
package ZZ_Issues_AutomationTestScripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_01_Material_Master_Release_RM extends BaseClass {
	@Test
	public static void Ordertypr() throws Exception {
		Test = extent.createTest("Purchase Order Update Test");
		WmpsObj w = new WmpsObj(driver);

		try {
			Test.log(Status.INFO, "Logging in as Approver");
			WMPS_Login("Approver_ID", "Approver_Password");
			Test.log(Status.PASS, "Logged in successfully as Approver");

			w.Second_Level();
			Test.log(Status.INFO, "Navigated to second level");

			w.ReviewApprovalCategory("Material Master Release");
			Test.log(Status.INFO, "Reviewing Approval Category: Material Master Release");

			int rowcount = xls.getRowCount("Material_Master");
			Test.log(Status.INFO, "Row count from Material_Master sheet: " + rowcount);

			for (int i = 2; i <= 2; i++) {
				try {
					//change data
					String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
					//////////
					// Fetch data from Excel
					String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
					String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
					String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i);
					String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
					String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
					String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);

					Test.log(Status.INFO, "Fetched data from Excel for row " + i);

					w.Search_Button();
					Test.log(Status.INFO, "Clicked on Search button");

					w.SearchBox(MaterialMasterRM_Edit);
					Test.log(Status.INFO, "Searched for " + MaterialMasterSFP);

					w.Edit_Action_Button();
					Thread.sleep(1000);
					Test.log(Status.INFO, "Clicked on Edit Action Button");

					w.Comments("Material_Master_Release");
					Test.log(Status.INFO, "Entered comments for Material Master Release");

					w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
					Test.log(Status.INFO, "Performed Action Level Approver Action");

					w.Submit_Button();
					w.Yes();
					w.Password_Fill.sendKeys(Pro.getProperty("Approver_Password"));
					w.Submit_Button2();
					w.Ok();
					Test.log(Status.PASS, "Submitted and approved action for Material Master");

					// Uncomment and update as needed for further steps
					// w.SearchBox(MaterialMasterRM_Edit);
					// w.ViewButton();
					// scrollPagedown();
					// w.Back_Button2();
				} catch (Exception e) {
					Test.log(Status.FAIL, "An error occurred while processing row " + i + ": " + e.getMessage());
				}
			}
		} catch (Exception e) {
			Test.log(Status.FAIL, "An error occurred during the test: " + e.getMessage());
		} finally {
//			driver.close();
			Test.log(Status.INFO, "Closed the driver");
		}
	}
}