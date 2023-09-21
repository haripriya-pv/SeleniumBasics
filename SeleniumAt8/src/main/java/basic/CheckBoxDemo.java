package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		List<WebElement> multiheckbox = driver.findElements(By.className("check-box-list"));
		multiheckbox.get(0).click();
		boolean f = multiheckbox.get(0).isSelected();
		System.out.println(f);
		multiheckbox.get(2).click();
		boolean f1 = multiheckbox.get(2).isSelected();
		System.out.println(f1);
		

	}

}
