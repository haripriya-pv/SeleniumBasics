package mytest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HtmlTable {
	WebDriver driver;

	@Test(priority = 0)
	// get all the headers
	public void getTableHeader() {
		List<WebElement> tableHeaders = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
		List<String> headerName = new ArrayList<String>();
		for (int i = 0; i < tableHeaders.size(); i++) {
			String value = tableHeaders.get(i).getText();
			headerName.add(value);

		}
		System.out.println(headerName);

	}

	@Test(priority = 1)
	// get all the data
	public void tableGetData() {
		List<WebElement> tableDataList = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td"));
		List<String> tableData = new ArrayList<String>();
		for (int j = 0; j < tableDataList.size(); j++) {
			String data = tableDataList.get(j).getText();
			tableData.add(data);
		}
		System.out.println("All table data = " + tableData);
	}

	@Test(priority = 2)
	// verfiy whether a expected value is present in table data
	public void verifyElementIsPresent() {
		List<WebElement> tableRowData = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td"));

		String expValue = "Software Engineer";
		Boolean f = false;
		for (int k = 0; k < tableRowData.size(); k++) {
			String actValue = tableRowData.get(k).getText();
			if (expValue.equalsIgnoreCase(actValue)) {
				f = true;
				break;
			}
		}
		Assert.assertTrue(f);
	}

	@Test(priority = 3)
	public void verifySingleElementIsPresent() {
		WebElement singleRowData = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[2]"));
		String expSingleValue = "Senior Javascript Developer";
		String actSingleValue = singleRowData.getText();
		Assert.assertEquals(actSingleValue, expSingleValue);
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
