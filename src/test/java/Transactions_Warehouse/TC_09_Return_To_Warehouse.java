package Transactions_Warehouse;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_09_Return_To_Warehouse extends BaseClass
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

		WMPS_Login("441111","Password");

		w.Menu_Navigate();
		w.Transactions();
		w.WareHouse();
		w.Return_To_Warehouse();
		w.Menu_Navigate();
		w.Create();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{




		}}}
