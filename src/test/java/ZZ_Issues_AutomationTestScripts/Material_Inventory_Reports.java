package ZZ_Issues_AutomationTestScripts;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;

public class Material_Inventory_Reports extends BaseClass {
	@Test
	public static void Create() throws Exception {
		Test = extent.createTest("Create Test");
		WmpsObj w = new WmpsObj(driver);
		try {
			int rowcount = xls.getRowCount("Material_Master");
			Test.log(Status.INFO, "Number of rows in Material_Master: " + rowcount);
			System.out.println(rowcount);

			for (int i = 2; i <= 2; i++) {
				// FOR SFG MAT ERIAL
				String Batch_Number_SFG_I = xls.getCellData("Dependency", "Batch_Number_SFG_I", i);
				// FOR RAW MATERIAL
				String MaterialMasterRM_Edit = xls.getCellData("Excel_Data", "MaterialMasterRM_Edit", i);
				String Batch_Number_RM_I = xls.getCellData("Dependency", "Batch_Number_RM_I", i);
				String Batch_Number_RM_II = xls.getCellData("Dependency", "Batch_Number_RM_II", i);

				String InitiatorPassword = xls.getCellData("Changable_Data", "InitiatorPassword", i);
				String ApproverPassword = xls.getCellData("Changable_Data", "ApproverPassword", i);
				String WrongPassword = xls.getCellData("Changable_Data", "WrongPassword", i);

				SoftAssert softAssert = new SoftAssert();

				WMPS_Login("Initiator", "Initiator_Password");
				Test.log(Status.PASS, "Logged in successfully as Initiator");

				w.Menu_Navigate();
				Test.log(Status.PASS, "Navigated to menu");

				w.Menu_Navigate();
				Test.log(Status.PASS, "Navigated to menu again");

				w.WareHouse();
				Test.log(Status.PASS, "Navigated to WareHouse");

				w.materialInventoriesReports();
				Test.log(Status.PASS, "Navigated to Material Inventories Reports");

				w.InventoryCard();
				Test.log(Status.PASS, "Navigated Inventory Card:");

				driver.findElement(By.xpath(
						"//div[@id='WOC2']//ng-select[@class='ng-select ng-select-single ng-select-searchable ng-select-clearable ng-untouched ng-pristine ng-valid']//input[@type='text']"))
						.sendKeys(MaterialMasterRM_Edit, Keys.ENTER);
				Test.log(Status.PASS, "Searched by Material Name:" + MaterialMasterRM_Edit);

				driver.findElement(By.xpath(
						"//div[@id='WOC2']//ng-select[@class='ng-select ng-select-single ng-select-searchable ng-select-clearable ng-untouched ng-pristine ng-invalid']//input[@type='text']"))
						.sendKeys(Batch_Number_RM_I, Keys.ENTER);
				Test.log(Status.PASS, "Searched Batch Number:" + Batch_Number_RM_I);

				driver.findElement(By.cssSelector("div[id='WOC2'] button[class='btn successBtn get']")).click();
				Test.log(Status.PASS, "Clicked Edit Action Button");

				// Locate the table cells
				List<WebElement> tableData = driver.findElements(By.xpath("//tr/td"));

				// Stream the table data and collect the text into a list
				List<String> cellTexts = tableData.stream().map(WebElement::getText).collect(Collectors.toList());

				// Print the collected cell texts
				cellTexts.forEach(System.out::println);
				Test.log(Status.PASS, "Table data" + cellTexts);

			}
		} catch (Exception e) {
			Test.log(Status.FAIL, e.getMessage());
			throw e;
		}
	}
}