package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		WebElement firstName = driver.findElement(By.id("validationCustom01"));
		firstName.sendKeys("hari");
		//firstName.clear();
		
		Dimension d = firstName.getSize();
        System.out.println(d.height+" "+d.width);
        org.openqa.selenium.Point p = firstName.getLocation();
        System.out.println(p.x+" " +p.y);
        
        
		WebElement lastName = driver.findElement(By.id("validationCustom02"));
		System.out.println(lastName.isDisplayed());
		lastName.sendKeys("priya");
		WebElement userName = driver.findElement(By.id("validationCustomUsername"));
		System.out.println(userName.isEnabled());
		userName.sendKeys("haripriya123@gmail.com");
		WebElement city = driver.findElement(By.id("validationCustom03"));
		String cityTag = city.getTagName();
		System.out.println(cityTag);
		city.sendKeys("Thrissur");
		WebElement zip = driver.findElement(By.id("validationCustom05"));
		zip.sendKeys("1234");
		WebElement state = driver.findElement(By.id("validationCustom04"));
		String typeValue = state.getAttribute("type");
		System.out.println("Value of type attribute"+typeValue);
		state.sendKeys("kerala");
		WebElement agreeCheckBox = driver.findElement(By.id("invalidCheck"));
		agreeCheckBox.click();
		WebElement submitbutton = driver.findElement(By.className("btn-primary"));
		System.out.println(submitbutton.getText());
		submitbutton.submit();
	}

}
