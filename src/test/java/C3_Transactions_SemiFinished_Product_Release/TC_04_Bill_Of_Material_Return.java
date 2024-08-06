package C3_Transactions_SemiFinished_Product_Release;
import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;
public class TC_04_Bill_Of_Material_Return extends BaseClass
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

		WMPS_Login("Approver_ID","Approver_Password");//Hindys & Hazelo
		//WMPS_Login("Approver_BOM", "Password_BOM");//HETERO
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//***************************************************************************************************************
			String DateToday =xls.getCellData("Date", "DateToday", i);
			//***************************************************************************************************************
			String BPR_Number_SFG_I = xls.getCellData("Dependency", "BPR_Number_SFG_I", i); //Change Everytime
			String BPR_Number_SFG_II = xls.getCellData("Dependency", "BPR_Number_SFG_II", i); //Change Everytime
			//***************************************************************************************************************
			String Version_Number_SFP = xls.getCellData("Dependency", "Version_Number_SFP" ,i);
			String Version_Number_FP = xls.getCellData("Dependency", "Version_Number_FP" ,i);
			//***************************************************************************************************************
			String BPR_Number_FP_I = xls.getCellData("Dependency", "BPR_Number_FP_I", i); //Change Everytime
			String BPR_Number_FP_II = xls.getCellData("Dependency", "BPR_Number_FP_II", i); //Change Everytime
			//***************************************************************************************************************
			//***************************************************************************************************************
			String Remarks_Initiate =xls.getCellData("Bill_Of_Material", "Remarks_Initiate", i);
			String Remarks_Return =xls.getCellData("Bill_Of_Material", "Remarks_Return", i);
			String Remarks_ReInitiate =xls.getCellData("Bill_Of_Material", "Remarks_ReInitiate", i);
			String Remarks_Release =xls.getCellData("Bill_Of_Material", "Remarks_Release", i);
			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String BOM_Password = xls.getCellData("Changable_Data", "BOM_Password", i);//*Only for Hetero HDL9
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************
			w.Second_Level();
			w.ReviewApprovalCategory("Bill Of Material Release");
			w.Search_Button();
			//***************************************************************************************************************
			w.SearchBox(BPR_Number_SFG_I+" "+Version_Number_SFP);
			//***************************************************************************************************************
			w.Edit_Action_Button();
			//Thread.sleep(2000);Thread.sleep(2000);
			w.EffectiveDate(DateToday);//today date required
			w.Comments("BOM_Returned Sucessfully by Durga Prasad Banguru");//Thread.sleep(2000);
			//***************************************************************************************************************
			//w.ActionLevelApproverAction(Status);
			w.ActionLevelApproverAction(Pro.getProperty("Action_2"));
			//***************************************************************************************************************
			w.Submit();w.Yes();
			//w.Password_Fill(BOM_Password);
			w.Password_Fill(ApproverPassword);
			w.Submit_Button2();w.Ok();
			//***************************************************************************************************************
			w.SearchBox(BPR_Number_SFG_I);
			//***************************************************************************************************************
			w.ViewButton();
			scrollPagedownSlow();//w.Back_Button2();
		}
		driver.close();
	}}