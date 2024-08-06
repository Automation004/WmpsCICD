package C1_Transactions_SemiFinished_Product_Create;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_09_Quality_Inspection_02_SFP extends BaseClass {

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
		for (int i = 2; i <= 2; i++)
		{

			//******************************************************************************************************

			String Batch_Number_SFG_I =xls.getCellData("Dependency", "Batch_Number_SFG_I", i);//*****************
			String Batch_Number_II = xls.getCellData("Dependency", "Batch_Number_II", i);// ************************
			String Batch_Number_FP =xls.getCellData("Dependency", "Batch_Number_FP", i);//**************************

			//******************************************************************************************************
			// ***************************************************************************************************************
			String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i); // New Semifinished
			// ***************************************************************************************************************
			//****************************************************************************************************************
			//****************************************************************************************************************
			String Pharmacopoeia =xls.getCellData("Quality_Inspection", "Pharmacopoeia", i);
			String Action =xls.getCellData("Quality_Inspection", "Action", i);
			String Sampled_Quantity =xls.getCellData("Quality_Inspection", "Sampled_Quantity", i);
			String SampledQuantityUOM =xls.getCellData("Quality_Inspection", "SampledQuantityUOM", i);
			//****************************************************************************************************************
			//****************************************************************************************************************
			// ***************************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ***************************************************************************************************************
			String BatchNo_I = xls.getCellData("Dependency", "BatchNo_I", i);
			//Unique First AR Number in Raw Material Flow
			String AR_Number_I =xls.getCellData("Dependency", "AR_Number_I", i);
			String AR_Number_II = xls.getCellData("Dependency", "AR_Number_II", i); // Unique
			String AR_Number_III = xls.getCellData("Dependency", "AR_Number_III", i); // Unique
			String AR_Number_FP = xls.getCellData("Dependency", "AR_Number_FP", i); // Unique
			// ***************************************************************************************************************

			WMPS_Login("Initiator", "Initiator_Password");
			w.Quality_Control();
			w.Quality_Inspection();
			// ***************************************************************************************************************
			w.SearchBox(Batch_Number_SFG_I);// For searching purpose only
			// ***************************************************************************************************************
			w.SMPL();
			Select ActionDD = new Select(driver.findElement(By.xpath("//select[@formcontrolname='AnalysisStatus']")));
			ActionDD.selectByIndex(3);Thread.sleep(2000);
			w.SampledQuantity(Sampled_Quantity);
			Select ReceivedUom = new Select(driver.findElement(By.xpath("//select[@formcontrolname='SampledQuantityUOM']")));
			ReceivedUom.selectByIndex(1);
			// ***************************************************************************************************************
			w.ARNumber(AR_Number_II);//*********************We have to fill
			// ***************************************************************************************************************
			w.Comments("Quality_Inspection_Passed");
			w.Submit();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button2();w.Ok();
			w.ViewButton();scrollPagedown();
			w.Back_Button();
		}
	}
}
