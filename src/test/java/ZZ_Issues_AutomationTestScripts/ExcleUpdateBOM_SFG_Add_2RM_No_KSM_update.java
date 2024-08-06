package ZZ_Issues_AutomationTestScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class ExcleUpdateBOM_SFG_Add_2RM_No_KSM_update extends BaseClass {
	static String BPR_Number_SFG_I;
	static String DateToday;
	static String Remarks_Release;
	static String BOM_Password;
	static WmpsObj w;
	private Map<String, String> testData = new HashMap<>();

	private void extractTestData() throws Exception {
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);

		for (int i = 2; i <= 3; i++) {
			testData.put("BPR_Number_SFG_I", xls.getCellData("Dependency", "BPR_Number_SFG_I", i));
			testData.put("Version_Number_SFP", xls.getCellData("Dependency", "Version_Number_SFP", i));
			testData.put("BatchSize", xls.getCellData("Bill_Of_Material", "BatchSize", i));
			testData.put("BPR_Number_SFG_II", xls.getCellData("Dependency", "BPR_Number_SFG_II", i));
			testData.put("MaterialMasterRM_Edit", xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i));
			testData.put("MaterialCodeSFP", xls.getCellData("Excel_Data", "MaterialCodeSFP", i));
			testData.put("Stage", xls.getCellData("Excel_Data", "Stage", i));
			testData.put("Remarks_Initiate", xls.getCellData("Bill_Of_Material", "Remarks_Initiate", i));
			testData.put("Remarks_Return", xls.getCellData("Bill_Of_Material", "Remarks_Return", i));
			testData.put("Remarks_ReInitiate", xls.getCellData("Bill_Of_Material", "Remarks_ReInitiate", i));
			testData.put("Remarks_Release", xls.getCellData("Bill_Of_Material", "Remarks_Release", i));
			testData.put("BatchSizeEdit", xls.getCellData("Bill_Of_Material", "BatchSizeEdit", i));
			testData.put("BPR_Type", xls.getCellData("Bill_Of_Material", "BPR_Type", i));
			testData.put("Number_Of_Lots", xls.getCellData("Bill_Of_Material", "Number_Of_Lots", i));
			testData.put("StandardQuantity", xls.getCellData("Bill_Of_Material", "StandardQuantity", i));
			testData.put("DateToday", xls.getCellData("Date", "DateToday", i));
			testData.put("InitiatorPassword", xls.getCellData("Changable_Data", "InitiatorPassword", i));
			testData.put("ApproverPassword", xls.getCellData("Changable_Data", "ApproverPassword", i));
			testData.put("BOM_Password", xls.getCellData("Changable_Data", "BOM_Password", i));
			testData.put("WrongPassword", xls.getCellData("Changable_Data", "WrongPassword", i));
			testData.put("High1", xls.getCellData("Bill_Of_Material", "High1", i));
			testData.put("Low1", xls.getCellData("Bill_Of_Material", "Low1", i));
			testData.put("High2", xls.getCellData("Bill_Of_Material", "High2", i));
			testData.put("Low2", xls.getCellData("Bill_Of_Material", "Low2", i));
		}
	}

	@Test
	public void BillOfMaterialCreate() throws Exception {
		extractTestData();

		Test = extent.createTest("Bill of Material Create Test");

		try {
			Test.info("Logging in with Initiator_BOM credentials");
			WMPS_Login("Initiator_BOM", "Initiator_BOM_Password");
			Test.pass("Logged in successfully");

			Test.info("Navigating to Production");
			w.Production();
			Test.pass("Navigated to Production");

			Test.info("Navigating to Bill of Material");
			w.BillOfMaterial();
			Test.pass("Navigated to Bill of Material");

			Test.info("Clicking Create Button");
			w.Create_Button();
			Test.pass("Create Button clicked");

			Test.info("Selecting SemiFinished Product");
			w.DD_01(testData.get("MaterialCodeSFP") + "-" + testData.get("MaterialMasterRM_Edit") + "-"
					+ testData.get("Stage"));
			Thread.sleep(4000);
			Test.pass("Selected SemiFinished Product");

			Test.info("Entering Batch Size");
			w.BatchSize(testData.get("BatchSize"));
			Test.pass("Entered Batch Size" + testData.get("BatchSize"));

			Test.info("Selecting Received UOM");
			w.RecievedUOM_SK("KG");
			Test.pass("Selected Received UOM");

			Test.info("Entering BPR Number");
			w.BPR_Number(testData.get("BPR_Number_SFG_I"));
			Thread.sleep(2000);
			Test.pass("Entered BPR Number");

			Test.info("Entering Version Number");
			w.Version_Number(testData.get("Version_Number_SFP"));
			Thread.sleep(1000);
			Test.pass("Entered Version Number");

			Test.info("Selecting BPR Type");
			w.BPRType(testData.get("BPR_Type"));
			Test.pass("Selected BPR Type");

			Test.info("Entering Remarks" + testData.get("BPR_Number_SFG_I"));
			w.Remarks(testData.get("BPR_Number_SFG_I"));
			Test.pass("Entered Remarks");

			boolean isDisplay = driver.findElement(By.xpath("//*[@formcontrolname='protocolNumber']")) != null;
			if (isDisplay) {
				driver.findElement(By.xpath("//*[@formcontrolname='protocolNumber']")).sendKeys("35");
			}
			Test.info("Clicking Proceed Button");
			w.Proceed_Button();
			Thread.sleep(2000);
			Test.pass("Clicked Proceed Button");

			Test.info("Selecting Raw Material 1");
			w.DD_02(Pro.getProperty("RawMaterial1"));
			Test.pass("Selected Raw Material 1");

			Test.info("Entering Number of Lots" + testData.get("Number_Of_Lots"));
			w.Type_Search_04(testData.get("Number_Of_Lots"));
			Test.pass("Entered Number of Lots");

			Test.info("Entering Standard Quantity" + (testData.get("StandardQuantity")));
			if (isDisplay) {
				w.TT_08(testData.get("StandardQuantity")); // StandardQuantity
			} else {
				w.TT_7(testData.get("StandardQuantity")); // StandardQuantity
			}

			Test.info("Selecting UOM for Raw Material 1");
			Select UOM11 = new Select(driver.findElement(By.xpath(
					"/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[6]/select")));
			UOM11.selectByIndex(0);
			Thread.sleep(2000);
			Test.pass("Selected UOM for Raw Material 1");

			Test.info("Clicking Manage Lots Plus Button for Raw Material 1");
			driver.findElement(By.xpath(
					"(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[8]/button[1])[1]"))
					.click();
			Thread.sleep(4000);
			Test.pass("Clicked Manage Lots Plus Button for Raw Material 1");

			Test.info("Entering High and Low Values for Raw Material 1");
			if (isDisplay) {
				w.TT_12(testData.get("High1")); // High
				w.TT_13(testData.get("Low1")); // Low
				w.TT_14(testData.get("High2")); // High
				w.TT_15(testData.get("Low2")); // Low
			} else {
				w.TT_11(testData.get("High1")); // High
				w.TT_12(testData.get("High2")); // Low
				w.TT_13(testData.get("High2")); // High
				w.TT_14(testData.get("High2")); // Low
			}
			Test.pass("Entered High and Low Values for Raw Material 1");

			Test.info("Clicking Action Plus Button for Raw Material 1");
			driver.findElement(By.xpath(
					"/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody[1]/tr[1]/td[9]/button[1]/i"))
					.click();
			Thread.sleep(2000);
			Test.pass("Clicked Action Plus Button for Raw Material 1");

			Test.info("Selecting Raw Material 2");
			w.DD_03(Pro.getProperty("RawMaterial2"));
			Test.pass("Selected Raw Material 2");

			Test.info("Entering Number of Lots for Raw Material 2");
			w.Type_Search_06(testData.get("Number_Of_Lots"));
			Test.pass("Entered Number of Lots for Raw Material 2");

			Test.info("Entering Standard Quantity for Raw Material 2");
			if (isDisplay) {
				w.TT_17(testData.get("StandardQuantity")); // StandardQuantity
			} else {
				w.TT_16(testData.get("StandardQuantity")); // StandardQuantity
			}
			Test.pass("Entered Standard Quantity for Raw Material 2");

			Test.info("Selecting UOM for Raw Material 2");
			Select UOM22 = new Select(driver.findElement(By.xpath(
					"/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody[2]/tr/td[6]/select")));
			UOM22.selectByIndex(0);
			Thread.sleep(2000);
			Test.pass("Selected UOM for Raw Material 2");

			Test.info("Clicking Manage Lots Plus Button for Raw Material 2");
			driver.findElement(By.xpath(
					"(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[8]/button[1])[2]"))
					.click();
			Thread.sleep(4000);
			Test.pass("Clicked Manage Lots Plus Button for Raw Material 2");

			Test.info("Entering High and Low Values for Raw Material 2");
			if (isDisplay) {
				w.TT_21_CSE(testData.get("High1")); // High
				w.TT_22_CSE(testData.get("Low1"));// Low
				w.TT_23_CSE(testData.get("High2")); // High
				w.TT_24_CSE(testData.get("Low2")); // Low
			} else {
				w.TT_20_CSE(testData.get("High1"));
				w.TT_21_CSE(testData.get("Low1"));
				w.TT_22_CSE(testData.get("High2"));
				w.TT_23_CSE(testData.get("Low2"));
			}
			Test.pass("Entered High and Low Values for Raw Material 2");

			Test.info("Clicking Action Plus Button for Raw Material 2");
			driver.findElement(By.xpath(
					"/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody[2]/tr/td[9]/button[1]/i"))
					.click();
			Thread.sleep(2000);
			Test.pass("Clicked Action Plus Button for Raw Material 2");

			Test.info("Clicking Submit Button");
			w.Submit_Button();
			Thread.sleep(2000);
			Test.pass("Clicked Submit Button");

		} catch (Exception e) {
			Test.fail("Test failed due to exception: " + e.getMessage());
			throw e;
		}
	}

	@Test // (dependsOnMethods = "BillOfMaterialCreate")
	public void BillOfMaterialRelease() throws Exception {
		extractTestData();

		Test = extent.createTest("Purchase Order Approval Test");
		w = new WmpsObj(driver);
		try {
			// Second login and actions
			WMPS_Login("Approver_BOM", "Password_BOM");
			Test.pass("Logged in with BOM Approver credentials");

			w.Second_Level();
			Test.pass("Navigated to Second Level");

			Test.info("Selecting Bill Of Material Release category");
			w.ReviewApprovalCategory("Bill Of Material Release");
			Test.pass("Selected Bill Of Material Release category");

			Test.info("Clicking Search Button");
			w.Search_Button();
			Test.pass("Clicked Search Button");

			Test.info("Searching for the BPR Number");
			w.SearchBox(testData.get("BPR_Number_SFG_I"));
			Test.pass("Searched for the BPR Number");

			Test.info("Clicking Edit Action Button");
			w.Edit_Action_Button();
			Thread.sleep(2000);
			Test.pass("Clicked Edit Action Button");

			Test.info("Entering Effective Date");
			w.EffectiveDate(testData.get("DateToday")); // today date required
			Thread.sleep(2000);
			Test.pass("Entered Effective Date");

			Test.info("Entering Comments");
			w.Comments(testData.get("Remarks_Release"));
			Thread.sleep(2000);
			Test.pass("Entered Comments");

			Test.info("Performing Action Level Approver Action");
			w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
			Test.pass("Performed Action Level Approver Action");

			Test.info("Clicking Submit Button");
			w.Submit();
			Test.pass("Clicked Submit Button");

			Test.info("Confirming Submission");
			w.Yes();
			Test.pass("Submission Confirmed");

			Test.info("Entering BOM Password");
			w.Password_Fill(Pro.getProperty("Password_BOM"));
			Test.pass("Entered BOM Password");

			Test.info("Clicking Submit Button");
			w.Submit_Button2();
			Test.pass("Clicked Submit Button");

			Test.info("Clicking Ok Button");
			w.Ok();
			Test.pass("Clicked Ok Button");

			Test.info("Searching for the BPR Number");
			w.SearchBox(testData.get("BPR_Number_SFG_I"));

			Test.pass("Searched for the BPR Number");

			Test.info("Viewing the BOM details");
			w.ViewButton();
			Test.pass("Viewing the BOM details");

			Test.info("Scrolling down the page");
			scrollPagedown();
			Test.pass("Scrolled down the page");

			Test.info("Clicking on Back Button");
			w.Back_Button2();
			Test.pass("Clicked on Back Button");
		} catch (Exception e) {
			Test.fail("Test failed due to an exception: " + e.getMessage());
			throw e;
		}
	} 
}