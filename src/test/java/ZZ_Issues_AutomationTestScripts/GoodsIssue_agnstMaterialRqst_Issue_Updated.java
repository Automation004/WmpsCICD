package ZZ_Issues_AutomationTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class GoodsIssue_agnstMaterialRqst_Issue_Updated extends BaseClass {
	@org.testng.annotations.Test
	public static void CreateForIssuence(boolean isSecondRun) throws Exception {
		Test = extent.createTest("Order Type Test");
		WmpsObj w = new WmpsObj(driver);
		try {
			int rowcount = xls.getRowCount("Material_Master");
			Test.log(Status.INFO, "Number of rows in Material_Master: " + rowcount);
			System.out.println(rowcount);

			for (int i = 2; i <= 2; i++) {
				// Read data from the Excel sheet - necessary data to change
				String Batch_Number_SFG_I = xls.getCellData("Dependency", "Batch_Number_SFG_I", i);
				String batchIssuedQuantityTb = xls.getCellData("Dependency", "batchIssuedQuantityTb", i);
				// New variable for the second issuance
				String batchIssuedQuantityTb2 = xls.getCellData("Dependency", "batchIssuedQuantityTb2", i);

				String Batch_Number_II = xls.getCellData("Dependency", "Batch_Number_II", i);
				String Batch_Number_FP = xls.getCellData("Dependency", "Batch_Number_FP", i);
				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);

				// Initialize SoftAssert
				SoftAssert softAssert = new SoftAssert();

				// Log in as Initiator
				WMPS_Login("Initiator", "Initiator_Password");
				Test.log(Status.PASS, "Logged in successfully as Initiator");

				// Navigate through the menu
				w.Menu_Navigate();
				Test.log(Status.PASS, "Navigated to menu");

				w.Menu_Navigate();
				Test.log(Status.PASS, "Navigated to menu again");

				w.WareHouse();
				Test.log(Status.PASS, "Navigated to WareHouse");

				w.Goods_Issue_Mat_Req();
				Test.log(Status.PASS, "Navigated to Goods Issue Material Request");

				// Search for the batch number
				w.SearchBox(Batch_Number_SFG_I);
				Test.log(Status.PASS, "Searched for Batch Number: " + Batch_Number_SFG_I);

				// Edit action
				w.Edit_Action_Button();
				Test.log(Status.PASS, "Clicked Edit Action Button");

				// Getting initial issuedQuantity
				WebElement issuedQuantity = driver.findElement(By.cssSelector("td:nth-child(12)"));
				String issuedQuantityText = issuedQuantity.getText();
				System.out.println("Issued Quantity before batch issuance: " + issuedQuantityText);
				Test.info("Issued Quantity before batch issuance: " + issuedQuantityText);

				// Assert that the text is equal to "0.000"
				softAssert.assertEquals(issuedQuantityText, "0.000",
						"Issued Quantity is not equal to 0.000. Actual is: " + issuedQuantityText);

				// Getting initial balanceQuantity
				WebElement balanceQuantity = driver.findElement(By.cssSelector("td:nth-child(13)"));
				String balanceQuantityText = balanceQuantity.getText();
				System.out.println("Balance Quantity before batch issuance: " + balanceQuantityText);
				Test.info("Balance Quantity before batch issuance: " + balanceQuantityText);

				// Select batch number
				driver.findElement(By.xpath("(//a[contains(text(),'Select')])[1]")).click();
				Test.log(Status.PASS, "Selected Batch Number");

				// Issue quantity
				if (isSecondRun) {
					w.TT_3(batchIssuedQuantityTb2);
					Test.log(Status.PASS, "Issued Quantity: " + batchIssuedQuantityTb2);
				} else {
					w.TT_2(batchIssuedQuantityTb);
					Test.log(Status.PASS, "Issued Quantity: " + batchIssuedQuantityTb);
				}

				w.Submit_Button();
				Test.log(Status.PASS, "Submitted Issued Quantity");

				// Checking issuedQuantity after issuing quantity for a particular batch
				String issuedQuantityTextAfterIssue = issuedQuantity.getText();
				System.out.println("Issued Quantity after issuance: " + issuedQuantityTextAfterIssue);
				Test.info("Issued Quantity after issuance: " + issuedQuantityTextAfterIssue);

				// Assert that the text is equal to the issued quantity
				if (isSecondRun) {
					double issuedQuantityValue = Double.parseDouble(batchIssuedQuantityTb)
							+ Double.parseDouble(batchIssuedQuantityTb2);
					softAssert.assertEquals(Double.parseDouble(issuedQuantityTextAfterIssue), issuedQuantityValue,
							"After batch issuance, the issued quantity value does not match the issued Quantity label data: "
									+ issuedQuantityTextAfterIssue);
				} else {
					softAssert.assertEquals(issuedQuantityTextAfterIssue, batchIssuedQuantityTb,
							"After batch issuance, the issued quantity value does not match the issued Quantity label data: "
									+ issuedQuantityTextAfterIssue);
				}

				// Checking balanceQuantity after issuing quantity for a particular batch
				String balanceQuantityTextAfterIssue = balanceQuantity.getText();
				System.out.println("Balance Quantity after issuance: " + balanceQuantityTextAfterIssue);
				Test.info("Balance Quantity after issuance: " + balanceQuantityTextAfterIssue);

				double balanceQuantityValue = Double.parseDouble(balanceQuantityText);
				double issuedQuantityValue = Double.parseDouble(batchIssuedQuantityTb);
				double expectedBalanceQuantity = balanceQuantityValue - issuedQuantityValue;

				// Assert that the balance quantity is as expected
				softAssert.assertEquals(Double.parseDouble(balanceQuantityTextAfterIssue), expectedBalanceQuantity,
						"After batch issuance, the balance quantity value does not match the balance Quantity label value: "
								+ balanceQuantityTextAfterIssue);

				w.CheckBox_1();
				Test.log(Status.PASS, "Checked the batch given check Box");

				// Issue materials
				w.Issue_Button();
				Test.log(Status.PASS, "Clicked Issue Button");
				w.Yes();
				Test.log(Status.PASS, "Confirmed Issue");

				w.Password_Fill(InitiatorPassword);
				Test.log(Status.PASS, "Filled Password");

				w.Submit_Button();
				Test.log(Status.PASS, "Clicked submit Button");

				w.Ok();
				Test.log(Status.PASS, "Clicked Ok Button");

				// Search for the batch number again
				w.SearchBox(Batch_Number_SFG_I);
				Test.log(Status.PASS, "Searched for Batch Number: " + Batch_Number_SFG_I);

				// View button
				w.ViewButton();
				Test.log(Status.PASS, "Clicked View Button");

				// Assert all
				softAssert.assertAll();
			}
		} catch (Exception e) {
			Test.log(Status.FAIL, e.getMessage());
			throw e;
		}
	}

	@Test
	public static void ReleseAndReturn() throws Exception {
		Test = extent.createTest("Order Type Test");
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		int rowcount = xls.getRowCount("Material_Master");
		Test.log(Status.INFO, "Number of rows in Material_Master: " + rowcount);
		System.out.println(rowcount);
		for (int i = 2; i <= rowcount; i++) {
			try {
				// Read data from the Excel sheet
				String Batch_Number_SFG_I = xls.getCellData("Dependency", "Batch_Number_SFG_I", i);

				String Batch_Number_SFG_II = xls.getCellData("Dependency", "Batch_Number_SFG_II", i);
				String Batch_Number_II = xls.getCellData("Dependency", "Batch_Number_II", i);
				String Batch_Number_FP = xls.getCellData("Dependency", "Batch_Number_FP", i);

				String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
				String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
				String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i);

				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);

				// Log in as Approver
				WMPS_Login("Approver_ID", "Approver_Password");
				Test.log(Status.PASS, "Logged in successfully as Approver");

				w.Menu_Navigate();
				Test.log(Status.PASS, "Navigated to first menu level");

				w.Menu_Navigate();
				Test.log(Status.PASS, "Navigated to second menu level");

				w.Second_Level();
				Test.log(Status.PASS, "Navigated to second level menu");

				w.ReviewApprovalCategory("Goods Issue ag(st) Mat Req Release");
				Test.log(Status.PASS, "Navigated to Review Approval Category: Goods Issue ag(st) Mat Req Release");

				w.Search_Button();
				Test.log(Status.PASS, "Clicked Search Button");

				// Search for the batch number
				w.SearchBox(Batch_Number_SFG_I);
				Test.log(Status.PASS, "Searched for Batch Number: " + Batch_Number_SFG_I);

				// Edit action
				w.Edit_Action_Button();
				Test.log(Status.PASS, "Clicked Edit Action Button");

				w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
				Test.log(Status.PASS, "Performed Action Level Approver Action");

				w.Comments("Batch_Order_Release");
				Test.log(Status.PASS, "Added Comments: Batch_Order_Release");

				Thread.sleep(2000);

				w.Submit();
				Test.log(Status.PASS, "Clicked Submit Button");

				w.Yes();
				Test.log(Status.PASS, "Confirmed Yes");

				w.Password_Fill(ApproverPassword);
				Test.log(Status.PASS, "Filled Approver Password");

				w.Submit_Button2();
				Test.log(Status.PASS, "Clicked Second Submit Button");

				w.Ok();
				Test.log(Status.PASS, "Clicked Ok Button");

				// Search for the batch number again
				w.SearchBox(Batch_Number_SFG_I);
				Test.log(Status.PASS, "Searched for Batch Number again: " + Batch_Number_SFG_I);

				// View button
				w.ViewButton();
				Test.log(Status.PASS, "Clicked View Button");

				w.Back_Button2();
				Test.log(Status.PASS, "Clicked Back Button");

				CreateForIssuence(true);
				// ReleseAndReturn();

			} catch (Exception e) {
				Test.log(Status.FAIL, e.getMessage());
				throw e;
			}
		}
	}
}
