package C2_Transactions_SemiFinished_Product_ReInitiate;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_01_1_BOM_ReInitiate_Normal extends BaseClass
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


		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//***************************************************************************************************************
			String BPR_Number_SFG_I = xls.getCellData("Dependency", "BPR_Number_SFG_I", i);// Change Everytime
			String BPR_Number_SFG_II = xls.getCellData("Dependency", "BPR_Number_SFG_II", i);// Change Everytime
			//***************************************************************************************************************
			String Version_Number_SFP = xls.getCellData("Dependency", "Version_Number_SFP" ,i);
			//***************************************************************************************************************
			//***************************************************************************************************************
			String BatchSize = xls.getCellData("Bill_Of_Material", "BatchSize", i);//5000
			String BatchSizeEdit = xls.getCellData("Bill_Of_Material", "BatchSizeEdit", i);//6000
			//***************************************************************************************************************
			String BPR_Type = xls.getCellData("Bill_Of_Material", "BPR_Type", i);
			//***************************************************************************************************************
			String Number_Of_Lots = xls.getCellData("Bill_Of_Material", "Number_Of_Lots", i);//2
			String StandardQuantity = xls.getCellData("Bill_Of_Material", "StandardQuantity", i);//500
			//***********************************CONNECTED EXCEL*************************************************************
			String High1 = xls.getCellData("Bill_Of_Material", "High1", i);
			String Low1 = xls.getCellData("Bill_Of_Material", "Low1", i);
			String High2 = xls.getCellData("Bill_Of_Material", "High2", i);
			String Low2 = xls.getCellData("Bill_Of_Material", "Low2", i);
			//***************************************************************************************************************
			String Remarks_Initiate =xls.getCellData("Bill_Of_Material", "Remarks_Initiate", i);
			String Remarks_Return =xls.getCellData("Bill_Of_Material", "Remarks_Return", i);
			String Remarks_ReInitiate =xls.getCellData("Bill_Of_Material", "Remarks_ReInitiate", i);
			String Remarks_Release =xls.getCellData("Bill_Of_Material", "Remarks_Release", i);
			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String BOM_Password = xls.getCellData("Changable_Data", "BOM_Password", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************
			w.SearchBox(BPR_Number_SFG_I+" "+Version_Number_SFP);
			w.Edit_Action_Button();
			w.Remarks(Remarks_ReInitiate);
			// *******************************************************************************************************
			w.Submit_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button2();w.Ok();
			scrollPagedownSlow();
			// *******************************************************************************************************
			w.SearchBox(BPR_Number_SFG_I);
			// *******************************************************************************************************
			w.ViewButton();scrollPagedown();
			w.Back_Button();
		}}}
