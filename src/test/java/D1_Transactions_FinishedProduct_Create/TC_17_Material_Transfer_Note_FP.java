package D1_Transactions_FinishedProduct_Create;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_17_Material_Transfer_Note_FP extends BaseClass
{

	@org.testng.annotations.Test
	public static void Bill_Of_Material() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);
		HomePage hp=new HomePage(driver);
		Common_Xpath cxp=new Common_Xpath(driver);
		PWO_Xpath p=new PWO_Xpath(driver);
		DataFields df=new DataFields(driver);
		MasterXpaths mp =new MasterXpaths(driver);

		WMPS_Login("Initiator","Initiator_Password");
		w.Menu_Navigate();w.Menu_Navigate();
		w.Production();
		w.Material_Transfer_Note();Thread.sleep(5000);
		w.Create();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//***************************************************************************************************************
			String MaterialMasterFP=xls.getCellData("Excel_Data", "MaterialMasterFP", i);//New Finished Material Upper Part
			//***************************************************************************************************************
			String Batch_Number_FP_I =xls.getCellData("Dependency", "Batch_Number_FP_I", i);//*********
			String Batch_Number_FP_II =xls.getCellData("Dependency", "Batch_Number_FP_II", i);//*********
			//****************************************************************************************************
			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************
			String Transferring_Department =xls.getCellData("MaterialTransforNote", "Transferring_Department", i);
			String TransferringBlock =xls.getCellData("MaterialTransforNote", "TransferringBlock", i);
			String HandlingLoss =xls.getCellData("MaterialTransforNote", "HandlingLoss", i);
			String UOM =xls.getCellData("MaterialTransforNote", "UOM", i);
			//***************************************************************************************************************

			w.DD_01(Pro.getProperty("Finished_Product"));Thread.sleep(2000);
			w.DD_02("");
			w.DD_03(Batch_Number_FP_I);
			w.TT_5("Warehouse");//Transferring_Department
			w.TT_6("Production");//TransferringBlock
			w.TT_7("");
			w.TEN_01(HandlingLoss);
			w.TT_12("KG");
			w.Comments("Material_Transfer_Note");
			w.Submit_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button3();w.Ok();
			//***************************************************************************************************************
			//***************************************************************************************************************
			w.SearchBox(Batch_Number_FP_I);
			w.ViewButton();scrollPagedown();
			w.Back_Button();
			//***************************************************************************************************************
			//***************************************************************************************************************
		}}}
