package ZZ_Issues_AutomationTestScripts;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_O1_BatchOrder_update extends BaseClass {
	static WebDriverWait wait;
	public static WmpsObj w;
	// changed everytime
	static String Batch_Number_SFG_I;
	static String MaterialMasterSFP;
	static String MaterialMasterRM_Edit;
	static SoftAssert assertion = new SoftAssert();

	static HashMap<String, String> dataMap = new HashMap<>();

	@BeforeClass
	public void setUp() {
		int rowIndex = 2; // assuming you want to get data from the 2nd row
		dataMap.put("InitiatorPassword", xls.getCellData("Changable_Data", "InitiatorPassword", rowIndex));
		dataMap.put("ApproverPassword", xls.getCellData("Changable_Data", "ApproverPassword", rowIndex));
		dataMap.put("BOM_Password", xls.getCellData("Changable_Data", "BOM_Password", rowIndex));
		dataMap.put("WrongPassword", xls.getCellData("Changable_Data", "WrongPassword", rowIndex));
		dataMap.put("MaterialMasterRM_Edit", xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", rowIndex));
		dataMap.put("MaterialMasterSFP", xls.getCellData("Excel_Data", "MaterialMasterSFP", rowIndex));
		dataMap.put("Batch_Number_SFG_I", xls.getCellData("Dependency", "Batch_Number_SFG_I", rowIndex));
		dataMap.put("Batch_Number_SFG_II", xls.getCellData("Dependency", "Batch_Number_SFG_II", rowIndex));
		dataMap.put("OrderType", xls.getCellData("Material_Indent", "OrderType", rowIndex));
		dataMap.put("RequestedQuantityEdit", xls.getCellData("Dependency", "RequestedQuantityEdit", rowIndex));
	}

	@Test
	public static void batchOrder() throws Exception {
		Test = extent.createTest("Batch Order");
		w = new WmpsObj(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			WMPS_Login("Initiator", "Initiator_Password");
			Test.log(Status.INFO, "Logged in as Initiator");

			w.Production();
			Test.log(Status.INFO, "Navigated to Production");

			w.BatchOrder();
			Test.log(Status.INFO, "Navigated to BatchOrder");

			w.Create_Button();
			Test.log(Status.INFO, "Clicked Create Button");

			Thread.sleep(1000);
			int rowcount = xls.getRowCount("Material_Master");
			Test.log(Status.INFO, "Row count in Material_Master: " + rowcount);

			for (int i = 2; i <= 2; i++) {
				MaterialMasterRM_Edit = dataMap.get("MaterialMasterRM_Edit");
				MaterialMasterSFP = dataMap.get("MaterialMasterSFP");
				Batch_Number_SFG_I = dataMap.get("Batch_Number_SFG_I");
				String OrderType = dataMap.get("OrderType");

				w.DD_01M(MaterialMasterSFP);
				Test.log(Status.INFO, "Selected SemiFinished_Product1");
				Thread.sleep(5000);

				w.DD_02("");
				Test.log(Status.INFO, "Cleared DD_02 field");

				Thread.sleep(5000);

				w.DD_03("GENERAL");
				Test.log(Status.INFO, "Set DD_03 to GENERAL");

				w.DD_04("");
				Test.log(Status.INFO, "Cleared DD_04 field");

				w.Batch_Number(Batch_Number_SFG_I);
				Test.log(Status.INFO, "Set Batch Number: " + Batch_Number_SFG_I);

				w.TT_11_AD_E(OrderType);
				Test.log(Status.INFO, "Set Order Type: " + OrderType);

				w.Get_Button();
				Test.log(Status.INFO, "Clicked Get Button");

				scrollPagedownSlow();

				w.Edit_Action_Button();
				Test.log(Status.INFO, "Clicked Edit Action Button");

				w.TT_17_CSE("200");
				Test.log(Status.INFO, "Set Requested Quantity for Material");

				w.TT_18_CSE("Maximum required Quantity");
				Test.log(Status.INFO, "Set Requested Quantity for Material");

				w.CheckBox_2();
				Test.log(Status.INFO, "Selected Checkbox 2");

				// Check if CheckBox_3 is displayed
				try {
					if (w.CheckBox_3.isDisplayed()) {
						w.TT_19_CSE("200");
						Test.log(Status.INFO, "Set Requested Quantity for Material");

						w.TT_20_CSE("Maximum required Quantity");
						Test.log(Status.INFO, "Set Requested Quantity for Material");

						w.CheckBox_3();
						Test.log(Status.INFO, "Selected Checkbox 3");
					}
				} catch (Exception e) {
					Test.log(Status.WARNING, "CheckBox_3 is not displayed: " + e.getMessage());
				}

				w.TITLE_SUBMIT();
				Test.log(Status.INFO, "Clicked Title Submit");

				Thread.sleep(2000);

				w.CheckBox_1();
				Test.log(Status.INFO, "Selected First Material CheckBox");

				// Check if Out side CheckBox_2 is displayed
				try {
					if (w.CheckBox_2.isDisplayed()) {
						w.ActionType_EditAction_Button2();
						Test.log(Status.INFO, "Clicked Action Type Edit Action Button 2");

						w.TT_18_CSE("200");
						Test.log(Status.INFO, "Set Requested Quantity for Material");

						w.TT_19_CSE("NA");
						Test.log(Status.INFO, "Set Comments for Material 2");

						w.CheckBox_3();
						Test.log(Status.INFO, "Selected Checkbox 3");

						Thread.sleep(2000);

						w.TITLE_SUBMIT();
						Test.log(Status.INFO, "Clicked Title Submit");

						w.CheckBox_2();
					}
				} catch (Exception e) {
					Test.log(Status.WARNING, "CheckBox_2 is not displayed: " + e.getMessage());
				}

				w.Submit();
				Test.log(Status.INFO, "Clicked Submit");

				w.Yes();
				Test.log(Status.INFO, "Clicked Yes");

				w.Password_Fill(Pro.getProperty("Initiator_Password"));
				Test.log(Status.INFO, "Filled Password");

				w.Submit_Button2();
				Test.log(Status.INFO, "Clicked Submit Button 2");

				w.Ok();
				Test.log(Status.INFO, "Clicked OK");

				w.SearchBox(Batch_Number_SFG_I);
				Test.log(Status.INFO, "Searched for Batch Number: " + Batch_Number_SFG_I);
				Thread.sleep(2000);

				w.ViewButton();
				Test.log(Status.INFO, "Clicked View Button");

				scrollPagedown();
				Test.log(Status.INFO, "Scrolled down the page");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			Test.fail("Test failed: " + e.getMessage());
		}
	}

	@Test
	public static void batchOrderRelease() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		Test = extent.createTest("BatchOrderRelease");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			WMPS_Login("Approver_ID", "Approver_Password");
			Test.log(Status.INFO, "Logged in as Initiator");

			w.Second_Level();
			Test.log(Status.INFO, "Navigated to Second Level");

			w.ReviewApprovalCategory("Batch Order Release");
			Test.log(Status.INFO, "Selected Review Approval Category: Batch Order Release");

			w.Search_Button();
			Test.log(Status.INFO, "Clicked Search Button");
			Thread.sleep(2000);

			w.SearchBox(dataMap.get("Batch_Number_SFG_I"));
			// w.SearchBox("777");
			Test.log(Status.INFO, "Searched for Batch Number: " + Batch_Number_SFG_I);

			w.Edit_Action_Button();
			Test.log(Status.INFO, "Clicked Edit Action Button");

			w.Comments("Batch_Order_Released Sucessfully");
			Test.log(Status.INFO, "Added comment: Batch_Order_Released Successfully");

			w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
			Test.log(Status.INFO, "Performed Action Level Approver Action");

			w.Submit_Button();
			Test.log(Status.INFO, "Clicked Submit Button");

			w.Yes();
			Test.log(Status.INFO, "Clicked Yes");

			w.Password_Fill(Pro.getProperty("Approver_Password"));
			Test.log(Status.INFO, "Filled Password");

			w.Submit_Button2();
			Test.log(Status.INFO, "Clicked Submit Button 2");

			w.Ok();
			Test.log(Status.INFO, "Clicked OK");

			Thread.sleep(3000);

			w.SearchBox(Batch_Number_SFG_I);
			Test.log(Status.INFO, "Searched for Batch Number: " + Batch_Number_SFG_I);

			Thread.sleep(2000);

			w.ViewButton();
			Test.log(Status.INFO, "Clicked View Button");

			scrollPagedown();
			Test.log(Status.INFO, "Scrolled down the page");
			Thread.sleep(2000);

			//			w.Back_Button();
			//			Test.log(Status.INFO, "Clicked Back Button");

		} catch (Exception e) {
			Test.fail("Test failed: " + e.getMessage());
		}
	}

	@Test
	public static void batchOrderReInitiate() throws Exception {
		Test = extent.createTest("Batch Order ReInitiate");
		w = new WmpsObj(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			WMPS_Login("Initiator", "Initiator_Password");
			Test.log(Status.INFO, "Logged in as Initiator");

			w.Production();
			Test.log(Status.INFO, "Navigated to Production");

			w.BatchOrder();
			Test.log(Status.INFO, "Navigated to BatchOrder");

			w.SearchBox(dataMap.get("Batch_Number_SFG_I"));
			// w.SearchBox("777");
			Test.log(Status.INFO, "Searched for Batch Number: " + Batch_Number_SFG_I);

			w.Edit_Action_Button();
			Test.log(Status.INFO, "Clicked Edit Action Button");

			w.Comments("Batch_Order_ReInitited Sucessfully");
			Test.log(Status.INFO, "Added comment: Batch_Order_ReInitited Sucessfully");

			scrollPagedown();
			Test.log(Status.INFO, "Scrolled down Page");

			// Performing the calculation with Actual Quantity & RequestedQuantity
			String actualQuantityStr = driver.findElement(By.xpath("//tbody//tr//td[8]")).getText();
			Test.log(Status.INFO, "actualQuantityStr : " + actualQuantityStr);

			String requestedQuantityStr = driver.findElement(By.xpath("//tbody//tr//td[9]")).getText();
			Test.log(Status.INFO, "requestedQuantityStr : " + requestedQuantityStr);

			// Parse the quantities as double
			double actualQuantity = Double.parseDouble(actualQuantityStr);
			System.out.println("Actual Quantity : " + actualQuantity);
			double requestedQuantity = Double.parseDouble(requestedQuantityStr);
			System.out.println("Requested Quantity : " + requestedQuantity);

			// Subtraction Operation
			double balanceQuantity = actualQuantity - requestedQuantity;
			Test.log(Status.INFO,
					"Calculated quantity difference between actualQuantity - requestedQuantity : " + balanceQuantity);
			System.out.println("Balence Quantity : " + balanceQuantity);

			//			w.Edit_Action_Button();
			//			Test.log(Status.INFO, "Clicked Edit Action for first Batch");
			//
			//			w.TT_17(dataMap.get("RequestedQuantityEdit"));
			//			Test.log(Status.INFO, "Edited the requested Quantity");
			//
			//			w.TITLE_SUBMIT();
			//			Test.log(Status.INFO, "Clicked Title Submit");
			//
			//			// Performing the calculation with Actual Quantity & RequestedQuantity
			//			String actualQuantityStr2 = driver.findElement(By.xpath("//tbody//tr//td[8]")).getText();
			//			Test.log(Status.INFO, "actualQuantityStrAfterIssue : " + actualQuantityStr2);
			//
			//			String requestedQuantityStr2 = driver.findElement(By.xpath("//tbody//tr//td[9]")).getText();
			//			Test.log(Status.INFO, "requestedQuantityStrAfterIssue : " + requestedQuantityStr2);
			//
			//			// Parse the quantities as double
			//			double actualQuantity1 = Double.parseDouble(actualQuantityStr2);
			//			System.out.println("Actual Quantity : " + actualQuantity1);
			//			double requestedQuantity1 = Double.parseDouble(requestedQuantityStr2);
			//			System.out.println("Requested Quantity : " + requestedQuantity1);
			//
			//			// Subtraction Operation
			//			double balanceQuantityAfterIssue = actualQuantity1 - requestedQuantity1;
			//			Test.log(Status.INFO,
			//					"Calculated quantity difference between actualQuantityAfterIssue - requestedQuantityAfterIssue : "
			//							+ balanceQuantityAfterIssue);
			//			System.out.println("Balence Quantity : " + balanceQuantityAfterIssue);

			w.Submit();
			Test.log(Status.INFO, "Clicked Submit");

			w.Yes();
			Test.log(Status.INFO, "Clicked Yes");

			w.Password_Fill(Pro.getProperty("Initiator_Password"));
			Test.log(Status.INFO, "Filled Password");

			w.Submit_Button2();
			Test.log(Status.INFO, "Clicked Submit Button 2");

			w.Ok();
			Test.log(Status.INFO, "Clicked OK");

			w.SearchBox(Batch_Number_SFG_I);
			Test.log(Status.INFO, "Searched for Batch Number: " + Batch_Number_SFG_I);
			Thread.sleep(2000);

			w.ViewButton();
			Test.log(Status.INFO, "Clicked View Button");

			scrollPagedown();
			Test.log(Status.INFO, "Scrolled down the page");

		} catch (Exception e) {
			Test.fail("Test failed: " + e.getMessage());
		}
	}
}
