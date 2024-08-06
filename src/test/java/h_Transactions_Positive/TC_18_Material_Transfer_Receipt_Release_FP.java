package h_Transactions_Positive;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_18_Material_Transfer_Receipt_Release_FP extends BaseClass
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

		WMPS_Login("Initiator","Initiator_Password");
		w.WareHouse();
		w.Material_Transfer_Receipt();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			String MaterialMasterFP=xls.getCellData("Excel_Data", "MaterialMasterFP", i);//New Semifinished Material Upper Part
			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);

			//***************************************************************************************************************
			w.SearchBox(Pro.getProperty("Finished_Product"));//USE Config File or EXCEL File
			//***************************************************************************************************************
			w.Edit_Action_Button();
			w.ActionLevelApproverAction("Recieve");
			w.Comments("Material_Transfer_Receipt");
			w.Submit();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button();w.Ok();
			//***************************************************************************************************************
			w.SearchBox(Pro.getProperty("Finished_Product"));//USE Config File or EXCEL File
			//***************************************************************************************************************
			w.ViewButton();
			scrollPagedownSlow();

		}}}
