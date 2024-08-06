package C1_Transactions_SemiFinished_Product_Create;

import org.openqa.selenium.By;

import F.pageobjects.Common_Xpath;
import F.pageobjects.DataFields;
import F.pageobjects.HomePage;
import F.pageobjects.MasterXpaths;
import F.pageobjects.PWO_Xpath;
import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_07_01_Goods_Issue_01_SFP_01_16x2 extends BaseClass
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
			//****************************************************************************************************
			String Batch_Number_SFG_I =xls.getCellData("Dependency", "Batch_Number_SFG_I", i);//*****************
			String Batch_Number_SFG_II =xls.getCellData("Dependency", "Batch_Number_SFG_II", i);//*****************


			String Batch_Number_II =xls.getCellData("Dependency", "Batch_Number_II", i);//For Semifinished Product
			String Batch_Number_FP =xls.getCellData("Dependency", "Batch_Number_FP", i);//************************
			//****************************************************************************************************
			//MaterialMasterFP
			String InitiatorPassword =xls.getCellData("Changable_Data", "InitiatorPassword", i);
			String ApproverPassword=xls.getCellData("Changable_Data", "ApproverPassword", i);
			String WrongPassword =xls.getCellData("Changable_Data", "WrongPassword", i);
			//****************************************************************************************************
			WMPS_Login("Initiator","Initiator_Password");
			w.Menu_Navigate();w.Menu_Navigate();
			w.WareHouse();
			w.Goods_Issue_Mat_Req();
			//****************************************************************************************************
			w.SearchBox(Batch_Number_SFG_II);//************************
			//****************************************************************************************************
			w.Edit_Action_Button();
			//Batch No Selection

			//********************************Try to link this Number Excel to previous screen
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[1]")).click();
			w.TT_2("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[2]")).click();
			w.TT_3("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[3]")).click();
			Thread.sleep(4000);
			w.TT_4("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[4]")).click();
			w.TT_5("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[5]")).click();
			w.TT_6("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[6]")).click();
			w.TT_7("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[7]")).click();
			w.TT_08("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[8]")).click();
			w.TT_09("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[9]")).click();
			w.TT_10("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[10]")).click();
			w.TT_11("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[11]")).click();
			w.TT_12("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[12]")).click();
			w.TT_13("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[13]")).click();
			w.TT_14("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[14]")).click();
			w.TT_15("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[15]")).click();
			w.TT_16("50");//Issued Quantity
			w.Submit_Button();
			driver.findElement(By.xpath("(//a[contains(text(),'Select')])[16]")).click();
			w.TT_17("50");//Issued Quantity
			w.Submit_Button();

			w.CheckBox_1();//Outer checkbox for selecting Material
			w.CheckBox_2();//Outer checkbox for selecting Material
			w.CheckBox_3();//Outer checkbox for selecting Material
			w.CheckBox_4();//Outer checkbox for selecting Material
			w.CheckBox_5();//Outer checkbox for selecting Material
			w.CheckBox_6();//Outer checkbox for selecting Material
			w.CheckBox_7();//Outer checkbox for selecting Material
			w.CheckBox_8();//Outer checkbox for selecting Material
			w.CheckBox_9();//Outer checkbox for selecting Material
			w.CheckBox_10();//Outer checkbox for selecting Material
			w.CheckBox_11();//Outer checkbox for selecting Material
			w.CheckBox_12();//Outer checkbox for selecting Material
			w.CheckBox_13();//Outer checkbox for selecting Material
			w.CheckBox_14();//Outer checkbox for selecting Material
			w.CheckBox_15();//Outer checkbox for selecting Material
			w.CheckBox_16();//Outer checkbox for selecting Material



			w.Issue_Button();
			w.Yes();
			w.Password_Fill(InitiatorPassword);
			w.Submit_Button();w.Ok();
			//****************************************************************************************************
			w.SearchBox(Batch_Number_SFG_II);//*****************************
			//****************************************************************************************************
			w.ViewButton2();
			scrollPagedownSlow();

		}}}
