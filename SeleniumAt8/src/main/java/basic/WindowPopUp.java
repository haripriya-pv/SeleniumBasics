package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.partialLinkText("Like us On Facebook"));
		element.click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		Iterator<String> i = child.iterator();
		while(i.hasNext()) {
			String currentPoint = i.next();
			if(!currentPoint.equals(parent)) {
				driver.switchTo().window(currentPoint);
				driver.findElement(By.xpath("//input[@name='email' and @type='text']")).sendKeys("hari");
			}
		}
		driver.switchTo().window(parent);
		//driver.quit();
		//driver.close();

	}

}
