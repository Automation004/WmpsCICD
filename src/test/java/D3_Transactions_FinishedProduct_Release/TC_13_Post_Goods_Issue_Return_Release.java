package D3_Transactions_FinishedProduct_Release;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_13_Post_Goods_Issue_Return_Release extends BaseClass {

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
		for (int i = 2; i <= 2; i++) {

			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			String Batch_Number = xls.getCellData("Material_Indent", "Batch_number", i);

			WMPS_Login_Release("441122", "ApproverPassword");
			w.Second_Level();
			w.ReviewApprovalCategory(" Post Goods Issue Return Release");
			w.Search_Button();
			// w.SearchBox(Batch_Number);
			w.FFP_01();
			w.Comments("Dispatch_Request_Release");
			Thread.sleep(2000);
			w.ActionLevelApproverAction("Release");
			w.Radio_Button_1();//
			w.Save_Button();
			w.Yes();
			Thread.sleep(2000);
			w.Password_Fill(ApproverPassword);
			w.SubmitType_2();
			w.Ok();
		}
	}
}
