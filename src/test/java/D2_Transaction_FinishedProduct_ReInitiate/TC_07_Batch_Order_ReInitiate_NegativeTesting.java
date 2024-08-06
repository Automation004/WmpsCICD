package D2_Transaction_FinishedProduct_ReInitiate;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_07_Batch_Order_ReInitiate_NegativeTesting extends BaseClass
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

		//********************************************************************************************************************
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//****************************************************************************************************
			String Batch_Number_SFG_I =xls.getCellData("Dependency", "Batch_Number_SFG_I", i);//*****************
			String Batch_Number_SFG_II =xls.getCellData("Dependency", "Batch_Number_SFG_II", i);//*****************
			//****************************************************************************************************
			String Batch_Number_FP_I =xls.getCellData("Dependency", "Batch_Number_FP_I", i);//*********
			String Batch_Number_FP_II =xls.getCellData("Dependency", "Batch_Number_FP_II", i);//*********
			//****************************************************************************************************
			//****************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//********************************************************************************************************************
			String MaterialMasterSFP=xls.getCellData("Excel_Data", "MaterialMasterSFP", i);

			String Batch_Number_I =xls.getCellData("Dependency", "Batch_Number_I", i);
			String Market =xls.getCellData("ProductRequirement", "Market", i);
			String OrderType =xls.getCellData("Material_Indent", "OrderType", i);
			String Material_Description =xls.getCellData("Material_Master", "Material_Description", i);

			w.Remarks(""+"A");//Re-initiation Comments

			//****************************************************************************************************
			//Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--
			//****************************************************************************************************
			//driver.findElement(By.xpath("(//*[@title='Edit'])[1]")).click();Thread.sleep(2000);  //Edit Button

//			//RequestedQuantity for Material 1 --LOT1
//			WebElement RequestedQuantity = driver.findElement(By.xpath("/html/body/app-root/div/div/app-material-indent-create/div/div[3]/div[1]/div/table/tbody/tr/app-transactions-pop-up[2]/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[6]/input"));
//			RequestedQuantity.clear();
//			RequestedQuantity.sendKeys("50");Thread.sleep(2000);

//			//RequestedQuantity for Material 2 --LOT2
//			WebElement RequestedQuantity1 = driver.findElement(By.xpath("/html/body/app-root/div/div/app-material-indent-create/div/div[3]/div[1]/div/table/tbody/tr/app-transactions-pop-up[2]/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[2]/td[6]/input"));
//			RequestedQuantity1.clear();
//			RequestedQuantity1.sendKeys("80");Thread.sleep(2000);

//			w.TT_17_CSE("50");
//			w.TT_18_CSE("80");

			//w.CheckBox_2();//Inside Select CheckBox 1--	Selecting Lots
			//w.CheckBox_3();//Inside Select CheckBox 2--    Selecting Lots

			//Inside Submit Button Selecting Lots
			//w.TITLE_SUBMIT();Thread.sleep(2000); //Select lot before submitting

			//******************************************************************************************************
			//Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--Selecting Lots --Selecting Lots--
			//******************************************************************************************************

			//driver.findElement(By.xpath("(//*[@title='Edit'])[2]")).click();Thread.sleep(2000); //Edit Button2

//			//RequestedQuantity for Material 2 --LOT1
//			WebElement RequestedQuantity_Material2_LOT1 = driver.findElement(By.xpath("/html/body/app-root/div/div/app-material-indent-create/div/div[3]/div[1]/div/table/tbody/tr/app-transactions-pop-up[2]/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[6]/input"));
//			RequestedQuantity_Material2_LOT1.clear();
//			RequestedQuantity_Material2_LOT1.sendKeys("50");Thread.sleep(2000); Thread.sleep(2000);
//
//			//RequestedQuantity for Material 2 --LOT2
//			WebElement RequestedQuantity_Material2_LOT2 = driver.findElement(By.xpath("/html/body/app-root/div/div/app-material-indent-create/div/div[3]/div[1]/div/table/tbody/tr/app-transactions-pop-up[2]/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[2]/td[6]/input"));
//			RequestedQuantity_Material2_LOT2.clear();
//			RequestedQuantity_Material2_LOT2.sendKeys("80");Thread.sleep(2000); Thread.sleep(2000);

//			w.TT_18_CSE("50");
//			w.TT_19_CSE("80");

			//w.CheckBox_3();Thread.sleep(2000);  //Inside Select CheckBox 1
			//w.CheckBox_4();Thread.sleep(2000); 	//Inside Select CheckBox 2

			//Inside Submit Button Selecting Lots
			//w.TITLE_SUBMIT();Thread.sleep(2000); //Select lot before submitting
			//******************************************************************************************************

			//Outside Select CheckBox for selecting RAW Material Name
//			w.CheckBox_1();
//			w.CheckBox_2();

			w.Radio_Button_1();

			w.DD_05(Pro.getProperty("RawMaterial1"));//RawMaterial1
			w.Comment_Box("ok");


			w.Add_Button();w.CheckBox_4();
		Thread.sleep(2000);
			w.Submit_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			//w.Submit_Button2();w.Ok();
		}}}
