package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.baseClass;

public class googleTest extends baseClass {

	@Test
	public void testGoogleTitle() {
		setup();
		driver.get("https://www.google.com");
		System.out.println("title of the page is   :  "+driver.getTitle());
		
		tearDown();
		System.out.println("success ====================== ");

		System.out.println("success ====================== ");
		

	}

	@Test
	public void  test() {
		
		System.out.println("testing ++++++++++++++++++++++++");
		System.out.println("s====================s=uccess ====================== ");

	}
}
