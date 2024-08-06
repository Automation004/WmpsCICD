package A1_Master_Create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import F.pageobjects.MasterXpaths;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_01_MaterialMasterRawMaterial_update extends BaseClass {
	WmpsObj w = new WmpsObj(driver);

	@Test
	public void materialMaster() throws Exception {
		Test = extent.createTest("Material Master Raw Material Test");
		WmpsObj w = new WmpsObj(driver);
		MasterXpaths mp = new MasterXpaths(driver);
		Actions actions = new Actions(driver);
		try {
			WMPS_Login("Initiator", "Initiator_Password");
			Test.log(Status.PASS, "Logged in successfully as Initiator");

			int rowcount = xls.getRowCount("Material_Master");
			Test.log(Status.INFO, "Row count from Material_Master: " + rowcount);

			WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Master')])[1]"));
			Actions actions1 = new Actions(driver);
			actions1.moveToElement(element).perform();
			actions1.click(element).perform();
			Test.log(Status.PASS, "Navigated to Master");

			mp.Master_Click();
			Test.log(Status.PASS, "Clicked on Master");

			mp.Material_Master();
			Test.log(Status.PASS, "Clicked on Material Master");

			for (int i = 2; i <= 2; i++) {
				Test.log(Status.INFO, "Processing row " + i);

				String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
				String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);

				String Material_Type_RawMaterial = xls.getCellData("Excel_Data", "Material_Type_RM", i);
				String Material_Type_SFP = xls.getCellData("Excel_Data", "Material_Type_SFP", i);

				String Material_Long_Description_RawMaterial = xls.getCellData("Excel_Data",
						"Material_Long_Description_RM", i);

				String Purchase_UOM = xls.getCellData("Material_Master", "Purchase_UOM", i);
				String Basic_UOM = xls.getCellData("Material_Master", "Basic_UOM", i);

				String AltUOM_X = xls.getCellData("Material_Master", "AltUOM_X", i);
				String AltUOM_Y = xls.getCellData("Material_Master", "AltUOM_Y", i);
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

				w.Create();
				Test.log(Status.PASS, "Clicked on Create");

				mp.Meterial_Type_Text(Material_Type_RawMaterial);
				Test.log(Status.PASS, "Entered Material Type: " + Material_Type_RawMaterial);

				mp.Material_Description_SK(MaterialMasterRM_Edit);
				Test.log(Status.PASS, "Entered Material Description: " + MaterialMasterRM_Edit);

				mp.Material_Long_Description_SK(Material_Long_Description_RawMaterial);
				Test.log(Status.PASS, "Entered Material Long Description");

				mp.Purchase_UOM_Text(Purchase_UOM);
				Test.log(Status.PASS, "Entered Purchase UOM: " + Purchase_UOM);

				mp.DropDown_Select();
				Test.log(Status.PASS, "Selected from dropdown");

				mp.Material_Number_SK(Material_Number);
				Test.log(Status.PASS, "Entered Material Number: " + Material_Number);

				mp.Basic_Unit_of_Measurement_Text(Basic_UOM);
				Test.log(Status.PASS, "Entered Basic UOM: " + Basic_UOM);

				mp.DropDown_Select();
				Test.log(Status.PASS, "Selected from dropdown");

				mp.Storage_Conditions_Text(Storage_Conditions);
				Test.log(Status.PASS, "Entered Storage Conditions");

				mp.DropDown_Select();
				Test.log(Status.PASS, "Selected from dropdown");

				mp.Specification_STP_No_SK(Specification_STP_No);
				Test.log(Status.PASS, "Entered Specification STP No");

				mp.Procurement_Type_Text(Procurement_Type);
				Test.log(Status.PASS, "Entered Procurement Type: " + Procurement_Type);

				mp.DropDown_Select();
				Test.log(Status.PASS, "Selected from dropdown");

				mp.Rounding_Text(Rounding);
				Test.log(Status.PASS, "Entered Rounding: " + Rounding);

				mp.DropDown_Select();
				Test.log(Status.PASS, "Selected from dropdown");

				mp.Production_Starting_Year(Production_Starting_Year);
				Test.log(Status.PASS, "Entered Production Starting Year: " + Production_Starting_Year);

				mp.Remarks_SK(Remarks);
				Test.log(Status.PASS, "Entered Remarks: " + Remarks);

				scrollPagedown();
				Test.log(Status.INFO, "Scrolled down the page");

				w.TT_15(AltUOM_X);
				Test.log(Status.PASS, "Entered Alternate UOM X");

				mp.Alt_UOM_DD_Select(AltUOM);
				Test.log(Status.PASS, "Selected Alt UOM: " + AltUOM);

				w.TT_17(AltUOM_Y);
				Test.log(Status.PASS, "Entered Alternate UOM Y");

				mp.QualityManagement_Click();
				Test.log(Status.PASS, "Clicked on Quality Management");

				Thread.sleep(2000);
				w.TEN_01(InspectIntervalPeriod);
				Test.log(Status.PASS, "Entered Inspect Interval Period");

				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']"))
						.sendKeys(InspectIntervalPeriodDMY);
				Test.log(Status.PASS, "Entered Inspect Interval Period DMY");

				Thread.sleep(2000);
				mp.InspectionType(InspectionType);
				Test.log(Status.PASS, "Entered Inspection Type");

				Thread.sleep(2000);
				w.CheckBox_1();
				Test.log(Status.PASS, "Checked CheckBox 1");

				w.CheckBox_2();
				Test.log(Status.PASS, "Checked CheckBox 2");

				w.CheckBox_3();
				Test.log(Status.PASS, "Checked CheckBox 3");

				mp.Storage_Locations_Click();
				Test.log(Status.PASS, "Clicked on Storage Locations");

				mp.StorageLocations1(StorageLocations);
				Test.log(Status.PASS, "Entered Storage Locations");

				w.CheckBox_4();
				Test.log(Status.PASS, "Checked CheckBox 4");

				w.Submit_Button();
				Test.log(Status.PASS, "Clicked Submit Button");

				w.Yes();
				Test.log(Status.PASS, "Clicked Yes");

				w.Password_Fill.sendKeys(Pro.getProperty("Initiator_Password"));
				Test.log(Status.PASS, "Entered Initiator Password");

				w.Submit_Button2();
				Test.log(Status.PASS, "Clicked Submit Button 2");

				w.Ok();
				Test.log(Status.PASS, "Clicked OK");
			}

			// driver.close();
			// Test.log(Status.PASS, "Closed the browser");

		} catch (Exception e) {
			Test.log(Status.FAIL, "Test failed with exception: " + e.getMessage());
			throw e;
		} finally {
			// extent.flush();
		}
	}
}