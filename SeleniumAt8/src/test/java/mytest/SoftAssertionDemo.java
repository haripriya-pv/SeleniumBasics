package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
WebDriver driver;

	
	@Test
	  public void assertEquals() {
		  SoftAssert softassert = new SoftAssert();
		  String actual = "Hello";
		  String expected ="world";
		  
		  softassert.assertEquals(actual, expected, "Testcase failed"); //expected [world] but found [Hello]
		  //Soft Assertion - if the assertion fails then the remaining statements will execute, not throwing exception immediately,next statements will execute
		  System.out.println("remaining statements"); 
		  softassert.assertAll();
			
	  }
	@Test
	  public void assertTrueOrFalse() {
		  SoftAssert softassert = new SoftAssert();
		  boolean result = true;
		  softassert.assertTrue(result);
		  boolean result2 = true;
		  softassert.assertFalse(result2);
		  System.out.println("remaining statements2"); 
		  softassert.assertAll();	
	  }
	  
	  @Test
	  public void f() {
		  SoftAssert softassert = new SoftAssert();
		  String heading = "selenium";
		  String title = driver.getTitle();
		  softassert.assertEquals(heading, title);	
		  System.out.println("remaining statements3"); 
		  softassert.assertAll();
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
