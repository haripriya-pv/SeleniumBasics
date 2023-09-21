package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Browser Commands
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.13.0");//launch the specified url
		String title = driver.getTitle(); // gets the page title
		System.out.println(title);
		String url = driver.getCurrentUrl(); //gets the current page url
		System.out.println(url);
		String pageSource = driver.getPageSource();//gets the dom
		//System.out.println(pageSource);
		driver.close();//close the current window or tab
		//driver.quit(); //close the entire browser

	}

}
