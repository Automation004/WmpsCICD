package h_Transactions_Positive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_13_Goods_Issue_Mat_Req4X2 extends BaseClass
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
		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{

			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************

			WMPS_Login("441111","Password");
			w.WareHouse();
			w.Goods_Issue_Mat_Req();
			//w.SearchBox("");
			w.Edit_Action_Button();

			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[1]")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			//********************************Try to link this Number Excel to previous screen
			w.Type_Number_01("50");
			w.Type_Number_02("");
			w.SubmitText01();
		    w.CheckBox_1();//Outer checkbox for selecting Material


			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[2]")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			w.Type_Number_01("50");
			w.Type_Number_02("");
			w.SubmitText01();
		    w.CheckBox_2();//Outer checkbox for selecting Material

			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[3]")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			w.Type_Number_01("50");
			w.Type_Number_02("");
			w.SubmitText01();
		    w.CheckBox_3();//Outer checkbox for selecting Material

			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[4]")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			w.Type_Number_01("50");
			w.Type_Number_02("");
			w.SubmitText01();
		    w.CheckBox_4();//Outer checkbox for selecting Material


			w.Issue_Button();
			w.Yes();
			w.Password_Fill(InitiatorPassword);
			//w.SubmitType12();w.Ok();
}}}
