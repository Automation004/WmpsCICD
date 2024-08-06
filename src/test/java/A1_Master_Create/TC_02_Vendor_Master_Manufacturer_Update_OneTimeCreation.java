package A1_Master_Create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.Status;

import F.pageobjects.MasterXpaths;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_02_Vendor_Master_Manufacturer_Update_OneTimeCreation extends BaseClass {
	@org.testng.annotations.Test
	public void Vendor_Master() throws Exception {
		Test = extent.createTest("Vendor Master Manufacturer One-Time Creation Test");
		WmpsObj w = new WmpsObj(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		try {
			WMPS_Login("Initiator", "Initiator_Password");
			Test.log(Status.PASS, "Logged in successfully as Initiator");

			int rowcount = xls.getRowCount("Material_Master");
			Test.log(Status.INFO, "Row count from Material_Master: " + rowcount);

			for (int i = 2; i <= 2; i++) {
				Test.log(Status.INFO, "Processing row " + i);

				String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
				String Vendor_Name_Manufacturer_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit",
						i);
				String VendorTypeManufacturer = xls.getCellData("Vendor_Supplier", "VendorTypeManufacturer", i);
				String Street = xls.getCellData("Vendor_Supplier", "Street", i);
				String Street1 = xls.getCellData("Vendor_Supplier", "Street1", i);
				String Postal_Code = xls.getCellData("Vendor_Supplier", "Postal_Code", i);
				String Street_Edit = xls.getCellData("Vendor_Supplier", "Street_Edit", i);
				String Street1_Edit = xls.getCellData("Vendor_Supplier", "Street1_Edit", i);
				String Postal_Code_Edit = xls.getCellData("Vendor_Supplier", "Postal_Code_Edit", i);
				String Street2 = xls.getCellData("Vendor_Supplier", "Street2", i);
				String Country = xls.getCellData("Vendor_Supplier", "Country", i);
				String State = xls.getCellData("Vendor_Supplier", "State", i);
				String City = xls.getCellData("Vendor_Supplier", "City", i);
				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
				String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);

				WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Master')])[1]"));
				Actions actions1 = new Actions(driver);
				actions1.moveToElement(element).perform();
				actions1.click(element).perform();
				Test.log(Status.PASS, "Navigated to Master");

				mp.Master_Click();
				Test.log(Status.PASS, "Clicked on Master");

				mp.Vendor_Master();
				Test.log(Status.PASS, "Clicked on Vendor Master");
				Thread.sleep(4000);

				w.Create_Button();
				Test.log(Status.PASS, "Clicked on Create Button");
				Thread.sleep(4000);

				w.VendorType(VendorTypeManufacturer);
				Test.log(Status.PASS, "Selected Vendor Type: " + VendorTypeManufacturer);

				mp.Vendor_Name_SK(Vendor_Name_Manufacturer_Edit);
				Test.log(Status.PASS, "Entered Vendor Name: " + Vendor_Name_Manufacturer_Edit);

				w.Street(Street);
				Test.log(Status.PASS, "Entered Street: " + Street);

				w.Street1(Street1);
				Test.log(Status.PASS, "Entered Street1: " + Street1);

				w.Street2(Street2);
				Test.log(Status.PASS, "Entered Street2: " + Street2);
				Thread.sleep(1000);

				w.Country_DD_VT(Country);
				Test.log(Status.PASS, "Selected Country: " + Country);
				Thread.sleep(1000);

				w.State_DDI();
				Test.log(Status.PASS, "Selected State");
				Thread.sleep(1000);

				w.City_DDI();
				Test.log(Status.PASS, "Selected City");
				Thread.sleep(1000);

				w.Postal_Code(Postal_Code);
				Test.log(Status.PASS, "Entered Postal Code: " + Postal_Code);

				w.Submit_Button();
				Test.log(Status.PASS, "Clicked Submit Button");

				w.Yes();
				Test.log(Status.PASS, "Clicked Yes");

				w.Password_Fill.sendKeys(Pro.getProperty("Initiator_Password"));
				Test.log(Status.PASS, "Entered Initiator Password");

				w.Submit_Button2();
				Test.log(Status.PASS, "Clicked Submit Button 2");

				w.Ok();
				Test.log(Status.PASS, "Clicked OK");

				w.SearchBox(Vendor_Name_Manufacturer_Edit);
				Test.log(Status.PASS, "Searched for Vendor Name: " + Vendor_Name_Manufacturer_Edit);

				w.ViewButton();
				Test.log(Status.PASS, "Clicked View Button");
			}

		} catch (Exception e) {
			Test.log(Status.FAIL, "Test failed with exception: " + e.getMessage());
			throw e;
		} finally {
//			extent.flush();
			// driver.close();
		}
	}
}