package F.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataFields
{
	public WebDriver driver;
	public	WebDriverWait wait;//globally declared

	public DataFields(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}









//Inspection_Type_SK
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='inspectionType']")
	public WebElement Inspection_Type_SK;
	public void Inspection_Type_SK(String x) throws Exception
	{
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='inspectionType']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Inspection_Type_SK.clear();Thread.sleep(2500);
		Inspection_Type_SK.sendKeys(x);Thread.sleep(2500);
	}

//Material_Type_SK
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='materialType']")
	public WebElement Material_Type_SK;
	public void Material_Type_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='materialType']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Material_Type_SK.clear();
		Thread.sleep(1000);

		Material_Type_SK.sendKeys(x);
		Thread.sleep(1000);
	}

//TypeCode_SK
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='typeCode']")
	public WebElement TypeCode_SK;
	public void TypeCode_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='typeCode']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		TypeCode_SK.clear();
		Thread.sleep(1000);

		TypeCode_SK.sendKeys(x);
		Thread.sleep(1000);
	}


	//Storage_Location_SK
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='storageLocation']")
	public WebElement Storage_Location_SK;
	public void Storage_Location_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='storageLocation']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Storage_Location_SK.clear();
		Thread.sleep(2500);

		Storage_Location_SK.sendKeys(x);
		Thread.sleep(2500);
	}

	//Location_Description_SK
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='locationDescription']")
	public WebElement Location_Description_SK;
	public void Location_Description_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='locationDescription']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Location_Description_SK.clear();
		Thread.sleep(2500);

		Location_Description_SK.sendKeys(x);
		Thread.sleep(2500);
	}


	//Movement_Type_SK
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='movementType']")
	public WebElement Movement_Type_SK;
	public void Movement_Type_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='movementType']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Movement_Type_SK.clear();
		Thread.sleep(2500);

		Movement_Type_SK.sendKeys(x);
		Thread.sleep(2500);
	}

	//Manufacture_Block_SK
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='ManufactureblockName']")
	public WebElement Manufacture_Block_SK;
	public void Manufacture_Block_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='ManufactureblockName']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Manufacture_Block_SK.clear();
		Thread.sleep(2500);

		Manufacture_Block_SK.sendKeys(x);
		Thread.sleep(2500);
	}

//5
	//Inward_Type_SK
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='inwardType']")
	public WebElement Inward_Type_SK;
	public void Inward_Type_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='inwardType']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Inward_Type_SK.clear();
		Thread.sleep(2500);

		Inward_Type_SK.sendKeys(x);
		Thread.sleep(2500);
	}

	// 2. Material Group
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Material Group\")]")
	public WebElement MaterialGroup;
	public void MaterialGroupClick()
	{
		MaterialGroup.click();
	}
	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"description\"]")
	public WebElement description;
	public void descriptionsend(String x)
	{
		description.sendKeys(x);
	}
	public void descriptionClear()
	{
		description.clear();
	}

//Warehouse_SK

	@FindBy(how=How.XPATH,using="//*[@formcontrolname='warehouse']")
	public WebElement Warehouse_SK;
	public void Warehouse_SK(String x)
	{
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='warehouse']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Warehouse_SK.clear();
		Warehouse_SK.sendKeys(x);

	}

	//UOM_Name_SK
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='uomName']")
	public WebElement UOM_Name_SK;
	public void UOM_Name_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='uomName']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		UOM_Name_SK.clear();
		Thread.sleep(2500);

		UOM_Name_SK.sendKeys(x);
		Thread.sleep(2500);
	}

	@FindBy(how=How.XPATH,using="//*[@formcontrolname='uomCode']")
	public WebElement UOM_Code_SK;
	public void UOM_Code_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='uomCode']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		UOM_Code_SK.clear();
		Thread.sleep(2500);

		UOM_Code_SK.sendKeys(x);
		Thread.sleep(2500);
	}

	@FindBy(how=How.XPATH,using="//*[@formcontrolname='countryName']")
	public WebElement Country_SK;
	public void Country_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='countryName']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Country_SK.clear();
		Thread.sleep(2500);

		Country_SK.sendKeys(x);
		Thread.sleep(2500);
	}

	@FindBy(how=How.XPATH,using="//*[@formcontrolname='stateName']")
	public WebElement State_SK;
	public void State_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='stateName']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		State_SK.clear();
		Thread.sleep(2500);

		State_SK.sendKeys(x);
		Thread.sleep(2500);
	}

	// 3. Storage Location
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Storage Location\")]")
	public WebElement StorageLocation;
	public void StorageLocationClick()
	{
		StorageLocation.click();
	}




	// 4. WareHouse
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"WareHouse\")]")
	public WebElement WareHouse;
	public void WareHouseClick()
	{
		WareHouse.click();
	}


	// 5. Storage Condition
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Storage Condition\")]")
	public WebElement StorageCondition;
	public void StorageConditionClick()
	{
		StorageCondition.click();
	}
	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"storageCondition\"]")
	public WebElement storagecondition;
	public void storageconditionsend(String x)
	{
		storagecondition.sendKeys(x);
	}
	public void storageconditionClear()
	{
		storagecondition.clear();
	}



	// 7. ProcurmentType
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Procurement Type\")]")
	public WebElement ProcurmentType;
	public void ProcurmentTypeClick()
	{
		ProcurmentType.click();
	}
	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"procurmentType\"]")
	public WebElement procurmentType;
	public void procurmentTypesend(String x)
	{
		procurmentType.sendKeys(x);
	}
	public void procurmentTypeClear()
	{
		procurmentType.clear();
	}

	// 8. Rounding
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Rounding\")]")
	public WebElement Rounding;
	public void RoundingClick()
	{
		Rounding.click();
	}
	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"rounding\"]")
	public WebElement rounding;
	public void roundingsend(String x)
	{
		rounding.sendKeys(x);
	}
	public void roundingClear()
	{
		rounding.clear();
	}

	// 9. VendorType
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Vendor Type\")]")
	public WebElement VendorType;
	public void VendorTypeClick()
	{
		VendorType.click();
	}
	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"VendorType\"]")
	public WebElement vendorType;
	public void vendorTypesend(String x)
	{
		vendorType.sendKeys(x);
	}
	public void vendorTypeClear()
	{
		vendorType.clear();
	}

	// 10. BPRtype
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"BPR Type\")]")
	public WebElement BPRtype;
	public void BPRtypeClick()
	{
		BPRtype.click();
	}
	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"bprType\"]")
	public WebElement BprType;
	public void BprTypesend(String x)
	{
		BprType.sendKeys(x);
	}
	public void BprTypeClear()
	{
		BprType.clear();
	}

	// 11. InwardType
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Inward Type\")]")
	public WebElement InwardType;
	public void InwardTypeClick()
	{
		InwardType.click();
	}


	// 12. IndentType
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Indent Type\")]")
	public WebElement IndentType;
	public void IndentTypeClick()
	{
		IndentType.click();
	}
	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"indentType\"]")
	public WebElement indentType;
	public void indentTypesend(String x)
	{
		indentType.sendKeys(x);
	}
	public void indentTypeClear()
	{
		indentType.clear();
	}

	// 13. PackingType
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Packing Type\")]")
	public WebElement PackingType;
	public void PackingTypeClick()
	{
		PackingType.click();
	}
	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"packingType\"]")
	public WebElement packingType;
	public void packingTypesend(String x)
	{
		packingType.sendKeys(x);
	}
	public void packingTypeClear()
	{
		packingType.clear();
	}

	// 14. Manufacture Block
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Manufacture Block\")]")
	public WebElement ManufactureBlock;
	public void ManufactureBlockClick()
	{
		ManufactureBlock.click();
	}


	// 15. MovementType
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Movement Type\")]")
	public WebElement MovementType;
	public void MovementTypeClick()
	{
		MovementType.click();
	}


	// 16. CheckList
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Check List\")]")
	public WebElement CheckList;
	public void CheckListClick()
	{
		CheckList.click();
	}
	@FindBy(how=How.XPATH,using="(//*[@formcontrolname=\"menuid\"])[2]")
	public WebElement MenuID;
	public void MenuIDselect(String x)
	{
		Select c = new Select(MenuID);
		c.selectByVisibleText(x);
	}
	@FindBy(how=How.XPATH,using="(//*[@formcontrolname=\"subMenuid\"])[2]")
	public WebElement SubMenuID;
	public void SubMenuIDselect(String x)
	{
		Select c = new Select(SubMenuID);
		c.selectByVisibleText(x);
	}
	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"checkPoints\"]")
	public WebElement checkpoint;
	public void checkpointsend(String x)
	{
		checkpoint.sendKeys(x);
	}
	public void checkpointClear()
	{
		checkpoint.clear();
	}

//*****************************************************************************************
//	Order Type_SK
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='indentType']")
	public WebElement Order_Type_SK;
	public void Order_Type_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='indentType']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Order_Type_SK.clear();
		Thread.sleep(2500);

		Order_Type_SK.sendKeys(x);
		Thread.sleep(2500);
	}
//Label_Type_SK
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='labelTypeName']")
	public WebElement Label_Type_SK;
	public void Label_Type_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='labelTypeName']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Label_Type_SK.clear();
		Thread.sleep(2500);

		Label_Type_SK.sendKeys(x);
		Thread.sleep(2500);
	}

	//Packing_Type_SK
		@FindBy(how=How.XPATH,using="//*[@formcontrolname='packingType']")
		public WebElement Packing_Type_SK;
		public void Packing_Type_SK(String x) throws Exception
		{

			WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='packingType']"));
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

			Packing_Type_SK.clear();
			Thread.sleep(2500);

			Packing_Type_SK.sendKeys(x);
			Thread.sleep(2500);
		}

		//Packing_Type_SK
		@FindBy(how=How.XPATH,using="//*[@formcontrolname='pharmacopeia']")
		public WebElement Pharmacopeia_SK;
		public void Pharmacopeia_SK(String x) throws Exception
		{

			WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='pharmacopeia']"));
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

			Pharmacopeia_SK.clear();
			Thread.sleep(2500);

			Pharmacopeia_SK.sendKeys(x);
			Thread.sleep(2500);
		}

//Procurement_Type_SK
		@FindBy(how=How.XPATH,using="//*[@formcontrolname='procurmentType']")
		public WebElement Procurement_Type_SK;
		public void Procurement_Type_SK(String x) throws Exception
		{

			WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='procurmentType']"));
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

			Procurement_Type_SK.clear();
			Thread.sleep(2500);

			Procurement_Type_SK.sendKeys(x);
			Thread.sleep(2500);
		}

		//Rounding_SK
				@FindBy(how=How.XPATH,using="//*[@formcontrolname='rounding']")
				public WebElement Rounding_SK;
				public void Rounding_SK(String x) throws Exception
				{

					WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='rounding']"));
					JavascriptExecutor Js = (JavascriptExecutor) driver;
					Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

					Rounding_SK.clear();
					Thread.sleep(2500);

					Rounding_SK.sendKeys(x);
					Thread.sleep(2500);
				}

				//BPR_Type_SK
				@FindBy(how=How.XPATH,using="//*[@formcontrolname='bprType']")
				public WebElement BPR_Type_SK;
				public void BPR_Type_SK(String x) throws Exception
				{

					WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='bprType']"));
					JavascriptExecutor Js = (JavascriptExecutor) driver;
					Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

					BPR_Type_SK.clear();
					Thread.sleep(2500);

					BPR_Type_SK.sendKeys(x);
					Thread.sleep(2500);
				}

				//Dispatch_Type_SK
				@FindBy(how=How.XPATH,using="//*[@formcontrolname='dispatch']")
				public WebElement Dispatch_Type_SK;
				public void Dispatch_Type_SK(String x) throws Exception
				{

					WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='dispatch']"));
					JavascriptExecutor Js = (JavascriptExecutor) driver;
					Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

					Dispatch_Type_SK.clear();
					Thread.sleep(2500);

					Dispatch_Type_SK.sendKeys(x);
					Thread.sleep(2500);
				}

				//Storage_Condition_SK
				@FindBy(how=How.XPATH,using="//*[@formcontrolname='storageCondition']")
				public WebElement Storage_Condition_SK;
				public void Storage_Condition_SK(String x) throws Exception
				{

					WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='storageCondition']"));
					JavascriptExecutor Js = (JavascriptExecutor) driver;
					Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

					Storage_Condition_SK.clear();
					Thread.sleep(2500);

					Storage_Condition_SK.sendKeys(x);
					Thread.sleep(2500);
				}


				//Description_SK
				@FindBy(how=How.XPATH,using="//*[@formcontrolname='description']")
				public WebElement Description_SK;
				public void Description_SK(String x) throws Exception
				{

					WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='description']"));
					JavascriptExecutor Js = (JavascriptExecutor) driver;
					Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

					Description_SK.clear();
					Thread.sleep(2500);

					Description_SK.sendKeys(x);
					Thread.sleep(2500);
				}

//Market_Name_SK
				@FindBy(how=How.XPATH,using="//*[@formcontrolname='MarketName']")
				public WebElement Market_Name_SK;
				public void Market_Name_SK(String x) throws Exception
				{

					WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='MarketName']"));
					JavascriptExecutor Js = (JavascriptExecutor) driver;
					Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

					Market_Name_SK.clear();
					Thread.sleep(2500);

					Market_Name_SK.sendKeys(x);
					Thread.sleep(2500);
				}

				//Market_Code_SK
				@FindBy(how=How.XPATH,using="//*[@formcontrolname='MarketCode']")
				public WebElement Market_Code_SK;
				public void Market_Code_SK(String x) throws Exception
				{

					WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='MarketCode']"));
					JavascriptExecutor Js = (JavascriptExecutor) driver;
					Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

					Market_Code_SK.clear();
					Thread.sleep(2500);

					Market_Code_SK.sendKeys(x);
					Thread.sleep(2500);
				}

				//City_SK
				@FindBy(how=How.XPATH,using="//*[@formcontrolname='cityName']")
				public WebElement City_SK;
				public void City_SK(String x) throws Exception
				{

					WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='cityName']"));
					JavascriptExecutor Js = (JavascriptExecutor) driver;
					Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

					City_SK.clear();
					Thread.sleep(2500);

					City_SK.sendKeys(x);
					Thread.sleep(2500);
				}

				//	Country_Name_DD
				@FindBy(xpath = "//select[@formcontrolname='countryId']")
				WebElement Country_Name_DD;
				public void selectCountry_Name_DD() throws Exception
				{
					Select s=new Select(Country_Name_DD);
					s.selectByIndex(1);
					Thread.sleep(2500);
				}

				//	State_Name_DD
				@FindBy(xpath = "//select[@formcontrolname='sateId']")
				WebElement State_Name_DD;
				public void selectState_Name_DD() throws Exception
				{
					Select s=new Select(State_Name_DD);
					s.selectByIndex(1);
					Thread.sleep(2500);
				}


				// 2. Vendor_Master
				@FindBy(how=How.XPATH,using="//*[contains(text(),'Vendor Master')]")
				public WebElement Vendor_Master;
				public void Vendor_Master()
				{
					Vendor_Master.click();
				}


















				//1. MaterialMaster
				//Click on Material master type
				@FindBy(linkText = "Material Master")
				WebElement meterialmaster;
				public void materialmaster ()
				{
					meterialmaster.click();
				}

				//Meterial Type
				@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
				WebElement meterialtypeclick;
				public void meterialclick()
				{
					meterialtypeclick.click();
				}

				@FindBy(xpath = "(//*[@type=\"text\"])[1]")
				WebElement meterialtyptext;
				public void meterialtext(String materialtype)
				{
					meterialtyptext.sendKeys(materialtype);
				}

				@FindBy(xpath = "(//*[@class='ng-option-label ng-star-inserted'])[1]")
				WebElement meterialtype;
				public void meterialdata()
				{
					meterialtype.click();
				}

				//material Description
				@FindBy(xpath = "//input[@formcontrolname='materialDescription']")
				WebElement meterialdescription;
				public void meterialdescription(String Materialdescription)
				{
					meterialdescription.sendKeys(Materialdescription);
				}

				//material long Description
				@FindBy(xpath = "//input[@formcontrolname=\'materialLongDescription\']")
				WebElement meteriallongdescription;
				public void meteriallondescription(String meteriallondescription )
				{
					meteriallongdescription.sendKeys(meteriallondescription);
				}

				//stage
				@FindBy(xpath = "//input[@formcontrolname='stage']")
				WebElement stages;
				public void stage(String stage)
				{
					stages.sendKeys(stage);
				}

				//Meterial Group
				@FindBy(xpath = "(//span[@class=\"ng-arrow-wrapper\"])[2]")
				WebElement meterialgroupclick;
				public void meterialgroupclick()
				{
					meterialgroupclick.click();
				}
				//		@FindBy(xpath = "(//input[@type='text'])[5]")
				//		WebElement meterialgrouptext;
				//		public void meterialgrouptext()
				//		{
				//			meterialgrouptext.sendKeys("finished");
				//		}

				@FindBy(xpath = "(//div[@class=\'ng-option ng-option-marked\'])[1]")
				WebElement meterialgroup;
				public void meterialgroup()
				{
					meterialgroup.click();
				}


				//purchase uom
				@FindBy(xpath = "(//span[@class=\"ng-arrow-wrapper\"])[2]")
				WebElement purchaseuomclick;
				public void purchaseuomclick()
				{
					purchaseuomclick.click();
				}
				@FindBy(xpath = "(//*[@type=\"text\"])[6]")
				WebElement purchaseuomtexts;
				public void purchaseuomtext(String purchaseuomtext )
				{
					purchaseuomtexts.sendKeys(purchaseuomtext);
				}

				@FindBy(xpath = "(//div[@role='option'])[1]")
				WebElement purchaseuom;
				public void purchaseuom()
				{
					purchaseuom.click();
				}



				//material Code
				@FindBy(xpath = "//input[@formcontrolname='materialCode']")
				WebElement materialcodes;
				public void materialcode(String materialcode)
				{
					materialcodes.sendKeys(materialcode);
				}

				//material number Clear
				@FindBy(xpath = "//input[@formcontrolname=\'materialNumer\']")
				WebElement materialnumberclear;
				public void materialnumberclear()
				{
					materialnumberclear.clear();
				}
				//material number
				@FindBy(xpath = "//input[@formcontrolname=\'materialNumer\']")
				WebElement materialnumber;
				public void materialnumber(String Materialnumber)
				{
					materialnumber.sendKeys(Materialnumber);
				}


				//Basic unit of measurement
				@FindBy(xpath = "(//span[@class=\"ng-arrow-wrapper\"])[3]")
				WebElement basicunitofmeasurementclick;
				public void basicunitofmeasurementclick()
				{
					basicunitofmeasurementclick.click();
				}
				@FindBy(xpath = "(//input[@type='text'])[8]")
				WebElement basicunitofmeasurementtext;
				public void basicunitofmeasurementtext(String bum)
				{
					basicunitofmeasurementtext.sendKeys(bum);
				}


				//(//div[@role='option'])[1]
				@FindBy(xpath = "/html/body/app-root/div/div/app-material-master-create/div/div[2]/div/div/form/div[3]/div[1]/div/ng-select/div/span[2]/span")
				WebElement basicunitofmeasurement;
				public void basicunitofmeasurement()
				{
					basicunitofmeasurement.click();
				}

				//production starting year
				@FindBy(xpath = "//input[@formcontrolname='productionStartingYear']")
				WebElement productionstartingyear;
				public void productionstartingyear(String year)
				{
					productionstartingyear.sendKeys(year);
				}

				//Procurement Type   (//span[@class=\"ng-arrow-wrapper\"])[5]
				@FindBy(xpath = "(//input[@type='text'])[11]")
				WebElement ProcurementTypeclick;
				public void ProcurementTypeclick()
				{
					ProcurementTypeclick.click();
				}
				@FindBy(xpath = "(//input[@type='text'])[11]")
				WebElement ProcurementTypetext;
				public void ProcurementTypetext(String procurement)
				{
					ProcurementTypetext.sendKeys(procurement);
				}

				@FindBy(xpath = "(//div[@role='option'])[1]")
				WebElement ProcurementType;
				public void ProcurementType()
				{
					ProcurementType.click();
				}

				//Storage Conditions
				@FindBy(xpath = "(//span[@class=\"ng-arrow-wrapper\"])[4]")
				WebElement StorageConditionsclick;
				public void StorageConditionsclick()
				{
					StorageConditionsclick.click();
				}
				@FindBy(xpath = "(//input[@type='text'])[9]")
				WebElement StorageConditionstext;
				public void StorageConditionstext(String storage)
				{
					StorageConditionstext.sendKeys(storage);
				}

				@FindBy(xpath = "(//div[@role='option'])[1]")
				WebElement StorageConditions;
				public void StorageConditions()
				{
					StorageConditions.click();
				}


				//Specification / STP No.
				@FindBy(xpath = "//input[@formcontrolname='stpNo']")
				WebElement stp;
				public void stp(String stps)
				{
					stp.sendKeys(stps);
				}


				//Rounding
				@FindBy(xpath = "(//span[@class=\"ng-arrow-wrapper\"])[6]")
				WebElement Roundingclick;
				public void Roundingclick()
				{
					Roundingclick.click();
				}
				@FindBy(xpath = "(//input[@type='text'])[12]")
				WebElement Roundingclicktext;
				public void Roundingclicktext(String rounding)
				{
					Roundingclicktext.sendKeys(rounding);
				}



				//ihbRequired
				@FindBy(xpath = "(//input[@name='radio'])[2]")
				WebElement ihbRequired;
				public void ihbRequired()
				{
					ihbRequired.click();
				}

				//Alternate uom
				@FindBy(xpath = "(//input[@type='number'])[1]")
				WebElement Alternateuom;
				public void Alternateuom(String alteruom)
				{
					Alternateuom.sendKeys(alteruom);
				}


				@FindBy(xpath = "//*[@id=\"r\"]/td[3]/select")
				WebElement Altuom;
				public void Altuom(String auom)
				{
					Select alt=new Select(Altuom);
					alt.selectByVisibleText(auom);
				}

				@FindBy(xpath = "(//input[@type='number'])[2]")
				WebElement Altuomyear;
				public void Altuomyear(String altyear)
				{
					Altuomyear.sendKeys(altyear);
				}

				//Quality Management
				@FindBy(linkText = "Quality Management")
				WebElement QualityManagement;
				public void QualityManagement()
				{
					QualityManagement.click();
				}

				//Inspect intervel period
				@FindBy(xpath = "(//input[@type='number'])[3]")
				WebElement Inspectintervelperiod;
				public void Inspectintervelperiod(String inspectintP)
				{
					Inspectintervelperiod.sendKeys(inspectintP);
				}

				//inspectYear
				@FindBy(xpath = "//*[@id=\"WOC1\"]/div/div[1]/div[2]/div/select")
				WebElement inspectYear;
				public void inspectYear(String inspectyear)
				{
					Select alt=new Select(inspectYear);
					alt.selectByVisibleText(inspectyear);
				}

				//inspectiontype
				@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[7]")
				WebElement inspectiontype;
				public void inspectiontype()
				{
					inspectiontype.click();
				}

				@FindBy(xpath = "(//div[@role='option'])[1]")
				WebElement inspectiontypeClick;
				public void inspectiontypeClick()
				{
					inspectiontypeClick.click();
				}


				//Storage Locations
				@FindBy(linkText = "Storage Locations")
				WebElement StorageLocations;
				public void StorageLocations()
				{
					StorageLocations.click();
				}


				//Storage
				@FindBy(xpath = "(//span[@class=\"ng-arrow-wrapper\"])[8]")
				WebElement Storageclick;
				public void Storageclick()
				{
					Storageclick.click();
				}

				@FindBy(xpath = "(//input[@type='text'])[17]")
				WebElement Storagetext;
				public void Storagecktext(String Storage)
				{
					Storagetext.sendKeys(Storage);
				}

				@FindBy(xpath = "(//div[@role='option'])[1]")
				WebElement Storage;
				public void Storage()
				{
					Storage.click();
				}



				// 2. VendorMaster
				@FindBy(how=How.XPATH,using="//*[contains(text(),'Vendor Master')]")
				public WebElement Vendor;
				public void VendorClick()
				{
					Vendor.click();
				}

				@FindBy(how=How.XPATH,using="//*[@formcontrolname='vendorType']")
				public WebElement VendorType_DD;
				//public void vendorTypeselect(String x)
				public void VendorType_DDselect()
				{
					Select c = new Select(VendorType_DD);
					//c.selectByVisibleText(x);
					c.selectByIndex(1);
				}


				@FindBy(how=How.XPATH,using="//*[@formcontrolname='vendorName']")
				public WebElement Vendorname;
				public void VendornameSend(String x)
				{
					Vendorname.sendKeys(x);
				}
				@FindBy(how=How.XPATH,using="//*[@formcontrolname='vendorAddress']")
				public WebElement address;
				public void addressSend(String x)
				{
					address.sendKeys(x);
				}
				public void addressClear()
				{
					address.clear();
				}
				@FindBy(how=How.XPATH,using="//*[@formcontrolname='cityId']")
				public WebElement city;
				//public void citySend(String x)
				public void citySend()

				{
					//city.sendKeys(x);

				}
				@FindBy(how=How.XPATH,using="//*[@formcontrolname='postalCode']")
				public WebElement postal;
				public void postalSend(String x)
				{
					postal.sendKeys(x);
				}
				@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"country\"]")
				public WebElement country;
				public void countryselect(String x)
				{
					Select c = new Select(country);
					c.selectByVisibleText(x);
				}
				@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"state\"]")
				public WebElement state;
				public void stateselect(String x)
				{
					Select c = new Select(state);
					c.selectByVisibleText(x);
				}
				@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"vendorStatus\"]")
				public WebElement vendorStatus;
				public void vendorStatusselect(String x)
				{
					Select c = new Select(vendorStatus);
					c.selectByVisibleText(x);
				}
				@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"todate\"]")
				public WebElement todate;
				public void todateSend(String x)
				{
					todate.sendKeys(x);
				}
				@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"fromDate\"]")
				public WebElement fromdate;
				public void fromdateSend(String x)
				{
					fromdate.sendKeys(x);
				}
				@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"tentativeDate\"]")
				public WebElement tentativedate;
				public void tentativedateSend(String x)
				{
					tentativedate.sendKeys(x);
				}

				// 3. Manufacture Assignment
				@FindBy(how=How.XPATH,using="//*[contains(text(),\"Manufacture Assignment\")]")
				public WebElement Manufacture;
				public void manufactureClick()
				{
					Manufacture.click();
				}
				@FindBy(how=How.XPATH,using="(//*[@type=\"text\"])[1]")
				public WebElement materialName;
				public void materialNameSend(String x) throws Exception
				{
					materialName.sendKeys(x);
					Thread.sleep(2000);
					materialName.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					Thread.sleep(2000);
				}
				@FindBy(how=How.XPATH,using="(//*[@type=\"text\"])[2]")
				public WebElement ManufacturerName;
				public void ManufacturerNameSend(String x) throws Exception
				{
					ManufacturerName.sendKeys(x);
					Thread.sleep(2000);
					ManufacturerName.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					Thread.sleep(2000);
				}
				public void ManufacturerNameClear()
				{
					ManufacturerName.clear();
				}
				public void ManufacturerNameClick()
				{
					ManufacturerName.click();
				}

				//4. Supplier Assignment
				@FindBy(linkText = "Supplier Assignment")
				WebElement supplierAssignment;
				public void supplierAssignment ()
				{
					supplierAssignment.click();
				}

				//Material Name
				@FindBy(xpath = "(//input[@type='text'])[1]")
				WebElement MaterialName;
//				@FindBy(xpath="(//div[@class='ng-option ng-option-marked'])[1]")
//				WebElement materialdown;
				public void MaterialName(String text) throws Exception
				{
					MaterialName.sendKeys(text);
					Thread.sleep(2000);
					Nameofthemanufactureclick.click();
				}
				//Manfacturer Name
				@FindBy(xpath = "(//input[@type='text'])[2]")
				WebElement ManfacturerName;
				public void ManfacturerName(String text) throws Exception
				{
					ManfacturerName.sendKeys(text);
					Thread.sleep(2000);

				}

				//Name of the manufacture
				@FindBy(xpath = "//*[@id=\"manufactureCode\"]/option[1]")
				WebElement Nameofthemanufactureclick;
				public void Nameofthemanufactureclick()
				{
					Nameofthemanufactureclick.click();
				}
				//Name of the Supplier
				@FindBy(xpath = "//input[@formcontrolname='SupplierName']")
				WebElement NameoftheSupplier;
				public void NameoftheSupplier(String text)
				{
					NameoftheSupplier.sendKeys(text);
				}
				//Name of the Supplier
				@FindBy(xpath = "//*[@id=\"codes\"]/option[1]")
				WebElement NameoftheSupplierclick;
				public void NameoftheSupplierclick()
				{
					NameoftheSupplierclick.click();
				}
				////*[@id="codes"]/option[1]


				//Remarks
				@FindBy(xpath = "//input[@formcontrolname='remarks']")
				WebElement Remarks;
				public void Remarks(String text)
				{
					Remarks.sendKeys(text);
				}
				//Remarks
				@FindBy(xpath = "//input[@formcontrolname='remarks']")
				WebElement Remarksclear;
				public void Remarksclear()
				{
					Remarksclear.clear();
				}
}

