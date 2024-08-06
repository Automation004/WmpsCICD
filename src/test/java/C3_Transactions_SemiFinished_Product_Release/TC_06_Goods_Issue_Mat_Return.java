package C3_Transactions_SemiFinished_Product_Release;
import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;
public class TC_06_Goods_Issue_Mat_Return extends BaseClass {

	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++)
		{
			// ********************************************************************************************************************
			String Batch_Number_SFG_I =xls.getCellData("Dependency", "Batch_Number_SFG_I", i);//*****************
			String Batch_Number_SFG_II =xls.getCellData("Dependency", "Batch_Number_SFG_II", i);//***************
			// ********************************************************************************************************************
			// ********************************************************************************************************************			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			// ********************************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ********************************************************************************************************************

			WMPS_Login("Approver_ID","Approver_Password");
//			w.Menu_Navigate();
//			w.Menu_Navigate();
			w.Second_Level();
			w.ReviewApprovalCategory("Goods Issue ag(st) Mat Req Release");
			w.Search_Button();
			// ********************************************************************************************************************
			w.SearchBox(Batch_Number_SFG_I);
			//w.SearchBox(Pro.getProperty("SemiFinished_Product1"));Thread.sleep(2500);
			//w.SearchBox(Pro.getProperty("SemiFinished_Product2"));Thread.sleep(2500);
			// ********************************************************************************************************************
			w.Edit_Action_Button();
			//****************************************************************************************************
			//w.ActionLevelApproverAction(Status);
			w.ActionLevelApproverAction(Pro.getProperty("Action_2"));
			//****************************************************************************************************
			w.Comments("Batch_Order_Release");Thread.sleep(2000);
			w.Submit();w.Yes();
			w.Password_Fill(ApproverPassword);
			w.Submit_Button2();w.Ok();
			// ********************************************************************************************************************
			w.SearchBox(Batch_Number_SFG_I);
			// ********************************************************************************************************************
			w.ViewButton();
			w.Back_Button2();
		}
	}
}
