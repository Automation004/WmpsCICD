package D3_Transactions_FinishedProduct_Release;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_09_Batch_Process_Closure_Release_ONLY extends BaseClass
{

	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);
		HomePage hp=new HomePage(driver);
		Common_Xpath cxp=new Common_Xpath(driver);
		PWO_Xpath p=new PWO_Xpath(driver);
		DataFields df=new DataFields(driver);
		MasterXpaths mp =new MasterXpaths(driver);

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{

			// ********************************************************************************************************************
			String Batch_Number_FP =xls.getCellData("Dependency", "Batch_Number_FP", i);// For Finished Product
			// ********************************************************************************************************************			// ********************************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
			String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i);
			// ********************************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ********************************************************************************************************************
			WMPS_Login("Approver_ID", "Approver_Password");

			w.Menu_Navigate();w.Menu_Navigate();
			w.Second_Level();
			w.ReviewApprovalCategory("Batch Process Closure Release");Thread.sleep(2000);
			w.Search_Button();
			// ********************************************************************************************************************
			w.SearchBox(Batch_Number_FP);
			// ********************************************************************************************************************
			w.Edit_Action_Button();
			w.Comments("Batch_Process_Closure_Release");Thread.sleep(2000);
			w.ActionLevelApproverAction("Release");//No Return
			w.Submit_Button();w.Yes();Thread.sleep(2000);
			w.Password_Fill(ApproverPassword);
			w.Submit_Button2();w.Ok();Thread.sleep(2000);Thread.sleep(2000);
			// ********************************************************************************************************************
			w.SearchBox(Batch_Number_FP);Thread.sleep(2000);//not working
			// ********************************************************************************************************************
			w.ViewButton();scrollPagedown();
		}}}
