package Z_Single_Screen;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;
public class TC_01_Material_Inventory extends BaseClass
{
	@org.testng.annotations.Test
	public static void Material_Inventory() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);
		WMPS_Login("Initiator","Initiator_Password");

		w.Transactions();
		w.WareHouse();
		w.Material_Inventory();
		//w.Menu_Navigate();
		Thread.sleep(5000);

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			String Batch_Number =xls.getCellData("Changable_Data", "Batch_Number", i);

			w.SearchBox("");//
			scrollPagedown();
			//Add code for Horizontal scroll inside Data Table
		}}}
