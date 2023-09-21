package mytest;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class BrowserSelection {
	WebDriver driver;
	
	@Parameters("browser")
	
  @Test
  public void f(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  driver = new ChromeDriver();
		   driver.get("https://qalegend.com/crm/index.php/signin");
		   driver.manage().window().maximize();
		  }
		  else if (browser.equalsIgnoreCase("edge")) {
			  driver = new EdgeDriver();
			   driver.get("https://qalegend.com/crm/index.php/signin");
			   driver.manage().window().maximize();
			  }
		  else
			  System.out.println("not found the entered browser");
	  }

	  
  @BeforeTest
  public void beforeTest() throws IOException {
//	  System.out.println("Enter the browser you want to open");
////	  Scanner sc = new Scanner(System.in);
////	  browser=sc.nextLine();
//	  BufferedReader reader = new BufferedReader(
//	            new InputStreamReader(System.in));
//	  String browser;
//	  browser =reader.readLine();
//	  System.out.println(browser);
//	  f(browser);
  }
  @AfterTest
  public void afterTest() {
  }

}
