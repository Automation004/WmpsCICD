package C2_Transactions_SemiFinished_Product_ReInitiate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_03_Batch_Order_ReInitiate_TickOne_RM_Add_1RM_NegativeTesting extends BaseClass
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
		w.Edit_Action_Button();

		//****************************************************************************************************************
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			String Batch_Number_SFG_I =xls.getCellData("Dependency", "Batch_Number_SFG_I", i);//*****************
			String Batch_Number_SFG_II =xls.getCellData("Dependency", "Batch_Number_SFG_II", i);//*****************
			//****************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//**********************************************************************************************************
			String MaterialMasterSFP=xls.getCellData("Excel_Data", "MaterialMasterSFP", i);

			String Batch_Number_I =xls.getCellData("Dependency", "Batch_Number_I", i);
			String Market =xls.getCellData("ProductRequirement", "Market", i);
			String OrderType =xls.getCellData("Material_Indent", "OrderType", i);
			String Material_Description =xls.getCellData("Material_Master", "Material_Description", i);

			w.Remarks("Re-initiation Comments");//Re-initiation Comments

			//****************************************************************************************************
			//Selecting Lots 1--Selecting Lots 1--Selecting Lots 1--Selecting Lots--Selecting Lots 1--Selecting Lots--1
			//****************************************************************************************************
			driver.findElement(By.xpath("(//*[@title='Edit'])[1]")).click();Thread.sleep(2000);  //Edit Button
			w.TT_17_CSE("50");//RequestedQuantity for Material 1 --LOT1
			w.TT_18_CSE("80");//RequestedQuantity for Material 2 --LOT2
//			w.CheckBox_2();//Inside Select CheckBox 1--	Selecting Lots -//Already Ticked
//			w.CheckBox_3();//Inside Select CheckBox 2--    Selecting Lots -//Already Ticked
			w.TITLE_SUBMIT();Thread.sleep(2000); //Select lot before submitting//Inside Submit Button Selecting Lots

			//******************************************************************************************************
			//Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--
			//******************************************************************************************************
			driver.findElement(By.xpath("(//*[@title='Edit'])[2]")).click();Thread.sleep(2000); //Edit Button2
			w.TT_18_CSE("50");//RequestedQuantity for Material 2 --LOT1
			w.TT_19_CSE("80");//RequestedQuantity for Material 2 --LOT2
			//w.CheckBox_3();Thread.sleep(2000);  //Inside Select CheckBox 1 -//Already Ticked
			//w.CheckBox_4();Thread.sleep(2000); 	//Inside Select CheckBox 2	-//Already Ticked
			w.TITLE_SUBMIT();Thread.sleep(2000); //Select lot before submitting//Inside Submit Button Selecting Lots
			//******************************************************************************************************
			//******************************************************************************************************
			//Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--
			//******************************************************************************************************
			//********************Tick 3rd Material and Select BatchNo and give Requested Quantity******************

			driver.findElement(By.xpath("(//*[@title='Edit'])[3]")).click();Thread.sleep(2000); //Edit Button
			w.TT_19_CSE("50");//RequestedQuantity for Material 3 --LOT1
			w.TT_20_CSE("80");//RequestedQuantity for Material 3 --LOT2

			w.CheckBox_4();Thread.sleep(2000);  //Inside Select CheckBox 1
			w.CheckBox_5();Thread.sleep(2000); 	//Inside Select CheckBox 2
			w.TITLE_SUBMIT();Thread.sleep(2000); //Select lot before submitting//Inside Submit Button Selecting Lots
			//******************************************************************************************************

			w.Radio_Button_1();//Add Additional Material

			w.DD_05(Pro.getProperty("RawMaterial4"));Thread.sleep(5000);//RawMaterial1
			w.Comment_Box("ok");Thread.sleep(2000);
			w.Add_Button();Thread.sleep(2000);
			w.TT_15_CSE("80");

			WebElement AdditionalMAterial_UOM = driver.findElement(By.xpath("(//*[@type='number'])[4]"));
			AdditionalMAterial_UOM.click();
			AdditionalMAterial_UOM.sendKeys("L");Thread.sleep(2000); Thread.sleep(2000);

			//********************************Outside-CheckBox-Selection**************************************
			//Outside Select CheckBox for selecting RAW Material Name
//			w.CheckBox_1();//Previously Ticked
//			w.CheckBox_2();//Previously Ticked

			w.CheckBox_3();Thread.sleep(2000); //Partial 3rd RawMaterial Selection
			w.CheckBox_4();Thread.sleep(2000); //New Additional RawMaterial Selection
			//******************************************************************************************************

			w.Submit_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			//w.Submit_Button2();w.Ok();
			//****************************************************************************************************
			w.SearchBox(Batch_Number_SFG_I);Thread.sleep(2000);//***************************
			//****************************************************************************************************
			w.ViewButton();scrollPagedown();
		}}}
