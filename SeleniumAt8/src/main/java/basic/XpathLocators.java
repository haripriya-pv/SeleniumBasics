package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstName.sendKeys("Hari");
		WebElement lastName = driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		lastName.sendKeys("Priya");
		WebElement userName = driver.findElement(By.xpath("//input[starts-with(@id,'validationCustomU')]"));
		userName.sendKeys("hari");
		WebElement city = driver.findElement(By.xpath("//input[contains(@placeholder,'it')]"));
		city.sendKeys("Thrissur");
		WebElement state = driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		state.sendKeys("kerala");
		WebElement zip = driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		zip.sendKeys("1234");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		checkBox.click();
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit form']"));
		submitButton.click();
		

	}

}
