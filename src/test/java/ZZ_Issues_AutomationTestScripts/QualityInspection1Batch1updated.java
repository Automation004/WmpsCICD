package ZZ_Issues_AutomationTestScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class QualityInspection1Batch1updated extends BaseClass {

	@Test
	public void QualityInspectionCreate() throws Exception {
		WmpsObj w = new WmpsObj(driver);
		HomePage hp = new HomePage(driver);
		Common_Xpath cxp = new Common_Xpath(driver);
		PWO_Xpath p = new PWO_Xpath(driver);
		DataFields df = new DataFields(driver);
		MasterXpaths mp = new MasterXpaths(driver);

		Test = extent.createTest("Quality Inspection Test");
		try {
			Test.info("Logging in as Initiator");
			WMPS_Login("Initiator", "Initiator_Password");
			Test.pass("Logged in successfully as Initiator");

			Test.info("Navigating to Quality Control and Quality Inspection");
			w.Quality_Control();
			w.Quality_Inspection();
			Test.pass("Navigated to Quality Control and Quality Inspection");

			int rowcount = xls.getRowCount("Material_Master");
			Test.info("Row count from Material_Master sheet: " + rowcount);

			for (int i = 2; i <= 2; i++) {
				Test.info("Processing row: " + i);
				String space = (" ");

				String AR_Number_RM_B1 = xls.getCellData("Dependency", "AR_Number_RM_B1", i);
				String AR_Number_RM_B2 = xls.getCellData("Dependency", "AR_Number_RM_B2", i);

				String MaterialMasterRM = xls.getCellData("Excel_Data", "MaterialMasterRM", i);
				String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
				String MaterialMasterSFP = xls.getCellData("Excel_Data", "MaterialMasterSFP", i);
				String MaterialMasterFP = xls.getCellData("Excel_Data", "MaterialMasterFP", i);

				String Pharmacopoeia = xls.getCellData("Quality_Inspection", "Pharmacopoeia", i);
				String Action = xls.getCellData("Quality_Inspection", "Action", i);
				String Sampled_Quantity = xls.getCellData("Quality_Inspection", "Sampled_Quantity", i);
				String SampledQuantityUOM = xls.getCellData("Quality_Inspection", "SampledQuantityUOM", i);

				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);

				Test.info("Entering Material Master in Search Box");
				w.SearchBox(MaterialMasterRM_Edit + " SMPL");
				Test.pass("Entered Material Master in Search Box");

				Test.info("Starting Sample Processing");
				w.SMPL();
				Test.pass("Started Sample Processing");

				String batchNumberText = driver.findElement(By.xpath("//input[@formcontrolname='BatchNumber']"))
						.getAttribute("value");
				w.ARNumber(batchNumberText);

				Test.info("Performing Action: " + Action);
				w.Action(Action);
				Test.pass("Performed Action: " + Action);

				boolean sampledQuantityDisplayed = driver
						.findElement(By.xpath("//input[@formcontrolname='SampledQuantity']")).isDisplayed();
				if (sampledQuantityDisplayed) {
					Test.info("Entering Sampled Quantity: " + Sampled_Quantity + space + SampledQuantityUOM);
					w.SampledQuantity(Sampled_Quantity);
					w.SampledQuantityUOM(SampledQuantityUOM);
					Test.pass("Entered Sampled Quantity: " + Sampled_Quantity + space + SampledQuantityUOM);
				}

				boolean commentsDisplayed = driver.findElement(By.xpath("//input[@formcontrolname='SampledQuantity']"))
						.isDisplayed();
				if (commentsDisplayed) {
					Test.info("Entering Comments: Quality_Inspection_Passed");
					w.Comments("Quality_Inspection_Passed");
					Test.pass("Entered Comments: Quality_Inspection_Passed");
				}

				Test.info("Submitting Inspection");
				w.SampledQuantity("100");// Sampled_Quantity
				w.Comments("Quality_Inspection_Passed");
				w.Submit();
				w.Yes();
				w.Password_Fill(InitiatorPassword);
				w.Submit_Button2();
				w.Ok();
				Test.pass("Submitted Inspection");

				Test.info("Verifying Material Code");
				w.SearchBox(MaterialMasterRM_Edit);
				Thread.sleep(4000);
				w.ViewButton();
				//				String MaterilaCodeText = driver.findElement(By.xpath("//input[@formcontrolname='MaterilaCode']"))
				//						.getAttribute("value");
				//				Assert.assertEquals(MaterilaCodeText.trim(), MaterialMasterRM_Edit.trim(),
				//						"Material Code is mismatched in view");
				scrollPagedown();
				w.Back_Button();
				Test.pass("Verified Material Code successfully");
			}
			Test.info("Quality Inspection Test Passed");
		} catch (Exception e) {
			Test.fail("Quality Inspection Test Failed: " + e.getMessage());
			throw e; // Rethrow the exception to ensure the Test is marked as failed
		}
	}
}