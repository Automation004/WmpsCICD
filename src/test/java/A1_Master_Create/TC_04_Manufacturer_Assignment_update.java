package A1_Master_Create;
import org.openqa.selenium.interactions.Actions;
import com.aventstack.extentreports.Status;
import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_04_Manufacturer_Assignment_update extends BaseClass {
	@org.testng.annotations.Test
	public void Manufacturer_Assignment() throws Exception {
		Test = extent.createTest("Manufacturer Assignment Test");
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);
		Actions actions = new Actions(driver);

		try {
			WMPS_Login("Initiator", "Initiator_Password");
			Test.log(Status.PASS, "Logged in successfully as Initiator");

			int rowcount = xls.getRowCount("Material_Master");
			Test.log(Status.INFO, "Row count from Material_Master: " + rowcount);

			mp.Master_Click();
			Test.log(Status.PASS, "Clicked on Master");

			mp.Manufacture_Master();
			Test.log(Status.PASS, "Clicked on Manufacture Master");
			Thread.sleep(2500);

			for (int i = 2; i <= 2; i++) {
				Test.log(Status.INFO, "Processing row " + i);

				String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
				String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
				String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
				String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
				String Vendor_Name_Supplier_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Supplier_Edit", i);
				String Vendor_Name_Manufacturer_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit",
						i);
				String fromdate = xls.getCellData("Manufacturer_Assignment", "fromdate", i);
				String todate = xls.getCellData("Manufacturer_Assignment", "todate", i);
				String VendorStatus = xls.getCellData("Manufacturer_Assignment", "VendorStatus", i);
				String VendorStatus2 = xls.getCellData("Manufacturer_Assignment", "VendorStatus2", i);
				String Comments = xls.getCellData("Manufacturer_Assignment", "Comments", i);
				String Date1MB = xls.getCellData("Date", "Date1MB", i);
				String DateToday = xls.getCellData("Date", "DateToday", i);
				String Date1ML = xls.getCellData("Date", "Date1ML", i);
				String Date2ML = xls.getCellData("Date", "Date2ML", i);
				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);

				w.Create_Button();
				Test.log(Status.PASS, "Clicked Create Button");

				w.DD_01M(MaterialMasterRM_Edit);
				Test.log(Status.PASS, "Selected Material Master RM Edit: " + MaterialMasterRM_Edit);
				Thread.sleep(4000);

				mp.Manfacturer_Name_Text(Vendor_Name_Manufacturer_Edit);
				Test.log(Status.PASS, "Entered Manufacturer Name: " + Vendor_Name_Manufacturer_Edit);

				w.VendorStatus(VendorStatus2);
				Test.log(Status.PASS, "Selected Vendor Status: " + VendorStatus2);

				w.typeDate(DateToday);
				Test.log(Status.PASS, "Entered From Date: " + DateToday);
				Thread.sleep(2000);

				try {
					w.todate(Date2ML);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Test.log(Status.PASS, "Entered To Date: " + Date2ML);

				w.Comments(Comments);
				Test.log(Status.PASS, "Entered Comments: " + Comments);
				Thread.sleep(2000);

				w.Save_Button();
				Test.log(Status.PASS, "Clicked Save Button");

				w.Yes();
				Test.log(Status.PASS, "Clicked Yes");

				w.Password_Fill.sendKeys(Pro.getProperty("Initiator_Password"));
				Test.log(Status.PASS, "Entered Initiator Password");

				w.Submit_Button();
				Test.log(Status.PASS, "Clicked Submit Button");

				w.Ok();
				Test.log(Status.PASS, "Clicked OK");

				w.SearchBox(MaterialMasterRM_Edit);
				Test.log(Status.PASS, "Searched for Material Master RM Edit: " + MaterialMasterRM_Edit);

				w.ViewButton();
				Test.log(Status.PASS, "Clicked View Button");
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