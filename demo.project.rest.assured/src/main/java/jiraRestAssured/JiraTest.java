package jiraRestAssured;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;

public class JiraTest {

	public static void main(String[] args) {
		
		//This is base URI
		RestAssured.baseURI = "http://localhost:8081/";
		
		//Creating object of SessionFilter to store session details 
		SessionFilter session = new SessionFilter();
		
		//JIRA authorization 
		
		//To bypass https certificate we can use 'relaxedHTTPSValidation(arg0)' with given()
	String responce=given().log().all().header("Content-Type", "application/json")
		.body("{ \"username\": \"suraj_shinde\", \"password\": \"perFume@66\" }")
		//filter() method we have to mention under given() section
		.filter(session)//when we use SessionFilter object then we have to mention filter() and pass object reference of SessionFilter
		.when().post("rest/auth/1/session")
		.then().extract().response().asString();
		
		//Add comment to the issue 
		String expectedMessage = "Hi how are you?";
		String addCommentResponce =given().pathParam("id", "10002").log().all().header("Content-Type","application/json").body("{\r\n" + 
				"    \"body\": \""+expectedMessage+"\",\r\n" + 
				"    \"visibility\": {\r\n" + 
				"        \"type\": \"role\",\r\n" + 
				"        \"value\": \"Administrators\"\r\n" + 
				"    }\r\n" + 
				"}").filter(session)
		.when().post("rest/api/2/issue/{id}/comment")
		//We are validating whether status code is 201
		.then().assertThat().statusCode(201).log().all().extract().response().asString();
		JsonPath jscomment = new JsonPath(addCommentResponce);
		String commentId =jscomment.getString("id");
		
		//Add attachment to the issue 
		
		given().log().all().pathParam("id", "10002").header("X-Atlassian-Token","no-check").filter(session)
		//In this use case we are file sending not JSON body hence header will be..
		.header("Content-Type","multipart/form-data")
		//To add an attachment We have to mention multiPart() method and pass args as (file, new File("path of file"))
		.multiPart("file", new File("AddAttachment.txt"))
		.when().log().all().post("rest/api/2/issue/{id}/attachments")
		.then().assertThat().statusCode(200).log().all();
		
		//Get issue 
		
		String getResponce =given().log().all().filter(session).pathParam("id", "10002")
		//here, queryParam() used to filter out entire json and return specific fields
				.queryParam("fields", "comment")
		.when().log().all().get("rest/api/2/issue/{id}")
		.then().log().all().extract().asString();
		System.out.println("Get Responce body: "+getResponce);
		
		JsonPath js = new JsonPath(getResponce);
		int countOfComments = js.getInt("fields.comment.comments.size()");
		
		for(int i=0; i<countOfComments;i++) {
			
			String commentIssueId = js.get("fields.comment.comments["+i+"].id").toString();
			if(commentIssueId.equalsIgnoreCase(commentId)) {
			
				String message =js.get("fields.comment.comments["+i+"].body").toString();
				System.out.println(message);
				Assert.assertEquals(message,expectedMessage );
				
			}
			
			
			
		}

	}

}
