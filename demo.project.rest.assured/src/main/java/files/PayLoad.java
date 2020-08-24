package files;

public class PayLoad {
	
	public static String addPlace() {
		return "{\\r\\n\" + \r\n" + 
				"				\"  \\\"location\\\": {\\r\\n\" + \r\n" + 
				"				\"    \\\"lat\\\": -38.383494,\\r\\n\" + \r\n" + 
				"				\"    \\\"lng\\\": 33.427362\\r\\n\" + \r\n" + 
				"				\"  },\\r\\n\" + \r\n" + 
				"				\"  \\\"accuracy\\\": 50,\\r\\n\" + \r\n" + 
				"				\"  \\\"name\\\": \\\"Tom House\\\",\\r\\n\" + \r\n" + 
				"				\"  \\\"phone_number\\\": \\\"(+91) 983 893 3937\\\",\\r\\n\" + \r\n" + 
				"				\"  \\\"address\\\": \\\"Wakad\\\",\\r\\n\" + \r\n" + 
				"				\"  \\\"types\\\": [\\r\\n\" + \r\n" + 
				"				\"    \\\"Apartment\\\",\\r\\n\" + \r\n" + 
				"				\"    \\\"home\\\"\\r\\n\" + \r\n" + 
				"				\"  ],\\r\\n\" + \r\n" + 
				"				\"  \\\"website\\\": \\\"http://google.com\\\",\\r\\n\" + \r\n" + 
				"				\"  \\\"language\\\": \\\"French-IN\\\"\\r\\n\" + \r\n" + 
				"				\"}";
	}
	
	public static String coursePrice() {
		
		return "{\r\n" + 
				"\r\n" + 
				"\"dashboard\": {\r\n" + 
				"\r\n" + 
				"\"purchaseAmount\": 910,\r\n" + 
				"\r\n" + 
				"\"website\": \"rahulshettyacademy.com\"\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"\"courses\": [\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"Selenium Python\",\r\n" + 
				"\r\n" + 
				"\"price\": 50,\r\n" + 
				"\r\n" + 
				"\"copies\": 6\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"Cypress\",\r\n" + 
				"\r\n" + 
				"\"price\": 40,\r\n" + 
				"\r\n" + 
				"\"copies\": 4\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"RPA\",\r\n" + 
				"\r\n" + 
				"\"price\": 45,\r\n" + 
				"\r\n" + 
				"\"copies\": 10\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"]\r\n" + 
				"\r\n" + 
				"}";
		
	}
	
	public static String addBookBody(String isbn, int aisel) {
		
		String body = "{\r\n" + 
				"\r\n" + 
				"\"name\":\"Learn Selenium Automation with Java\",\r\n" + 
				"\"isbn\":\""+isbn+"\",\r\n" + 
				"\"aisle\":\""+aisel+"\",\r\n" + 
				"\"author\":\"John foe\"\r\n" + 
				"}\r\n" + 
				"";
		
		return body;
	}

}
