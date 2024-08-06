package A2_Master_Release;

import org.openqa.selenium.By;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_05_Customer_Master_Release extends BaseClass {
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
		for (int i = 2; i <=2; i++) {
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String materialtype = xls.getCellData("Material_Master", "Material_Type", i);
			String Material_Description = xls.getCellData("Material_Master", "Material_Description", i);
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

			WMPS_Login("Approver_ID", "Approver_Password");
			w.Menu_Navigate();
			w.Second_Level();
			w.Menu_Navigate();
			w.ReviewApprovalCategory("Supplier Assignment Release");
			driver.findElement(By.xpath("//*[contains(text(),' Search ')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@title='Edit'])[1]")).click();
			Thread.sleep(2000);
			w.Comments("Customer_Master_Release");
			Thread.sleep(2000);
			w.ActionLevel("Release");
			w.Submit();
			w.Yes();
			w.Password_Fill.sendKeys(Pro.getProperty("Approver_Password"));
			w.SubmitType_2();
			w.Ok();
			driver.close();
		}
	}
}
