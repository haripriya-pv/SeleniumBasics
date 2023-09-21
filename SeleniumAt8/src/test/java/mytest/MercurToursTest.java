package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MercurToursTest {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement userName = driver.findElement(By.name("userName"));
      userName.sendKeys("hari");
      Dimension d = userName.getSize();
      System.out.println(d.height+" "+d.width);
      org.openqa.selenium.Point p = userName.getLocation();
      System.out.println(p.x+" " +p.y);
      WebElement password = driver.findElement(By.name("password"));
      password.sendKeys("hari");
      WebElement submitButton = driver.findElement(By.name("submit"));
      submitButton.click();
  }
  @BeforeTest
  public void beforeTest() {
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://demo.guru99.com/test/newtours/");
	   driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
