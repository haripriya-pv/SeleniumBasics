package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		WebElement color = driver.findElement(By.id("single-input-field"));
		Select oselect = new Select(color);
		//we can select the drop down options three ways, selectByIndex,selectByValue,selectByVisibleText
		oselect.selectByIndex(0);
		oselect.selectByValue("Red");
		oselect.selectByVisibleText("Yellow");
		List<WebElement> options = oselect.getOptions();
		for(int i=0;i<options.size();i++) {
			String optionsDisplay = options.get(i).getText();
			System.out.println(optionsDisplay);
		}
		
		WebElement selected = oselect.getFirstSelectedOption();
		String value = selected.getText();
		System.out.println("selected value :" +value);
		
		//drop down - multi select
		WebElement multiSelect = driver.findElement(By.id("multi-select-field"));
		Select objselect = new Select(multiSelect);
		boolean f =objselect.isMultiple();
		System.out.println(f);
		objselect.selectByIndex(0);
		objselect.selectByValue("Green");
		objselect.deselectByIndex(2);
		objselect.deselectAll();

	}

}
