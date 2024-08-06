package ZZ_Issues_AutomationTestScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_05_02_BOM_SFG_Add_2RM_No_KSM_update extends BaseClass {
	static String BPR_Number_SFG_I;
	static String DateToday;
	static String Remarks_Release;
	static String BOM_Password;
	static WmpsObj w;
	private static Map<String, String> testData = new HashMap<>();

	@BeforeClass()
	public void setUp() {
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++) {
			testData.put("BPR_Number_SFG_I", xls.getCellData("Dependency", "BPR_Number_SFG_I", i));
			testData.put("DateToday", xls.getCellData("Dependency", "DateToday", i));
			Remarks_Release = xls.getCellData("Bill_Of_Material", "Remarks_Release", i);
		}
	}

	@org.testng.annotations.Test
	public static void BillOfMaterialCreate() throws Exception {
		boolean isExistesprotocolNumber = false;
		WmpsObj w = new WmpsObj(driver);
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

			int rowcount = xls.getRowCount("Material_Master");
			System.out.println(rowcount);

			for (int i = 2; i <= 2; i++) {
				// Always Change***********
				BPR_Number_SFG_I = xls.getCellData("Dependency", "BPR_Number_SFG_I", i); //
				// Change Everytime
				String Version_Number_SFP = xls.getCellData("Dependency", "Version_Number_SFP", i); // create Test
				String BatchSize = xls.getCellData("Bill_Of_Material", "BatchSize", i); //
				// **************************************************
				String BPR_Number_SFG_II = xls.getCellData("Dependency", "BPR_Number_SFG_II", i); // Change Everytime
				String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
				String MaterialCodeSFP = xls.getCellData("Excel_Data", "MaterialCodeSFP", i);
				String Stage = xls.getCellData("Excel_Data", "Stage", i);
				String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);

				String Remarks_Initiate = xls.getCellData("Bill_Of_Material", "Remarks_Initiate", i);
				String Remarks_Return = xls.getCellData("Bill_Of_Material", "Remarks_Return", i);
				String Remarks_ReInitiate = xls.getCellData("Bill_Of_Material", "Remarks_ReInitiate", i);
				Remarks_Release = xls.getCellData("Bill_Of_Material", "Remarks_Release", i);
				String BatchSizeEdit = xls.getCellData("Bill_Of_Material", "BatchSizeEdit", i); // 6000
				String BPR_Type = xls.getCellData("Bill_Of_Material", "BPR_Type", i);
				String Number_Of_Lots = xls.getCellData("Bill_Of_Material", "Number_Of_Lots", i); // 2
				String StandardQuantity = xls.getCellData("Bill_Of_Material", "StandardQuantity", i); // 500
				DateToday = xls.getCellData("Date", "DateToday", i);
				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String BOM_Password = xls.getCellData("Changable_Data", "BOM_Password", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
				String High1 = xls.getCellData("Bill_Of_Material", "High1", i); // 80
				String Low1 = xls.getCellData("Bill_Of_Material", "Low1", i); // 30
				String High2 = xls.getCellData("Bill_Of_Material", "High2", i); // 80
				String Low2 = xls.getCellData("Bill_Of_Material", "Low2", i); // 20

				if (BPR_Type == "Validation Order") {
					isExistesprotocolNumber = true;
				}
				Test.info("Selecting SemiFinished Product");
				// w.DD_01(MaterialCodeSFP + "-" + MaterialMasterRM_Edit + "-" + Stage);
				w.DD_01(MaterialMasterSFP);
				Thread.sleep(1500);
				Test.pass("Selected SemiFinished Product");

				Test.info("Entering Batch Size");
				w.BatchSize(BatchSize); // 5000
				Test.pass("Entered Batch Size" + BatchSize);

				Test.info("Selecting Received UOM");
				w.RecievedUOM_SK("KG");
				Test.pass("Selected Received UOM");

				Test.info("Entering BPR Number");
				w.BPR_Number(BPR_Number_SFG_I);
				Thread.sleep(2000);
				Test.pass("Entered BPR Number");

				Test.info("Entering Version Number");
				// w.Version_Number(Version_Number_SFP);
				w.Version_Number(Pro.getProperty("VersionNumber"));
				Thread.sleep(1000);
				Test.pass("Entered Version Number");

				Test.info("Selecting BPR Type");
				w.BPRType(BPR_Type);
				Test.pass("Selected BPR Type");

				Test.info("Entering Remarks" + BPR_Number_SFG_I);
				w.Remarks(BPR_Number_SFG_I);
				Test.pass("Entered Remarks");

				if (isExistesprotocolNumber) {
					WebElement protocolNumberElement = driver
							.findElement(By.xpath("//*[@formcontrolname='protocolNumber']"));
					protocolNumberElement.sendKeys("35");
				}
				Test.info("Clicking Proceed Button");
				w.Proceed_Button();
				Thread.sleep(1500);
				Test.pass("Clicked Proceed Button");

				scrollPagedownSlow();
				Test.info("Selecting Raw Material 1");
				w.DD_02(Pro.getProperty("RawMaterial1"));
				Test.pass("Selected Raw Material 1");

				Test.info("Entering Number of Lots" + Number_Of_Lots);
				w.Type_Search_04(Number_Of_Lots);
				Test.pass("Entered Number of Lots");
				scrollPagedownSlow();

				Test.info("Entering Standard Quantity" + StandardQuantity);
				if (isExistesprotocolNumber) {
					w.TT_08(StandardQuantity); // StandardQuantity
				} else {
					w.TT_7(StandardQuantity); // StandardQuantity
				}
				Test.pass("Entered Standard Quantity");

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
				if (isExistesprotocolNumber) {
					w.TT_12(High1); // High
					w.TT_13(Low1); // Low
					w.TT_14(High2); // High
					w.TT_15(Low2); // Low
				} else {
					w.TT_11(High1); // High
					w.TT_12(Low1); // Low
					w.TT_13(High2); // High
					w.TT_14(Low2); // Low
				}
				Test.pass("Entered High and Low Values for Raw Material 1");

				Test.info("Clicking Action Plus Button for Raw Material 1");
				driver.findElement(By.xpath(
						"/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody[1]/tr[1]/td[9]/button[1]/i"))
						.click();
				Thread.sleep(2000);
				Test.pass("Clicked Action Plus Button for Raw Material 1");
				scrollPagedownSlow();

				Test.info("Selecting Raw Material 2");
				w.DD_03(Pro.getProperty("RawMaterial2"));
				Test.pass("Selected Raw Material 2");

				Test.info("Entering Number of Lots for Raw Material 2");
				w.Type_Search_06(Number_Of_Lots);
				Test.pass("Entered Number of Lots for Raw Material 2");

				Test.info("Entering Standard Quantity for Raw Material 2");
				if (isExistesprotocolNumber) {
					w.TT_17(StandardQuantity); // StandardQuantity
				} else {
					w.TT_16(StandardQuantity); // StandardQuantity
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
				Test.pass("Clicked Manage Lots Plus Button for Raw Material 2");

				Test.info("Entering High and Low Values for Raw Material 2");
				if (isExistesprotocolNumber) {
					w.TT_21_CSE(High1); // High
					w.TT_22_CSE(Low1); // Low
					w.TT_23_CSE(High2); // High
					w.TT_24_CSE(Low2); // Low
				} else {
					w.TT_20_CSE(High1); // High
					w.TT_21_CSE(Low1); // Low
					w.TT_22_CSE(High2); // High
					w.TT_23_CSE(Low2); // Low }
				}
				Test.pass("Entered High and Low Values for Raw Material 2");

				Test.info("Clicking Submit Button");
				w.Submit_Button();
				Test.pass("Clicked Submit Button");

				Test.info("Confirming Submission");
				w.Yes();
				Test.pass("Submission Confirmed");

				Test.info("Entering Initiator Password");
				w.Password_Fill(Pro.getProperty("Initiator_BOM_Password"));
				Test.pass("Entered Initiator Password");

				Test.info("Clicking Submit Button");
				w.Submit_Button2();
				Test.pass("Clicked Submit Button");

				Test.info("Clicking Ok Button");
				w.Ok();
				Test.pass("Clicked Ok Button");

				Test.info("Searching for the BPR Number");
				w.SearchBox(BPR_Number_SFG_I);
				Test.pass("Searched for the BPR Number");

				Test.info("Viewing the BOM details");
				w.ViewButton();
				Test.pass("Viewing the BOM details");

				Test.info("Scrolling down the page");
				scrollPagedown();
				Test.pass("Scrolled down the page");

				// this code is without view click comparing table data
				// List<WebElement> tableRows = driver.findElements(By.xpath("//tr"));
				// System.out.println("Number of rows in the table: " + tableRows.size());
				//
				// for (WebElement row : tableRows) {
				// List<WebElement> cells = row.findElements(By.xpath("//td"));
				// System.out.println("Number of cells in the row: " + cells.size());
				//
				// if (cells.size() != 0) {
				// String sNo = cells.get(0).getText();
				// String bomNumber = cells.get(1).getText().trim();
				// String bprNumber = cells.get(2).getText().trim();
				// String productName = cells.get(3).getText().trim();
				// String productCode = cells.get(4).getText().trim();
				// String batchSize = cells.get(5).getText().trim();
				// String productStage = cells.get(6).getText().trim();
				// String bomType = cells.get(7).getText().trim();
				// String status = cells.get(8).getText().trim();
				// String effectiveDate = cells.get(9).getText().trim();
				//
				// System.out.println("S.No: " + sNo);
				// System.out.println("BOM Number: " + bomNumber);
				// System.out.println("BPR Number: " + bprNumber);
				// System.out.println("Product Name: " + productName);
				// System.out.println("Product Code: " + productCode);
				// System.out.println("Batch Size: " + batchSize);
				// System.out.println("Product Stage: " + productStage);
				// System.out.println("BOM Type: " + bomType);
				// System.out.println("Status: " + status);
				// System.out.println("Effective Date: " + effectiveDate);
				//
				// if (bprNumber.equals(BPR_Number_SFG_I + Version_Number_SFP) &&
				// batchSize.equals("5,000.000")
				// && productStage.equals("I") && bomType.equals("Commercial Order")) {
				// System.out.println("Row data matches expected values.");
				// Test.pass("Row data matches expected values.");
				// } else {
				// System.out.println("Row data does not match expected values.");
				// Test.fail("Row data does not match expected values.");
				// }
				// } else {
				// System.out.println("Not enough cells in the row.");
				// Test.fail("Not enough cells in the row.");
				// }
				// }

				Test.info("Clicking on Back Button");
				w.Back_Button();
				Test.pass("Clicked on Back Button");
			}
		} catch (

		Exception e) {
			Test.fail("Test failed due to an exception: " + e.getMessage());
			throw e;
		}
	}

	@Test
	public void BillOfMaterialReturn() throws Exception {
		Test = extent.createTest("BOM Return Test");
		WmpsObj w = new WmpsObj(driver);
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
			w.SearchBox(BPR_Number_SFG_I);
			Test.pass("Searched for the BPR Number");

			Test.info("Clicking Edit Action Button");
			w.Edit_Action_Button();
			Thread.sleep(2000);
			Test.pass("Clicked Edit Action Button");

			Test.info("Entering Effective Date");
			w.EffectiveDate(DateToday); // today date required
			Test.pass("Entered Effective Date");

			Test.info("Entering Comments");
			w.Comments(BPR_Number_SFG_I + " returned");
			Test.pass("Entered Comments");

			Test.info("Performing Action Level return Action");
			w.ActionLevelApproverAction(Pro.getProperty("Action_2"));
			Test.pass("Performed Action Level return Action");

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
			Thread.sleep(2000);

			scrollPageup();

			Test.info("Searching for the BPR Number");
			w.SearchBox(BPR_Number_SFG_I);
			Test.pass("Searched for the BPR Number");
			Thread.sleep(2000);

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

	@org.testng.annotations.Test
	public static void BillOfMaterialReInitiate() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		Test = extent.createTest("Bill of Material ReInitiate Test");

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

			Test.info("search on BprNumber");
			w.SearchBox(testData.get("BPR_Number_SFG_I"));
			Test.pass("searched on BprNumber");

			Test.info("Clicking Edit Button");
			w.Edit_Action_Button();
			Test.pass("Create Edit clicked");

			int rowcount = xls.getRowCount("Material_Master");
			System.out.println(rowcount);

			for (int i = 2; i <= 2; i++) {
				// Always Change***********
				BPR_Number_SFG_I = xls.getCellData("Dependency", "BPR_Number_SFG_I", i); //
				// Change Everytime
				String BatchSize = xls.getCellData("Bill_Of_Material", "BatchSize", i); //
				// **************************************************
				String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);

				Remarks_Release = xls.getCellData("Bill_Of_Material", "Remarks_Release", i);
				String BPR_Type = xls.getCellData("Bill_Of_Material", "BPR_Type", i);
				String Number_Of_Lots = xls.getCellData("Bill_Of_Material", "Number_Of_Lots", i); // 2
				String StandardQuantity = xls.getCellData("Bill_Of_Material", "StandardQuantity", i); // 500
				DateToday = xls.getCellData("Date", "DateToday", i);
				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String BOM_Password = xls.getCellData("Changable_Data", "BOM_Password", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
				String High1 = xls.getCellData("Bill_Of_Material", "High1", i); // 80
				String Low1 = xls.getCellData("Bill_Of_Material", "Low1", i); // 30
				String High2 = xls.getCellData("Bill_Of_Material", "High2", i); // 80
				String Low2 = xls.getCellData("Bill_Of_Material", "Low2", i); // 20

				Test.info("Entering Remarks" + BPR_Number_SFG_I);
				w.Remarks(testData.get("BPR_Number_SFG_I") + " ReInitiated");
				Test.pass("Entered Remarks");

				Test.info("Clicking Submit Button");
				w.Submit_Button();
				Test.pass("Clicked Submit Button");

				Test.info("Confirming Submission by Yes");
				w.Yes();
				Test.pass("Submission Confirmed");

				Test.info("Entering Initiator Password");
				w.Password_Fill(Pro.getProperty("Initiator_BOM_Password"));
				Test.pass("Entered Initiator Password");

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
				w.Back_Button();
				Test.pass("Clicked on Back Button");
			}
		} catch (Exception e) {
			Test.fail("Test failed due to an exception: " + e.getMessage());
			throw e;

		}
	}

	@Test
	public void BillOfMaterialRelease() throws Exception {
		Test = extent.createTest("BOM Approval Test");
		WmpsObj w = new WmpsObj(driver);
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
			Test.pass("Entered Effective Date");

			Test.info("Entering Comments");
			w.Comments(Remarks_Release);
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
			Thread.sleep(2000);

			scrollPageup();

			Test.info("Searching for the BPR Number");
			w.SearchBox(testData.get("BPR_Number_SFG_I"));
			Test.pass("Searched for the BPR Number");
			Thread.sleep(2000);

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