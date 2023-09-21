package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatotrTwo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='inlineRadioOptions']"));
		radio.get(0).click();
//		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
//		female.click();
		WebElement showSelected = driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelected.click();
		List<WebElement> gender = driver.findElements(By.xpath("//input[@name='student-gender']"));
		gender.get(1).click();
//		WebElement pFemale = driver.findElement(By.xpath("//input[starts-with(@id,'inlineRadio21')]"));
//		pFemale.click();
		List<WebElement> age = driver.findElements(By.xpath("//input[@name='student-age']"));
		age.get(1).click();
//		WebElement ageGroup = driver.findElement(By.xpath("//input[contains(@id,'inlineRadio23')]"));
//		ageGroup.click();
		WebElement submit = driver.findElement(By.xpath("//*[text()='Get Results']"));
		submit.click();
	

	}

}
