package B1_Transaction_RawMaterial_Create;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_02_Goods_Recipt_With_PO_Split_2_Batch extends BaseClass {
	@org.testng.annotations.Test
	public static void goodsRecipt() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		WMPS_Login("Initiator", "Initiator_Password");
		w.WareHouse();
		w.Goods_Receipt();
		Thread.sleep(10000);

		w.Menu_Navigate();
		Thread.sleep(1000);

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 5; i++) {
			// Data_Mapping from Purchase Order Entry
			String PurchaseOrder_Number = xls.getCellData("PurchaseOrderEntry", "PurchaseOrder_Number", i);
			// ***************************************************************************************************
			// Data_Mapping
			// **************************************************************************************************
			String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
			String Vendor_Name_Supplier_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Supplier_Edit", i);
			// **************************************************************************************************
			String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
			String Vendor_Name_Manufacturer_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit", i);
			// **************************************************************************************************
			String VendorTypeManufacturer = xls.getCellData("Vendor_Supplier", "VendorTypeManufacturer", i);
			String VendorTypeSupplier = xls.getCellData("Vendor_Supplier", "VendorTypeSupplier", i);
			// **************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
			// **************************************************************************************************
			String Material_Description = xls.getCellData("Excel_Data", "Material_Description", i);
			// ***************************************************************************************************************
			String Requested_Quantity = xls.getCellData("PurchaseOrderEntry", "Requested_Quantity", i);// From PO Screen
			String Received_Quantity = xls.getCellData("PurchaseOrderEntry", "Received_Quantity", i);// From PO Screen
			// ***************************************************************************************************************
			String ContainerA = xls.getCellData("Goods_ReceiptWith_WithOut", "ContainerA", i);// 1
			String ContainerB = xls.getCellData("Goods_ReceiptWith_WithOut", "ContainerB", i);// 2
			String ContainerC = xls.getCellData("Goods_ReceiptWith_WithOut", "ContainerC", i);// 3

			String DeliveryChallanNo = xls.getCellData("Goods_ReceiptWith_WithOut", "DeliveryChallanNo", i);
			String DeliveryChallanNo2 = xls.getCellData("Goods_ReceiptWith_WithOut", "DeliveryChallanNo2", i);
			String Remarks = xls.getCellData("Goods_ReceiptWith_WithOut", "Remarks", i);
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

			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='Goods-Reciept-create']")).click();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			Thread.sleep(3000);

			w.PO_Selection_WithPO();
			w.PO_Number(PurchaseOrder_Number);
			w.Get_Button();

			w.InwardType_Selection();
			w.MaterialType_Selection();

			// ***************************************************************************************************************
			w.DD_01(MaterialMasterRM_Edit);
			w.DD_02(Vendor_Name_Manufacturer_Edit);
			w.DD_03(Vendor_Name_Supplier_Edit);
			// ***************************************************************************************************************
			w.StorageLocation_Selection();

			driver.findElement(By.xpath("//*[@formcontrolname='receivedQuantity']")).sendKeys("2000000");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();
			w.Ok_Button();
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();

			driver.findElement(By.xpath("//*[@formcontrolname='receivedQuantity']")).sendKeys("20");

			// w.ReceivedQuantity(Received_Quantity);//Always less that what given in PO
			// Screen
			// w.ReceivedQuantity("1000");//Always less that what given in PO Screen

//			WebElement GetReceivedQuantity = driver.findElement(By.xpath("//*[@formcontrolname='receivedQuantity' or @formcontrolname='receivedQuantity']"));
//			String ReceivedQuantity = GetReceivedQuantity.getText();
//			System.out.println(ReceivedQuantity);

			w.Container_No(ContainerB);// 2 Container
			w.VendorStorageCondition(DeliveryChallanNo);
			w.Remarks(Remarks);
			w.ChallanNumber(DeliveryChallanNo);
			w.StorageCondition_Selection();

			w.ManufacturingDateFormat_Selection();

			driver.findElement(By.xpath("//input[@formcontrolname='manufactureDate']")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@formcontrolname='retestDate']")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@formcontrolname='expiryDate']")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@formcontrolname='dcDate']")).click();
			Thread.sleep(8000);

			// ***************************************************************************************************************
			p.CB_1();// Only for Hetero ***********
			// ***************************************************************************************************************

			w.Split_Button();
			w.Plus_Button_FFPC();// Adding ome more container

			w.TT_18_CSE("5000");// try to half the data of Received_Quantity bt using get function
			w.TT_19_CSE("1");

			driver.findElement(By.xpath("(//*[@type='date'])[8]")).sendKeys(DateToday);
			Thread.sleep(2000);// Manufacturing Date
			driver.findElement(By.xpath("(//*[@type='date'])[9]")).sendKeys(OneMonthLater);
			Thread.sleep(2000);// Vendor Re-test Date
			driver.findElement(By.xpath("(//*[@type='date'])[10]")).sendKeys(OneYearLater);
			Thread.sleep(2000);// Vendor Expiry Date

			w.Proceed_Button();
			w.Yes();
			w.Password_Fill(InitiatorPassword);
			// w.Submit_Button();w.Ok();
			Thread.sleep(10000);

			// ***************************************************************************************************************
			w.SearchBox(PurchaseOrder_Number);
			Thread.sleep(4000);
			w.ViewButton();
			scrollPagedown();
			w.Back_Button();
			// ***************************************************************************************************************
		}
		driver.close();
	}
}