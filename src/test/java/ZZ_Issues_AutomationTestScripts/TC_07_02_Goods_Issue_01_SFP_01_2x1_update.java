package ZZ_Issues_AutomationTestScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class TC_07_02_Goods_Issue_01_SFP_01_2x1_update extends BaseClass {
	static String Batch_Number_SFG_I;
	static WmpsObj w;
	static String ApproverPassword;

	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception {
		w = new WmpsObj(driver);
		int rowcount = xls.getRowCount("Material_Master");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		System.out.println(rowcount);
		for (int i = 2; i <= 2; i++) {
			// ****************************************************************************************************
			Batch_Number_SFG_I = xls.getCellData("Dependency", "Batch_Number_SFG_I", i);// *****************
			String Batch_Number_II = xls.getCellData("Dependency", "Batch_Number_II", i);// For Semifinished Product
			String Batch_Number_FP = xls.getCellData("Dependency", "Batch_Number_FP", i);// ************************
			// ****************************************************************************************************
			// MaterialMasterFP
			String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
			ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);
			// ****************************************************************************************************
			WMPS_Login("Initiator", "Initiator_Password");
			w.Menu_Navigate();
			w.Menu_Navigate();
			w.WareHouse();
			w.Goods_Issue_Mat_Req();
			// ****************************************************************************************************
			w.SearchBox(Batch_Number_SFG_I);// *****************************
			// ****************************************************************************************************
			w.Edit_Action_Button();
			// Batch No Selection
			WebElement MaterialNameText1 = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("tbody tr:nth-child(1) td:nth-child(3)")));
			WebElement MaterialNameText2 = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("tbody tr:nth-child(2) td:nth-child(3)")));

			String Material1Text = MaterialNameText1.getText();
			System.out.println("Material1Text: " + Material1Text);

			String Material2Text = MaterialNameText2.getText();
			System.out.println("Material2Text: " + Material2Text);

			List<WebElement> tableData = driver.findElements(By.xpath("//tr/td"));
			System.out.println("Table data count: " + tableData.size());
			// Find all rows in the table
			List<WebElement> rows = driver.findElements(By.cssSelector("tbody tr"));

			for (WebElement row : rows) {
				// Get the text from the third cell of the row
				WebElement cell = row.findElement(By.cssSelector("td:nth-child(3)"));
				String cellText = cell.getText();
				System.out.println("cellText " + cellText);

				// Check if the cell text matches either of the raw materials
				if (cellText.equals(Material1Text) || cellText.equals(Material2Text)) {
					// Find the checkbox in this row and click it
					WebElement checkbox = row.findElement(By.cssSelector("td:nth-child(1) input[type='checkbox']"));
					if (!checkbox.isSelected()) {
						checkbox.click();
					}
				}
			}
			// ********************************Try to link this Number Excel to previous
			// screen
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[1]")).click();
			w.TT_2("50");// Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[2]")).click();
			w.TT_3("50");// Issued Quantity
			w.Submit_Button();
			w.Issue_Button();
			w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button();
			w.Ok();
			// ****************************************************************************************************
			w.SearchBox(Batch_Number_SFG_I);
			// ****************************************************************************************************
			w.ViewButton();
		}
	}

	@Test(dependsOnMethods = { "Ordertypr" })
	public static void goodsIssueRqstRelease() throws Exception {
		Thread.sleep(2000);
		suiteSetUp();
		WMPS_Login("Approver_ID", "Approver_Password");// HETERO
		w.Menu_Navigate();
		w.Menu_Navigate();
		w.Second_Level();
		w.ReviewApprovalCategory("Goods Issue ag(st) Mat Req Release");
		w.Search_Button();
		// ********************************************************************************************************************
		w.SearchBox(Batch_Number_SFG_I);
		// w.SearchBox(Pro.getProperty("SemiFinished_Product1"));Thread.sleep(2500);
		// w.SearchBox(Pro.getProperty("SemiFinished_Product2"));Thread.sleep(2500);
		// ********************************************************************************************************************
		w.Edit_Action_Button();
		// ****************************************************************************************************
		// w.ActionLevelApproverAction(Status);
		w.ActionLevelApproverAction(Pro.getProperty("Action_1"));
		// ****************************************************************************************************
		w.Comments("Batch_Order_Release");
		Thread.sleep(2000);
		w.Submit();
		w.Yes();
		w.Password_Fill(ApproverPassword);
		w.Submit_Button2();
		w.Ok();
		// ********************************************************************************************************************
		w.SearchBox(Batch_Number_SFG_I);
		// ********************************************************************************************************************
		w.ViewButton();
		w.Back_Button2();

	}
}
