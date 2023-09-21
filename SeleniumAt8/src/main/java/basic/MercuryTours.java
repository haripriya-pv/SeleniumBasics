package basic;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
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

}
