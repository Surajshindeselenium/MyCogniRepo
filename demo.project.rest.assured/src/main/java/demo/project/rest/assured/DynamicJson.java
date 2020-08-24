package demo.project.rest.assured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.PayLoad;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

@Test (dataProvider = "BooksData")
public class DynamicJson {

	public void addBook(String isbn, int aisle) {
		
		RestAssured.baseURI = "http://216.10.245.166";
		String responce = given().header("Content-Type","application/json").
		body(PayLoad.addBookBody(isbn, aisle)).
		when()
		.post("Library/Addbook.php").
		then().assertThat().statusCode(200).
		extract().response().asString();
		JsonPath js =ReusableMethods.rawToJson(responce);
		String id = js.get("ID");
		System.out.println(id);
		
	}
	
	public void deleteBooks(String isbn, int aisle) {
		
		RestAssured.baseURI = "http://216.10.245.166";
		String responce = given().header("Content-Type","application/json").
		body(PayLoad.addBookBody(isbn, aisle)).
		when()
		.post("/Library/DeleteBook.php").
		then().assertThat().statusCode(200).
		extract().response().asString();
		JsonPath js =ReusableMethods.rawToJson(responce);
		String id = js.get("ID");
		System.out.println(id);
		
	}
	
	
	@DataProvider(name= "BooksData")
	public Object[][] getData() {
		
		return new Object[][]	{{"Ram", 1111},{"Sham", 2222},{"Rahul", 3333 }};
	}
	
	
}






