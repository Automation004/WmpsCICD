package A2_Master_Release;

import org.testng.annotations.Test;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_03_ManufacturerAssignmentRelease_Update extends BaseClass {
	@Test
	public void Ordertypr() throws Exception {
		Test = extent.createTest("Manufacturer Assignment Test");

		WmpsObj w = new WmpsObj(driver);
		Test.info("Logging in as Approver");
		WMPS_Login("Approver_ID", "Approver_Password");
		Test.pass("Logged in successfully");

		Test.info("Navigating to Second Level");
		w.Second_Level();
		Test.pass("Navigated to Second Level");

		Test.info("Reviewing Approval Category");
		w.ReviewApprovalCategory("Manufacture Assignment Release");
		Test.pass("Reviewed Approval Category");

		Test.info("Clicking on Search Button");
		w.Search_Button();
		Test.pass("Clicked on Search Button");

		int rowcount = xls.getRowCount("Material_Master");
		Test.info("Total row count: " + rowcount);

		for (int i = 2; i <= 2; i++) {
			// ********************************************************************************
			// ********************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
			// ********************************************************************************
			// ********************************************************************************
			String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
			String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
			// ********************************************************************************
			String Vendor_Name_Supplier_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Supplier_Edit", i);
			String Vendor_Name_Manufacturer_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit", i);
			// ********************************************************************************
			String DateToday = xls.getCellData("Date", "DateToday", i);
			// ********************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ********************************************************************************
			Test.info("Searching for Material Master RM Edit");
			w.SearchBox(MaterialMasterRM_Edit);
			Test.pass("Searched for Material Master RM Edit");

			Test.info("Clicking on Edit Action Button");
			w.Edit_Action_Button();
			Test.pass("Clicked on Edit Action Button");

			Test.info("Adding Comments");
			w.Comments("Vendor_Master_Release");
			Test.pass("Added Comments");

			Test.info("Performing Approver Action");
			w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
			Test.pass("Performed Approver Action");

			Test.info("Clicking on Save Button");
			w.Save_Button();
			Test.pass("Clicked on Save Button");

			Test.info("Confirming Action");
			w.Yes();
			Test.pass("Confirmed Action");

			Test.info("Entering Approver Password");
			w.Password_Fill.sendKeys(Pro.getProperty("Approver_Password"));
			Test.pass("Entered Approver Password");

			Test.info("Clicking on Submit Button");
			w.Submit_Button();
			Test.pass("Clicked on Submit Button");

			Test.info("Clicking on OK Button");
			w.Ok_Button();
			Test.pass("Clicked on OK Button");
		}
	}
}
