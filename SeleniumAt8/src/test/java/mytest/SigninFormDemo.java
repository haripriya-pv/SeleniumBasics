package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class SigninFormDemo {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement email = driver.findElement(By.id("email"));
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("admin@admin.com");
	  WebElement password = driver.findElement(By.id("password"));
	  password.sendKeys("12345678");
	  WebElement signinButton = driver.findElement(By.xpath("//button[@type='submit' ]"));
	  signinButton.click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	   driver.get("https://qalegend.com/crm/index.php/signin");
	   driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
