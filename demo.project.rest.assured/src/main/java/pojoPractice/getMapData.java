package pojoPractice;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

 


public class getMapData {
	
	

	public static void main(String[] args) {
		
		RestAssured.baseURI = "http://rahulshettyacademy.com";
		
		POJOClass responce = given().log().all()
		.queryParams("key", "qaclick123")
		.queryParams("place_id","f332e4dd9904fec9a641137679e4753a")
		.when().log().all().get("/maps/api/place/get/json").as(POJOClass.class);
		
		System.out.println(responce.getName());
		System.out.println(responce.getLocation().getLatitude());
		

	}

}
