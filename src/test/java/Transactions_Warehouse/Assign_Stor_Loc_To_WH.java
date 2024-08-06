package Transactions_Warehouse;

import org.openqa.selenium.By;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class Assign_Stor_Loc_To_WH extends BaseClass
{

	@org.testng.annotations.Test
	public static void Ordertypr() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);
		HomePage hp=new HomePage(driver);
		Common_Xpath cxp=new Common_Xpath(driver);
		PWO_Xpath p=new PWO_Xpath(driver);
		DataFields df=new DataFields(driver);

		WMPS_Login("Initiator","Password");
		w.Menu();

		driver.findElement(By.xpath("(//*[contains(text(),'Assign Stor. Loc. To WH')])[1]")).click();
		w.Create();




		driver.close();

	}





}
