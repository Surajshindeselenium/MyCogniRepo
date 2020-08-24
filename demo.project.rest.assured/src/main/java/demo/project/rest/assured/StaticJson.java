package demo.project.rest.assured;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import files.PayLoad;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class StaticJson {

@Test
public void addBook() throws IOException {
		
		
		RestAssured.baseURI = "http://216.10.245.166";
		String responce = given().header("Content-Type","application/json").
		body(generateStringFromResponce("C:\\Users\\348333\\Desktop\\Addbook.json")).
		when()
		.post("Library/Addbook.php").
		then().assertThat().statusCode(200).
		extract().response().asString();
		JsonPath js =ReusableMethods.rawToJson(responce);
		String id = js.get("ID");
		System.out.println(id);
		
	}

	public String generateStringFromResponce(String path) throws IOException {
		
		return new String (Files.readAllBytes(Paths.get(path)));
		
	}
	
	

}
