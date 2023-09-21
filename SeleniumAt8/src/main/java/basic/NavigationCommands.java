package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.13.0");//launch the specified url

		//Navigation Commands
		driver.navigate().to("https://www.lambdatest.com/blog/what-is-actions-class-in-selenium/");//launching the url and maintains browser history
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
