
package A2_Master_Release;

import org.testng.annotations.Test;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_01_material_Master_Release_Update extends BaseClass {
	@Test
	public void Ordertypr() throws Exception {
		Test = extent.createTest("Material Master Raw Release Test");
		WmpsObj w = new WmpsObj(driver);

		Test.info("Logging in as Approver");
		WMPS_Login("Approver_ID", "Approver_Password");
		Test.pass("Logged in successfully");

		Test.info("Navigating to Second Level");
		w.Second_Level();
		Test.pass("Navigated to Second Level");

		Test.info("Reviewing Approval Category");
		w.ReviewApprovalCategory("Material Master Release");
		Test.pass("Reviewed Approval Category");

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
			Test.info("Clicking on Search Button");
			w.Search_Button();
			Test.pass("Clicked on Search Button");

			// w.SearchBox(MaterialMasterRM_Edit);
			// w.SearchBox(MaterialMasterRM);Thread.sleep(2000);
			// w.SearchBox(MaterialMasterSFP_Edit);
			// w.SearchBox(MaterialMasterSFP_Edit);

			// w.SearchBox(MaterialMasterSFP);Thread.sleep(2000);
			// w.SearchBox(MaterialMasterFP);Thread.sleep(2000);
			// ******************************************************************************************************

			Test.info("Clicking on Edit Action Button");
			w.Edit_Action_Button();
			Test.pass("Clicked on Edit Action Button");

			Thread.sleep(1000);

			Test.info("Adding Comments");
			w.Comments("Material_Master_Release");
			Test.pass("Added Comments");

			// ******************************************************************************************************
			Test.info("Performing Approver Action");
			w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
			Test.pass("Performed Approver Action");
			// *********************************************************************.*********************************

			Test.info("Submitting Form");
			w.Submit_Button();
			Test.pass("Submitted Form");

			w.Yes();

			Test.info("Entering Password");
			w.Password_Fill.sendKeys(Pro.getProperty("Approver_Password"));
			Test.pass("Entered Password");

			Test.info("Clicking on Submit Button");
			w.Submit_Button2();
			Test.pass("Clicked on Submit Button");

			Test.info("Clicking on OK Button");
			w.Ok();
			Test.pass("Clicked on OK Button");

			// ******************************************************************************************************
			// w.SearchBox(MaterialMasterRM);
			// w.SearchBox(MaterialMasterRM_Edit);//Vendor_Name_Manufacturer_Edit
			// ******************************************************************************************************
			// w.ViewButton();scrollPagedown();
			// w.Back_Button2();
		}
	}
}
