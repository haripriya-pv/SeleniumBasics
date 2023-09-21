package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		//Link : partialLinkText/LinkText
		WebElement radioButtonDemo = driver.findElement(By.linkText("Radio Buttons Demo"));
		radioButtonDemo.click();
		WebElement checkBoxDemo = driver.findElement(By.partialLinkText("Checkbox"));
		checkBoxDemo.click();

	}

}
