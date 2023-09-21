package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions actions = new Actions(driver);
		//WebElement rightClickMe = driver.findElement(By.className("btn-neutral"));
		//actions.contextClick(rightClickMe).perform();
		
		WebElement doubleClickMe = driver.findElement(By.tagName("Double-Click Me To See Alert"));
		actions.doubleClick(doubleClickMe).perform();

	}

}
