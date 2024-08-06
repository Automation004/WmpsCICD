package D1_Transactions_FinishedProduct_Create;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_10_01_BOM_FP_Add_2Material_1RM_1SFG_No_KSM extends BaseClass
{
	@org.testng.annotations.Test
	public static void Bill_Of_Material() throws Exception
	{
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		WMPS_Login("Initiator", "Initiator_Password");
		w.Menu_Navigate();w.Menu_Navigate();
		w.Production();
		w.BillOfMaterial();
		w.Create_Button();
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++)
		{
			//Always Change
			//***************************************************************************************************************
			String BPR_Number_FP_I = xls.getCellData("Dependency", "BPR_Number_FP_I", i);// Change Everytime
			String BPR_Number_FP_II = xls.getCellData("Dependency", "BPR_Number_FP_II", i);// Change Everytime
			//***************************************************************************************************************
			String Version_Number_FP = xls.getCellData("Dependency", "Version_Number_FP" ,i);// Change Everytime
			//***************************************************************************************************************
			String Remarks_Initiate =xls.getCellData("Bill_Of_Material", "Remarks_Initiate", i);
			String Remarks_Return =xls.getCellData("Bill_Of_Material", "Remarks_Return", i);
			String Remarks_ReInitiate =xls.getCellData("Bill_Of_Material", "Remarks_ReInitiate", i);
			String Remarks_Release =xls.getCellData("Bill_Of_Material", "Remarks_Release", i);
			//***************************************************************************************************************
			String BatchSize = xls.getCellData("Bill_Of_Material", "BatchSize", i);//5000
			String BatchSizeEdit = xls.getCellData("Bill_Of_Material", "BatchSizeEdit", i);//6000
			//***************************************************************************************************************
			String BPR_Type = xls.getCellData("Bill_Of_Material", "BPR_Type", i);
			//***************************************************************************************************************
			String Number_Of_Lots = xls.getCellData("Bill_Of_Material", "Number_Of_Lots", i);//2
			String StandardQuantity = xls.getCellData("Bill_Of_Material", "StandardQuantity", i);//500
			//***********************************CONNECTED EXCEL*************************************************************
			String High1 = xls.getCellData("Bill_Of_Material", "High1", i);  //80
			String Low1  = xls.getCellData("Bill_Of_Material", "Low1", i);   //30
			String High2 = xls.getCellData("Bill_Of_Material", "High2", i);  //80
			String Low2  = xls.getCellData("Bill_Of_Material", "Low2", i);   //20
			//***************************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************

			w.DD_01(Pro.getProperty("Finished_Product"));
			w.BatchSize(BatchSize);//5000
			w.RecievedUOM_SK("KG");
			//***************************************************************************************************************
			w.BPR_Number(BPR_Number_FP_I);Thread.sleep(2000);// ***********************UNIQUE
			//***************************************************************************************************************
			w.Version_Number(Version_Number_FP);Thread.sleep(1000);
			w.BPRType(BPR_Type);
			w.Remarks(Remarks_Initiate);
			w.Proceed_Button();//Thread.sleep(2000);
			//***************************************************************************************************************

			w.DD_02(Pro.getProperty("RawMaterial1"));//RawMaterial5
			w.Type_Search_04(Number_Of_Lots);
			w.TT_7(StandardQuantity);//StandardQuantity//TT8 if we select Validation Request

			Select UOM11 = new Select(driver.findElement(By.xpath("/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[6]/select")));
			UOM11.selectByIndex(0);Thread.sleep(2000);

			//w.CheckBox_1();// NO KSM/ API Material

			//Manage Lots-1//Plus Button for giving High and Low Values
			driver.findElement(By.xpath("(//button[@class='btn xsBtn ng-tns-c77-2'])[1]")).click();


			w.TT_11(High1);//High
			w.TT_12(Low1);//Low
			w.TT_13(High2);//High
			w.TT_14(Low2);//Low

			//Action - 1 -Plus Button
			driver.findElement(By.xpath("(//*[@title='Edit'])[11]")).click();
			Thread.sleep(2000);
			//*****************************IF we want to create another material we used this below code***********************************************/////////////////////////////////////
			//*****************************IF we want to create another material we used this below code***********************************************/////////////////////////////////////
			w.DD_03(Pro.getProperty("SemiFinished_Product1"));//RawMaterial1
			w.Type_Search_06(Number_Of_Lots);
			w.TT_16(StandardQuantity);//StandardQuantity//

			Select UOM22 = new Select(driver.findElement(By.xpath("/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody[2]/tr/td[6]/select")));
			UOM22.selectByIndex(0);
			Thread.sleep(2000);

			//***************************************************************************************************************
			driver.findElement(By.xpath("(//button[@class='btn xsBtn ng-tns-c77-2'])[2]")).click();// Manage Lots-2//PLUS BUTTON
			w.TT_20_CSE("80");//High
			w.TT_21_CSE("30");//Low
			w.TT_22_CSE("80");//High
			w.TT_23_CSE("20");//Low

			w.Submit_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button2();
			w.Ok();
			//***************************************************************************************************************
			w.SearchBox(BPR_Number_FP_I);
			w.ViewButton();scrollPagedownSlow();
			w.Back_Button();
			//***************************************************************************************************************
		}
	}
}
//********************************************************************************************************************************
// If we select VALIDATION REQUEST in Dropdown this dynamic field
// Protocol_Number will come
// VALIDATION REQUEST
//			try {
//				w.Protocol_Number(BPR_Number_I);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
