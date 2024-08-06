package D1_Transactions_FinishedProduct_Create;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_16_Batch_Process_Closure_FP extends BaseClass {

	@org.testng.annotations.Test
	public static void Bill_Of_Material() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		WMPS_Login("Initiator", "Initiator_Password");
		w.Production();
		w.Batch_Process_Closure();
		w.Create();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++) {
			// ****************************************************************************************************
			String Batch_Number_FP_I = xls.getCellData("Dependency", "Batch_Number_FP_I", i);// *********
			String Batch_Number_FP_II = xls.getCellData("Dependency", "Batch_Number_FP_II", i);// *********
			// ****************************************************************************************************
			// *****************************************************************************************************************
			String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i);// New Finished Material
																							// Upper Part
			// *****************************************************************************************************************
			// *****************************************************************************************************************
			// *****************************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// *****************************************************************************************************************

			w.DD_04(Pro.getProperty("Finished_Product"));
			Thread.sleep(2000);
			Thread.sleep(2000);
			w.DD_05(Batch_Number_FP_I); //

//			w.TT_16_CSE("Issue_Slip_1");
//			w.TT_17_CSE("Issue_Slip_2");
//			w.TT_18_CSE("Issue_Slip_3");
//			w.TT_19_CSE("Issue_Slip_4");

			w.Remarks("Okay");
			w.Submit();
			w.Yes();
			w.Password_Fill(InitiatorPassword);
//			w.Submit_Button();
			w.Ok(); // That okay button is under problem

			// ***************************************************************************************************************
			w.SearchBox(Batch_Number_FP_I);
			// ***************************************************************************************************************
			w.ViewButton();
			scrollPagedown();
			w.Back_Button();

		}
	}
}
