package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
//		WebElement sampleText = driver.findElement(By.id("sampleHeading"));// will get "Unable to locate element" /no such element exception
//		String s = sampleText.getText();
//		System.out.println(s);
		
		//we need to switch control before any action-- 3 ways
		//driver.switchTo().frame("frame1"); //way 1
		WebElement iFrameFirst = driver.findElement(By.id("frame1"));
		//driver.switchTo().frame(iFrameFirst); //way2
		
		driver.switchTo().frame(3);
		WebElement sampleText = driver.findElement(By.id("sampleHeading"));
		String s = sampleText.getText();
		System.out.println(s);
		driver.switchTo().defaultContent(); //Selects either the first frame on the page, or the main document when a page containsiframes. 

	}

}
