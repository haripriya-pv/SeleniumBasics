package mytest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowPopupDemo {
	WebDriver driver;
	  @Test
	  public void f() {
		  WebElement clickHere = driver.findElement(By.partialLinkText("Click Here"));
		  clickHere.click();
		  String parent = driver.getWindowHandle();
			Set<String> child = driver.getWindowHandles();
			Iterator<String> i = child.iterator();
			while(i.hasNext()) {
				String currentPoint = i.next();
				if(!currentPoint.equals(parent)) {
					driver.switchTo().window(currentPoint);
					driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("hari@gmail.com");
					driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
					 WebElement clickHere2 = driver.findElement(By.partialLinkText("Click Here"));
					  clickHere2.click();
					  String parent2 = driver.getWindowHandle();
						Set<String> child2 = driver.getWindowHandles();
						Iterator<String> i2 = child2.iterator();
						while(i2.hasNext()) {
							String currentPoint2 = i2.next();
							if(!currentPoint2.equals(parent2)) {
								driver.switchTo().window(currentPoint2);
							}
						}
						driver.switchTo().window(parent2);
				}
			}
			driver.switchTo().window(parent);
	  }
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		   driver.get("https://demo.guru99.com/popup.php");
		   driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() {
		 // driver.quit();
	  }
}
