package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMercuryTours {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement passCount = driver.findElement(By.name("passCount"));
		Select oselect = new Select(passCount);
		oselect.selectByIndex(1);
		List<WebElement> options = oselect.getOptions();
		for(int i=0;i<options.size();i++) {
			String optionsDisplay = options.get(i).getText();
			System.out.println(optionsDisplay);
		}
		
		WebElement toPort = driver.findElement(By.name("toPort"));
		Select obj2select = new Select(toPort);
		obj2select.selectByVisibleText("Portland");
		
		WebElement toMonth = driver.findElement(By.name("toMonth"));
		Select obj3select = new Select(toMonth);
		obj3select.selectByValue("5");
	}

}
