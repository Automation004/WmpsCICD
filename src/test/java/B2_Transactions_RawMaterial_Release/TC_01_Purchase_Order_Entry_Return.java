package B2_Transactions_RawMaterial_Release;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_01_Purchase_Order_Entry_Return extends BaseClass
{
	@org.testng.annotations.Test
	public static void Purchase_Order_Entry_Release() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);
		//******************************************************************************************************************
		WMPS_Login("Approver_ID","Approver_Password");
		w.Second_Level();
		w.ReviewApprovalCategory("Purchase Order Release");
		w.Search_Button();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=9;i++)
		{
			//***************************************************************************************************************
			//***************************************************************************************************************
			String Status =xls.getCellData("Changable_Data", "Status", i);//Release//Block//Return
			//***************************************************************************************************************
			//***************************************************************************************************************
			//Data_Mapping from Purchase Order Entry
			String PurchaseOrder_Number =xls.getCellData("PurchaseOrderEntry", "PurchaseOrder_Number", i);
			//***************************************************************************************************************
			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************
			//***************************************************************************************************************
			w.SearchBox(PurchaseOrder_Number);Thread.sleep(4000);
			//w.SearchBox(Pro.getProperty("RawMaterial1"));
			//***************************************************************************************************************
			w.Edit_Action_Button();
			w.Comments("Purchase_Order_Entry_Release");Thread.sleep(2000);
			//***************************************************************************************************************
			//w.ActionLevelApproverAction(Status);
			w.ActionLevelApproverAction(Pro.getProperty("Action_2"));
			//***************************************************************************************************************
			w.Save_Button();w.Yes();
			w.Password_Fill(ApproverPassword);
			w.Submit_Button();w.Ok();
			//**************************************************************************************************************
			w.SearchBox(PurchaseOrder_Number);Thread.sleep(4000);
			//***************************************************************************************************************
			w.ViewButton();scrollPagedown();
			w.Back_Button2();
		}
		driver.close();
	}}
