package C2_Transactions_SemiFinished_Product_ReInitiate;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_01_3_BOM_ReInitiate_For_2RM_Add_1RM_NegativeTesting_Total_3RM_atLast extends BaseClass
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
		//w.Menu_Navigate();w.Menu_Navigate();
		w.Production();w.BillOfMaterial();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//***************************************************************************************************************
			String BPR_Number_SFG_I = xls.getCellData("Dependency", "BPR_Number_SFG_I", i);// Change Everytime
			String BPR_Number_SFG_II = xls.getCellData("Dependency", "BPR_Number_SFG_II", i);// Change Everytime
			//***************************************************************************************************************
			String Version_Number_SFP = xls.getCellData("Dependency", "Version_Number_SFP" ,i);
			//***************************************************************************************************************
			//***************************************************************************************************************
			String BatchSize = xls.getCellData("Bill_Of_Material", "BatchSize", i);//5000
			String BatchSizeEdit = xls.getCellData("Bill_Of_Material", "BatchSizeEdit", i);//6000
			//***************************************************************************************************************
			String BPR_Type = xls.getCellData("Bill_Of_Material", "BPR_Type", i);
			//***************************************************************************************************************
			String Number_Of_Lots = xls.getCellData("Bill_Of_Material", "Number_Of_Lots", i);//2
			String StandardQuantity = xls.getCellData("Bill_Of_Material", "StandardQuantity", i);//500
			//***********************************CONNECTED EXCEL*************************************************************
			//***********************************CONNECTED EXCEL*************************************************************
			String High1 = xls.getCellData("Bill_Of_Material", "High1", i);
			String Low1 = xls.getCellData("Bill_Of_Material", "Low1", i);
			String High2 = xls.getCellData("Bill_Of_Material", "High2", i);
			String Low2 = xls.getCellData("Bill_Of_Material", "Low2", i);
			//***************************************************************************************************************
			String Remarks_Initiate =xls.getCellData("Bill_Of_Material", "Remarks_Initiate", i);
			String Remarks_Return =xls.getCellData("Bill_Of_Material", "Remarks_Return", i);
			String Remarks_ReInitiate =xls.getCellData("Bill_Of_Material", "Remarks_ReInitiate", i);
			String Remarks_Release =xls.getCellData("Bill_Of_Material", "Remarks_Release", i);
			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String BOM_Password = xls.getCellData("Changable_Data", "BOM_Password", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************
			w.SearchBox(BPR_Number_SFG_I+" "+Version_Number_SFP);
			w.Edit_Action_Button();
			w.Remarks(Remarks_ReInitiate);

			w.BatchSize(BatchSizeEdit);//5000previous now 6000
			w.BPR_Number(BPR_Number_SFG_I);Thread.sleep(2000);
			//***************************************************************************************************************
			w.Version_Number2("B");Thread.sleep(1000);
			//***************************************************************************************************************
			w.Proceed_Button();//Thread.sleep(2000);

			//Delete Action Button-3 (Buttons given in try catch so if less KSM box also code will work)
			//******************************Deleted all added material in KSM Box********************************************
			driver.findElement(By.xpath("(//*[@title='Delete'])[1]")).click();
			try {driver.findElement(By.xpath("(//*[@title='Delete'])[1]")).click();
			} catch (Exception e){e.printStackTrace();}
			try {driver.findElement(By.xpath("(//*[@title='Delete'])[1]")).click();} catch (Exception e) {e.printStackTrace();}
			Thread.sleep(2000);w.Proceed_Button();Thread.sleep(2000);
			//******************************Deleted all added material in KSM Box********************************************
			w.Proceed_Button();//Thread.sleep(2000);

			//Action Plus- 1 & Action Plus- 1 two times click on same button so that 3 KSM Empty box will Appears here)1 by default it will come
			driver.findElement(By.xpath("(//*[@title='Edit'])[2]")).click();
			driver.findElement(By.xpath("(//*[@title='Edit'])[2]")).click();

			//******************Again Adding 3 Raw Material in KSM Box after deleting entire KSM Box*********************
			w.DD_02(Pro.getProperty("RawMaterial1"));//RawMaterial1
			//w.DD_02("");Thread.sleep(2000);//RawMaterial1
			w.Type_Search_04(Number_Of_Lots);
			w.TT_7(StandardQuantity);//StandardQuantity//TT8 if we select Validation Request

			Select UOM11 = new Select(driver.findElement(By.xpath("/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[6]/select")));
			UOM11.selectByIndex(0);Thread.sleep(2000);

			//w.CheckBox_1();//KSM/ API Material

			//Manage Lots-1//Plus Button for giving High and Low Values
			driver.findElement(By.xpath("(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[8]/button[1])[1]")).click();
			Thread.sleep(4000);

			w.TT_11(High1);//High
			w.TT_12(Low1);//Low
			w.TT_13(High2);//High
			w.TT_14(Low2);//Low

			//************************IF we want to create another material we used this below code**********************
			//w.DD_03("");Thread.sleep(2000);//RawMaterial2
			w.DD_03(Pro.getProperty("RawMaterial2"));//RawMaterial2
			w.Type_Search_06(Number_Of_Lots);
			w.TT_16(StandardQuantity);//StandardQuantity//

			Select UOM22 = new Select(driver.findElement(By.xpath("/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody[2]/tr/td[6]/select")));
			UOM22.selectByIndex(0);
			Thread.sleep(2000);

			//***************************************************************************************************************
			//Manage Lots-2//Plus Button for giving High and Low Values

			driver.findElement(By.xpath("(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[8]/button[1])[2]")).click();
			w.TT_20_CSE(High1);//High
			w.TT_21_CSE(Low1);//Low
			w.TT_22_CSE(High2);//High
			w.TT_23_CSE(Low2);//Low

			//**************IF we want to create another material we used this below code************************************
			scrollPagedown();

			//w.DD_04("");Thread.sleep(2000);//RawMaterial2
			w.DD_04(Pro.getProperty("RawMaterial3"));//RawMaterial1
			w.Type_Search_08(Number_Of_Lots);
			w.TT_25_CSE(StandardQuantity);//StandardQuantity//

			Select UOM33 = new Select(driver.findElement(By.xpath("/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody[3]/tr/td[6]/select")));
			UOM33.selectByIndex(0);
			Thread.sleep(2000);

			//***************************************************************************************************************
			//Manage Lots-3//Plus Button for giving High and Low Values
			driver.findElement(By.xpath("/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody[3]/tr/td[8]/button[1]")).click();

			w.TT29(High1);//High
			w.TT30(Low1);//Low
			w.TT31(High2);//High
			w.TT32(Low1);//Low
			scrollPagedown();

			w.Submit_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button2();w.Ok();
			scrollPagedownSlow();
			//***************************************************************************************************************
			w.SearchBox(BPR_Number_SFG_I);
			//***************************************************************************************************************
			w.ViewButton();scrollPagedown();
			w.Back_Button();
		}}}
