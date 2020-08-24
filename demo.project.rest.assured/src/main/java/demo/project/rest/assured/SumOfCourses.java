package demo.project.rest.assured;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.PayLoad;
import io.restassured.path.json.JsonPath;

public class SumOfCourses {

	@Test
	
	public static void totalCoursePrice() {
		int totalPrice = 0;
		JsonPath js = new JsonPath(PayLoad.coursePrice());
		int count = js.getInt("courses.size()");
		System.out.println(count);

		// get sum of all courses prices matches with purchase amount

		for (int i=0; i<count; i++) {

			

			int price = js.getInt("courses[" + i + "].price");
			int copies = js.getInt("courses[" + i + "].copies");

			int courseTotal = copies * price;

			totalPrice = totalPrice + courseTotal;
			

		}
		
		System.out.println(totalPrice);
		
		int purchaseAmount= js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(totalPrice, purchaseAmount);
	}
}
