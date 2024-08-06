package A2_Master_Release;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_04_Supplier_Assignment_Update_Release extends BaseClass {
	@org.testng.annotations.Test
	public void Ordertypr() throws Exception {
		Test = extent.createTest("Supplier_Assignment_Update_Release Assignment Test");
		WmpsObj w = new WmpsObj(driver);
		SoftAssert softAssert = new SoftAssert();

		try {
			WMPS_Login("Approver_ID", "Approver_Password");
			Test.log(Status.PASS, "Logged in successfully as Approver");

			w.Second_Level();
			Test.log(Status.PASS, "Navigated to Second Level");

			w.ReviewApprovalCategory("Supplier Assignment Release");
			Test.log(Status.PASS, "Selected Review Approval Category: Supplier Assignment Release");

			w.Search_Button();
			Test.log(Status.PASS, "Clicked Search Button");

			int rowcount = xls.getRowCount("Material_Master");
			Test.log(Status.INFO, "Row count from Material_Master: " + rowcount);

			for (int i = 2; i <= 2; i++) {
				Test.log(Status.INFO, "Processing row " + i);

				String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
				String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
				String Vendor_Name_Manufacturer = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer", i);
				String Vendor_Name_Supplier = xls.getCellData("Excel_Data", "Vendor_Name_Supplier", i);
				String Vendor_Name_Supplier_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Supplier_Edit", i);
				String Vendor_Name_Manufacturer_Edit = xls.getCellData("Excel_Data", "Vendor_Name_Manufacturer_Edit",
						i);
				String DateToday = xls.getCellData("Date", "DateToday", i);
				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);

				w.Edit_Action_Button();
				Test.log(Status.PASS, "Clicked Edit Action Button");

				String tentativeDataText = driver.findElement(By.xpath("(//input[@type='date'])[1]"))
						.getAttribute("value");
				Test.log(Status.PASS, tentativeDataText);

				try {
					softAssert.assertEquals(DateToday, tentativeDataText, "Given Date and Getting Date is not matched");
					Test.log(Status.PASS, DateToday);
					Test.log(Status.PASS, "Assertion Passed: Given Date matches Getting Date");
				} catch (AssertionError e) {
					Test.log(Status.FAIL,
							"Assertion Failed: Given Date and Getting Date is not matched - " + e.getMessage());
				}

				w.Comments("Vendor_Master_Release");
				Test.log(Status.PASS, "Entered Comments: Vendor_Master_Release");

				w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
				Test.log(Status.PASS, "Performed Action Level Approver Action");

				w.Save_Button();
				Test.log(Status.PASS, "Clicked Save Button");

				w.Yes();
				Test.log(Status.PASS, "Clicked Yes");

				w.Password_Fill.sendKeys(Pro.getProperty("Approver_Password"));
				Test.log(Status.PASS, "Entered Approver Password");

				w.Submit_Button();
				Test.log(Status.PASS, "Clicked Submit Button");

				w.Ok_Button();
				Test.log(Status.PASS, "Clicked Ok Button");
			}
		} catch (Exception e) {
			Test.log(Status.FAIL, "Test failed with exception: " + e.getMessage());
			throw e;
		} finally {
			softAssert.assertAll(); // This will collect all the assertion failures and mark the test as failed if
			// any assertion failed.
			// extent.flush();
			// driver.close();
		}
	}
}
