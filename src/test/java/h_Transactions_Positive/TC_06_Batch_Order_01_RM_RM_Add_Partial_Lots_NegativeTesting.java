package h_Transactions_Positive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_06_Batch_Order_01_RM_RM_Add_Partial_Lots_NegativeTesting extends BaseClass
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
		w.BatchOrder();
		w.Create_Button();Thread.sleep(2000);
		//********************************************************************************************************************
		int rowcount = xls.getRowCount("Material_Master");

		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//****************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//****************************************************************************************************
			String MaterialMasterSFP=xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
			String Batch_Number_I =xls.getCellData("Dependency", "Batch_Number_I", i);//**************************
			//****************************************************************************************************
			String Market =xls.getCellData("ProductRequirement", "Market", i);
			String OrderType =xls.getCellData("Material_Indent", "OrderType", i);
			String Material_Description =xls.getCellData("Material_Master", "Material_Description", i);

			w.DD_01(Pro.getProperty("SemiFinished_Product1"));Thread.sleep(2000);
			w.DD_02("");
			w.DD_03("GENERAL");
			//should be same as of master we have given as product requirement*****
			//General market is applicable for all without creating any problem, but if we select KSM we have to select same market as of
			//Prdoduct Requirement , if we will not select same market like PR than Avaible Quantity will become ZERO

			w.DD_04("");
			w.Batch_Number(Batch_Number_I);//**********************Malli  use

			w.TT_11_AD_E(OrderType);
			driver.findElement(By.xpath("//*[@formcontrolname='batchPlanningDate']")).click();
			Thread.sleep(7000);Thread.sleep(2000);//Manually

			w.Get_Button();

			//****************************************************************************************************
			//Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--
			//****************************************************************************************************
			driver.findElement(By.xpath("(//*[@title='Edit'])[1]")).click();Thread.sleep(2000);  //Edit Button

			//RequestedQuantity for Material 1 --LOT1
			WebElement RequestedQuantity = driver.findElement(By.xpath("/html/body/app-root/div/div/app-material-indent-create/div/div[3]/div[1]/div/table/tbody/tr/app-transactions-pop-up[2]/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[6]/input"));
			RequestedQuantity.clear();
			RequestedQuantity.sendKeys("80");Thread.sleep(2000);


			w.CheckBox_2();//Inside Select CheckBox 1--	Selecting Lots
			//w.CheckBox_3();//Inside Select CheckBox 2--    Selecting Lots

			//Inside Submit Button Selecting Lots
			w.TITLE_SUBMIT();Thread.sleep(2000); //Select lot before submitting

			//******************************************************************************************************
			//Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--
			//******************************************************************************************************

			driver.findElement(By.xpath("(//*[@title='Edit'])[2]")).click();Thread.sleep(2000); //Edit Button2

			//RequestedQuantity for Material 2 --LOT1
			WebElement RequestedQuantity_Material2_LOT1 = driver.findElement(By.xpath("/html/body/app-root/div/div/app-material-indent-create/div/div[3]/div[1]/div/table/tbody/tr/app-transactions-pop-up[2]/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[6]/input"));
			RequestedQuantity_Material2_LOT1.clear();
			RequestedQuantity_Material2_LOT1.sendKeys("80");Thread.sleep(2000); Thread.sleep(2000);

			w.CheckBox_3();Thread.sleep(2000);  //Inside Select CheckBox 1
			//w.CheckBox_4();Thread.sleep(2000); 	//Inside Select CheckBox 2

			//Inside Submit Button Selecting Lots
			w.TITLE_SUBMIT();Thread.sleep(2000); //Select lot before submitting
			//******************************************************************************************************

			//Outside Select CheckBox for selecting RAW Material Name
			w.CheckBox_1();
			w.CheckBox_2();

			w.Submit();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button2();w.Ok();
			w.ViewButton();
			scrollPagedown();



		}}}
