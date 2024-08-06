package ZZ_Issues_AutomationTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import F.pageobjects.MasterXpaths;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_01_MaterialMasterSemiFinishedMaterial extends BaseClass {
	@Test
	public static void materialMaster() throws Exception {
		Test = extent.createTest("Material Master Test");
		WmpsObj w = new WmpsObj(driver);
		MasterXpaths mp = new MasterXpaths(driver);
		try {
			Test.log(Status.INFO, "Logging in as Initiator");
			WMPS_Login("Initiator", "Initiator_Password");
			Test.log(Status.PASS, "Logged in successfully as Initiator");

			int rowcount = xls.getRowCount("Material_Master");
			Test.log(Status.INFO, "Row count from Material_Master sheet: " + rowcount);

			WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Master')])[1]"));
			Actions actions1 = new Actions(driver);
			actions1.moveToElement(element).perform();
			actions1.click(element).perform();
			Test.log(Status.INFO, "Navigated to Master");

			mp.Master_Click();
			mp.Material_Master();
			Test.log(Status.INFO, "Navigated to Material Master");

			for (int i = 2; i <= 2; i++) {
				try {
					// need to change
					String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
					String MaterialCodeSFP = xls.getCellData("Excel_Data", "MaterialCodeSFP", i);
					String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
					// Fetch data from Excel
					String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
					String Material_Type_RawMaterial = xls.getCellData("Excel_Data", "Material_Type", i);
					String Stage = xls.getCellData("Excel_Data", "Stage", i);

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
					String Specification_STP_No_Edit = xls.getCellData("Material_Master", "Specification_STP_No_Edit",
							i);
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

					Test.log(Status.INFO, "Fetched data from Excel for row " + i);

					// Actions
					w.Create();
					Test.log(Status.INFO, "Clicked on Create");

					mp.Meterial_Type_Text(Material_Type_SFP);
					Test.log(Status.INFO, "Entered Material Type SFP");

					driver.findElement(By.xpath("//*[@formcontrolname='materialCode']")).sendKeys(MaterialCodeSFP);
					Test.log(Status.INFO, "Entered Material Code");

					driver.findElement(By.xpath("//*[@formcontrolname='stage']")).sendKeys(Stage);
					Test.log(Status.INFO, "Entered Material stage");

					mp.Material_Description_SK(MaterialMasterSFP);
					Test.log(Status.INFO, "Entered Material Description");

					mp.Material_Long_Description_SK(Material_Long_Description_RawMaterial);
					Test.log(Status.INFO, "Entered Material Long Description");

					mp.Purchase_UOM_Text(Purchase_UOM);
					Test.log(Status.INFO, "Entered Purchase UOM");

					mp.DropDown_Select();
					Test.log(Status.INFO, "Selected from dropdown");

					mp.Material_Number_SK(Material_Number);
					Test.log(Status.INFO, "Entered Material Number");

					mp.Basic_Unit_of_Measurement_Text(Basic_UOM);
					Test.log(Status.INFO, "Entered Basic Unit of Measurement");

					mp.DropDown_Select();
					Test.log(Status.INFO, "Selected from dropdown");

					mp.Storage_Conditions_Text(Storage_Conditions);
					Test.log(Status.INFO, "Entered Storage Conditions");

					mp.DropDown_Select();
					Test.log(Status.INFO, "Selected from dropdown");

					mp.Specification_STP_No_SK(Specification_STP_No);
					Test.log(Status.INFO, "Entered Specification STP No");

					mp.Procurement_Type_Text(Procurement_Type);
					Test.log(Status.INFO, "Entered Procurement Type");

					mp.DropDown_Select();
					Test.log(Status.INFO, "Selected from dropdown");

					mp.Rounding_Text(Rounding);
					Test.log(Status.INFO, "Entered Rounding");

					mp.DropDown_Select();
					Test.log(Status.INFO, "Selected from dropdown");

					mp.Production_Starting_Year(Production_Starting_Year);
					Test.log(Status.INFO, "Entered Production Starting Year");

					mp.Remarks_SK(Remarks);
					Test.log(Status.INFO, "Entered Remarks");

					scrollPagedown();
					Test.log(Status.INFO, "Scrolled down the page");

					w.TT_15(AltUOM_X);
					Test.log(Status.INFO, "Entered AltUOM X");

					mp.Alt_UOM_DD_Select(AltUOM);
					Test.log(Status.INFO, "Selected AltUOM from dropdown");

					w.TT_17(AltUOM_Y);
					Test.log(Status.INFO, "Entered AltUOM Y");

					mp.QualityManagement_Click();
					Test.log(Status.INFO, "Clicked on Quality Management");

					Thread.sleep(2000);
					w.TEN_01(InspectIntervalPeriod);
					Test.log(Status.INFO, "Entered Inspect Interval Period");

					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@class='form-control ng-untouched ng-pristine ng-valid']"))
							.sendKeys(InspectIntervalPeriodDMY);
					Test.log(Status.INFO, "Entered Inspect Interval Period DMY");

					Thread.sleep(2000);
					mp.InspectionType(InspectionType);
					Test.log(Status.INFO, "Entered Inspection Type");

					Thread.sleep(2000);
					w.CheckBox_1();
					Test.log(Status.INFO, "Checked CheckBox 1");

					w.CheckBox_2();
					Test.log(Status.INFO, "Checked CheckBox 2");

					w.CheckBox_3();
					Test.log(Status.INFO, "Checked CheckBox 3");

					mp.Storage_Locations_Click();
					Test.log(Status.INFO, "Clicked on Storage Locations");

					mp.StorageLocations1(StorageLocations);
					Test.log(Status.INFO, "Entered Storage Locations");

					w.CheckBox_4();
					Test.log(Status.INFO, "Checked CheckBox 4 (Active)");

					// Submit the form
					w.Submit_Button();
					Test.log(Status.INFO, "Clicked on Submit Button");

					w.Yes();
					Test.log(Status.INFO, "Clicked on Yes");

					w.Password_Fill.sendKeys(Pro.getProperty("Initiator_Password"));
					Test.log(Status.INFO, "Entered Initiator Password");

					w.Submit_Button2();
					Test.log(Status.INFO, "Clicked on Submit Button 2");

					w.Ok();
					Test.log(Status.PASS, "Submitted and created material master for row " + i);

					// Uncomment and update as needed for further steps
					// w.SearchBox(MaterialMasterRM_Edit);
					// w.ViewButton();
					// scrollPagedown();
					// w.Back_Button();
				} catch (Exception e) {
					Test.log(Status.FAIL, "An error occurred while processing row " + i + ": " + e.getMessage());
				}
			}
		} catch (Exception e) {
			Test.log(Status.FAIL, "An error occurred during the test: " + e.getMessage());
		} finally {
//			driver.close();
			Test.log(Status.INFO, "Closed the driver");
		}
	}
}