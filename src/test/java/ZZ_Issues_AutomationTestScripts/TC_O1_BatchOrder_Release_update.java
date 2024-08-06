package ZZ_Issues_AutomationTestScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_O1_BatchOrder_Release_update extends BaseClass {
	static WebDriverWait wait;
	static WmpsObj w;
	static String Batch_Number_SFG_I;
	static String Approver_Password;
	static String MaterialMasterRM_Edit;

	@Test
	public void GoodsIssueRelease() throws Exception {
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= rowcount; i++) {
			// ********************************************************************************************************************
			String Batch_Number_SFG_I = xls.getCellData("Dependency", "Batch_Number_SFG_I", i); // *****************
			String Batch_Number_SFG_II = xls.getCellData("Dependency", "Batch_Number_SFG_II", i); // *****************
			String Batch_Number_II = xls.getCellData("Dependency", "Batch_Number_II", i); // For Semifinished_02 Product
			String Batch_Number_FP = xls.getCellData("Dependency", "Batch_Number_FP", i); // *********
			// ********************************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
			String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i);
			// ********************************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ********************************************************************************************************************

			Test = extent.createTest("Goods Issue Mat Release Test - Row " + i);
			w = new WmpsObj(driver);
			try {
				Test.info("Logging in with Approver credentials");
				WMPS_Login("Approver_ID", "Approver_Password");
				Test.pass("Logged in successfully");

				Test.info("Navigating through menu");
				w.Menu_Navigate();
				w.Menu_Navigate();
				w.Second_Level();
				Test.pass("Navigated through menu");

				Test.info("Selecting Review Approval Category");
				w.ReviewApprovalCategory("Goods Issue ag(st) Mat Req Release");
				Test.pass("Selected Review Approval Category");

				Test.info("Clicking Search Button");
				w.Search_Button();
				Test.pass("Clicked Search Button");

				Test.info("Entering Batch Number in Search Box");
				w.SearchBox(Batch_Number_SFG_I);
				Test.pass("Entered Batch Number in Search Box");

				Test.info("Clicking Edit Action Button");
				w.Edit_Action_Button();
				Test.pass("Clicked Edit Action Button");

				Test.info("Performing Approver Action");
				w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
				Test.pass("Performed Approver Action");

				Test.info("Entering Comments");
				w.Comments("Batch_Order_Release");
				Thread.sleep(2000);
				Test.pass("Entered Comments");

				Test.info("Submitting Form");
				w.Submit();
				w.Yes();
				Test.pass("Submitted Form");

				Test.info("Entering Approver Password");
				w.Password_Fill(Pro.getProperty(Approver_Password));
				Test.pass("Entered Approver Password");

				Test.info("Clicking Submit Button");
				w.Submit_Button2();
				w.Ok();
				Test.pass("Clicked Submit Button");

				Test.info("Re-entering Batch Number in Search Box");
				w.SearchBox(Batch_Number_SFG_I);
				Test.pass("Re-entered Batch Number in Search Box");

				Test.info("Clicking View Button");
				w.ViewButton();
				Test.pass("Clicked View Button");

				Test.info("Clicking Back Button");
				w.Back_Button2();
				Test.pass("Clicked Back Button");

			} catch (Exception e) {
				Test.fail("Test failed due to exception: " + e.getMessage());
				throw e;
			} finally {
				Test.pass("Logged out as Approver");
			}
		}
	}

}