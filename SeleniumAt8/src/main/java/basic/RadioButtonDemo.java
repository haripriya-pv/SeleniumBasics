package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class RadioButtonDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		List<WebElement> gender = driver.findElements(By.name("inlineRadioOptions"));
		gender.get(0).click();
		boolean f = gender.get(0).isSelected();
		System.out.println(f);
		
		List <WebElement> StudentAge = driver.findElements(By.name("student-age"));
		StudentAge.get(1).click();
		

	}

}
