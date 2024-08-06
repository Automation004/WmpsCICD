package h_Transactions_Positive;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;
public class TC_21_Post_Goods_Issue_02_Issue extends BaseClass
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
		w.Pharma_Dispatch();
		w.Post_Goods_Issue();
		w.Menu_Navigate();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//***************************************************************************************************************
			String Delivery_Number =xls.getCellData("Dependency", "Delivery_Number", i);//**********
			//***************************************************************************************************************
			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************
			w.SearchBox(Delivery_Number);
			w.Edit_Action_Button();
			w.TT_5(Delivery_Number);
			//Date
			w.Date01SK("18012024");
			w.TT_6(Delivery_Number);
			w.TT_7(Delivery_Number);
			w.CheckBox_1();
			w.Issue_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button();w.Ok();
		}}}