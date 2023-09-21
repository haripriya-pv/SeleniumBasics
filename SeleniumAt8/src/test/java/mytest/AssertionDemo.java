package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionDemo {
	WebDriver driver;
	
	@Test
	  public void assertEquals() {
		  String actual = "Hello";
		  String expected ="world";
		  Assert.assertEquals(actual, expected); //expected [world] but found [Hello]
		  //Hard Assertion - if the assertion fails then the remaining statements will not execute, after throwing exception next test will execute
		  System.out.println("remaining statements"); 
			
	  }
	@Test
	  public void assertTrueOrFalse() {
		  boolean result = true;
		  Assert.assertTrue(result);
		  boolean result2 = false;
		  Assert.assertFalse(result2);
			
	  }
	  
	  @Test
	  public void f() {
		  String heading = "selenium";
		  String title = driver.getTitle();
		  Assert.assertEquals(heading, title);	
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.get("https://selenium.obsqurazone.com/form-submit.php");
		  driver.manage().window().maximize();
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }
}
