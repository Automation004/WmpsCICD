package A1_Master_Create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.Status;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_05_Supplier_Assignment_update extends BaseClass {
	@org.testng.annotations.Test
	public void Supplier_Assignment() throws Exception {
		Test = extent.createTest("Supplier Assignment Update Test");
		WmpsObj w = new WmpsObj(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		try {
			WMPS_Login("Initiator", "Initiator_Password");
			Test.log(Status.PASS, "Logged in successfully as Initiator");

			int rowcount = xls.getRowCount("SupplierAssignment");
			Test.log(Status.INFO, "Row count from SupplierAssignment: " + rowcount);

			mp.Master_Click();
			Test.log(Status.PASS, "Clicked on Master");

			// Start measuring time
			long startTime = System.currentTimeMillis();
			mp.Supplier_Assignment();
			// Calculate the time taken
			long endTime = System.currentTimeMillis();
			long executionTime = endTime - startTime;
			// Log the time taken
			Test.log(Status.INFO, "Time taken for mp.Supplier_Assignment(): " + executionTime + " milliseconds");

			w.Create_Button();
			Test.log(Status.PASS, "Clicked Create Button");

			for (int i = 2; i <= 2; i++) {
				Test.log(Status.INFO, "Processing row " + i);

				String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
				String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
				String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
				String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
				String Vendor_Name_Supplier_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Supplier_Edit", i);
				String Vendor_Name_Manufacturer_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit",
						i);
				String DateToday = xls.getCellData("Date", "DateToday", i);
				String Date1DB = xls.getCellData("Date", "Date1DB", i);
				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);

				w.DD_01M(MaterialMasterRM_Edit);
				Test.log(Status.PASS, "Selected Material Master RM Edit: " + MaterialMasterRM_Edit);
				Thread.sleep(3000);

				mp.Manfacturer_Name_Text(Vendor_Name_Manufacturer_Edit);
				Test.log(Status.PASS, "Entered Manufacturer Name: " + Vendor_Name_Manufacturer_Edit);
				Thread.sleep(3000);

				mp.Name_of_the_Supplier(Vendor_Name_Supplier_Edit);
				Test.log(Status.PASS, "Entered Supplier Name: " + Vendor_Name_Supplier_Edit);
				Thread.sleep(3000);

				w.VendorStatusDD("Approved");
				Test.log(Status.PASS, "Selected Vendor Status: Approved");

				w.qualifiedDate(DateToday);
				Test.log(Status.PASS, "Entered Qualified Date: " + DateToday);

				w.Save_Button();
				Test.log(Status.PASS, "Clicked Save Button");

				w.Yes();
				Test.log(Status.PASS, "Clicked Yes");

				w.Password_Fill.sendKeys(Pro.getProperty("Initiator_Password"));
				Test.log(Status.PASS, "Entered Initiator Password");

				w.Submit_Button();
				Test.log(Status.PASS, "Clicked Submit Button");

				Thread.sleep(2000);

				// Actions act = new Actions(driver);
				// WebElement ele =
				// driver.findElement(By.xpath("/html/body/div/div/div[6]/button[1]"));
				// act.doubleClick(ele).perform();
				// Test.log(Status.PASS, "Double clicked on confirmation button");
				// Thread.sleep(3000);
				// Un-comment the following lines if you need to perform search and view actions
				// w.SearchBox(MaterialMasterRM_Edit);
				// Test.log(Status.PASS, "Searched for Material Master RM Edit: " +
				// MaterialMasterRM_Edit);
				// w.ViewButton();
				// Test.log(Status.PASS, "Clicked View Button");
				// scrollPagedown();
				// w.Back_Button();
			}
		} catch (Exception e) {
			Test.log(Status.FAIL, "Test failed with exception: " + e.getMessage());
			throw e;
		} finally {
			// extent.flush();
			// driver.close();
		}
	}
}