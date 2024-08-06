package B3_Transactions_RawMaterial_Relnitiate;
import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_01_Purchase_Order_Entry_ReInitiate extends BaseClass {

	@org.testng.annotations.Test
	public static void Purchase_Order_Entry() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);
		WMPS_Login("Initiator", "Initiator_Password");

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 6; i++)
		{

			// ********************************************************************************************************************
			String PurchaseOrder_Number = xls.getCellData("PurchaseOrderEntry", "PurchaseOrder_Number", i);// Unique
			String PurchaseOrder_Number_Edit = xls.getCellData("PurchaseOrderEntry", "PurchaseOrder_Number_Edit", i);// Unique

			String DateToday = xls.getCellData("Date", "DateToday", i);// Today

			// ********************************************************************************************************************
			String Requested_Quantity_Edit = xls.getCellData("PurchaseOrderEntry", "Requested_Quantity_Edit", i);
			String RequestUOM = xls.getCellData("PurchaseOrderEntry", "RequestUOM", i);
			String Received_Quantity_Edit = xls.getCellData("PurchaseOrderEntry", "Received_Quantity_Edit", i);
			String ReceivedUOM = xls.getCellData("PurchaseOrderEntry", "RequestUOM", i);
			String Remarks = xls.getCellData("PurchaseOrderEntry", "Remarks", i);
			// ********************************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ********************************************************************************************************************
			w.Purchase_Order();
			w.Purchase_Order_Entry();
			// ********************************************************************************************************************
			w.SearchBox(PurchaseOrder_Number);Thread.sleep(2000);
			// ********************************************************************************************************************
			w.Edit_Action_Button();

			w.PurchaseOrderNumber(PurchaseOrder_Number_Edit);
			w.PurchaseOrderDate(DateToday);
			// ********************************************************************************************************************
			w.RequestQuantity(Requested_Quantity_Edit+"0");//12000
			w.ReceivedQuantity(Received_Quantity_Edit);//same 10000
			// ********************************************************************************************************************
			w.Remarks(Remarks);
			w.Add_Button();
			w.UpdateButton();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button();w.Ok();
			w.Eye_FF_01();
		}
		driver.close();
	}
}
