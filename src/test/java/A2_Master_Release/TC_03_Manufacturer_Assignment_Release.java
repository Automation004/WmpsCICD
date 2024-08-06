package A2_Master_Release;

import org.openqa.selenium.By;
import org.testng.asserts.Assertion;
import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_03_Manufacturer_Assignment_Release extends BaseClass {

	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		Test = extent.createTest("Manufacturer Assignment Test");
		WMPS_Login("Approver_ID", "Approver_Password");
		w.Second_Level();
		w.ReviewApprovalCategory("Manufacture Assignment Release");
		w.Search_Button();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++) {

			// ******************************************************************************************************
			// ******************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
			// ******************************************************************************************************
			// ******************************************************************************************************
			String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
			String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
			// ******************************************************************************************************
			String Vendor_Name_Supplier_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Supplier_Edit", i);
			String Vendor_Name_Manufacturer_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit", i);
			// ******************************************************************************************************
			String DateToday = xls.getCellData("Date", "DateToday", i);
			// ******************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ******************************************************************************************************
			// ******************************************************************************************************
			// w.SearchBox(Vendor_Name_Supplier);
			w.SearchBox(MaterialMasterRM_Edit);
			// ******************************************************************************************************
			w.Edit_Action_Button();
//			String tentativeDataText = driver.findElement(By.xpath("//input[@type='date']")).getAttribute("value");
//			Assertion s = new Assertion();
//			s.assertEquals(DateToday, tentativeDataText, "Given Date and Getting Date is not matched");
			w.Comments("Vendor_Master_Release");
			// ******************************************************************************************************
			// w.ActionLevelApproverAction(Status);
			w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
			// ******************************************************************************************************
			w.Save_Button();
			w.Yes();
			w.Password_Fill.sendKeys(Pro.getProperty("Approver_Password"));
			w.Submit_Button();
			w.Ok_Button();
			// ******************************************************************************************************

			// //w.SearchBox(Vendor_Name_Supplier);
			// w.SearchBox(MaterialMasterRM_Edit);
			// w.ViewButton();scrollPagedown();
			// w.Back_Button2();
			// ******************************************************************************************************
		}
		// driver.close();
	}

}
