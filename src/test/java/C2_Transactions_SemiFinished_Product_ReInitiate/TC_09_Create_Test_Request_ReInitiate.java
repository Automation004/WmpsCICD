package C2_Transactions_SemiFinished_Product_ReInitiate;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_09_Create_Test_Request_ReInitiate extends BaseClass {

	@org.testng.annotations.Test
	public static void Bill_Of_Material() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		WMPS_Login("Initiator", "Initiator_Password");
		// w.Menu_Navigate();w.Menu_Navigate();

		w.Production();
		w.Create_Test_Request_Production();
		Thread.sleep(2000);
		int rowcount = xls.getRowCount("Material_Master");

		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++) {
			// ******************************************************************************************************
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			//******************************************************************************************************
			String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i); // New Semifinished
			//******************************************************************************************************
			String Batch_Number_I = xls.getCellData("Dependency", "Batch_Number_I", i);// **********
			String Batch_Number_II = xls.getCellData("Dependency", "Batch_Number_II", i);// ********

			//w.Edit_Action_Button();
			// *******************************************************************************************************
			// *******************************************************************************************************
			w.SearchBox(Batch_Number_I);Thread.sleep(1000);
			//w.SearchBox("");Thread.sleep(1000);
			// *******************************************************************************************************
			w.FFP_01();
			w.Remarks(Batch_Number_I);
			w.Quantity("6000");

			Select Packing_Type = new Select(driver.findElement(By.xpath("//*[@formcontrolname='packingTypeId']")));
			Packing_Type.selectByIndex(2);Thread.sleep(2000);

			w.Save_Button();w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button();w.Ok();
			w.Eye_FF_01();//w.Back_Button();

			//driver.close();

		}
	}
}
