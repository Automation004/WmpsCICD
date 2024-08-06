package A1_Master_Create;

import F.pageobjects.MasterXpaths;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_03_Vendor_Master_Supplier_OneTimeCreation extends BaseClass {

	@org.testng.annotations.Test
	public static void Vendor_Master_Supplier() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++)
		{
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
			// **************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
			// **************************************************************************************************

			WMPS_Login("Initiator", "Initiator_Password");
			mp.Master_Click();
			mp.Vendor_Master();Thread.sleep(4000);
			w.Create_Button();Thread.sleep(4000);
			//mp.Vendor_Type_DDselect();
			w.VendorType(VendorTypeSupplier);//Excel
			// **************************************************************************************************
			//mp.Vendor_Name_SK(Vendor_Name_Supplier);
			mp.Vendor_Name_SK(Vendor_Name_Supplier_Edit);
			// **************************************************************************************************
			w.Street(Street);
			w.Street1(Street1);
			w.Street2(Street2);Thread.sleep(1000);
			w.Country_DD_VT(Country);Thread.sleep(1000);
			w.State_DDI();Thread.sleep(1000);
			w.City_DDI();Thread.sleep(1000);
			mp.Postal_Code(Postal_Code);
			w.Submit_Button();w.Yes();
			w.Password_Fill.sendKeys(Pro.getProperty("Initiator_Password"));
			w.Submit_Button2();w.Ok();
			// **************************************************************************************************
			//w.SearchBox(Vendor_Name_Supplier);
			w.SearchBox(Vendor_Name_Supplier_Edit);
			// **************************************************************************************************
			w.ViewButton();
		}
		 driver.close();
	}

}
