package A1_Master_Create;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_04_Manufacturer_Assignment extends BaseClass {

	@org.testng.annotations.Test
	public static void Manufacturer_Assignment() throws Exception
	{
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);
		Actions actions = new Actions(driver);

		int rowcount = xls.getRowCount("Material_Master");
		WMPS_Login("Initiator", "Initiator_Password");
		mp.Master_Click();
		mp.Manufacture_Master();Thread.sleep(2500);
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++)
		{
			// **************************************************************************************************
			// **************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
			// **************************************************************************************************
			// **************************************************************************************************
			String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
			String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
			// **************************************************************************************************
			String Vendor_Name_Supplier_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Supplier_Edit", i);
			String Vendor_Name_Manufacturer_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit", i);
			// **************************************************************************************************
			// **************************************************************************************************
			String fromdate = xls.getCellData("Manufacturer_Assignment", "fromdate", i);
			String todate = xls.getCellData("Manufacturer_Assignment", "todate", i);
			String VendorStatus = xls.getCellData("Manufacturer_Assignment", "VendorStatus", i);
			String Comments = xls.getCellData("Manufacturer_Assignment", "Comments", i);
			// **************************************************************************************************
			String Date1MB = xls.getCellData("Date", "Date1MB", i);
			String DateToday = xls.getCellData("Date", "DateToday", i);
			String Date1ML = xls.getCellData("Date", "Date1ML", i);
			String Date2ML = xls.getCellData("Date", "Date2ML", i);
			// **************************************************************************************************
			// **************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// **************************************************************************************************
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2500);
			w.Create_Button();
			//w.DD_01(MaterialMasterRM);
			w.DD_01(MaterialMasterRM_Edit);
			// **************************************************************************************************
			//mp.Manfacturer_Name_Text(Vendor_Name_Manufacturer);
			mp.Manfacturer_Name_Text(Vendor_Name_Manufacturer_Edit);
			// **************************************************************************************************
			w.VendorStatus(VendorStatus);
			w.fromDate(DateToday);Thread.sleep(2000);
			w.todate(Date2ML);
			w.Comments(Comments);
			w.Save_Button();w.Yes();
			w.Password_Fill.sendKeys(Pro.getProperty("Initiator_Password"));
			w.Submit_Button();w.Ok();
			// **************************************************************************************************

//			//w.SearchBox(MaterialMasterRM);
//			w.SearchBox(MaterialMasterRM_Edit);
//			// **************************************************************************************************
//			w.ViewButton();w.Back_Button();
		}
		driver.close();
	}
}
