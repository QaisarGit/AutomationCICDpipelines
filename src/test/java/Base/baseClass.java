package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	

	
	 public WebDriver driver;

	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	       // driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver/4.41.0");
	    }

	    public void tearDown() {
	        driver.quit();
	    }
	
}
