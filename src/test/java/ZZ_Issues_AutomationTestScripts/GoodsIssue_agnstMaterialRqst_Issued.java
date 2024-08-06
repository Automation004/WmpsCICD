package ZZ_Issues_AutomationTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class GoodsIssue_agnstMaterialRqst_Issued extends BaseClass {
	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception {
		Test = extent.createTest("Order Type Test");
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		try {
			int rowcount = xls.getRowCount("Material_Master");
			Test.log(Status.INFO, "Number of rows in Material_Master: " + rowcount);
			System.out.println(rowcount);

			for (int i = 2; i <= 2; i++) {
				// Read data from the Excel sheet
				String Batch_Number_SFG_I = xls.getCellData("Dependency", "Batch_Number_SFG_I", i);
				// ********************

				String Batch_Number_II = xls.getCellData("Dependency", "Batch_Number_II", i);
				String Batch_Number_FP = xls.getCellData("Dependency", "Batch_Number_FP", i);
				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);

				// Initialize SoftAssert
				SoftAssert softAssert = new SoftAssert();

				// Log in as Initiator
				WMPS_Login("Initiator", "Initiator_Password");
				Test.log(Status.PASS, "Logged in successfully as Initiator");
				// Navigate through the menu
				w.Menu_Navigate();
				Test.log(Status.PASS, "Navigated to menu");
				w.Menu_Navigate();
				Test.log(Status.PASS, "Navigated to menu again");
				w.WareHouse();
				Test.log(Status.PASS, "Navigated to WareHouse");
				w.Goods_Issue_Mat_Req();
				Test.log(Status.PASS, "Navigated to Goods Issue Material Request");

				// Search for the batch number
				w.SearchBox("TDF1240158");
				Test.log(Status.PASS, "Searched for Batch Number: " + Batch_Number_SFG_I);

				// Edit action
				w.Edit_Action_Button();
				Test.log(Status.PASS, "Clicked Edit Action Button");

				WebElement issuedQuantity = driver.findElement(By.cssSelector("td:nth-child(11)"));
				System.out.println("Issued Quantity = " + issuedQuantity.getText());
				Test.info("Issued Quantity got and the value is" + issuedQuantity);
				// Assert that the text is equal to "0.000"
				softAssert.assertEquals(issuedQuantity, "0.000",
						"Issued Quantity is not equal to 0.000. Actual: " + issuedQuantity);

				WebElement balanceQuantity = driver.findElement(By.cssSelector("td:nth-child(12)"));
				System.out.println("Balance Quantity = " + balanceQuantity.getText());
				Test.info("Balance Quantity got and the value is" + balanceQuantity);

				// Select batch number
				driver.findElement(By.xpath("(//a[contains(text(),'Select')])[1]")).click();
				// driver.findElement(By.xpath("(//a[contains(text(),'Select')])[3]")).click();
				Test.log(Status.PASS, "Selected Batch Number");

				// Issue quantity
				w.TT_2("20");
				// w.TT_4("50");
				Test.log(Status.PASS, "Issued Quantity: 20");

				w.Submit_Button();
				Test.log(Status.PASS, "Submitted Issued Quantity");

				//				driver.findElement(By.xpath("(//a[contains(text(),'Select')])[4]")).click();
				//				Test.log(Status.PASS, "Submitted Issued Quantity");

				//// Select another batch number
				// driver.findElement(By.xpath("(//a[contains(text(),'Select')])[4]")).click();
				// Test.log(Status.PASS, "Selected another Batch Number");

				// Issue another quantity
				// w.TT_3("50");
				// w.TT_5("50");
				// Test.log(Status.PASS, "Issued Quantity: 20");
				// w.Submit_Button();
				// Test.log(Status.PASS, "Submitted Issued Quantity");

				// Select materials check Box
				w.CheckBox_1();
				Test.log(Status.PASS, "checked the batch given check Box");

				// w.CheckBox_3();
				// Test.log(Status.PASS, "Selected Material Checkbox 1");
				// w.CheckBox_4();
				// Test.log(Status.PASS, "Selected Material Checkbox 2");

				// Issue materials
				w.Issue_Button();
				Test.log(Status.PASS, "Clicked Issue Button");
				w.Yes();
				Test.log(Status.PASS, "Confirmed Issue");

				//				w.Password_Fill(InitiatorPassword);
				//				Test.log(Status.PASS, "Filled Password");

				w.Submit_Button();
				Test.log(Status.PASS, "clicked submit Button");

				// Search for the batch number again
				w.SearchBox(Batch_Number_SFG_I);
				Test.log(Status.PASS, "Searched for Batch Number: " + Batch_Number_SFG_I);

				// View button
				w.ViewButton();
				Test.log(Status.PASS, "Clicked View Button");

				// Assert all
				softAssert.assertAll();
			}
		} catch (Exception e) {
			Test.log(Status.FAIL, e.getMessage());
			throw e;
		}
	}
}
