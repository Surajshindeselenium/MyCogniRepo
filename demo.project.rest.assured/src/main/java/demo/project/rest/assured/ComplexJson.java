package demo.project.rest.assured;

import files.PayLoad;
import io.restassured.path.json.JsonPath;

public class ComplexJson {

	public static void main(String[] args) {

		JsonPath js = new JsonPath(PayLoad.coursePrice());
		// get no. of courses
		int count = js.getInt("courses.size()");
		System.out.println(count);

		// get purchase amount

		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmount);

		String website = js.getString("dashboard.website");
		System.out.println(website);

		// Print title of first course

		String firstCourseTitle = js.getString("courses[0].title");
		System.out.println(firstCourseTitle);

		// get all courses title and price

		for (int i = 0; i < count; i++) {

			String courseTitle = js.getString("courses[" + i + "].title");
			int price = js.getInt("courses[" + i + "].price");

			System.out.println(courseTitle);
			System.out.println(price);

		}

		// get no of copies sold by RPA course

		for (int i = 0; i < count; i++) {

			String course = js.getString("courses[" + i + "].title");

			if (course == "RPA") {

				int copies = js.getInt("courses[" + course + "].copies");
				System.out.println(copies);

				break;

			}

		}
		
		

	}



	
}
