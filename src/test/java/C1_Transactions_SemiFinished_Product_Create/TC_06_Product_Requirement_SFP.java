package C1_Transactions_SemiFinished_Product_Create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import F.pageobjects.MasterXpaths;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_06_Product_Requirement_SFP extends BaseClass
{

	@org.testng.annotations.Test
	public static void Material_Master() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);
		MasterXpaths mp =new MasterXpaths(driver);
		Actions actions = new Actions(driver);

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++)
		{
			// *******************************************************************************************************************
			String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			// *******************************************************************************************************************
			String Stage = xls.getCellData("Material_Master", "Stage", i);
			// *******************************************************************************************************************
			//DataMapping
			String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);// *************
			// *******************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String BOM_Password = xls.getCellData("Changable_Data", "BOM_Password", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			// ********************************************************************************************************************
			String Market_1 = xls.getCellData("Market", "Market_1", i);
			String Market_2 = xls.getCellData("Market", "Market_2", i);
			String Market_3 = xls.getCellData("Market", "Market_3", i);
			//***************************************************************************************************************
			WMPS_Login("Initiator", "Initiator_Password");
			WebElement MoveCursor = driver.findElement(By.xpath("//*[text()='Masters ']"));
			Thread.sleep(2000);
			actions.moveToElement(MoveCursor).perform();
			Thread.sleep(1000);
			mp.Master_Click();
			mp.Product_Requirement();Thread.sleep(4000);
			w.Create_Button();
			//***************************************************************************************************************
			w.DD_01(Pro.getProperty("SemiFinished_Product1"));
			w.Stage(Stage);
			w.DD_02(Pro.getProperty("RawMaterial1"));//KSM Raw Material
			//***************************************************************************************************************
			w.ManufactureNameByIndex();
			//w.ManufactureName(Vendor_Name_Manufacturer);
			w.MarketName_Select(Market_1);
			w.Add_Button();
			//***************************************************************************************************************
			w.ManufactureNameByIndex();
			//w.ManufactureName(Vendor_Name_Manufacturer);
			w.MarketName_Select(Market_2);
			w.Add_Button();
			//***************************************************************************************************************
			w.ManufactureNameByIndex();
			//w.ManufactureName(Vendor_Name_Manufacturer);
			w.MarketName_Select(Market_3);
			w.Add_Button();
			//***************************************************************************************************************
			w.Remarks(Vendor_Name_Manufacturer);
			//***************************************************************************************************************
			w.CheckBox_1();
			w.CheckBox_2();
			w.CheckBox_3();
			//***************************************************************************************************************
			w.Submit();w.Yes();
			w.Save_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button();w.Ok();
			//***************************************************************************************************************
			w.SearchBox(Pro.getProperty("RawMaterial1"));//KSM Raw Material
			w.SearchBox2(" ");
			w.SearchBox2(Pro.getProperty("SemiFinished_Product1"));//KSM Raw Material
			//***************************************************************************************************************
			w.ViewButton();
			scrollPagedownSlow();
		}
		// driver.close();
	}
}