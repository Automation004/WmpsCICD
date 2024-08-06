package h_Transactions_Positive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_19_Dispatch_Request_FP extends BaseClass
{

	@org.testng.annotations.Test
	public static void Dispatch_Request() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);
		HomePage hp=new HomePage(driver);
		Common_Xpath cxp=new Common_Xpath(driver);
		PWO_Xpath p=new PWO_Xpath(driver);
		DataFields df=new DataFields(driver);
		MasterXpaths mp =new MasterXpaths(driver);

		WMPS_Login("Initiator","Initiator_Password");
		w.Menu_Navigate();w.Menu_Navigate();
		w.Pharma_Dispatch();
		w.Dispatch_Request();
		w.Create();

		int rowcount = xls.getRowCount("DispatchRequest");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			//***************************************************************************************************************
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//***************************************************************************************************************
			String CustomerPONumber =xls.getCellData("DispatchRequest", "CustomerPONumber", i);
			String CustomerPOQuantity =xls.getCellData("DispatchRequest", "CustomerPOQuantity", i);
			String DispatchType =xls.getCellData("DispatchRequest", "DispatchType", i);
			String CustomerName =xls.getCellData("DispatchRequest", "CustomerName", i);
			String Market =xls.getCellData("DispatchRequest", "Market", i);
			String Remarks =xls.getCellData("DispatchRequest", "Remarks", i);
			String PharmaCopeia =xls.getCellData("DispatchRequest", "PharmaCopeia", i);

			String DispatchedQuantity=xls.getCellData("DispatchRequest", "DispatchedQuantity", i);

			String NumberOfContainers=xls.getCellData("DispatchRequest", "NumberOfContainers", i);

			String PackingDetails=xls.getCellData("DispatchRequest", "PharmaCopeia", i);
			String PackingMode=xls.getCellData("DispatchRequest", "PackingMode", i);
			String product_code =xls.getCellData("Bill_Of_Material", "productcode_finished", i);
			String nu_of_container =xls.getCellData("Goods_ReceiptWith_WithOut", "no_of_container", i);
			String MaterialMasterFP=xls.getCellData("Excel_Data", "MaterialMasterFP", i);//New Semifinished Material Upper Part


			w.CustomerPONumber(CustomerPONumber);
			w.CustomerPOQuantity(CustomerPOQuantity);
			w.DispatchType(DispatchType);
			w.TT_2(CustomerName);

			w.TT_4(MaterialMasterFP);

			w.Market("I");
			w.PharmaCopeia("P");
			w.Remarks(Remarks);
			w.Get_Button();

			WebElement DispatchedQuantity1 = driver.findElement(By.xpath("(//*[@type='number'])[2]"));
			DispatchedQuantity1.click();
			DispatchedQuantity1.clear();
			DispatchedQuantity1.sendKeys(DispatchedQuantity);Thread.sleep(2000);


			WebElement NumberOfContainers1 = driver.findElement(By.xpath("(//*[@type='number'])[3]"));
			NumberOfContainers1.click();
			NumberOfContainers1.clear();
			NumberOfContainers1.sendKeys(NumberOfContainers);Thread.sleep(2000);


		//	PackingDetails
			WebElement PackingDetails1 = driver.findElement(By.xpath("(//*[@type='search'])[2]"));Thread.sleep(2000);
			PackingDetails1.click();
			PackingDetails1.clear();
			PackingDetails1.sendKeys(PackingDetails);Thread.sleep(2000);


			WebElement PackingMode11 = driver.findElement(By.xpath("/html/body/app-root/div/div/app-dispatchrequest/div/div[2]/div[2]/div[2]/div[1]/div/table/tbody/tr/td[10]/select"));Thread.sleep(2000);
			PackingMode11.click();
			PackingMode11.sendKeys("P");Thread.sleep(2000);


			w.CheckBox_1();









			//w.Type_Button_2();
			w.Yes();
			//w.Password_Fill("321");
//*****************************************************************************************************88
			//driver.navigate().back();

			//driver.navigate().refresh();


		}}}
