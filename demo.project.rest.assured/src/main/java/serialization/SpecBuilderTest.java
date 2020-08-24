package serialization;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilderTest {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://rahulshettyacademy.com";
		//To set values we need to create object of MapPojo class 
		MapPojo obj = new MapPojo();
		obj.setAccuracy(90);
		obj.setName("Laxmi Niwas");
		obj.setPhone_number("+91 1234567891");
		obj.setAddress("Pune");
		obj.setWebsite("www.myWebSite.com");
		obj.setLanguage("Marathi");
		//We have to create object of LocationPojo class to set values 
		LocationPojo loc = new LocationPojo();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		//And Pass this object to setLocation()
		obj.setLocation(loc);
		//We have to create ArrayList object to set values for types 
		List<String> myList = new ArrayList<String>();
		myList.add("Row House");
		myList.add("Bunglow");
		//And pass this object of ArrayList to the types
		obj.setTypes(myList);
		
		//Request/Responce spec builder is used to create generic method with common code.
		//so that we can use it whenever needed.
		
		//Creating object of RequestSpecBuilder
		RequestSpecification req =new RequestSpecBuilder().setBaseUri("http://rahulshettyacademy.com").addQueryParam("key", "qaclick123")
		.setContentType(ContentType.JSON).build();
		
		//Creating object of ResponceSpecBuilder
		ResponseSpecification resSpec = new ResponseSpecBuilder()
		.expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		//Add place 
		RequestSpecification res = given().spec(req).body(obj);
				//Here we have to pass object of MapPojo class to the body
		Response responce = res.when().post("/maps/api/place/add/json")
		.then().spec(resSpec).extract().response();
		
		String responceString = responce.asString();
		
		System.out.println(responceString);
	}

}
