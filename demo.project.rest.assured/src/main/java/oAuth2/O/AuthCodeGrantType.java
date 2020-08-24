package oAuth2.O;

import static io.restassured.RestAssured.given;

import deSerialization.GetCourse;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

public class AuthCodeGrantType {
	
	//OAuth 2.0 Concepts:
	//Now days, Many applications give option to authenticate yourself using third party user profiles 
	//like log in with Google/Facebook thats called OAuth 2.0.
	//Authorization code and client credentials are most commonly used grant types in OAuth 2.0 
	
	//Parameters required::
	//client: Book My Show/ Udemy(client who using third party authorization)
	//client ID: This will be provided by Google/Facebook to the client
	//client secret ID: This will be provided by Google/Facebook to the client
	//Resource: Human
	//Resource/Authorization server: Google/Facebook
	
	//Steps to achieve access token:
	//1. User clicks on google to sign in to the application and do sign in after that it will provide code.
	//2. Application will use this code and to hit google resource server in back end to get
	//Scope(Access token, Fist name, last name, Email ID, Image)
	//(This access token will be attached to browser and will be used to do operations in application e.g. Book my Show
	//3. Application will grant the access to user by validating access token 
	
	//Query Parameters required:
	//Scope: What all information required from the third party application.
	//Authorization URL: Third party application server URL
	//Client ID: when we register ourself with Third party site, They provide Client ID and Client secret ID
	//Response_type: Code which we will get from third party server
	//Redirect_uri - The URL which will be redirected after login
	
	
	
	public static void main(String[] args) {
		
		//Steps to get Authorization code 
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://accounts.google.com/o/oauth2/v2/auth?"
//				+ "scope=https://www.googleapis.com/auth/userinfo."
//				+ "email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107"
//				+ "-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent."
//				+ "com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php");
//		driver.findElement(By.id("identifierId")).sendKeys("surajshinde0809@gmail.com");
//		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb'][1]")).click();
//		driver.findElement(By.name("password")).sendKeys("");
//		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb'][1]")).click();
//		
//		String url = driver.getCurrentUrl();
		
		String url = "https://rahulshettyacademy.com/getCourse.php?code=4%2F3AFGsaJZwLI6QN7JoPFs8-xh4_41wGTgCstip92hfqxm-s93De1YIpzgQ9B48O6Ushd2sM0K1oZYkj4sB-Olu4U&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent#";
		
		String partialCode = url.split("code=")[1];
		String code = partialCode.split("&scope")[0];
		
		System.out.println(code);
		
		
		//To get Access Token. output - access token 
		String accessTokenResponce = given().urlEncodingEnabled(false)
		.queryParams("code",code)
		.queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
		.queryParams("grant_type", "authorization_code")
		.queryParams("state", "verifyfjdss")
        .queryParams("session_state", "ff4a89d1f7011eb34eef8cf02ce4353316d9744b..7eb8")
		.when().log().all()
		.post("https://rahulshettyacademy.com/getCourse.php").asString();
		
		JsonPath js = new JsonPath(accessTokenResponce);
		String accessToken = js.getString("access_token"); 
		
		//Actual request 
		GetCourse responce = given().queryParam("access_token", accessToken).expect().defaultParser(Parser.JSON)
				//We need not mention 'expect().defaultParser(Parser.JSON)' when content type is application/Json
		.when()
		.get("https://rahulshettyacademy.com/getCourse.php").as(GetCourse.class);
		
		System.out.println(responce);
		
		//Retrieving values from POJO class
		System.out.println(responce.getLinkedIn());
		
		
	}

}
