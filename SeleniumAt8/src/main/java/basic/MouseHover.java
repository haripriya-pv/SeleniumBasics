package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu/#");
		Actions actions = new Actions(driver);
		WebElement link1 = driver.findElement(By.linkText("Main Item 2"));
		actions.moveToElement(link1).perform();
		WebElement link2 = driver.findElement(By.linkText("SUB SUB LIST »"));
		
		actions.moveToElement(link2).perform();//perform to execute the action //move to element - mouse hover
		WebElement link3 = driver.findElement(By.linkText("Sub Sub Item 2"));
		actions.moveToElement(link3).click().build().perform(); // build : create a composite or combine action

	}

}
