package mytest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginFormDemo {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement userName = driver.findElement(By.id("username"));
	  userName.sendKeys("admin");
	  WebElement password = driver.findElement(By.id("password"));
	  password.sendKeys("123123");
	  WebElement checkBox = driver.findElement(By.xpath("//*[@name ='remember' ]"));
	  checkBox.click();
	  WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit' ]"));
	  loginButton.click();
	  WebElement endTourButton = driver.findElement(By.xpath("//*[text()='End tour']"));
	  SoftAssert softassert = new SoftAssert();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	   driver.get("https://qalegend.com/billing/public/login");
	   driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
