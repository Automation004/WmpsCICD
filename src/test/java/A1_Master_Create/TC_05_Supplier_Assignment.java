package A1_Master_Create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_05_Supplier_Assignment extends BaseClass {
	@SuppressWarnings("unused")
	@org.testng.annotations.Test
	public static void Supplier_Assignment() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		WMPS_Login("Initiator", "Initiator_Password");

		int rowcount = xls.getRowCount("SupplierAssignment");

		mp.Master_Click();
		// Start measuring time
		long startTime = System.currentTimeMillis();
		mp.Supplier_Assignment();
		// Calculate the time taken
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		// Print the time taken
		System.out.println("Time taken for mp.Supplier_Assignment(): " + executionTime + " milliseconds");

		w.Create_Button();

		System.out.println(rowcount);
		for (int i = 2; i <= 5; i++) {
			// *************************************************************************************************
			// **************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
			// **************************************************************************************************
			// **************************************************************************************************
			String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
			String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
			// **************************************************************************************************
			String Vendor_Name_Supplier_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Supplier_Edit", i);
			String Vendor_Name_Manufacturer_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit", i);
			// **************************************************************************************************
			// **************************************************************************************************
			String DateToday = xls.getCellData("Date", "DateToday", i);
			String Date1DB = xls.getCellData("Date", "Date1DB", i);// Date one day Back

			// **************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// **************************************************************************************************

			w.DD_01(MaterialMasterRM_Edit);
			Thread.sleep(3000);
			// **************************************************************************************************
			mp.Manfacturer_Name_Text(Vendor_Name_Manufacturer_Edit);
			Thread.sleep(3000);
			mp.Name_of_the_Supplier(Vendor_Name_Supplier_Edit);// Problem in data loading
			Thread.sleep(3000);
			// **************************************************************************************************
			w.VendorStatusDD("Approved");
			w.qualifiedDate(DateToday);
			w.Save_Button();
			w.Yes();
			w.Password_Fill.sendKeys(Pro.getProperty("Initiator_Password"));
			w.Submit_Button();
			Thread.sleep(7000);// Loading issue

			Actions act = new Actions(driver);
			WebElement ele = driver.findElement(By.xpath("/html/body/div/div/div[6]/button[1]"));
			act.doubleClick(ele).perform();
			// w.Ok_Button();
			Thread.sleep(3000);// not working okay button
			// **************************************************************************************************

			// //w.SearchBox(MaterialMasterRM);
			// w.SearchBox(MaterialMasterRM_Edit);
			// //
			// **************************************************************************************************
			// w.ViewButton();scrollPagedown();
			// w.Back_Button();

			// **************************************************************************************************

		}
		driver.close();
	}
}
