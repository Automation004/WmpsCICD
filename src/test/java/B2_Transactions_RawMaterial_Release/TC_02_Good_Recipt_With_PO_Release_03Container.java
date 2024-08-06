package B2_Transactions_RawMaterial_Release;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_02_Good_Recipt_With_PO_Release_03Container extends BaseClass
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

		WMPS_Login("Approver_ID","Approver_Password");
		w.Second_Level();
		w.ReviewApprovalCategory("Goods Receipt Release");
		w.Search_Button();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//***************************************************************************************************************
			//***************************************************************************************************************
			String PurchaseOrder_Number =xls.getCellData("PurchaseOrderEntry", "PurchaseOrder_Number", i);
			//***************************************************************************************************************
			// **************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
			// **************************************************************************************************
			String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
			String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i);
			//***************************************************************************************************************
			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************
			//***************************************************************************************************************
			//***************************************************************************************************************
			w.SearchBox(MaterialMasterRM_Edit);Thread.sleep(3000);
			w.SearchBox2(" Created");Thread.sleep(3000);
			//***************************************************************************************************************
			w.Edit_Action_Button();
			w.Comments("Good_Recipt_With_PO_Release");Thread.sleep(2000);
			w.ActionLevelApproverAction("Release");
			w.Save_Button2();w.Yes();
			w.Password_Fill(ApproverPassword);
			w.Submit_Button();w.Ok();
			Thread.sleep(4000);
			//***************************************************************************************************************
			w.SearchBox(MaterialMasterRM_Edit);Thread.sleep(3000);
			w.SearchBox2(" Created");Thread.sleep(3000);
			//***************************************************************************************************************
			w.Edit_Action_Button();	//ADD 2 if remove search BOX***********
			w.Comments("Good_Recipt_With_PO_Release");Thread.sleep(2000);
			w.ActionLevelApproverAction("Release");
			w.Save_Button2();w.Yes();
			w.Password_Fill(ApproverPassword);
			w.Submit_Button();w.Ok();
			Thread.sleep(4000);
			//***************************************************************************************************************
			//***************************************************************************************************************
			w.SearchBox(MaterialMasterRM_Edit);Thread.sleep(3000);
			w.SearchBox2(" Created");Thread.sleep(3000);
			//***************************************************************************************************************
			w.Edit_Action_Button();	//ADD 3 if remove search BOX***********
			w.Comments("Good_Recipt_With_PO_Release");Thread.sleep(2000);
			w.ActionLevelApproverAction("Release");
			w.Save_Button2();w.Yes();
			w.Password_Fill(ApproverPassword);
			w.Submit_Button();w.Ok();
			Thread.sleep(4000);
			//***************************************************************************************************************
			//***************************************************************************************************************
			w.SearchBox(MaterialMasterRM_Edit);Thread.sleep(3000);
			w.ViewButton();scrollPagedown();
			w.Back_Button2();
		}
		driver.close();
	}}
