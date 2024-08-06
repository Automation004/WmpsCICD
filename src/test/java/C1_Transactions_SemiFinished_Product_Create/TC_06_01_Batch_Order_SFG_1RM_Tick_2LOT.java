package C1_Transactions_SemiFinished_Product_Create;
import org.openqa.selenium.By;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;
public class TC_06_01_Batch_Order_SFG_1RM_Tick_2LOT extends BaseClass
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
		w.BatchOrder();	Thread.sleep(5000);
		w.Create_Button();Thread.sleep(5000);
		//****************************************************************************************************
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{

			//****************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String BOM_Password = xls.getCellData("Changable_Data", "BOM_Password", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//****************************************************************************************************
			String Batch_Number_SFG_I =xls.getCellData("Dependency", "Batch_Number_SFG_I", i);//*****************
			String Batch_Number_SFG_II =xls.getCellData("Dependency", "Batch_Number_SFG_II", i);//*****************
			//****************************************************************************************************
			String OrderType =xls.getCellData("Material_Indent", "OrderType", i);

			//w.DD_01(MaterialMasterSFP);Thread.sleep(2000);
			w.DD_01(Pro.getProperty("SemiFinished_Product1"));Thread.sleep(5000);
			w.DD_02("");	Thread.sleep(5000);
			w.DD_03("GENERAL");//Avaiable Quantity is nonzero
			w.DD_04("");
			w.Batch_Number(Batch_Number_SFG_I);//**********************Malli  use

			w.TT_11_AD_E(OrderType);Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@formcontrolname='batchPlanningDate']")).click();
			Thread.sleep(7000);Thread.sleep(2000);//Manually

			w.Get_Button();Thread.sleep(5000);

			//****************************************************************************************************
			//Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--
			//****************************************************************************************************
			//Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--
			//****************************************************************************************************
			w.Edit_Action_Button();
			w.TT_17_CSE("50");//RequestedQuantity for Material 1 --LOT1
			w.TT_18_CSE("50");//RequestedQuantity for Material 2 --LOT2
			w.CheckBox_2();//Inside Select CheckBox 1--	   Selecting Lots
			w.CheckBox_3();//Inside Select CheckBox 2--    Selecting Lots
			w.TITLE_SUBMIT();Thread.sleep(2000); //Inside Submit Button Selecting Lots--//Select lot before submitting
			//******************************************************************************************************
			//******************************************************************************************************
			//Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--
			//******************************************************************************************************
			//****************************************************************************************************
			//Outside Select CheckBox only 1 Raw Material for selecting RAW Material Name
			w.CheckBox_1();

			w.Submit();w.Yes();
			w.Password_Fill(InitiatorPassword);
			//w.Submit_Button2();w.Ok();

			//****************************************************************************************************
			w.SearchBox(Batch_Number_SFG_I);Thread.sleep(2000);//***************************
			//****************************************************************************************************
			w.ViewButton();scrollPagedown();
		}}}
