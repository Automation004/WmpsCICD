
package A2_Master_Release;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_01_Material_Master_Release_RM extends BaseClass {
	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		WMPS_Login("Approver_ID", "Approver_Password");
		w.Second_Level();
		w.ReviewApprovalCategory("Material Master Release");

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++) {
			// ******************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);

			String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
			String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i);
			// ******************************************************************************************************
			// ******************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ******************************************************************************************************
			w.Search_Button();
			// ******************************************************************************************************

			//w.SearchBox(MaterialMasterRM_Edit);
			// w.SearchBox(MaterialMasterRM);Thread.sleep(2000);
			// w.SearchBox(MaterialMasterSFP_Edit);
			// w.SearchBox(MaterialMasterSFP_Edit);

			// w.SearchBox(MaterialMasterSFP);Thread.sleep(2000);
			// w.SearchBox(MaterialMasterFP);Thread.sleep(2000);
			// ******************************************************************************************************

			w.Edit_Action_Button();
			Thread.sleep(1000);
			w.Comments("Material_Master_Release");// Thread.sleep(2000);
			// ******************************************************************************************************
			// w.ActionLevelApproverAction(Status);
			w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
			// *********************************************************************.*********************************
			w.Submit_Button();
			w.Yes();
			w.Password_Fill.sendKeys(Pro.getProperty("Approver_Password"));
			w.Submit_Button2();
			w.Ok();
			// ******************************************************************************************************

//			//w.SearchBox(MaterialMasterRM);
//			w.SearchBox(MaterialMasterRM_Edit);//Vendor_Name_Manufacturer_Edit
//			// ******************************************************************************************************
//			w.ViewButton();scrollPagedown();
//			w.Back_Button2();
		}
//		driver.close();
	}
}
