package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		uploadFile.sendKeys("C:\\Users\\hpriy\\OneDrive\\Pictures\\reviewProgram1.png"); // add an extra '\' after copying path
		WebElement accept = driver.findElement(By.id("terms"));
		accept.click();
		WebElement submitButton = driver.findElement(By.id("submitbutton"));
		submitButton.click();

	}

}
