package mytest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SubmitForm {
	WebDriver driver;
	
  @Test
  public void f() {
	  SoftAssert softassert = new SoftAssert();
	  WebElement firstName = driver.findElement(By.id("validationCustom01"));
	  Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
				fluentWait.until(ExpectedConditions.visibilityOf(firstName));
		firstName.sendKeys("hari");
		//Hard Assertion
//		boolean t = firstName.isDisplayed();
//		Assert.assertTrue(t);
		
		//Soft Assertion
		
		boolean t1 = firstName.isDisplayed();
		softassert.assertFalse(t1);
		
		WebElement lastName = driver.findElement(By.id("validationCustom02"));
		lastName.sendKeys("priya");
		WebElement userName = driver.findElement(By.id("validationCustomUsername"));
		userName.sendKeys("haripriya123@gmail.com");
		WebElement city = driver.findElement(By.id("validationCustom03"));
		city.sendKeys("Thrissur");
		WebElement zip = driver.findElement(By.id("validationCustom05"));
		zip.sendKeys("1234");
		WebElement state = driver.findElement(By.id("validationCustom04"));
		state.sendKeys("kerala");
		WebElement agreeCheckBox = driver.findElement(By.id("invalidCheck"));
		agreeCheckBox.click();
		WebElement submitbutton = driver.findElement(By.className("btn-primary"));
		submitbutton.submit();
		String expected = "Form has been submitted successfully";
		WebElement message = driver.findElement(By.id("message-one"));
		String actual = message.getText();
		//Assert.assertEquals(actual, expected);
		
		softassert.assertEquals(actual, expected, "test case failed");
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
