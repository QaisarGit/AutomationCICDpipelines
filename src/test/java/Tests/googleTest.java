package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.baseClass;

public class googleTest extends baseClass{
	
	 @Test
	    public void testGoogleTitle() {
	        setup();
	        driver.get("https://www.google.com");
	        System.out.println(driver.getTitle());
	        tearDown();
	        System.out.println("success ====================== ");
	 }

}
