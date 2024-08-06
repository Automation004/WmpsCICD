package Z_Single_Screen;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;
public class TC_02_Re_Test_Register extends BaseClass
{
	@org.testng.annotations.Test
	public static void Re_Test_Register() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);
		WMPS_Login("Initiator","Initiator_Password");

		w.Transactions();
		w.WareHouse();
		w.ReTest_Report();
		//w.Menu_Navigate();
		Thread.sleep(5000);

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			// ************************************************************************************************************
			String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
			String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);


			w.TT_1(MaterialMasterRM_Edit);

			w.Get_Button();
			scrollPagedown();
			//Add code for Horizontal scroll inside Data Table
		}}}
