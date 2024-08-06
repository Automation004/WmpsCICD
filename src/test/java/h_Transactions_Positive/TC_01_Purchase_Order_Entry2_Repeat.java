package h_Transactions_Positive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_01_Purchase_Order_Entry2_Repeat extends BaseClass {

	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++) {
			String materialtype = xls.getCellData("Material_Master", "Material_Type", i);
			String Material_Long_Description = xls.getCellData("Material_Master", "Material_Long_Description", i);
			String Stage = xls.getCellData("Material_Master", "Stage", i);
			String Purchase_UOM = xls.getCellData("Material_Master", "Purchase_UOM", i);
			String Material_Code = xls.getCellData("Material_Master", "Material_Code", i);
			String Material_Number = xls.getCellData("Material_Master", "Material_Number", i);
			String Basic_Unit_Of_Measurement = xls.getCellData("Material_Master", "Basic_Unit_Of_Measurement", i);
			String Production_Starting_Yrear = xls.getCellData("Material_Master", "Production_Starting_Yrear", i);
			String Procurement_Type = xls.getCellData("Material_Master", "Procurement_Type", i);
			String Storage_Conditions = xls.getCellData("Material_Master", "Storage_Conditions", i);
			String Specification_STP_No = xls.getCellData("Material_Master", "Specification_STP_No", i);
			String Rounding = xls.getCellData("Material_Master", "Rounding", i);
			String Inspectiontype = xls.getCellData("Datafields_ALL", "Inspectiontype", i);
			String Edit_InspectionType = xls.getCellData("Datafields_ALL", "Edit_InspectionType", i);
			String po_date = xls.getCellData("PurchaseOrderEntry", "po_date", i);
			String supplier = xls.getCellData("Manufacturer_Assignment", "Name_Of_Supplier", i);
			String material_Description = xls.getCellData("Manufacturer_Assignment", "Material_Name", i);
			String Manufaturer = xls.getCellData("Manufacturer_Assignment", "Manufacturer_name", i);

			// String PurchaseOrder_number =xls.getCellData("PurchaseOrderEntry",
			// "PurchaseOrder_number", i);
			String Requested_Quantity = xls.getCellData("PurchaseOrderEntry", "Requested_Quantity", i);
			String Received_Quantity = xls.getCellData("PurchaseOrderEntry", "Received_Quantity", i);
			String remarks = xls.getCellData("PurchaseOrderEntry", "remarks", i);

			String RequestUOM = xls.getCellData("PurchaseOrderEntry", "RequestUOM", i);

			// Data_Mapping

			String PurchaseOrder_Number = xls.getCellData("PurchaseOrderEntry", "PurchaseOrder_Number", i);

			String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
			String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
			String Material_Description = xls.getCellData("Excel_Data", "Material_Description", i);

			WMPS_Login("441111", "Password");
			w.Menu_Navigate();
			w.Menu_Navigate();
			w.Purchase_Order();
			w.Purchase_Order_Entry();
//			w.Type_Button_1();
			// w.Entry_Button();

			driver.findElement(By.xpath("//*[@formcontrolname='purchaseOrderNumber']")).sendKeys(PurchaseOrder_Number);
			Thread.sleep(2000);
			w.Remarks(Material_Description);

			WebElement MaterialDescription = driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[2]"));
			MaterialDescription.sendKeys(Material_Description);
			Thread.sleep(2000);
			w.DropDown1Select();
			// MaterialDescription.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);Thread.sleep(2000);

			WebElement Manufacturer = driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[3]"));
			Manufacturer.sendKeys(Vendor_Name_Manufacturer);
			Thread.sleep(2000);
			Manufacturer.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@formcontrolname='requestQuantity']")).sendKeys(Requested_Quantity);
			Thread.sleep(2000);

			Select RequestUom = new Select(driver.findElement(By.xpath("//*[@formcontrolname='requestUOMId']")));
			// RequestUom.selectByVisibleText(RequestUOM);Thread.sleep(2000);
			RequestUom.selectByIndex(2);

			driver.findElement(By.xpath("//*[@formcontrolname='receivedQuantity']")).sendKeys(Received_Quantity);
			Thread.sleep(2000);

			Select ReceivedUom = new Select(driver.findElement(By.xpath("//select[@formcontrolname='uomId']")));
			ReceivedUom.selectByIndex(2);
			// uom2.selectByVisibleText(UOM);Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@formcontrolname='remarks']")).sendKeys(remarks);
			Thread.sleep(2000);

			driver.findElement(By.id("Purchse-entry-add")).click();
			Thread.sleep(2000); // add

			w.Submit();
			Thread.sleep(2000);
			w.Yes();
//			w.Password_Fill("");w.Submit_Type();
//			w.Password_Fill(WrongPassword);w.Submit_Type();w.Ok();
			// w.Password_Fill("321");w.Submit_Type();w.Ok();

		}
	}
}
