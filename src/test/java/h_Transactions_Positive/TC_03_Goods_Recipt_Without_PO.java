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

public class TC_03_Goods_Recipt_Without_PO extends BaseClass {

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

			String nu_of_container = xls.getCellData("Goods_ReceiptWith_WithOut", "no_of_container", i);
			String delivery_challan_No = xls.getCellData("Goods_ReceiptWith_WithOut", "delivery_challan_No", i);
			String manufacturing_date = xls.getCellData("Goods_ReceiptWith_WithOut", "manufacturing_date", i);
			String vendor_Retest = xls.getCellData("Goods_ReceiptWith_WithOut", "vendor_Retest", i);

			// Data_Mapping
			String Vendor_name_Manufacturer = xls.getCellData("Vendor_Supplier", "Vendor_name_Manufacturer", i);
			String Vendor_name_Supplier = xls.getCellData("Vendor_Supplier", "Vendor_name_Supplier", i);
			// String Material_Description =xls.getCellData("Material_Master",
			// "Material_Description", i);
			String PurchaseOrder_number = xls.getCellData("PurchaseOrderEntry", "PurchaseOrder_number", i);// Purchase
																											// Order
																											// Entry

			String Today_Date = xls.getCellData("Changable_Data", "Today_Date", i);
			String OneMonthLater = xls.getCellData("Changable_Data", "OneMonthLater", i);
			String OneYearLater = xls.getCellData("Changable_Data", "OneYearLater", i);
			String Past_Date = xls.getCellData("Changable_Data", "Past_Date", i);

			String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
			String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
			String Material_Description = xls.getCellData("Excel_Data", "Material_Description", i);

			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);

			WMPS_Login("Initiator", "Initiator_Password");
			w.Menu_Navigate();
			w.Menu_Navigate();
			w.WareHouse();
			w.Goods_Receipt();
			w.Menu_Navigate();
			w.Create();
			Thread.sleep(2000);

			Select gr = new Select(driver.findElement(By.xpath("//*[@class='form-control']")));
			gr.selectByVisibleText("Other Goods Receipt");
			Thread.sleep(2000);

			Select InwardType = new Select(driver.findElement(By.xpath("//select[@formcontrolname='InwardType']")));
			InwardType.selectByIndex(2);
			Thread.sleep(2000);

			Select MaterialType = new Select(driver.findElement(By.xpath("//select[@formcontrolname='materialType']")));
			MaterialType.selectByIndex(2);
			Thread.sleep(2000);

			WebElement MaterialDescription = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			MaterialDescription.sendKeys(Material_Description);
			Thread.sleep(2000);
			MaterialDescription.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);

			WebElement VendorBatchNumber = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
			VendorBatchNumber.sendKeys("");
			Thread.sleep(4000);

			WebElement ManufactureName = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
			ManufactureName.sendKeys(Vendor_Name_Manufacturer);
			Thread.sleep(4000);
			ManufactureName.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);

			WebElement SupplierName = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
			SupplierName.sendKeys(Vendor_Name_Supplier);
			Thread.sleep(4000);
			SupplierName.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
			Thread.sleep(2000);

			Select StorageLocation = new Select(
					driver.findElement(By.xpath("//select[@formcontrolname='storageLocation']")));
			StorageLocation.selectByIndex(2);
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@formcontrolname='receivedQuantity']")).sendKeys("1000");
			Thread.sleep(2000);

			Select RequestUom = new Select(driver.findElement(By.xpath("//*[@formcontrolname='uom']")));
			RequestUom.selectByIndex(2);
			driver.findElement(By.xpath("//input[@formcontrolname='noofContainers']")).sendKeys("2");
			Thread.sleep(2000);

			Select mdformat = new Select(driver.findElement(By.xpath("//*[@formcontrolname='mfgDateFormat']")));
			Thread.sleep(2000);
			mdformat.selectByIndex(2);

			driver.findElement(By.xpath("//input[@formcontrolname='manufactureDate']")).sendKeys(Today_Date);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='retestDate']")).sendKeys(OneMonthLater);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='expiryDate']")).sendKeys(OneYearLater);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='dcDate']")).sendKeys(Today_Date);
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@formcontrolname='challanNumber']")).sendKeys(delivery_challan_No);
			Thread.sleep(2000);

			Select condition = new Select(driver.findElement(By.xpath("//*[@formcontrolname='storageCondition']")));
			condition.selectByIndex(2);
			Thread.sleep(2000);

			p.CB_1();
			driver.findElement(By.xpath("//*[contains(text(),' Proceed ')]")).click();
			Thread.sleep(2000);

			// E_Signature_Masters("Password");

		}
	}
}
