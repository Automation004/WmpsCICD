package Transactions_Warehouse;

import org.openqa.selenium.By;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_11_Material_Return_To_Vendor extends BaseClass
{

	@org.testng.annotations.Test
	public static void Material_Return_To_Vendor() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);

		WMPS_Login("441111","Password");

		w.Menu_Navigate();
		w.Transactions();
		w.WareHouse();
		w.Material_Return_To_Vendor();
		w.Menu_Navigate();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			String Material_Description =xls.getCellData("Excel_Data", "Material_Description", i);
			String PurchaseOrder_Number =xls.getCellData("Negative_Transaction", "PurchaseOrder_Number", i);

			w.SearchBox(Material_Description);
			w.Edit_Action_Button();
			driver.findElement(By.xpath("//input[@formcontrolname='documentDate']")).click();Thread.sleep(6000);Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@formcontrolname='deliveryChallanNumber']")).sendKeys(PurchaseOrder_Number);Thread.sleep(2000);
            w.Remarks("Material Return To Vendor");
            w.Return_Button();
            w.Yes();w.Password_Fill("321");
		}}}
