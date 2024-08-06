package B1_Transaction_RawMaterial_Create;

import org.openqa.selenium.By;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_03_Quality_Inspection_for_1_Batch extends BaseClass
{

	@org.testng.annotations.Test
	public static void Quality_Inspection() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);
		HomePage hp=new HomePage(driver);
		Common_Xpath cxp=new Common_Xpath(driver);
		PWO_Xpath p=new PWO_Xpath(driver);
		DataFields df=new DataFields(driver);
		MasterXpaths mp =new MasterXpaths(driver);

		WMPS_Login("Initiator","Initiator_Password");
		w.Quality_Control();w.Quality_Inspection();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=4;i++)
		{
			//***************************************************************************************************************
			//Unique First AR Number in Raw Material Flow
			String AR_Number_RM_B1 =xls.getCellData("Dependency", "AR_Number_RM_B1", i);
			String AR_Number_RM_B2 =xls.getCellData("Dependency", "AR_Number_RM_B2", i);
			//***************************************************************************************************************
			// **************************************************************************************************************
			// **************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
			// **************************************************************************************************
			String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
			String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i); //
			//***************************************************************************************************************
			//***************************************************************************************************************
			String Pharmacopoeia =xls.getCellData("Quality_Inspection", "Pharmacopoeia", i);
			String Action =xls.getCellData("Quality_Inspection", "Action", i);
			String Sampled_Quantity =xls.getCellData("Quality_Inspection", "Sampled_Quantity", i);
			String SampledQuantityUOM =xls.getCellData("Quality_Inspection", "SampledQuantityUOM", i);
			//***************************************************************************************************************
			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************
			//***************************************************************************************************************

			//w.SearchBox(MaterialMasterRM_Edit);//Change Everytime

			//***************************************************************************************************************
			w.SMPL();
			//w.PharmacopoeiaId(Pharmacopoeia);
			//***************************************************************************************************************
			w.ARNumber(AR_Number_RM_B1);//*********************	Change Everytime
			//***************************************************************************************************************
			w.Action(Action);
			System.out.println(Action);
			boolean t= driver.findElement(By.xpath("//input[@formcontrolname='SampledQuantity']")).isDisplayed();
			if(t)
			{
				System.out.println(Action);
				w.SampledQuantity(Sampled_Quantity);
				w.SampledQuantityUOM(SampledQuantityUOM);
			}
			System.out.println(Action);
			boolean tt= driver.findElement(By.xpath("//input[@formcontrolname='SampledQuantity']")).isDisplayed();
			if(tt)
			{
				System.out.println(Action);
				w.Comments("Quality_Inspection_Passed");
			}
			w.SampledQuantity(Sampled_Quantity);//---50
			//w.SampledQuantityUOM(SampledQuantityUOM);
			w.Comments("Quality_Inspection_Passed");
			w.Submit();w.Yes();
			w.Password_Fill(InitiatorPassword);
			//w.Submit_Button2();w.Ok();
			//***************************************************************************************************************

			w.SearchBox(MaterialMasterRM_Edit);Thread.sleep(4000);
			w.ViewButton();scrollPagedown();
			w.Back_Button();

			//***************************************************************************************************************
		}
		//driver.close();
	}}
