package A2_Master_Release;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_02_Vendor_Master_Release_Supplier extends BaseClass {

	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception {
		WmpsObj w = new WmpsObj(driver);

		WMPS_Login("Approver_ID", "Approver_Password");
		w.Second_Level();
		w.ReviewApprovalCategory("Vendor Master Release");
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++)
		{
			// ******************************************************************************************************
			String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
			String Vendor_Name_Supplier_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Supplier_Edit", i);
			// ******************************************************************************************************
			// ******************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ******************************************************************************************************
			Thread.sleep(2000);
			w.Search_Button();
			// ******************************************************************************************************
			//w.SearchBox(Vendor_Name_Supplier);
			w.SearchBox(Vendor_Name_Supplier_Edit);
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
			//w.SearchBox(Vendor_Name_Supplier);
			w.SearchBox(Vendor_Name_Supplier_Edit);
			// ******************************************************************************************************
			w.ViewButton();scrollPagedown();
		}
//		driver.close();

	}
}
