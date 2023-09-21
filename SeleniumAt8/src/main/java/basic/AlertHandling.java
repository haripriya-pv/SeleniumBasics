package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		
		//for first alert
		WebElement alertButton1 = driver.findElement(By.className("btn-success"));
		alertButton1.click();
		Alert obj = driver.switchTo().alert();//to transfer
		String text = obj.getText();
		System.out.println(text);
		obj.accept();//accept the alert
		
		//for second alert
		WebElement alertButton2 = driver.findElement(By.className("btn-warning"));
		alertButton2.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();//cancel
		
		//for third alert
		WebElement alertButton3 = driver.findElement(By.className("btn-danger"));
		alertButton3.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("hari");
		alert3.accept();

	}

}

//First we need to switch to alert using driver.switchTo().alert().Then we can use
		//the 4 methods of Alert Interface.
		// Alert interface it is predefined
		//To accept the alert ,for clicking OK :alert.accept()
		//to cancel :alert.dismiss()
		//to get the text in the alert :alert.getText()
		//to enter value in input box :alert.sendKeys()
