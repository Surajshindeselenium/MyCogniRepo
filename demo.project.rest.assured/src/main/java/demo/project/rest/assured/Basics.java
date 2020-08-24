package demo.project.rest.assured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.PayLoad;
public class Basics {

	public static void main(String[] args) {
		
		// Rest Assured test cases are written in given() when(), and then() methods 
		//given() is used for all input details 
		//when() is used for submit the request  
		//then() is used for validate the response
		
		//Validating add place API working as expected 
		
		//setting up Base URi
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String responce=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(PayLoad.addPlace())
		//here, post() accept resources as arguments 
		.when().post("/maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200)
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println(responce);
		//We can use JsonPath class to parse JSON response
		JsonPath json= new JsonPath(responce);
		String placeID=json.getString("place_id");
		System.out.println(placeID);
		
		//Add place> update place with new address> get place to validate updated address is present or not
		
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+placeID+"\",\r\n" +
				"\"address\":\"Wakad, Pune\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}").
		when().put("/maps/api/place/update/json").
		then().assertThat().log().all().statusCode(200);
		
	}

}
