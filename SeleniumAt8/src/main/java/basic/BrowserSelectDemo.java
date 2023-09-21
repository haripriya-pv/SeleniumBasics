package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSelectDemo {
        WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the browser you want to open");
		String browser;
		  Scanner sc = new Scanner(System.in);
		  browser=sc.nextLine();
//		  BufferedReader reader = new BufferedReader(
//		            new InputStreamReader(System.in));
//		  
//		  browser =reader.readLine();
		  System.out.println(browser);
		  BrowserSelectDemo  obj = new BrowserSelectDemo ();
		  obj.f(browser);

	}
	public  void f(String br) {
		  if(br.equalsIgnoreCase("chrome")) {
			  driver = new ChromeDriver();
			   driver.get("https://qalegend.com/crm/index.php/signin");
			   driver.manage().window().maximize();
			  }
			  else if (br.equalsIgnoreCase("edge")) {
				  driver = new EdgeDriver();
				   driver.get("https://qalegend.com/crm/index.php/signin");
				   driver.manage().window().maximize();
				  }
			  else
				  System.out.println("not found the entered browser");
		  }

}
