package D3_Transactions_FinishedProduct_Release;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_06_Product_Requirement_Release extends BaseClass
{

	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);
		HomePage hp=new HomePage(driver);
		Common_Xpath cxp=new Common_Xpath(driver);
		PWO_Xpath p=new PWO_Xpath(driver);
		DataFields df=new DataFields(driver);
		MasterXpaths mp =new MasterXpaths(driver);

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++) {
			//****************************************************************************************************************
			String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP",i);
			//****************************************************************************************************************
			//****************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String BOM_Password = xls.getCellData("Changable_Data", "BOM_Password", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//****************************************************************************************************************
			WMPS_Login("Approver_ID", "Approver_Password");
			w.Second_Level();
			w.ReviewApprovalCategory("Product Requirement Release");
			w.Search_Button();
			//***************************************************************************************************************
			w.SearchBox(Pro.getProperty("RawMaterial1"));//KSM Raw Material
			w.SearchBox2(" ");
			w.SearchBox2(Pro.getProperty("SemiFinished_Product1"));//KSM Raw Material
			//***************************************************************************************************************
			w.Edit_Action_Button();
			w.Comments("Manufacture_Master_Release");Thread.sleep(2000);
			//***************************************************************************************************************
			//w.ActionLevelApproverAction(Status);
			w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
			//***************************************************************************************************************
			w.Save_Button();w.Yes();
			w.Password_Fill(ApproverPassword);
			w.Submit_Button();w.Ok();
			//***************************************************************************************************************
			w.SearchBox(Pro.getProperty("RawMaterial1"));//KSM Raw Material
			w.SearchBox2(" ");
			w.SearchBox2(Pro.getProperty("SemiFinished_Product1"));//KSM Raw Material
			//***************************************************************************************************************
			w.ViewButton();
			scrollPagedown();
			driver.close();
		}
	}
}