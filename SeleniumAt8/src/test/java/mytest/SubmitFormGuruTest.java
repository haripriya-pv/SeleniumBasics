package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SubmitFormGuruTest {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement firstName = driver.findElement(By.name("firstName"));
	  firstName.sendKeys("hari");
	  WebElement lastName = driver.findElement(By.name("lastName"));
	  lastName.sendKeys("priya");
	  WebElement phone = driver.findElement(By.name("phone"));
	  phone.sendKeys("562546548");
	  WebElement email = driver.findElement(By.id("userName"));
	  email.sendKeys("hari@123");
	  WebElement address1 = driver.findElement(By.xpath("//input[@name='address1']"));
	  address1.sendKeys("address");
	  WebElement city =driver.findElement(By.xpath("//input[@name='city']"));
	  city.sendKeys("kkd");
	  WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
	  state.sendKeys("kerala");
	  WebElement post = driver.findElement(By.xpath("//input[@name='postalCode']"));
	  post.sendKeys("9886nnn");
	  WebElement country = driver.findElement(By.name("country"));
	  Select oselect = new Select(country);
	  oselect.selectByIndex(5);
	  WebElement userName = driver.findElement(By.id("email"));
	  userName.sendKeys("tutorial");
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("tutorial");
	  WebElement cPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	  cPassword.sendKeys("tutorial");
	  WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
	  submit.click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	   driver.get("https://demo.guru99.com/test/newtours/register.php");
	   driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
