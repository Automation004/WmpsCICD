package Transactions_Warehouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_06_Batch_Change extends BaseClass
{

	@org.testng.annotations.Test
	public static void Batch_Change() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);



		WMPS_Login("441111","Password");

		w.Menu_Navigate();
		w.Transactions();
		w.WareHouse();
		w.Batch_Change();
		w.Menu_Navigate();
		w.Create();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//Data_Mapping
			String Vendor_Name_Manufacturer =xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
			String Vendor_Name_Supplier =xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
			String Material_Description =xls.getCellData("Excel_Data", "Material_Description", i);

			WebElement MaterialDescription = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			MaterialDescription.sendKeys(Material_Description);Thread.sleep(2000);
			MaterialDescription.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);Thread.sleep(2000);

			WebElement MaterialDescription1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			MaterialDescription1.sendKeys(" RM02522005 ");Thread.sleep(2000);
			MaterialDescription1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@formcontrolname='numberOfRetest']")).sendKeys("2");Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@formcontrolname='commentsBatchChange']")).sendKeys("Batch Status Comments Done");Thread.sleep(2000);



			WebElement ManufactureName = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
			ManufactureName.sendKeys(Vendor_Name_Manufacturer);Thread.sleep(1000);
			ManufactureName.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);Thread.sleep(2000);
			WebElement SupplierName = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
			SupplierName.sendKeys(Vendor_Name_Supplier);Thread.sleep(1000);
			SupplierName.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);Thread.sleep(2000);
			w.Submit();w.Ok_Button();w.Password_Fill("321");
			//w.TYPE_SUBMIT();w.OK_BUTTON();



}}}