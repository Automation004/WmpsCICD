package D2_Transaction_FinishedProduct_ReInitiate;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_05_Bill_Of_Material_ReInitiate extends BaseClass
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

		WMPS_Login("Initiator", "Initiator_Password");
		w.Menu_Navigate();w.Menu_Navigate();
		w.Production();w.BillOfMaterial();
		//w.Create();
		w.Edit_Action_Button();
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//***************************************************************************************************************
			String BPR_Number_ISFG = xls.getCellData("Dependency", "BPR_Number_ISFG", i);// Change Everytime
			//***************************************************************************************************************
			// *******************************************************************************************************
			String MaterialMasterSFP=xls.getCellData("Excel_Data", "MaterialMasterSFP", i);	//New Semifinished Material Upper Part
			String VersionNumber_I =xls.getCellData("Dependency", "VersionNumber_I", i);//Change Everytime
			// *******************************************************************************************************

			String High =xls.getCellData("Bill_Of_Material", "High", i);
			String Low =xls.getCellData("Bill_Of_Material", "low", i);

			String Remarks =xls.getCellData("Bill_Of_Material", "Remarks", i);

			// *******************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//*******************************************************************************************************
			w.Remarks(Remarks);


			w.Submit_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			//w.Submit_Button2();w.Ok();

		}}}
