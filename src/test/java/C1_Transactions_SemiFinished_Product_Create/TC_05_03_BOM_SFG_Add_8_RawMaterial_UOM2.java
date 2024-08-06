package C1_Transactions_SemiFinished_Product_Create;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;
public class TC_05_03_BOM_SFG_Add_8_RawMaterial_UOM2 extends BaseClass
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
		w.Menu_Navigate();
		w.Menu_Navigate();
		w.Production();
		w.BillOfMaterial();
		w.Create_Button();
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);

		for (int i = 2; i<= 2; i++)
		{
			//Always Change
			//***************************************************************************************************************
			String BPR_Number_SFG_I = xls.getCellData("Dependency", "BPR_Number_SFG_I", i);// Change Everytime
			String BPR_Number_SFG_II = xls.getCellData("Dependency", "BPR_Number_SFG_II", i);// Change Everytime
			//***************************************************************************************************************
			String Version_Number_SFP = xls.getCellData("Dependency", "Version_Number_SFP" ,i);// create test request
			//***************************************************************************************************************
			String BatchSize = xls.getCellData("Bill_Of_Material", "BatchSize", i);//5000
			String BatchSizeEdit = xls.getCellData("Bill_Of_Material", "BatchSizeEdit", i);//6000
			//***************************************************************************************************************
			String BPR_Type = xls.getCellData("Bill_Of_Material", "BPR_Type", i);
			//***************************************************************************************************************
			String Number_Of_Lots = xls.getCellData("Bill_Of_Material", "Number_Of_Lots", i);//2
			String StandardQuantity = xls.getCellData("Bill_Of_Material", "StandardQuantity", i);//500
			//***********************************CONNECTED EXCEL*************************************************************
			//***************************************************************************************************************
			String High1 = xls.getCellData("Bill_Of_Material", "High1", i);  //80
			String Low1  = xls.getCellData("Bill_Of_Material", "Low1", i);   //30
			String High2 = xls.getCellData("Bill_Of_Material", "High2", i);  //80
			String Low2  = xls.getCellData("Bill_Of_Material", "Low2", i);   //20
			//***************************************************************************************************************
			// *******************************************************************************************************
			String Remarks_Initiate =xls.getCellData("Bill_Of_Material", "Remarks_Initiate", i);
			String Remarks_Return =xls.getCellData("Bill_Of_Material", "Remarks_Return", i);
			String Remarks_ReInitiate =xls.getCellData("Bill_Of_Material", "Remarks_ReInitiate", i);
			String Remarks_Release =xls.getCellData("Bill_Of_Material", "Remarks_Release", i);
			// *******************************************************************************************************
			//***************************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************

			//w.DD_01("");
			w.DD_01(Pro.getProperty("SemiFinished_Product1"));
			w.BatchSize(BatchSize);//5000
			w.UOM_DDI();
			//***************************************************************************************************************
			w.BPR_Number(BPR_Number_SFG_II);Thread.sleep(2000);// ***********************UNIQUE
			//***************************************************************************************************************
			w.Version_Number(Version_Number_SFP);Thread.sleep(1000);
			w.BPRType(BPR_Type);
			w.Remarks(BPR_Number_SFG_II);


			w.Proceed_Button();Thread.sleep(2000);

			driver.findElement(By.xpath("(//button[@title='Edit'])[11]")).click();
			driver.findElement(By.xpath("(//button[@title='Edit'])[11]")).click();
			driver.findElement(By.xpath("(//button[@title='Edit'])[11]")).click();
			driver.findElement(By.xpath("(//button[@title='Edit'])[11]")).click();
			driver.findElement(By.xpath("(//button[@title='Edit'])[11]")).click();
			driver.findElement(By.xpath("(//button[@title='Edit'])[11]")).click();
			driver.findElement(By.xpath("(//button[@title='Edit'])[11]")).click();

			w.DD_02(Pro.getProperty("RawMaterial1"));//RawMaterial1
			w.DD_03(Pro.getProperty("RawMaterial2"));//RawMaterial2
			w.DD_04(Pro.getProperty("RawMaterial3"));//RawMaterial3
			w.DD_05(Pro.getProperty("RawMaterial4"));//RawMaterial4
			w.DD_06(Pro.getProperty("RawMaterial5"));//RawMaterial5
			w.DD_07(Pro.getProperty("RawMaterial6"));//RawMaterial6
			w.DD_08(Pro.getProperty("RawMaterial7"));//RawMaterial7
			w.DD_09(Pro.getProperty("RawMaterial8"));//RawMaterial8

			driver.findElement(By.xpath("(//input[@type='search'])[4]")).sendKeys(Number_Of_Lots);
			driver.findElement(By.xpath("(//input[@type='search'])[6]")).sendKeys(Number_Of_Lots);
			driver.findElement(By.xpath("(//input[@type='search'])[8]")).sendKeys(Number_Of_Lots);
			driver.findElement(By.xpath("(//input[@type='search'])[10]")).sendKeys(Number_Of_Lots);
			driver.findElement(By.xpath("(//input[@type='search'])[12]")).sendKeys(Number_Of_Lots);
			driver.findElement(By.xpath("(//input[@type='search'])[14]")).sendKeys(Number_Of_Lots);
			driver.findElement(By.xpath("(//input[@type='search'])[16]")).sendKeys(Number_Of_Lots);
			driver.findElement(By.xpath("(//input[@type='search'])[18]")).sendKeys(Number_Of_Lots);

			driver.findElement(By.xpath("(//*[@type='text'])[7]")).sendKeys(StandardQuantity);
			driver.findElement(By.xpath("(//*[@type='text'])[9]")).sendKeys(StandardQuantity);
			driver.findElement(By.xpath("(//*[@type='text'])[11]")).sendKeys(StandardQuantity);
			driver.findElement(By.xpath("(//*[@type='text'])[13]")).sendKeys(StandardQuantity);
			driver.findElement(By.xpath("(//*[@type='text'])[15]")).sendKeys(StandardQuantity);
			driver.findElement(By.xpath("(//*[@type='text'])[17]")).sendKeys(StandardQuantity);
			driver.findElement(By.xpath("(//*[@type='text'])[19]")).sendKeys(StandardQuantity);
			driver.findElement(By.xpath("(//*[@type='text'])[21]")).sendKeys(StandardQuantity);

			Select UOM1 = new Select(driver.findElement(By.xpath("(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[6]/select)[1]")));
			UOM1.selectByIndex(1);Thread.sleep(2000);
			Select UOM2 = new Select(driver.findElement(By.xpath("(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[6]/select)[2]")));
			UOM2.selectByIndex(1);Thread.sleep(2000);
			Select UOM3 = new Select(driver.findElement(By.xpath("(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[6]/select)[3]")));
			UOM3.selectByIndex(1);Thread.sleep(2000);
			Select UOM4 = new Select(driver.findElement(By.xpath("(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[6]/select)[4]")));
			UOM4.selectByIndex(1);Thread.sleep(2000);
			Select UOM5 = new Select(driver.findElement(By.xpath("(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[6]/select)[5]")));
			UOM5.selectByIndex(1);Thread.sleep(2000);
			Select UOM6 = new Select(driver.findElement(By.xpath("(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[6]/select)[6]")));
			UOM6.selectByIndex(1);Thread.sleep(2000);
			Select UOM7 = new Select(driver.findElement(By.xpath("(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[6]/select)[7]")));
			UOM7.selectByIndex(1);Thread.sleep(2000);
			Select UOM8 = new Select(driver.findElement(By.xpath("(/html/body/app-root/div/div/app-bom/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr/td[6]/select)[8]")));
			UOM8.selectByIndex(1);Thread.sleep(2000);


			driver.findElement(By.xpath("(//*[@class='fa fa-plus-circle ng-tns-c77-1'])[2]")).click();
			driver.findElement(By.xpath("(//*[@class='fa fa-plus-circle ng-tns-c77-1'])[4]")).click();
			driver.findElement(By.xpath("(//*[@class='fa fa-plus-circle ng-tns-c77-1'])[6]")).click();
			driver.findElement(By.xpath("(//*[@class='fa fa-plus-circle ng-tns-c77-1'])[8]")).click();
			driver.findElement(By.xpath("(//*[@class='fa fa-plus-circle ng-tns-c77-1'])[10]")).click();
			driver.findElement(By.xpath("(//*[@class='fa fa-plus-circle ng-tns-c77-1'])[12]")).click();
			driver.findElement(By.xpath("(//*[@class='fa fa-plus-circle ng-tns-c77-1'])[14]")).click();
			driver.findElement(By.xpath("(//*[@class='fa fa-plus-circle ng-tns-c77-1'])[16]")).click();

			driver.findElement(By.xpath("(//*[@type='text'])[11]")).sendKeys("55");
			driver.findElement(By.xpath("(//*[@type='text'])[12]")).sendKeys("30");
			driver.findElement(By.xpath("(//*[@type='text'])[13]")).sendKeys("55");
			driver.findElement(By.xpath("(//*[@type='text'])[14]")).sendKeys("30");

			w.Submit_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button2();w.Ok();
			//***************************************************************************************************************
			w.SearchBox(BPR_Number_SFG_I);
			//***************************************************************************************************************
			w.ViewButton();scrollPagedown();
			w.Back_Button();
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
