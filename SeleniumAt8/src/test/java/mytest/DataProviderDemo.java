package mytest;

import org.testng.annotations.Test;

import basic.ExcelRead;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String userName, String password) {
	  WebElement userNameF = driver.findElement(By.name("userName"));
      userNameF.sendKeys(userName);
      
      
     
      
      WebElement passwordF = driver.findElement(By.name("password"));
      passwordF.sendKeys(password);
      WebElement submitButton = driver.findElement(By.name("submit"));
      submitButton.click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	   driver.get("https://demo.guru99.com/test/newtours/");
	   driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }
//number of parameters = no of columns in excel
 //number of times @Test executed = no of rows in excel

  @DataProvider
  public Object[][] dp() throws InvalidFormatException, IOException {
   Object [][] data = ExcelRead.getDataFromExcel("C:\\Users\\hpriy\\Downloads\\dataprovidere.xlsx","Sheet1");
return data;
  }
}
