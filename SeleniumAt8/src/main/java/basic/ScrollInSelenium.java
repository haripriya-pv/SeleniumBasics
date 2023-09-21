package basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInSelenium {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		JavascriptExecutor js=(JavascriptExecutor)driver;//typecast driver to javascriptexecutor
		js.executeScript("window.scrollBy(0,500)");//vertical down 500 pixel
        js.executeScript("window.scrollBy(0,-100)");//vertical scroll up 100 pixel
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scroll to the bottom of the page
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");//scroll to top of the page
        WebElement button=driver.findElement(By.id("button-two"));
		js.executeScript("arguments[0].scrollIntoView()",button);//scroll to the webelement
        
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//take screenshot
		File destFile=new File("C:\\Users\\hpriy\\OneDrive\\Pictures\\ScreenshotsAutomation\\myfirst.png");//specify the destination 
		FileUtils.copyFile(srcFile, destFile);//copy scrfile to destination 
		
	}

}
