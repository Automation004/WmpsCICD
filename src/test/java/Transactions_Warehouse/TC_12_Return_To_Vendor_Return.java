package Transactions_Warehouse;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import F.pageobjects.WmpsObj;
import F.utilities.BaseClass;


public class TC_12_Return_To_Vendor_Return extends BaseClass
{

	@org.testng.annotations.Test
	public static void Return_To_Vendor_Return() throws Exception
	{
		WmpsObj w=new WmpsObj(driver);


		int rowcount = xls.getRowCount("Material_Master");
		System.out.println(rowcount);
		for(int i=2; i<=2;i++)
		{
			String Material_Description =xls.getCellData("Excel_Data", "Material_Description", i);


			WMPS_Login("441122","Password");
			w.Menu_Navigate();
			w.Second_Level();
			Select Review_Approval_Category=new Select(driver.findElement(By.xpath("//*[@formcontrolname='Category']")));
			Review_Approval_Category.selectByIndex(18);Thread.sleep(2000);
			w.Search_Button();
			w.SearchBox(Material_Description);
			w.Edit_Action_Button();
			w.Comments_Id("Return_To_Vendor_Return");Thread.sleep(2000);
			Select Action_Level_Select=new Select(driver.findElement(By.xpath("//*[@id='actionLevel']")));
			Action_Level_Select.selectByIndex(2);Thread.sleep(2000);//Return
			w.Submit();Thread.sleep(2000);
//			w.Yes();w.Password_Fill("321");w.TYPE_SUBMIT2();w.OK_BUTTON();
			}}}
