package Z_Single_Screen;
import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;
public class TC_03_General_Indent extends BaseClass
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
		w.Transactions();
		w.Production();
		w.General_Indent();
		w.Menu_Navigate();Thread.sleep(3000);
		w.Create_Button();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{

w.TT_1("ttt");
w.DD_01("KOH");
w.DD_02("Bulk");
w.DD_03("Bulk");
w.DD_04("");//Requested Department
w.DD_05("");//Requested Block
w.Remarks("");
w.Add_Button();
w.TT_10("ttt");




		}}}
