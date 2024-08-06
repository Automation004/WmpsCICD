package A1_Master_Create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import F.pageobjects.MasterXpaths;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_01_MaterialMasterRawMaterial extends BaseClass {
	@org.testng.annotations.Test
	public static void materialMaster() throws Exception {
		WmpsObj w = new WmpsObj(driver);// ob call
		MasterXpaths mp = new MasterXpaths(driver);
		Actions actions = new Actions(driver);

		WMPS_Login("Initiator", "Initiator_Password");
		int rowcount = xls.getRowCount("Material_Master");

		WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Master')])[1]"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(element).perform();
		actions1.click(element).perform();

		mp.Master_Click();
		mp.Material_Master();
		System.out.println(rowcount);

		// ****************************************************************************************************************
		for (int i = 2; i <= 5; i++) {
			// ************************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);

			String Material_Type_RawMaterial = xls.getCellData("Excel_Data", "Material_Type", i);
			String Material_Type_SFP = xls.getCellData("Excel_Data", "Material_Type_SFP", i);

			// ************************************************************************************************************
			String Material_Long_Description_RawMaterial = xls.getCellData("Excel_Data", "Material_Long_Description_RM",
					i);

			String Purchase_UOM = xls.getCellData("Material_Master", "Purchase_UOM", i);// *****************
			String Basic_UOM = xls.getCellData("Material_Master", "Basic_UOM", i);// ***********************

			String AltUOM_X = xls.getCellData("Material_Master", "AltUOM_X", i);// *******************
			String AltUOM_Y = xls.getCellData("Material_Master", "AltUOM_Y", i);// *******************
			String AltUOM = xls.getCellData("Material_Master", "AltUOM", i);

			String Material_Number = xls.getCellData("Material_Master", "Material_Number", i);
			String Material_Number_Edit = xls.getCellData("Material_Master", "Material_Number_Edit", i);

			String Storage_Conditions = xls.getCellData("Material_Master", "Storage_Conditions", i);

			String Specification_STP_No = xls.getCellData("Material_Master", "Specification_STP_No", i);
			String Specification_STP_No_Edit = xls.getCellData("Material_Master", "Specification_STP_No_Edit", i);

			String Procurement_Type = xls.getCellData("Material_Master", "Procurement_Type", i);
			String Rounding = xls.getCellData("Material_Master", "Rounding", i);
			String Production_Starting_Year = xls.getCellData("Material_Master", "Production_Starting_Year", i);
			String Remarks = xls.getCellData("Material_Master", "Remarks", i);
			String InspectIntervalPeriod = xls.getCellData("Material_Master", "InspectIntervalPeriod", i);
			String InspectionType = xls.getCellData("Material_Master", "InspectionType", i);
			String InspectIntervalPeriodDMY = xls.getCellData("Material_Master", "InspectIntervalPeriodDMY", i);
			String StorageLocations = xls.getCellData("Material_Master", "StorageLocations", i);

			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ************************************************************************************************************
			// ************************************************************************************************************
			w.Create();
			mp.Meterial_Type_Text(Material_Type_SFP);
			// ************************************************************************************************************
			// mp.Material_Description_SK(MaterialMasterRM);//***********
			mp.Material_Description_SK(MaterialMasterRM_Edit);// *************
			// ************************************************************************************************************
			mp.Material_Long_Description_SK(Material_Long_Description_RawMaterial);
			mp.Purchase_UOM_Text(Purchase_UOM);
			mp.DropDown_Select();
			mp.Material_Number_SK(Material_Number);
			mp.Basic_Unit_of_Measurement_Text(Basic_UOM);
			mp.DropDown_Select();
			mp.Storage_Conditions_Text(Storage_Conditions);
			mp.DropDown_Select();
			mp.Specification_STP_No_SK(Specification_STP_No);
			mp.Procurement_Type_Text(Procurement_Type);
			mp.DropDown_Select();// Always External in RAW MATERIAL
			mp.Rounding_Text(Rounding);
			mp.DropDown_Select();
			mp.Production_Starting_Year(Production_Starting_Year);// nakko in Raw Material
			mp.Remarks_SK(Remarks);
			scrollPagedown();

			w.TT_15(AltUOM_X);// Alternate_UOM_X
			mp.Alt_UOM_DD_Select(AltUOM);// AltUOM//L //Not in Raw Material
			w.TT_17(AltUOM_Y);// Alternate_UOM_Y
			mp.QualityManagement_Click();
			Thread.sleep(2000);
			w.TEN_01(InspectIntervalPeriod);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']"))
					.sendKeys(InspectIntervalPeriodDMY);
			// w.TEN_02(InspectIntervalPeriodDMY);
			Thread.sleep(2000);
			mp.InspectionType(InspectionType);
			Thread.sleep(2000);
			w.CheckBox_1();
			w.CheckBox_2();
			w.CheckBox_3();
			mp.Storage_Locations_Click();
			mp.StorageLocations1(StorageLocations);
			w.CheckBox_4();// Active

			// Scenarios***************************************************************************************************

			// w.Submit();w.Not_Create();
			// w.Submit();w.Yes();
			// w.Password_Fill("");w.Submit_Type();w.Cross_Close_Button();
			// w.Submit();w.Yes();w.Password_Fill(WrongPassword);w.Submit_Type();w.Ok();w.Cross_Close_Button();
			// w.Submit();w.Yes();w.Password_Fill(InitiatorPassword);w.Submit_Type();w.Ok();
			// Scenarios***************************************************************************************************

			w.Submit_Button();
			w.Yes();
			w.Password_Fill.sendKeys(Pro.getProperty("Initiator_Password"));
			w.Submit_Button2();
			w.Ok();
			// ***************************************************************************************************

//			//w.SearchBox(MaterialMasterRM);
//			w.SearchBox(MaterialMasterRM_Edit);//
//			// Scenarios***************************************************************************************************
//			w.ViewButton();scrollPagedown();
//			w.Back_Button();
		}
		driver.close();
	}
}
