package C3_Transactions_SemiFinished_Product_Release;
import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;
public class TC_05_Batch_Order_Return extends BaseClass
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
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//****************************************************************************************************
			String Batch_Number_SFG_I =xls.getCellData("Dependency", "Batch_Number_SFG_I", i);//Change Everytime
			String Batch_Number_SFG_II =xls.getCellData("Dependency", "Batch_Number_SFG_II", i);//Change Everytime
			//****************************************************************************************************
			String BPR_Number_SFG_I = xls.getCellData("Dependency", "BPR_Number_SFG_I", i);
			String BPR_Number_SFG_II = xls.getCellData("Dependency", "BPR_Number_SFG_II", i);
			//****************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String BOM_Password = xls.getCellData("Changable_Data", "BOM_Password", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//****************************************************************************************************

			w.Menu_Navigate();w.Menu_Navigate();
			w.Second_Level();
			w.ReviewApprovalCategory("Batch Order Release");
			w.Search_Button();Thread.sleep(2000);
			//****************************************************************************************************
			w.SearchBox(Batch_Number_SFG_I);Thread.sleep(2000);
			//****************************************************************************************************
			w.Edit_Action_Button();
			w.Comments("Batch Order Returned Sucessfully");Thread.sleep(2000);
			//****************************************************************************************************
			//w.ActionLevelApproverAction(Status);
			w.ActionLevelApproverAction(Pro.getProperty("Action_2"));
			//****************************************************************************************************
			w.Submit_Button();w.Yes();Thread.sleep(2000);
			w.Password_Fill(ApproverPassword);
			w.Submit_Button2();w.Ok();Thread.sleep(3000);
			//****************************************************************************************************
			w.SearchBox(Batch_Number_SFG_I);Thread.sleep(2000);
			//****************************************************************************************************
			w.ViewButton();
			w.Back_Button();
		}}}