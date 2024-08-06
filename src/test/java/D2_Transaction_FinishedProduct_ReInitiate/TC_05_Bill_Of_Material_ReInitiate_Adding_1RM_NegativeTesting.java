package D2_Transaction_FinishedProduct_ReInitiate;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_05_Bill_Of_Material_ReInitiate_Adding_1RM_NegativeTesting extends BaseClass
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
		//w.Create();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			// *******************************************************************************************************
			String MaterialMasterSFP=xls.getCellData("Excel_Data", "MaterialMasterSFP", i);	//New Semifinished Material Upper Part
			String Version_Number_SFP =xls.getCellData("Dependency", "Version_Number_SFP", i);//Change Everytime
			// *******************************************************************************************************
			String Remarks =xls.getCellData("Bill_Of_Material", "Remarks", i);
			//Always Change
			//***************************************************************************************************************
			//***************************************************************************************************************
			//***************************************************************************************************************
			String BPR_Number_SFG_I = xls.getCellData("Dependency", "BPR_Number_SFG_I", i);// Change Everytime
			String BPR_Number_SFG_II = xls.getCellData("Dependency", "BPR_Number_SFG_II", i);// Change Everytime
			//***************************************************************************************************************
			String BPR_Number_FP_I = xls.getCellData("Dependency", "BPR_Number_FP_I", i);// Change Everytime
			String BPR_Number_FP_II = xls.getCellData("Dependency", "BPR_Number_FP_II", i);// Change Everytime
			//***************************************************************************************************************			String Version_Number = xls.getCellData("Bill_Of_Material", "Version_Number" ,i);// create test request

			//***************************************************************************************************************			//***************************************************************************************************************
			//***************************************************************************************************************
			//***************************************************************************************************************
			String BatchSize = xls.getCellData("Bill_Of_Material", "BatchSize", i);//
			String BatchSizeEdit = xls.getCellData("Bill_Of_Material", "BatchSizeEdit", i);

			//***************************************************************************************************************
			String Number_Of_Lots = xls.getCellData("Bill_Of_Material", "Number_Of_Lots", i);
			String StandardQuantity = xls.getCellData("Bill_Of_Material", "StandardQuantity", i);
			//***********************************CONNECTED EXCEL*************************************************************
			String High1 = xls.getCellData("Bill_Of_Material", "High1", i);
			String Low1 = xls.getCellData("Bill_Of_Material", "Low1", i);
			String High2 = xls.getCellData("Bill_Of_Material", "High2", i);
			String Low2 = xls.getCellData("Bill_Of_Material", "Low2", i);
			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String BOM_Password = xls.getCellData("Changable_Data", "BOM_Password", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************
			w.SearchBox(BPR_Number_FP_I);
			w.Edit_Action_Button();
			w.BatchSize(BatchSizeEdit);//5000previous now 6000
			w.BPR_Number(BPR_Number_FP_I);Thread.sleep(2000);// ***********************UNIQUE
			w.Version_Number2("0");Thread.sleep(1000);
			w.Remarks("Re-Initiated");Thread.sleep(1000);
			w.Proceed_Button();Thread.sleep(2000);
			Thread.sleep(4000);
			// Manage Lots-1//PLUS BUTTON
			driver.findElement(By.xpath("(//*[@title='Delete'])[1]")).click();
			try {
				driver.findElement(By.xpath("(//*[@title='Delete'])[1]")).click();
			} catch (Exception e)
			{
				e.printStackTrace();
			}
			try {
				driver.findElement(By.xpath("(//*[@title='Delete'])[1]")).click();
			} catch (Exception e) {
				e.printStackTrace();
			}

			Thread.sleep(4000);
			w.Proceed_Button();Thread.sleep(2000);
			//******************************Deleted all added material in KSM Box********************************************

			w.DD_02(Pro.getProperty("SemiFinished_Product1"));//RawMaterial1
			//w.DD_02("");Thread.sleep(2000);//RawMaterial1
			w.Type_Search_04(Number_Of_Lots);
			w.TT_7(StandardQuantity);//StandardQuantity//TT8 if we select Validation Request

			Select UOM11 = new Select(driver.findElement(By.xpath("/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[6]/select")));
			UOM11.selectByIndex(0);
			Thread.sleep(2000);

			//w.CheckBox_1();//KSM/ API Material

			// Manage Lots-1//PLUS BUTTON
			driver.findElement(By.xpath("(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[8]/button[1])[1]")).click();
			Thread.sleep(4000);

			w.TT_11("80");//High
			w.TT_12("30");//Low
			w.TT_13("80");//High
			w.TT_14("20");//Low

			//Action - 1
			driver.findElement(By.xpath("/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[9]/button[1]")).click();
			Thread.sleep(2000);

			//*****************************IF we want to create another material we used this below code***********************************************/////////////////////////////////////

			//w.DD_03("");Thread.sleep(2000);//RawMaterial2
			w.DD_03(Pro.getProperty("RawMaterial5"));//RawMaterial1
			w.Type_Search_06(Number_Of_Lots);
			w.TT_16(StandardQuantity);//StandardQuantity//

			Select UOM22 = new Select(driver.findElement(By.xpath("/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody[2]/tr/td[6]/select")));
			UOM22.selectByIndex(0);
			Thread.sleep(2000);

			//***************************************************************************************************************
			driver.findElement(By.xpath("(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[8]/button[1])[2]")).click();

			w.TT_20_CSE("80");//High
			w.TT_21_CSE("30");//Low
			w.TT_22_CSE("80");//High
			w.TT_23_CSE("20");//Low

			//Action - 1
			driver.findElement(By.xpath("/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[9]/button[1]")).click();
			Thread.sleep(2000);
			//***** **********************************  NEW MATERIAL ADDITION  *****************************************************

			//*****************************IF we want to create another material we used this below code***********************************************/////////////////////////////////////
			scrollPagedown();

			//w.DD_04("");Thread.sleep(2000);//RawMaterial2
			w.DD_04(Pro.getProperty("RawMaterial6"));//RawMaterial1
			w.Type_Search_08(Number_Of_Lots);
			w.TT_25_CSE(StandardQuantity);//StandardQuantity//

			Select UOM33 = new Select(driver.findElement(By.xpath("/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody[3]/tr/td[6]/select")));
			UOM33.selectByIndex(0);
			Thread.sleep(2000);

			//***************************************************************************************************************
			driver.findElement(By.xpath("/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody[3]/tr/td[8]/button[1]")).click();

			w.TT29("80");//High
			w.TT30("30");//Low
			w.TT31("80");//High
			w.TT32("20");//Low
			scrollPagedown();
			w.Remarks_SK("Re-I");Thread.sleep(1000);


			w.Submit_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button2();w.Ok();
			scrollPagedownSlow();
			//***************************************************************************************************************
			w.SearchBox(BPR_Number_FP_I);
			//***************************************************************************************************************
			w.ViewButton();scrollPagedown();
			w.Back_Button();
		}}}
