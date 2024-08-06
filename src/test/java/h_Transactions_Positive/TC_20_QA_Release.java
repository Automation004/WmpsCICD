package h_Transactions_Positive;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_20_QA_Release extends BaseClass
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
		//w.Menu_Navigate();
		//w.Transactions();
		w.Pharma_Dispatch();
		w.QA_Release();
		w.Menu_Navigate();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//***************************************************************************************************************
			String Delivery_Number =xls.getCellData("Dependency", "Delivery_Number", i);//**********
			//***************************************************************************************************************
			//***************************************************************************************************************
			//*************************************IDs and Password**********************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//*************************************IDs and Password**********************************************************

			w.DD_01("FP240600655");
			w.DD_02("");//Product Name
			w.DD_03("");//Batch Number
			w.Get_Button();
			w.Print_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button();
			Thread.sleep(2000);Thread.sleep(2000);
			Close_Opened_File();
			w.Ok();
		}}}
