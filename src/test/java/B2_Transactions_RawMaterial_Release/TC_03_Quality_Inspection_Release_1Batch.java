package B2_Transactions_RawMaterial_Release;

import org.openqa.selenium.By;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_03_Quality_Inspection_Release_1Batch extends BaseClass
{

	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);

		WMPS_Login("Approver_ID","Approver_Password");
		w.Second_Level();
		w.ReviewApprovalCategory("Quality Inspection Release");
		w.Search_Button();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)

		{
			// *******************************************************************************************************************
			// ********************************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
			String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i);
			// ********************************************************************************************************************
			String BatchNoFromGoodRecipt =xls.getCellData("VVI", "BatchNoFromGoodRecipt", i);
			String Material_Description =xls.getCellData("Excel_Data", "Material_Description", i);
			// ********************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			// ********************************************************************************************************************
			// ********************************************************************************************************************
			   //w.SearchBox(AR_Number_FP);
			// ********************************************************************************************************************
			Thread.sleep(2000);Thread.sleep(2000);
			w.USDE();
			w.ActionLevelApproverAction("Approve");
			w.Comments("Quality_Inspection_Release");Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@formcontrolname='RetestDate']")).click();Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@formcontrolname='ExpiryDate']")).click();Thread.sleep(6000);

			w.Submit();w.Yes();Thread.sleep(2000);
			w.Password_Fill(ApproverPassword);
			w.Submit_Button2();w.Ok();
			// ********************************************************************************************************************
			  // w.SearchBox(AR_Number_FP);
			// ********************************************************************************************************************
			w.ViewButton();scrollPagedown();
			w.Back_Button2();
		}
		//driver.close();
	}}
