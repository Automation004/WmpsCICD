package ZZ_Issues_AutomationTestScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class PurchaseOrder extends BaseClass {
	String PurchaseOrder_Number;
	String ApproverPassword;
	Map<String, String> globalData = new HashMap<>();

	@BeforeClass
	public void setUp() throws Exception {
		// Load all required data from Excel into globalData map
		int rowcount = xls.getRowCount("Material_Master");
		for (int i = 2; i <= 2; i++) {
			globalData.put("PurchaseOrder_Number", xls.getCellData("PurchaseOrderEntry", "PurchaseOrder_Number", i));
			globalData.put("DateToday", xls.getCellData("Date", "DateToday", i));
			globalData.put("Vendor_Name_Supplier_Edit", xls.getCellData("Excel_Data", "Vendor_Name_Supplier_Edit", i));
			globalData.put("MaterialMasterRM_Edit", xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i));
			globalData.put("Vendor_Name_Manufacturer_Edit",
					xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit", i));
			globalData.put("Requested_Quantity", xls.getCellData("PurchaseOrderEntry", "Requested_Quantity", i));
			globalData.put("Received_Quantity", xls.getCellData("PurchaseOrderEntry", "Received_Quantity", i));
			globalData.put("Basic_UOM", xls.getCellData("Material_Master", "Basic_UOM", i));
			globalData.put("Remarks", xls.getCellData("PurchaseOrderEntry", "Remarks", i));
			globalData.put("InitiatorPassword", xls.getCellData("Changable_Data", "InitiatorPassword", i));
			globalData.put("ApproverPassword", xls.getCellData("Changable_Data", "ApproverPassword", i));
			globalData.put("Requested_Quantity_Edit",
					xls.getCellData("PurchaseOrderEntry", "Requested_Quantity_Edit", i));
			globalData.put("Received_Quantity_Edit",
					xls.getCellData("PurchaseOrderEntry", "Received_Quantity_Edit", i));
			globalData.put("ReInitiatorRemarks", xls.getCellData("Changable_Data", "ReInitiatorRemarks", i));
		}
	}
	@Test
	public void Purchase_Order_Entry() throws Exception {
		Test = extent.createTest("Purchase Order Create Test");
		WmpsObj w = new WmpsObj(driver);
		try {
			WMPS_Login("Initiator", "Initiator_Password");
			Test.log(Status.PASS, "Logged in successfully as Initiator");

			w.Purchase_Order();
			Test.log(Status.PASS, "Navigated to Purchase Order");
			long startTime = System.currentTimeMillis();
			w.Purchase_Order_Entry();
			Test.log(Status.PASS, "Navigated to Purchase Order Entry");
			Thread.sleep(2000);
			long endTime = System.currentTimeMillis();
			long executionTime = endTime - startTime;
			Test.log(Status.INFO, "Time taken for Purchase Order Entry: " + executionTime + " milliseconds");

			Test.log(Status.INFO, "Number of rows in Material_Master: " + xls.getRowCount("Material_Master"));

			Test.log(Status.INFO, "Processing row: 2");

			Test.log(Status.INFO, "Entering Purchase Order details for row: 2");
			w.Entry_Button();
			Test.log(Status.PASS, "Clicked Entry Button");

			w.PurchaseOrderNumber(globalData.get("PurchaseOrder_Number"));
			Test.log(Status.PASS, "Entered Purchase Order Number: " + globalData.get("PurchaseOrder_Number"));

			w.PurchaseOrderDate(globalData.get("DateToday"));
			Test.log(Status.PASS, "Entered Purchase Order Date: " + globalData.get("DateToday"));

			w.DD_01(globalData.get("Vendor_Name_Supplier_Edit"));
			Test.log(Status.PASS, "Selected Vendor Name (Supplier): " + globalData.get("Vendor_Name_Supplier_Edit"));
			Thread.sleep(2000);

			w.DD_02(globalData.get("MaterialMasterRM_Edit"));
			Test.log(Status.PASS, "Selected Material Master (RM): " + globalData.get("MaterialMasterRM_Edit"));
			Thread.sleep(2000);

			w.DD_03(globalData.get("Vendor_Name_Manufacturer_Edit"));
			Test.log(Status.PASS,
					"Selected Vendor Name (Manufacturer): " + globalData.get("Vendor_Name_Manufacturer_Edit"));
			Thread.sleep(2000);

			w.RequestQuantity(globalData.get("Requested_Quantity"));
			Test.log(Status.PASS, "Entered Requested Quantity: " + globalData.get("Requested_Quantity"));

			w.ReceivedQuantity(globalData.get("Received_Quantity"));
			Test.log(Status.PASS, "Entered Received Quantity: " + globalData.get("Received_Quantity"));

			w.RequestUOM_SK(globalData.get("Basic_UOM"));
			Test.log(Status.PASS, "Selected Request UOM: " + globalData.get("Basic_UOM"));

			w.RecievedUOM_SK(globalData.get("Basic_UOM"));
			Test.log(Status.PASS, "Selected Received UOM: " + globalData.get("Basic_UOM"));

			w.Remarks(globalData.get("Remarks"));
			Test.log(Status.PASS, "Entered Remarks: " + globalData.get("Remarks"));

			w.Add_Button();
			Thread.sleep(3000);
			Test.log(Status.PASS, "Clicked Add Button");

			w.Save_Button();
			Thread.sleep(3000);
			Test.log(Status.PASS, "Clicked Save Button");

			w.Yes();
			Test.log(Status.PASS, "Clicked Yes Button");

			w.Password_Fill(globalData.get("InitiatorPassword"));
			Test.log(Status.PASS, "Entered Initiator Password");

			w.Submit_Button();
			Test.log(Status.PASS, "clicked Submitted Button");

			w.Ok();
			Test.log(Status.PASS, "clicked OK Button");

			Thread.sleep(3000);
			driver.quit();
			Test.log(Status.PASS, "Closed the initiator Browser");

		} catch (Exception e) {
			Test.fail("Test failed: " + e.getMessage());
		}
	}

	@Test
	public void PurchaseOrderReturn() throws Exception {
		Test = extent.createTest("Purchase Order Return Test");
		WmpsObj w = new WmpsObj(driver);
		try {
			WMPS_Login("Approver_ID", "Approver_Password");
			Test.log(Status.PASS, "Logged in successfully as Approver");

			w.Second_Level();
			Test.log(Status.PASS, "Navigated to Second Level");

			w.ReviewApprovalCategory("Purchase Order Release");
			Test.log(Status.PASS, "Reviewed Approval Category: Purchase Order Release");

			w.Search_Button();
			Test.log(Status.PASS, "Clicked Search Button");

			Test.log(Status.INFO, "Number of rows in Material_Master: " + xls.getRowCount("Material_Master"));

			w.SearchBox(globalData.get("PurchaseOrder_Number"));
			Test.log(Status.PASS,
					"Entered Purchase Order Number in Search Box: " + globalData.get("PurchaseOrder_Number"));

			w.Edit_Action_Button();
			Test.log(Status.PASS, "Clicked Edit Action Button");

			w.Comments(globalData.get("PurchaseOrder_Number") + " record Returned");
			Test.log(Status.PASS, "Entered Comments: Purchase_Order_Entry" + Pro.getProperty("Action_2"));
			Thread.sleep(2000);

			w.ActionLevelApproverAction(Pro.getProperty("Action_2"));
			Test.log(Status.PASS, "Performed Action Level Approver Action: " + Pro.getProperty("Action_2"));

			w.Save_Button();
			Test.log(Status.PASS, "Clicked Save Button");

			w.Yes();
			Test.log(Status.PASS, "Clicked Yes Button");

			w.Password_Fill(Pro.getProperty("Approver_Password"));
			Test.log(Status.PASS, "Entered Approver Password");

			w.Submit_Button();
			Test.log(Status.PASS, "Clicked Submit Button");

			w.Ok();
			Test.log(Status.PASS, "Clicked Ok Button");
			Thread.sleep(2000);

			Test.log(Status.INFO, "All rows processed successfully.");
		} catch (Exception e) {
			Test.fail("Test failed: " + e.getMessage());
		}
	}

	@Test // (dependsOnMethods = "PurchaseOrderReturn")
	public void PurchaseOrderReinitiate() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		Test = extent.createTest("Purchase Order Re-Initiate Test");

		for (int i = 2; i <= 2; i++) {
			try {
				WMPS_Login("Initiator", "Initiator_Password");
				w.Purchase_Order();
				Test.log(Status.PASS, "Navigated to Purchase Order");

				w.Purchase_Order_Entry();
				Test.log(Status.PASS, "Navigated to Purchase Order Entry");

				w.SearchBox(globalData.get("PurchaseOrder_Number"));
				Test.log(Status.PASS,
						"Entered Purchase Order Number in Search Box: " + globalData.get("PurchaseOrder_Number"));
				Thread.sleep(2000);

				w.Edit_Action_Button();
				Test.log(Status.PASS, "Clicked Edit Action Button");

				w.RequestQuantity(globalData.get("Requested_Quantity_Edit") + "0");
				Test.log(Status.PASS, "Entered Requested Quantity: " + globalData.get("Requested_Quantity_Edit") + "0");

				w.ReceivedQuantity(globalData.get("Received_Quantity_Edit"));
				Test.log(Status.PASS, "Entered Received Quantity: " + globalData.get("Received_Quantity_Edit"));

				w.Remarks(globalData.get("ReInitiatorRemarks"));
				Test.log(Status.PASS, "Entered Remarks: " + globalData.get("ReInitiatorRemarks"));

				w.Add_Button();
				Test.log(Status.PASS, "Clicked Add Button");

				w.UpdateButton();
				Test.log(Status.PASS, "Clicked Update Button");

				w.Yes();
				Test.log(Status.PASS, "Clicked Yes Button");

				w.Password_Fill(globalData.get("InitiatorPassword"));
				Test.log(Status.PASS, "Entered Initiator Password");

				w.Submit_Button();
				Test.log(Status.PASS, "Clicked Submit Button");

				w.Ok();
				Test.log(Status.PASS, "Clicked Ok Button");

				w.Eye_FF_01();
				Test.log(Status.PASS, "Clicked Eye_FF_01 Button");
				scrollPagedown();

				WebElement reinitiatorCommentElement = driver
						.findElement(By.xpath("//tr[td[normalize-space()='Reinitiated']]/td[5]"));

				if (reinitiatorCommentElement != null) {
					String bindedReinitiatorComment = reinitiatorCommentElement.getText();

					if (bindedReinitiatorComment != null) {
						Assert.assertEquals(globalData.get("ReInitiatorRemarks").trim(),
								bindedReinitiatorComment.trim(),
								"Given remarks in Re-initiation and binded remarks data not matched");
					} else {
						Assert.fail("The attribute 'value' of the located element is null.");
					}
				} else {
					Assert.fail("The element with the specified CSS selector was not found.");
				}
				Test.log(Status.PASS, "Purchase Order Entry processed successfully for row: " + i);
			} catch (Exception e) {
				Test.fail("Purchase Order Entry failed for row: " + i + " - " + e.getMessage());
			}
		}
	}

	@Test // (dependsOnMethods = "PurchaseOrderReinitiate")
	public void PurchaseOrderRelease() throws Exception {
		Test = extent.createTest("Purchase Order Approval Test");
		WmpsObj w = new WmpsObj(driver);

		try {
			WMPS_Login("Approver_ID", "Approver_Password");
			Test.log(Status.PASS, "Logged in successfully as Approver");

			w.Second_Level();
			Test.log(Status.PASS, "Navigated to Second Level");

			w.ReviewApprovalCategory("Purchase Order Release");
			Test.log(Status.PASS, "Reviewed Approval Category: Purchase Order Release");

			w.Search_Button();
			Test.log(Status.PASS, "Clicked Search Button");

			Test.log(Status.INFO, "Number of rows in Material_Master: " + xls.getRowCount("Material_Master"));

			w.SearchBox(globalData.get("PurchaseOrder_Number"));
			Test.log(Status.PASS,
					"Entered Purchase Order Number in Search Box: " + globalData.get("PurchaseOrder_Number"));

			w.Edit_Action_Button();
			Test.log(Status.PASS, "Clicked Edit Action Button");

			w.Comments(globalData.get("PurchaseOrder_Number") + " record Release");
			Test.log(Status.PASS, "Entered Comments: Purchase_Order_Entry" + Pro.getProperty("Action_1"));
			Thread.sleep(2000);

			w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
			Test.log(Status.PASS, "Performed Action Level Approver Action: " + Pro.getProperty("Action_1"));

			w.Save_Button();
			Test.log(Status.PASS, "Clicked Save Button");

			w.Yes();
			Test.log(Status.PASS, "Clicked Yes Button");

			w.Password_Fill(Pro.getProperty("Approver_Password"));
			Test.log(Status.PASS, "Entered Approver Password");

			w.Submit_Button();
			Test.log(Status.PASS, "Clicked Submit Button");

			w.Ok();
			Test.log(Status.PASS, "Clicked Ok Button");
			Thread.sleep(2000);

			Test.log(Status.INFO, "All rows processed successfully.");
		} catch (Exception e) {
			Test.fail("Test failed: " + e.getMessage());
		}
	}	
}
