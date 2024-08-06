package ZZ_Issues_AutomationTestScripts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class zzTC_01_Quality_Inspection_Search extends BaseClass {
	@SuppressWarnings("deprecation")
	@Test
	public static void Quality_Inspection() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		WMPS_Login("Initiator", "Initiator_Password");
		w.Quality_Control();
		w.Quality_Inspection();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++)

		{
			// ***************************************************************************************************************
			// Unique First AR Number in Raw Material Flow
			String AR_Number_RM_B1 = xls.getCellData("Dependency", "AR_Number_RM_B1", i);
			String AR_Number_RM_B2 = xls.getCellData("Dependency", "AR_Number_RM_B2", i);
			// ***************************************************************************************************************
			// **************************************************************************************************************
			// **************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
			// **************************************************************************************************
			String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
			String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i); //
			// ***************************************************************************************************************
			// ***************************************************************************************************************
			String Pharmacopoeia = xls.getCellData("Quality_Inspection", "Pharmacopoeia", i);
			String Action = xls.getCellData("Quality_Inspection", "Action", i);
			String Sampled_Quantity = xls.getCellData("Quality_Inspection", "Sampled_Quantity", i);
			String SampledQuantityUOM = xls.getCellData("Quality_Inspection", "SampledQuantityUOM", i);
			// ***************************************************************************************************************
			// ***************************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ***************************************************************************************************************
			// ***************************************************************************************************************

			w.SearchBox("Raw Material Approved");// Raw Material of Approved state

			WebElement GetBatchNumber = driver
					.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(7) span:nth-child(1)"));
			String BatchNumber = GetBatchNumber.getText();
			System.out.println(BatchNumber);

			w.SearchBox(BatchNumber);// Raw Material of Approved state

			WebElement GetSampleInwardNumber = driver
					.findElement(By.cssSelector("tbody tr[class='odd'] td:nth-child(2) span:nth-child(1)"));
			String SampleInwardNumber = GetSampleInwardNumber.getText();
			System.out.println(SampleInwardNumber);

			w.WareHouse();
			w.Material_Inventory();

			w.SearchBox(BatchNumber);

			WebElement GetBatchNumberFromMatIn = driver
					.findElement(By.xpath("//*[@id='invnetoryTable']/tbody/tr/td[4]/span"));
			String BatchNumber2 = GetBatchNumberFromMatIn.getText();
			System.out.println(BatchNumber2);

			if (BatchNumber.equals(BatchNumber2)) {
				GetBatchNumberFromMatIn.click();

			} else

				System.out.println("BatchNumber mismatched");

			w.Inventory_Card();
			w.Back_Button();

			// Login change
			w.Handling_Of_Quantities();
			w.SearchBox(SampleInwardNumber);

			// launchURL();
			WMPS_Login("Service_User", "Service_User_Password");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// driver.findElement(By.xpath("(//a[contains(text(),'WareHouse')])")).click();
			w.WareHouse();
			w.Handling_Of_Quantities();

			w.SearchBox(SampleInwardNumber);

			w.Modify_Button();

			Select TransactionType = new Select(
					driver.findElement(By.xpath("//*[@formcontrolname='transactionTypeId']")));
			TransactionType.selectByVisibleText("Quality Inspection");

			WebElement TransactionId = driver.findElement(By.xpath("//*[@formcontrolname='transactionId']"));
			TransactionId.click();
			TransactionId.sendKeys(SampleInwardNumber);

			w.TT_2("fff");
			w.Save_Button();

		}
	}
}
