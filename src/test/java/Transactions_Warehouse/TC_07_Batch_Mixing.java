package Transactions_Warehouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_07_Batch_Mixing extends BaseClass
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

		WMPS_Login("441111","Password");

		w.Menu_Navigate();
		w.Transactions();
		w.WareHouse();
		w.Batch_Mixing();
		w.Menu_Navigate();
		w.Create();

		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{

			String Material_Description =xls.getCellData("Excel_Data", "Material_Description", i);

			WebElement Material_Code = driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[1]"));
			Material_Code.sendKeys("Chloro_Form");Thread.sleep(2000);Thread.sleep(2000);
			Thread.sleep(2000);w.DropDown1Select();

			driver.findElement(By.xpath("//*[@formcontrolname='quantity']")).sendKeys("100");Thread.sleep(2000);

			driver.findElement(By.xpath("(//*[@class=\"ng-input\"])[2]")).click();Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[2]")).sendKeys("KG");
			w.DropDown1Select();


//			Select Action_Level_Select=new Select(driver.findElement(By.xpath("//*[@placeholder='--Select--']")));
//			Action_Level_Select.selectByVisibleText(" KG ");
//
			//Action_Level_Select.selectByIndex(2);Thread.sleep(2000);//Return
			Thread.sleep(2000);Thread.sleep(2000);Thread.sleep(2000);Thread.sleep(2000);Thread.sleep(2000);

//			WebElement ReceivedUom=driver.findElement(By.xpath("//*[@formcontrolname='uom']"));
//			ReceivedUom.sendKeys("ZINC_");
//			//ReceivedUom.selectByIndex(1);
//			Thread.sleep(2000);


//			driver.findElement(By.xpath("//*[@formcontrolname='postingDate']")).click();
//			Thread.sleep(2000);Thread.sleep(2000);Thread.sleep(2000);Thread.sleep(2000);
//			driver.findElement(By.xpath("(//button[contains(.,'Batch Determination')])")).click();
//
//			driver.findElement(By.xpath("(//button[contains(.,'Batch Mixing')])")).click();
//
//
//			driver.findElement(By.xpath("(//*[@type='text'])[10]")).sendKeys("50");Thread.sleep(2000);
//			driver.findElement(By.xpath("(//*[@type='text'])[13]")).sendKeys("50");Thread.sleep(2000);
//
//			w.CheckBox_2();w.CheckBox_3();
//
//			driver.findElement(By.xpath("(//button[contains(.,'Batch Mixing')])")).click();
//
//			w.Submit();
//			w.Yes();w.Password_Fill("321");w.TYPE_SUBMIT();w.OK_BUTTON();
//























		}}}
