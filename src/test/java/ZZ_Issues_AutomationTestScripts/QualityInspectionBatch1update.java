package ZZ_Issues_AutomationTestScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class QualityInspectionBatch1update extends BaseClass {
	@org.testng.annotations.Test
	public static void Release() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		Test = extent.createTest("TC_03_Quality_Inspection_Release_1Batch_update");
		try {
			WMPS_Login("Approver_ID", "Approver_Password");
			Test.pass("Logged in with Approver credentials");
			w.Second_Level();
			Test.pass("Navigated to Second Level");
			w.ReviewApprovalCategory("Quality Inspection Release");
			Test.pass("Selected 'Quality Inspection Release' in Review Approval Category");
			w.Search_Button();
			Test.pass("Clicked on Search Button");
			int rowcount = xls.getRowCount("Material_Master");
			Test.pass("Fetched row count: " + rowcount);
			System.out.println(rowcount);

			for (int i = 2; i <= 2; i++) {
				String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
				String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
				String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
				String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i);
				String BatchNoFromGoodRecipt = xls.getCellData("VVI", "BatchNoFromGoodRecipt", i);
				String Material_Description = xls.getCellData("Excel_Data", "Material_Description", i);
				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
				String DateToday = xls.getCellData("Date", "DateToday", i);
				String BPR_Number_SFG_I = xls.getCellData("Dependency", "BPR_Number_SFG_I", i);
				String BPR_Number_SFG_II = xls.getCellData("Dependency", "BPR_Number_SFG_II", i);
				String Version_Number_SFP = xls.getCellData("Dependency", "Version_Number_SFP", i);
				String BPR_Number_FP_I = xls.getCellData("Dependency", "BPR_Number_FP_I", i);
				String BPR_Number_FP_II = xls.getCellData("Dependency", "BPR_Number_FP_II", i);
				String Remarks_Initiate = xls.getCellData("Bill_Of_Material", "Remarks_Initiate", i);
				String Remarks_Return = xls.getCellData("Bill_Of_Material", "Remarks_Return", i);
				String Remarks_ReInitiate = xls.getCellData("Bill_Of_Material", "Remarks_ReInitiate", i);
				String Remarks_Release = xls.getCellData("Bill_Of_Material", "Remarks_Release", i);

				Test.info("Entering Material Master in Search Box");
				w.SearchBox(MaterialMasterRM_Edit + " USDE");
				Test.pass("Entered Material Master in Search Box");
				Thread.sleep(2000);
				w.USDE();
				Test.pass("Navigated to USDE");
				w.ActionLevelApproverAction("Approve");
				Test.pass("Selected 'Approve' action");
				w.Comments("Quality_Inspection_Release");
				Test.pass("Entered comments for Quality Inspection Release");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@formcontrolname='RetestDate']")).click();
				Test.pass("Clicked on Retest Date input field");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@formcontrolname='ExpiryDate']")).click();
				Test.pass("Clicked on Expiry Date input field");
				Thread.sleep(6000);
				w.Submit();
				Test.pass("Clicked on Submit button");
				w.Yes();
				Test.pass("Confirmed action with Yes button");
				Thread.sleep(2000);
				w.Password_Fill(Pro.getProperty("Approver_Password"));
				Test.pass("Filled Approver Password");
				w.Submit_Button2();
				Test.pass("Clicked on Submit button to finalize");
				w.Ok();
				Test.pass("Clicked on Ok button");
				w.SearchBox(MaterialMasterRM_Edit);
				Test.pass("Searched for Material Master RM Edit");
				w.ViewButton();
				Test.pass("Clicked on View button");
				String MaterilaCodeText = driver.findElement(By.xpath("//input[@formcontrolname='MaterilaCode']"))
						.getAttribute("value");
				Assert.assertEquals(MaterilaCodeText.trim(), MaterialMasterRM_Edit.trim(),
						"Material Code is mismatched in view");
				Test.pass("Verified Material Code matches the expected value");
				scrollPagedown();
				Test.pass("Scrolled down the page");
				w.Back_Button2();
				Test.pass("Clicked on Back button");

				// open new browser instance
				// suiteSetUp();
				//// Second login and actions
				// WMPS_Login("Approver_BOM", "Password_BOM");
				// Test.pass("Logged in with BOM Approver credentials");
				// w.Second_Level();
				// Test.pass("Navigated to Second Level");
				// w.ReviewApprovalCategory("Bill Of Material Release");
				// Test.pass("Selected 'Bill Of Material Release' in Review Approval Category");
				//
				// w.Search_Button();
				// Test.pass("Clicked on Search Button");
				//
				// for (int i = 2; i <= 2; i++) {
				// String BPR_Number_SFG_I = xls.getCellData("Dependency", "BPR_Number_SFG_I",
				//// i);
				// String Version_Number_SFP = xls.getCellData("Dependency",
				//// "Version_Number_SFP", i);
				// String DateToday = xls.getCellData("Date", "DateToday", i);
				// String Remarks_Release = xls.getCellData("Bill_Of_Material",
				//// "Remarks_Release", i);
				// String ApproverPassword = xls.getCellData("Changable_Data",
				//// "ApproverPassword", i);
				// w.SearchBox(BPR_Number_SFG_I + " " + Version_Number_SFP);
				// Test.pass("Searched for BPR Number SFG I and Version Number SFP");
				// w.Edit_Action_Button();
				// Test.pass("Clicked on Edit Action Button");
				//
				// Thread.sleep(2000);
				// w.EffectiveDate(DateToday);
				// Test.pass("Entered Effective Date");
				//
				// w.Comments(Remarks_Release);
				// Test.pass("Entered comments for Release");
				//
				// Thread.sleep(2000);
				// w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
				// Test.pass("Selected action from properties file");
				// w.Submit();
				// Test.pass("Clicked on Submit button");
				//
				// w.Yes();
				// Test.pass("Confirmed action with Yes button");
				//
				// w.Password_Fill(ApproverPassword);
				// Test.pass("Filled Approver Password");
				//
				// w.Submit_Button2();
				// Test.pass("Clicked on Submit button to finalize");
				//
				// w.Ok();
				// Test.pass("Clicked on Ok button");
				// w.SearchBox(BPR_Number_SFG_I);
				// Test.pass("Searched for BPR Number SFG I");
				//
				// w.ViewButton();
				// Test.pass("Clicked on View button");
				//
				// scrollPagedown();
				// Test.pass("Scrolled down the page");
				//
				// w.Back_Button2();
				// Test.pass("Clicked on Back button");
			}
		} catch (Exception e) {
			Test.fail("Test failed: " + e.getMessage());
		}
	}
}
