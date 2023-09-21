package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoExp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement enterMessage = driver.findElement(By.id("single-input-field"));
		enterMessage.sendKeys("firstcheck");
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		showMessageButton.click();
		WebElement messageDisplayed = driver.findElement(By.id("message-one"));
		String s = messageDisplayed.getText();
		System.out.println(s);
		
		WebElement enteValueA = driver.findElement(By.id("value-a"));
		enteValueA.sendKeys("5");
		WebElement enteValueB = driver.findElement(By.id("value-b"));
		enteValueB.sendKeys("2");
		WebElement getTotalButton = driver.findElement(By.id("button-two"));
		getTotalButton.click();
		WebElement messageDisplayedTwo = driver.findElement(By.id("message-two"));
		String s1 = messageDisplayedTwo.getText();
		System.out.println(s1);

	}

}
