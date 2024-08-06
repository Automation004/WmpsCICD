
package A2_Master_Release;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_02_Vendor_Master_Release_Manuf extends BaseClass {

	@org.testng.annotations.Test
	public static void Vendor_Master_Release_Manuf() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		WMPS_Login("Approver_ID", "Approver_Password");
		w.Second_Level();
		w.ReviewApprovalCategory("Vendor Master Release");
		int rowcount = xls.getRowCount("VendorMaster");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++)
		{
			// ******************************************************************************************************
			String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
			String Vendor_Name_Manufacturer_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit", i);
			// ******************************************************************************************************
			// ******************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ******************************************************************************************************
			Thread.sleep(2000);
			w.Search_Button();
			// ******************************************************************************************************
			//w.SearchBox(Vendor_Name_Manufacturer);
			w.SearchBox(Vendor_Name_Manufacturer_Edit);// Vendor_Name_Manufacturer_Edit
			// ******************************************************************************************************
			w.Edit_Action_Button();
			w.Comments("Vendor_Master_Release");
			// ******************************************************************************************************
			//w.ActionLevelApproverAction(Status);
			w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
			// ******************************************************************************************************
			w.Submit_Button();w.Yes();
			w.Password_Fill.sendKeys(Pro.getProperty("Approver_Password"));
			w.Submit_Button2();w.Ok();
			// ******************************************************************************************************
			//w.SearchBox(Vendor_Name_Manufacturer);
			w.SearchBox(Vendor_Name_Manufacturer_Edit);// Vendor_Name_Manufacturer_Edit
			// ******************************************************************************************************
			w.ViewButton();
			//scrollPagedown();
		}
		driver.close();
	}
}
