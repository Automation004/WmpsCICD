package Transactions_Warehouse;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_11_Print_Issue_Slip extends BaseClass {

	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);
		int firstCopyNum = 1;
		int secondCopyNum = 2;
		int thirdCopyNum = 3;
		Test = extent.createTest("Goods Receipt Test");


		// Logging in with Initiator credentials
		Test.info("Logging in with Initiator credentials");
		WMPS_Login("Initiator", "Initiator_Password");

		// Navigating through the menu twice
		Test.info("Navigating through the menu");
		w.Menu_Navigate();
		w.Menu_Navigate();


		// Clicking on Warehouse
		Test.info("Clicking on Warehouse");
		w.WareHouse();

		// Clicking on Print Issue Slip
		Test.info("Clicking on Print Issue Slip");
		w.Print_Issue_Slip();

		// Entering search term for Order ID and selecting the order
		Test.info("Entering search term for Order ID: ");
		driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("MIN240600094");
		Thread.sleep(1000);
		Test.info("Selecting the order from the search results");
		driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]/a")).click();

		// Selecting the Order ID from the dropdown
		Test.info("Selecting Order ID from the dropdown");
		WebElement orderId = driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-printissueslip[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]"));
		orderId.click();
		Select orderIdDd = new Select(orderId);
		orderIdDd.selectByIndex(1);

		// Previewing the Issue Slip
		Test.info("Previewing the Issue Slip");
		w.Preview();

		// Handling the whitecard popup
		Test.info("Handling the whitecard popup for first copy");
		handleWhitecardPopup(firstCopyNum);

		// Clicking on Print Button
		Test.info("Clicking on Print Button");
		w.Print_Button();

		// Confirming the print action
		Test.info("Confirming the print action by clicking Yes");
		w.Yes();
		Thread.sleep(2000);

		// Entering the password for confirmation
		Test.info("Entering the password for confirmation");
		w.Password_Fill("123");

		// Submitting the form
		Test.info("Clicking on Submit Button");
		w.Submit_Button();

		// Acknowledging the submission
		Test.info("Acknowledging the submission by clicking Ok");
		w.Ok();

		// Pausing for user input (if any)
		Test.info("Pausing for user input (scanner)");
		Scanner s = new Scanner(System.in);
		s.next();

		// Closing the opened file if necessary
		// Test.info("Closing the opened file if necessary");
		// Close_Opened_File();
	}
}