package ZZ_Issues_AutomationTestScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_02_Goods_Recipt_WithOut_PO_RemarksIssue extends BaseClass {
	WmpsObj w;
	@org.testng.annotations.Test
	public static void goodsReceipt() throws Exception {
		WmpsObj w = new WmpsObj(driver);

		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);
		Test = extent.createTest("Goods Receipt Test");
		try {
			WMPS_Login("Initiator", "Initiator_Password");
			Test.pass("Logging in with Initiator credentials");

			w.WareHouse();
			Test.pass("Clicking on Warehouse");

			w.Goods_Receipt();
			Test.pass("Clicking on Goods Receipt");
			Thread.sleep(2000);

			w.Menu_Navigate();
			Test.pass("Navigating through the menu");
			Thread.sleep(1000);

			int rowcount = xls.getRowCount("Material_Master");
			System.out.println(rowcount);
			for (int i = 2; i <= 2; i++) {
				String PurchaseOrder_Number = xls.getCellData("PurchaseOrderEntry", "PurchaseOrder_Number", i);
				String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
				String Vendor_Name_Supplier_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Supplier_Edit", i);
				String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
				String Vendor_Name_Manufacturer_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit",
						i);
				String VendorTypeManufacturer = xls.getCellData("Vendor_Supplier", "VendorTypeManufacturer", i);
				String VendorTypeSupplier = xls.getCellData("Vendor_Supplier", "VendorTypeSupplier", i);
				String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
				String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
				String Material_Description = xls.getCellData("Excel_Data", "Material_Description", i);
				String Requested_Quantity = xls.getCellData("PurchaseOrderEntry", "Requested_Quantity", i);
				String Received_Quantity = xls.getCellData("PurchaseOrderEntry", "Received_Quantity", i);
				String ContainerA = xls.getCellData("Goods_ReceiptWith_WithOut", "ContainerA", i);
				String ContainerB = xls.getCellData("Goods_ReceiptWith_WithOut", "ContainerB", i);
				String ContainerC = xls.getCellData("Goods_ReceiptWith_WithOut", "ContainerC", i);
				String DeliveryChallanNo = xls.getCellData("Goods_ReceiptWith_WithOut", "DeliveryChallanNo", i);
				String DeliveryChallanNo2 = xls.getCellData("Goods_ReceiptWith_WithOut", "DeliveryChallanNo2", i);
				String Remarks = xls.getCellData("Goods_ReceiptWith_WithOut", "Remarks", i);
				String Today_Date = xls.getCellData("Changable_Data", "Today_Date", i);
				String OneMonthLater = xls.getCellData("Changable_Data", "OneMonthLater", i);
				String OneYearLater = xls.getCellData("Changable_Data", "OneYearLater", i);
				String Past_Date = xls.getCellData("Changable_Data", "Past_Date", i);
				String DateToday = xls.getCellData("Date", "DateToday", i);
				String Date1ML = xls.getCellData("Date", "Date1ML", i);
				String Date2ML = xls.getCellData("Date", "Date2ML", i);
				String Date6ML = xls.getCellData("Date", "Date6ML", i);
				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);

				w.Create();
				Test.pass("Creating a new Goods Receipt entry");
				Thread.sleep(2000);

				w.PO_Selection();
				Test.pass("Selecting Purchase Order");

				w.InwardType_Selection();
				Test.pass("Selecting Inward Type");

				w.MaterialType_Selection();
				Test.pass("Selecting Material Type");
				System.out.println(MaterialMasterRM_Edit);

				w.DD_01(MaterialMasterRM_Edit);
				Test.pass("Selecting Material Master from dropdown");

				w.DD_02(Vendor_Name_Manufacturer_Edit);
				Test.pass("Selecting Vendor Name Manufacturer from dropdown");

				w.DD_03(Vendor_Name_Supplier_Edit);
				Test.pass("Selecting Vendor Name Supplier from dropdown");

				w.StorageLocation_Selection();
				Test.pass("Selecting Storage Location");

				w.ReceivedQuantity(Received_Quantity);
				Test.pass("Entering Received Quantity");

				w.UOM_DDI();
				Test.pass("Selecting UOM");

				w.Container_No(ContainerA);
				Test.pass("Entering Container Number");

				w.VendorStorageCondition(DeliveryChallanNo);
				Test.pass("Entering Vendor Storage Condition");

				w.Remarks(Remarks);
				Test.pass("Entering Remarks");

				w.ChallanNumber(DeliveryChallanNo);
				Test.pass("Entering Delivery Challan Number");

				w.StorageCondition_Selection();
				Test.pass("Selecting Storage Condition");

				w.ManufacturingDateFormat_Selection();
				Test.pass("Selecting Manufacturing Date Format");

				driver.findElement(By.xpath("//input[@formcontrolname='manufactureDate']")).click();
				Test.pass("Entering Manufacturing Date");
				Thread.sleep(8000);

				driver.findElement(By.xpath("//*[@formcontrolname='retestDate']")).click();
				Test.pass("Entering Retest Date");
				Thread.sleep(8000);

				driver.findElement(By.xpath("//*[@formcontrolname='expiryDate']")).sendKeys(Date6ML);
				Test.pass("Entering Expiry Date");
				Thread.sleep(8000);

				driver.findElement(By.xpath("//*[@formcontrolname='dcDate']")).click();
				Test.pass("Entering DC Date");
				Thread.sleep(8000);

				p.CB_1();
				Test.pass("Clicking on Checkbox 1");

				w.Split_Button();
				Test.pass("Clicking on Split Button");

				w.Proceed_Button();
				Test.pass("Clicking on Proceed Button");

				w.Yes();
				Test.pass("Clicking on Yes Button");

				w.Password_Fill(InitiatorPassword);
				Test.pass("Entering Initiator Password");

				w.Submit_Button();
				Test.pass("Clicking on Submit Button");

				w.Ok();
				Test.pass("Clicking on Ok Button");

				((JavascriptExecutor) driver).executeScript("window.open('about:blank', '_blank');");
				Set<String> windowHandles = driver.getWindowHandles();
				Iterator<String> iterator = windowHandles.iterator();
				iterator.next();
				String newTabHandle = iterator.next();
				driver.switchTo().window(newTabHandle);
				driver.get("http://172.16.5.175/Spectrum/Test/");
				driver.switchTo().window(newTabHandle);
				Test.pass("Opening a new tab and navigating to URL");

				driver.findElement(By.cssSelector(".avatarIcon")).click();
				driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
				driver.findElement(By.xpath("//a[normalize-space()='Yes']")).click();
				Test.pass("Logging out from the current session");

				WMPS_Login("Approver_ID", "Approver_Password");
				Test.pass("Logging in with Approver credentials");

				w.Second_Level();
				Test.pass("Navigating to Second Level");

				w.ReviewApprovalCategory("Goods Receipt Release");
				Test.pass("Selecting Review Approval Category as 'Goods Receipt Release'");

				w.Search_Button();
				Test.pass("Clicking on Search Button");

				w.SearchBox(MaterialMasterRM_Edit);
				Test.pass("Searching for Material Master RM Edit");

				w.SearchBox2(" Created");
				Test.pass("Adding additional search criteria 'Created'");
				Thread.sleep(3000);

				w.Edit_Action_Button();
				Test.pass("Clicking on Edit Action Button");

				Thread.sleep(3000);
				WebElement ReturnedRemarks = driver
						.findElement(By.xpath("//input[@formcontrolname='returnedRemarks']"));
				String releaseRemarks = ReturnedRemarks.getAttribute("value");
				
				
				Assert.assertEquals(releaseRemarks, Remarks,
						"The release remarks do not match the expected remarks from Excel.");
				Test.pass("Validating remarks from the previous screen");
				Thread.sleep(1000);

				w.Comments("Good_Recipt_With_PO_Release");
				Test.pass("Entering comments for release");
				Thread.sleep(2000);

				w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
				Test.pass("Selecting Approver Action");

				w.Save_Button2();
				Test.pass("Clicking on Save Button");

				w.Yes();
				Test.pass("Clicking on Yes Button");

				w.Password_Fill(ApproverPassword);
				Test.pass("Entering Approver Password");

				w.Submit_Button();
				Test.pass("Clicking on Submit Button");

				w.Ok();
				Test.pass("Clicking on Ok Button");

				Test.info("Searching for Material Master RM Edit again");
				w.SearchBox(MaterialMasterRM_Edit);
				Thread.sleep(3000);

				Test.info("Viewing the receipt details");
				w.ViewButton();

				Test.info("Scrolling down the page");
				scrollPagedown();

				Test.info("Clicking on Back Button");
				w.Back_Button2();
			}
		} catch (Exception e) {
			Test.fail("Test failed due to an exception: " + e.getMessage());
			throw e;
		}
	}
}