package D3_Transactions_FinishedProduct_Release;
import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;
public class TC_04_Bill_Of_Material_Release extends BaseClass
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

		WMPS_Login("Approver_ID","Approver_Password");//HINDYS
		//WMPS_Login("Approver_BOM", "Password_BOM");//HETERO
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//***************************************************************************************************************
			String DateToday =xls.getCellData("Date", "DateToday", i);
			//***************************************************************************************************************
			//***************************************************************************************************************
			String BPR_Number_SFG_I = xls.getCellData("Dependency", "BPR_Number_SFG_I", i);// Change Everytime
			String BPR_Number_SFG_II = xls.getCellData("Dependency", "BPR_Number_SFG_II", i);// Change Everytime
			//***************************************************************************************************************
			String BPR_Number_FP_I = xls.getCellData("Dependency", "BPR_Number_FP_I", i);// Change Everytime
			String BPR_Number_FP_II = xls.getCellData("Dependency", "BPR_Number_FP_II", i);// Change Everytime
			//***************************************************************************************************************
			String BPR_Number_I = xls.getCellData("Dependency", "BPR_Number_I", i);
			String BPR_Number_II = xls.getCellData("Dependency", "BPR_Number_II", i);
			String BPR_Number_III = xls.getCellData("Dependency", "BPR_Number_III", i);																		// Material Upper Part
			//***************************************************************************************************************
			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String BOM_Password = xls.getCellData("Changable_Data", "BOM_Password", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************
			w.Second_Level();
			w.ReviewApprovalCategory("Bill Of Material Release");
			w.Search_Button();
			//***************************************************************************************************************
			w.SearchBox(BPR_Number_FP_I);
			//***************************************************************************************************************
			w.Edit_Action_Button();
			Thread.sleep(2000);Thread.sleep(2000);
			w.EffectiveDate(DateToday);//today date required
			w.Comments("BOM_Release");Thread.sleep(2000);
			//***************************************************************************************************************
			//w.ActionLevelApproverAction(Status);
			w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
			//***************************************************************************************************************
			w.Submit();w.Yes();
			//w.Password_Fill(BOM_Password);
			w.Password_Fill(ApproverPassword);
			w.Submit_Button2();w.Ok();
			//***************************************************************************************************************
			w.SearchBox(BPR_Number_FP_I);
			//***************************************************************************************************************
			w.ViewButton();
			scrollPagedown();
			w.Back_Button2();
		}
		driver.close();
	}}

