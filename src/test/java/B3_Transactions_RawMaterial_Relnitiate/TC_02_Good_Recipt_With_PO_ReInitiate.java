package B3_Transactions_RawMaterial_Relnitiate;
import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_02_Good_Recipt_With_PO_ReInitiate extends BaseClass {

	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);
		WMPS_Login("Initiator", "Initiator_Password");
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++) {
			// Data_Mapping from Purchase Order Entry
			// *******************************************************************************************************
			String PurchaseOrder_Number = xls.getCellData("PurchaseOrderEntry", "PurchaseOrder_Number", i);
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);// For RAW Material Master
			String DCInvoiceNumber_Edit = xls.getCellData("Goods_ReceiptWith_WithOut", "DCInvoiceNumber_Edit", i);
			String DeliveryChallanNo =xls.getCellData("Goods_ReceiptWith_WithOut", "DeliveryChallanNo", i);
			String DeliveryChallanNo2 =xls.getCellData("Goods_ReceiptWith_WithOut", "DeliveryChallanNo2", i);
			// *******************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// *******************************************************************************************************
			w.WareHouse();
			w.Goods_Receipt();
			// *******************************************************************************************************
			//w.SearchBox(PurchaseOrder_Number);Thread.sleep(1000);
			//w.SearchBox("");Thread.sleep(1000);
			// *******************************************************************************************************
			Thread.sleep(2000);
			w.Edit_Action_Button();Thread.sleep(1000);
			w.DCEInvoiceNumber(""+"A");
			w.Proceed_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button();w.Ok();
			// *******************************************************************************************************
			//w.SearchBox(PurchaseOrder_Number);
			//w.SearchBox("");Thread.sleep(1000);
			// *******************************************************************************************************
			w.Eye_FF_01();
		}
//		driver.close();
	}
}
