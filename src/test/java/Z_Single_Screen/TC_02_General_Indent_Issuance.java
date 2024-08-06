package Z_Single_Screen;
import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;
public class TC_02_General_Indent_Issuance extends BaseClass
{
	@org.testng.annotations.Test
	public static void Ordertype() throws Exception
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
			//****************************************************************************************************
			String Batch_Number_I =xls.getCellData("Dependency", "Batch_Number_I", i);//
			String Batch_Number_II =xls.getCellData("Dependency", "Batch_Number_II", i);//
			String Batch_Number_FP =xls.getCellData("Dependency", "Batch_Number_FP", i);//
			//****************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//****************************************************************************************************
			WMPS_Login("Initiator","Initiator_Password");
			//w.Menu_Navigate();//w.Transactions();
			w.WareHouse();
			w.General_Indent_Issuance();
			//****************************************************************************************************
			w.SearchBox(Batch_Number_I);//*********
			//****************************************************************************************************
		}}}
