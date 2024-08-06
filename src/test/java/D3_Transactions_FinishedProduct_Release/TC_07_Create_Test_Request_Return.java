package D3_Transactions_FinishedProduct_Release;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_07_Create_Test_Request_Return extends BaseClass {

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
			// *****************************************************************************************************
			String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i);
			//****************************************************************************************************
			String Batch_Number_SFG_I =xls.getCellData("Dependency", "Batch_Number_SFG_I", i);//*****************
			String Batch_Number_SFG_II =xls.getCellData("Dependency", "Batch_Number_SFG_II", i);//*****************
			//****************************************************************************************************
			String Batch_Number_FP_I =xls.getCellData("Dependency", "Batch_Number_FP_I", i);//*********
			String Batch_Number_FP_II =xls.getCellData("Dependency", "Batch_Number_FP_II", i);//*********
			//****************************************************************************************************
			// *****************************************************************************************************
			// *****************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// *****************************************************************************************************
			WMPS_Login("Approver_ID", "Approver_Password");
			w.Second_Level();
			w.ReviewApprovalCategory("Create Test Request Release(Production)");
			w.Search_Button();
			// *****************************************************************************************************
			w.SearchBox(Batch_Number_FP_I);Thread.sleep(2000);
			// *****************************************************************************************************
			w.EDIT_TITLE();
			w.Radio_Button_1();
			w.Comments("Create_Test_Request_Release");Thread.sleep(2000);
			//*******************************************************************************************************
			//w.ActionLevelApproverAction(Status);
			w.ActionLevelApproverAction(Pro.getProperty("Action_2"));
			//*******************************************************************************************************
			w.Save_Button();w.Yes();
			w.Password_Fill(ApproverPassword);
			//w.Submit_Button();w.Ok();
			//*******************************************************************************************************
			w.SearchBox(Batch_Number_FP_I);Thread.sleep(2000);
			// *****************************************************************************************************
			w.ViewButton();
			scrollPagedown();
			driver.close();

		}
	}
}