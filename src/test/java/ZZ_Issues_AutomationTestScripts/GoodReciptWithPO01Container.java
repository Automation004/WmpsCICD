package ZZ_Issues_AutomationTestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class GoodReciptWithPO01Container extends BaseClass {

	@org.testng.annotations.Test
	public static void goodsReceiptWithPoCreate() throws Exception {
		// Create a test instance for logging
		Test = extent.createTest("Goods Receipt with PO Create Test");

		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		try {
			WMPS_Login("Initiator", "Initiator_Password");
			Test.log(Status.PASS, "Logged in successfully as Initiator");

			w.WareHouse();
			Test.log(Status.PASS, "Navigated to Warehouse");

			w.Goods_Receipt();
			Test.log(Status.PASS, "Navigated to Goods Receipt");

			int rowcount = xls.getRowCount("Material_Master");
			System.out.println(rowcount);

			for (int i = 2; i <= 2; i++) {
				String purchaseOrderNumber = xls.getCellData("PurchaseOrderEntry", "PurchaseOrder_Number", i);
				String receivedQuantityEdit = xls.getCellData("PurchaseOrderEntry", "Requested_Quantity", i);
				String containerA = xls.getCellData("Goods_ReceiptWith_WithOut", "ContainerA", i);
				String Remarks = xls.getCellData("Goods_ReceiptWith_WithOut", "Remarks", i);
				String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
				String vendorNameSupplierEdit = xls.getCellData("Excel_Data", "Vendor_Name_Supplier_Edit", i);
				// **************************************************************************************************
				String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
				String vendorNameManufacturerEdit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit", i);
				// **************************************************************************************************
				String VendorTypeManufacturer = xls.getCellData("Vendor_Supplier", "VendorTypeManufacturer", i);
				String VendorTypeSupplier = xls.getCellData("Vendor_Supplier", "VendorTypeSupplier", i);
				// **************************************************************************************************
				String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
				String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
				// **************************************************************************************************
				String Material_Description = xls.getCellData("Excel_Data", "Material_Description", i);
				// ***************************************************************************************************************
				String Requested_Quantity = xls.getCellData("PurchaseOrderEntry", "Requested_Quantity", i);// From PO
				// Screen
				String Received_Quantity = xls.getCellData("PurchaseOrderEntry", "Received_Quantity", i);// From PO
				// Screen
				// ***************************************************************************************************************
				String ContainerA = xls.getCellData("Goods_ReceiptWith_WithOut", "ContainerA", i);// 1
				String ContainerB = xls.getCellData("Goods_ReceiptWith_WithOut", "ContainerB", i);// 2
				String ContainerC = xls.getCellData("Goods_ReceiptWith_WithOut", "ContainerC", i);// 3

				String DeliveryChallanNo = xls.getCellData("Goods_ReceiptWith_WithOut", "DeliveryChallanNo", i);
				String DeliveryChallanNo2 = xls.getCellData("Goods_ReceiptWith_WithOut", "DeliveryChallanNo2", i);
				// ***************************************************************************************************************
				String Today_Date = xls.getCellData("Changable_Data", "Today_Date", i);
				String OneMonthLater = xls.getCellData("Changable_Data", "OneMonthLater", i);
				String OneYearLater = xls.getCellData("Changable_Data", "OneYearLater", i);
				String Past_Date = xls.getCellData("Changable_Data", "Past_Date", i);
				// ***************************************************************************************************************
				String DateToday = xls.getCellData("Date", "DateToday", i);
				String Date1ML = xls.getCellData("Date", "Date1ML", i);
				String Date2ML = xls.getCellData("Date", "Date2ML", i);
				String Date6ML = xls.getCellData("Date", "Date6ML", i);
				// ***************************************************************************************************************
				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
				// ***************************************************************************************************************

				w.Create();
				Thread.sleep(2000);

				Test.log(Status.PASS, "Created new Goods Receipt");

				w.PO_Selection_WithPO();

				Test.log(Status.PASS, "Selected PO with Goods Receipt");

				w.PO_Number(purchaseOrderNumber);

				Test.log(Status.PASS, "Entered PO Number: " + purchaseOrderNumber);

				w.Get_Button();

				Test.log(Status.PASS, "Clicked Get Button");

				w.InwardType_Selection();

				Test.log(Status.PASS, "Selected Inward Type");

				w.MaterialType_Selection();

				Test.log(Status.PASS, "Selected Material Type");

				w.DD_01(MaterialMasterRM_Edit);

				Test.log(Status.PASS, "Entered Material Master RM Edit: " + MaterialMasterRM_Edit);

				w.DD_02(vendorNameManufacturerEdit);

				Test.log(Status.PASS, "Entered Vendor Name Manufacturer Edit: " + vendorNameManufacturerEdit);

				w.DD_03(vendorNameSupplierEdit);

				Test.log(Status.PASS, "Entered Vendor Name Supplier Edit: " + vendorNameSupplierEdit);

				w.StorageLocation_Selection();

				Test.log(Status.PASS, "Selected Storage Location");

				w.Container_No(containerA);

				Test.log(Status.PASS, "Entered Container No: " + containerA);

				w.VendorStorageCondition(DeliveryChallanNo);

				Test.log(Status.PASS, "Entered Vendor Storage Condition: " + DeliveryChallanNo);

				w.Remarks(Remarks);

				Test.log(Status.PASS, "Entered Remarks: " + Remarks);

				w.ChallanNumber(DeliveryChallanNo);

				Test.log(Status.PASS, "Entered Challan Number: " + DeliveryChallanNo);

				w.StorageCondition_Selection();

				Test.log(Status.PASS, "Selected Storage Condition");

				w.ManufacturingDateFormat_Selection();

				Test.log(Status.PASS, "Selected Manufacturing Date Format");

				driver.findElement(By.xpath("//input[@formcontrolname='manufactureDate']")).click();

				Thread.sleep(8000);

				Test.log(Status.PASS, "Selected Manufacture Date");

				driver.findElement(By.xpath("//*[@formcontrolname='retestDate']")).click();

				Thread.sleep(8000);

				Test.log(Status.PASS, "Selected Retest Date");

				driver.findElement(By.xpath("//*[@formcontrolname='expiryDate']")).sendKeys(Date6ML);

				Thread.sleep(8000);

				Test.log(Status.PASS, "Entered Expiry Date: " + Date6ML);

				driver.findElement(By.xpath("//*[@formcontrolname='dcDate']")).click();

				Thread.sleep(8000);

				Test.log(Status.PASS, "Selected Delivery Challan Date");

				p.CB_1();// RADIO -1

				Test.log(Status.PASS, "Selected CB_1 for Hetero");

				w.Split_Button();

				Test.log(Status.PASS, "Clicked Split Button");

				w.Proceed_Button();

				w.Yes();

				Test.log(Status.PASS, "Proceeded and confirmed");

				w.Password_Fill(Pro.getProperty("Initiator_Password"));

				Test.log(Status.PASS, "Entered Initiator Password");

				w.Submit_Button();

				Test.log(Status.PASS, "Clicked Submit Button");

				w.Ok();

				Thread.sleep(3000);

				Test.log(Status.PASS, "Clicked Ok Button");

				w.SearchBox(purchaseOrderNumber);
				Thread.sleep(2000); // Reduced sleep time
				Test.log(Status.PASS, "Searched for Purchase Order Number: " + purchaseOrderNumber);

				w.ViewButton();
				scrollPagedown();
				Test.log(Status.PASS, "Viewed and scrolled down");

				/*
				 * List<WebElement> viewData = driver.findElements(By.xpath("//tbody/tr/td"));
				 * 
				 * viewData.stream().map(element -> { List<WebElement> inputElements =
				 * element.findElements(By.xpath(".//input"));
				 * 
				 * if (inputElements.isEmpty()) { return element.getText().trim();
				 * 
				 * } else { WebElement inputElement = inputElements.get(0); return
				 * inputElement.getAttribute("disabled") != null ?
				 * inputElement.getAttribute("value") != null ?
				 * inputElement.getAttribute("value").trim() : element.getText().trim() :
				 * inputElement.getAttribute("value").trim(); } }).filter(text ->
				 * !text.isEmpty()).collect(Collectors.toList());
				 * 
				 * // tableDataValues.forEach(System.out::println); //it is only for verifiying
				 * // which data is coming
				 * 
				 * boolean allMatched = true;
				 * 
				 * if (!doesValueExistInTable(viewData, receivedQuantityEdit)) { allMatched =
				 * false; Test.log(Status.FAIL,
				 * "Received_Quantity_Edit value from Excel does not match with any table data."
				 * ); } if (!doesValueExistInTable(viewData, containerA)) { allMatched = false;
				 * Test.log(Status.FAIL,
				 * "ContainerA value from Excel does not match with any table data."); } if
				 * (!doesValueExistInTable(viewData, Remarks)) { allMatched = false;
				 * Test.log(Status.FAIL,
				 * "Remarks value from Excel does not match with any table data."); }
				 * 
				 * Assert.assertTrue(allMatched,
				 * "Not all specified fields from Excel matched with the table data.");
				 * 
				 */
				w.Back_Button();
				Test.log(Status.PASS, "Clicked Back Button");
			}
		} catch (Exception e) {
			Test.log(Status.FAIL, "Test failed: " + e.getMessage());
			throw e;
		} finally {
			// Close the driver or perform any cleanup
			// driver.close();
			Test.log(Status.INFO, "Closed the driver");
		}
	}

	@Test
	public static void goodsReceiptWithPoRelease() throws Exception {

		// Create a test instance for logging

		Test = extent.createTest("Good Receipt with PO Release Test");

		WmpsObj w = new WmpsObj(driver);

		HomePage hp = new HomePage(driver);

		Common_Xpath cxp = new Common_Xpath(driver);

		PWO_Xpath p = new PWO_Xpath(driver);

		DataFields df = new DataFields(driver);

		MasterXpaths mp = new MasterXpaths(driver);

		try {

			WMPS_Login("Approver_ID", "Approver_Password");

			Test.log(Status.PASS, "Logged in successfully as Approver");

			w.Second_Level();

			Test.log(Status.PASS, "Navigated to Second Level");

			w.ReviewApprovalCategory("Goods Receipt Release");

			Test.log(Status.PASS, "Selected 'Goods Receipt Release' Approval Category");

			w.Search_Button();

			Test.log(Status.PASS, "Clicked Search Button");

			int rowcount = xls.getRowCount("Material_Master");

			System.out.println(rowcount);

			for (int i = 2; i <= 2; i++) {

				String purchaseOrderNumber = xls.getCellData("PurchaseOrderEntry",

						"PurchaseOrder_Number", i);

				String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM",

						i);

				String MaterialMasterRM_Edit = xls.getCellData("Excel_Data",

						"MaterialMasterRM_Edit", i);

				String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP",

						i);

				String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP",

						i);
				String InitiatorPassword = xls.getCellData("Changable_Data",

						"InitiatorPassword", i);

				String ApproverPassword = xls.getCellData("Changable_Data",

						"ApproverPassword", i);

				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);

				w.SearchBox(MaterialMasterRM_Edit);

				Thread.sleep(3000);

				Test.log(Status.PASS, "Searched for Material Master RM Edit");

				w.SearchBox2(" Created");

				Thread.sleep(3000);

				Test.log(Status.PASS, "Filtered results by 'Created'");

				w.Edit_Action_Button();

				Thread.sleep(3000);

				Test.log(Status.PASS, "Clicked Edit Action Button");

				w.Comments("Good_Recipt_With_PO_Release");

				Thread.sleep(2000);

				Test.log(Status.PASS, "Added comments for Good Receipt with PO Release");

				w.ActionLevelApproverAction(Pro.getProperty("Action_1"));

				Test.log(Status.PASS, "Performed Action Level Approver Action");

				w.Save_Button2();

				w.Yes();

				Test.log(Status.PASS, "Clicked Save and confirmed");

				w.Password_Fill(Pro.getProperty("Approver_Password"));

				Test.log(Status.PASS, "Entered Approver Password");

				w.Submit_Button();

				w.Ok();

				Thread.sleep(2000);

				Test.log(Status.PASS, "Submitted and confirmed action");

				Thread.sleep(2000);

				scrollPageup();

				w.SearchBox(MaterialMasterRM_Edit);

				Thread.sleep(3000);

				Test.log(Status.PASS, "Searched again for Material Master RM Edit");

				w.ViewButton();

				scrollPagedown();

				Test.log(Status.PASS, "Viewed details and scrolled down");

				w.Back_Button2();

				Test.log(Status.PASS, "Clicked Back Button");
			}

		} catch (Exception e) {

			Test.log(Status.FAIL, "Test failed: " + e.getMessage());

			throw e;

		} finally {
			// driver.close();
			// Test.log(Status.INFO, "Closed the driver");
		}
	}
}