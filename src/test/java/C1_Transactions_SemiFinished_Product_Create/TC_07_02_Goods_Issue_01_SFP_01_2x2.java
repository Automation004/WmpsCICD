package C1_Transactions_SemiFinished_Product_Create;

import org.openqa.selenium.By;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_07_02_Goods_Issue_01_SFP_01_2x2 extends BaseClass
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
			//****************************************************************************************************
			String Batch_Number_SFG_I =xls.getCellData("Dependency", "Batch_Number_SFG_I", i);//*****************
			String Batch_Number_II =xls.getCellData("Dependency", "Batch_Number_II", i);//For Semifinished Product
			String Batch_Number_FP =xls.getCellData("Dependency", "Batch_Number_FP", i);//************************
			//****************************************************************************************************
			//MaterialMasterFP
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//****************************************************************************************************
			WMPS_Login("Initiator","Initiator_Password");
			w.Menu_Navigate();w.Menu_Navigate();
			w.WareHouse();
			w.Goods_Issue_Mat_Req();
			//****************************************************************************************************
			w.SearchBox(Batch_Number_SFG_I);//*****************************
			//****************************************************************************************************
			w.Edit_Action_Button();
			//Batch No Selection
			//********************************Try to link this Number Excel to previous screen


			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[1]")).click();
			w.TT_2("10");//Issued Quantity
			w.TT_3("10");//Issued Quantity
			w.Submit_Button();
			w.Yes();
			w.TT_2("U can submit this record");
			w.Submit_Button();


			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[2]")).click();
			w.TT_3("10");//Issued Quantity
			w.TT_4("10");//Issued Quantity
			w.Submit_Button();
			w.Yes();
			w.TT_3("U can submit this record");
			w.Submit_Button();

			w.CheckBox_1();//Outer checkbox for selecting Material
			w.CheckBox_2();//Outer checkbox for selecting Material

			w.Issue_Button();
			w.Yes();
			w.Password_Fill(InitiatorPassword);
			//w.Submit_Button();w.Ok();
			//****************************************************************************************************
			w.SearchBox(Batch_Number_SFG_I);//*****************************
			//****************************************************************************************************
			w.ViewButton();
		}}}