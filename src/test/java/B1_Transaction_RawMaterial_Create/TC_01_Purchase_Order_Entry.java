package B1_Transaction_RawMaterial_Create;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_01_Purchase_Order_Entry extends BaseClass {
	@org.testng.annotations.Test
	public static void Purchase_Order_Entry() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		WMPS_Login("Initiator", "Initiator_Password");
		w.Purchase_Order();
		// Start measuring time
		long startTime = System.currentTimeMillis();
		w.Purchase_Order_Entry();
		// Calculate the time taken
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		// Print the time taken
		System.out.println("Time taken for Purchase_Order_Entry " + executionTime + " milliseconds");
		Thread.sleep(4000);

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 5; i++) {
			// **************************************************************************************************
			String PurchaseOrder_Number = xls.getCellData("PurchaseOrderEntry", "PurchaseOrder_Number", i);// Unique
			String DateToday = xls.getCellData("Date", "DateToday", i);// Today
			// **************************************************************************************************
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

			String Requested_Quantity = xls.getCellData("PurchaseOrderEntry", "Requested_Quantity", i);
			String Received_Quantity = xls.getCellData("PurchaseOrderEntry", "Received_Quantity", i);
			// **************************************************************************************************
			// **************************************************************************************************
			String Basic_UOM = xls.getCellData("Material_Master", "Basic_UOM", i);// ***********From Material Master
			// RequestUOM and ReceivedUOM should be same as Base UOM of Material MAster
			String RequestUOM = xls.getCellData("PurchaseOrderEntry", "RequestUOM", i);
			String ReceivedUOM = xls.getCellData("PurchaseOrderEntry", "RequestUOM", i);
			// **************************************************************************************************
			// **************************************************************************************************

			String Remarks = xls.getCellData("PurchaseOrderEntry", "Remarks", i);
			// **************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// **************************************************************************************************
			Thread.sleep(2000);
			w.Entry_Button();// Recurrance

			w.PurchaseOrderNumber(PurchaseOrder_Number);
			// w.Remarks(Material_Description);
			w.PurchaseOrderDate(DateToday);
			// ****************************Take edit or without edit
			// accordingly*********************************

			w.DD_01(Vendor_Name_Supplier_Edit);// **********************
			w.DD_02(MaterialMasterRM_Edit);
			Thread.sleep(2000);// **************************
			w.DD_03(Vendor_Name_Manufacturer_Edit);
			Thread.sleep(2000);// ******************

			// **************************************************************************************************

			w.RequestQuantity(Requested_Quantity);
			w.ReceivedQuantity(Received_Quantity);
			// **************************************************************************************************
			w.RequestUOM_SK(Basic_UOM);// BaseUOM of Material Master
			w.RecievedUOM_SK(Basic_UOM);// AlternateUOM of Material Master
			// **************************************************************************************************
			w.Remarks(Remarks);
			w.Add_Button();
			Thread.sleep(3000);
			w.Save_Button();
			Thread.sleep(3000);
			w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button();
			w.Ok();
			Thread.sleep(3000);
			Thread.sleep(3000);
			// *******************************Not working for more than 2 i*
			// values******************************

			// w.ViewButton(); Thread.sleep(3000);
			// scrollPagedown();
			// w.Back_Button();Thread.sleep(3000);

			// **************************************************************************************************
		}
		// driver.close();
		//// div/div/table
	}
}
