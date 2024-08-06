package A1_Master_Create;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import F.pageobjects.MasterXpaths;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;
public class TC_02_Vendor_Master_Manufacturer_OneTimeCreation extends BaseClass {
	@org.testng.annotations.Test
	public static void Vendor_Master() throws Exception
	{
		WmpsObj w = new WmpsObj(driver);
		MasterXpaths mp = new MasterXpaths(driver);
		WMPS_Login("Initiator", "Initiator_Password");

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++)
		{
			String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
			String Vendor_Name_Manufacturer_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit", i);
			// **************************************************************************************************
			String VendorTypeManufacturer = xls.getCellData("Vendor_Supplier", "VendorTypeManufacturer", i);
			// **************************************************************************************************
			String Street = xls.getCellData("Vendor_Supplier", "Street", i);
			String Street1 = xls.getCellData("Vendor_Supplier", "Street1", i);
			String Postal_Code = xls.getCellData("Vendor_Supplier", "Postal_Code", i);
			// **************************************************************************************************
			String Street_Edit = xls.getCellData("Vendor_Supplier", "Street_Edit", i);
			String Street1_Edit = xls.getCellData("Vendor_Supplier", "Street1_Edit", i);
			String Postal_Code_Edit = xls.getCellData("Vendor_Supplier", "Postal_Code_Edit", i);
			// **************************************************************************************************
			String Street2 = xls.getCellData("Vendor_Supplier", "Street2", i);
			String Country = xls.getCellData("Vendor_Supplier", "Country", i);
			String State = xls.getCellData("Vendor_Supplier", "State", i);
			String City = xls.getCellData("Vendor_Supplier", "City", i);
			// **************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			// **************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
			// **************************************************************************************************
			 WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Master')])[1]"));
		        Actions actions1 = new Actions(driver);
		        actions1.moveToElement(element).perform();
		        actions1.click(element).perform();

			mp.Master_Click();
			mp.Vendor_Master();Thread.sleep(4000);
			w.Create_Button();
			Thread.sleep(4000);
			w.VendorType(VendorTypeManufacturer);//Excel
			// **************************************************************************************************
			//mp.Vendor_Name_SK(Vendor_Name_Manufacturer);
			mp.Vendor_Name_SK(Vendor_Name_Manufacturer_Edit);
			// **************************************************************************************************
			w.Street(Street);
			w.Street1(Street1);
			w.Street2(Street2);Thread.sleep(1000);
			w.Country_DD_VT(Country);Thread.sleep(1000);
			w.State_DDI();Thread.sleep(1000);
			w.City_DDI();Thread.sleep(1000);
			w.Postal_Code(Postal_Code);
			w.Submit_Button();w.Yes();
			w.Password_Fill.sendKeys(Pro.getProperty("Initiator_Password"));
			w.Submit_Button2();w.Ok();
			// **************************************************************************************************
			//w.SearchBox(Vendor_Name_Manufacturer);
			w.SearchBox(Vendor_Name_Manufacturer_Edit);
			// **************************************************************************************************
			w.ViewButton();
		}
//	 driver.close();
	}
}
