package files;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {
	
	public static JsonPath rawToJson(String responce) {
		
		JsonPath js = new JsonPath(responce);
		return js;
	}

}
