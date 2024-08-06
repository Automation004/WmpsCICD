package C3_Transactions_SemiFinished_Product_Release;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_12_Dispatch_Request_Release extends BaseClass
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
			String Batch_Number_I =xls.getCellData("Dependency", "Batch_Number_I", i);//For Semifinished_01 Product
			String Batch_Number_II =xls.getCellData("Dependency", "Batch_Number_II", i);//For Semifinished_02 Product
			String Batch_Number_FP =xls.getCellData("Dependency", "Batch_Number_FP", i);// For Finished Product
			// ********************************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
			String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i);
			// ********************************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ********************************************************************************************************************
			//*********************************************************************************************************************
			String Delivery_Number =xls.getCellData("Dependency", "Delivery_Number", i);//**********
			//*********************************************************************************************************************
			WMPS_Login("Approver_ID", "Approver_Password");
			w.Second_Level();
			w.ReviewApprovalCategory("Dispatch Request Release");
			w.Search_Button();
			w.SearchBox(Delivery_Number);
			w.Edit_Action_Button();
			w.Comments("Dispatch_Request_Release");Thread.sleep(2000);
			//****************************************************************************************************
			//w.ActionLevelApproverAction(Status);
			w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
			//****************************************************************************************************
			w.Save_Button();w.Yes();Thread.sleep(2000);
			w.Password_Fill(ApproverPassword);
			w.Submit_Button2();w.Ok();
		}}}
