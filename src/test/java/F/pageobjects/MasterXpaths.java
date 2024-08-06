package F.pageobjects;

import java.util.concurrent.TimeUnit;

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

public class MasterXpaths {

	public WebDriver driver;
	public	WebDriverWait wait;//globally declared

	public MasterXpaths(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//0. Master
	@FindBy(xpath= "(//a[contains(text(),'Master')])[1]")
	WebElement Master_Click;
	public void Master_Click () throws Exception
	{
		Master_Click.click();
		Thread.sleep(1500);
	}
	//1. MaterialMaster
	@FindBy(xpath= "(//a[contains(text(),'Material Master')])[1]")
	WebElement Material_Master;
	public void Material_Master () throws Exception
	{
		Material_Master.click();
		Thread.sleep(1500);
	}


	@FindBy(xpath= "(//a[contains(text(),'Product Requirement')])[1]")
	WebElement Product_Requirement;
	public void Product_Requirement () throws Exception
	{
		Product_Requirement.click();
		Thread.sleep(500);
	}
	//Meterial_Type_Text
	@FindBy(xpath = "(//*[@type='text'])[1]")
	WebElement Meterial_Type_Text;
	public void Meterial_Type_Text(String x) throws InterruptedException
	{

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		Meterial_Type_Text.sendKeys(x);
		Thread.sleep(500);Thread.sleep(500);
		Meterial_Type_Text.sendKeys(Keys.ENTER);
		Thread.sleep(500);
	}
	//Meterial_Type_Select
	@FindBy(xpath = "(//*[@class='ng-option-label ng-star-inserted'])[1]")
	WebElement Meterial_Type_Select;
	public void Meterial_Type_Select() throws Exception
	{
		//		WebElement Color = driver.findElement(By.xpath("(//*[@class='ng-option-label ng-star-inserted'])[1]"));
		//		JavascriptExecutor Js = (JavascriptExecutor) driver;
		//		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Meterial_Type_Select.click();
		Thread.sleep(500);
	}

	//Material_Description_SK

	@FindBy(xpath = "//input[@formcontrolname='materialDescription']")
	WebElement Material_Description_SK;
	public void Material_Description_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='materialDescription']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Material_Description_SK.clear();
		Thread.sleep(500);

		Material_Description_SK.sendKeys(x);
		Thread.sleep(500);
	}

	//Material_Long_Description_SK

	@FindBy(xpath = "//input[@formcontrolname='materialLongDescription']")
	WebElement Material_Long_Description_SK;
	public void Material_Long_Description_SK(String x) throws Exception
	{
		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='materialLongDescription']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Material_Long_Description_SK.clear();
		Thread.sleep(500);
		Material_Long_Description_SK.sendKeys(x);
		Thread.sleep(500);
	}

	//Stage_SK

	@FindBy(xpath = "//input[@formcontrolname='stage']")
	WebElement Stage_SK;
	public void Stage_SK(String s) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='stage']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Stage_SK.sendKeys(s);
		Thread.sleep(500);
	}

	//Meterial Group

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
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

	@FindBy(xpath = "(//div[@class='ng-option ng-option-marked'])[1]")
	WebElement meterialgroup;
	public void meterialgroup()
	{
		meterialgroup.click();
	}


	//Purchase_UOM_Text

	@FindBy(xpath = "(//*[@type='text'])[6]")
	WebElement Purchase_UOM_Text;
	public void Purchase_UOM_Text(String x )
	{

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[6]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		Purchase_UOM_Text.sendKeys(x);
	}
	//Purchase_UOM_Select

	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement Purchase_UOM_Select;
	public void Purchase_UOM_Select() throws Exception
	{

		Purchase_UOM_Select.click();
		Thread.sleep(500);

	}

	//Material_Number_SK

	@FindBy(xpath = "//input[@formcontrolname='materialNumer']")
	WebElement Material_Number_SK;
	public void Material_Number_SK(String x) throws Exception
	{
		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='materialNumer']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Material_Number_SK.sendKeys(x);
		Thread.sleep(500);
	}

	//Material_Code_SK
	@FindBy(xpath = "//input[@formcontrolname='materialCode']")
	WebElement Material_Code_SK;
	public void Material_Code_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='materialCode']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Material_Code_SK.clear();
		Material_Code_SK.sendKeys(x);
		Thread.sleep(500);

	}

	//material number Clear
	@FindBy(xpath = "//input[@formcontrolname='materialNumer']")
	WebElement materialnumberclear;
	public void materialnumberclear()
	{
		materialnumberclear.clear();
	}



	//Basic unit of measurement*******************************************************************

	//Basic_Unit_of_Measurement_Text
	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement Basic_Unit_of_Measurement_Text;
	public void Basic_Unit_of_Measurement_Text(String x) throws Exception
	{
		WebElement Color = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		Basic_Unit_of_Measurement_Text.sendKeys(x);
		Thread.sleep(500);
	}


	//Basic_Unit_of_Measurement_Select

	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement Basic_Unit_of_Measurement_Select;
	public void Basic_Unit_of_Measurement_Select() throws Exception
	{

		Basic_Unit_of_Measurement_Select.click();
		Thread.sleep(500);

	}
	//**********************************************************************************************
	//Storage_Conditions*******************************************************************

	//Storage_Conditions_Text
	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement Storage_Conditions_Text;
	public void Storage_Conditions_Text(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		Storage_Conditions_Text.sendKeys(x);
		Thread.sleep(500);
	}


	//Storage_Conditions_Select

	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement Storage_Conditions_Select;
	public void Storage_Conditions_Select() throws Exception
	{

		Storage_Conditions_Select.click();
		Thread.sleep(500);

	}
	//**********************************************************************************************





	//(//div[@role='option'])[1]
	@FindBy(xpath = "/html/body/app-root/div/div/app-material-master-create/div/div[2]/div/div/form/div[3]/div[1]/div/ng-select/div/span[2]/span")
	WebElement basicunitofmeasurement;
	public void basicunitofmeasurement()
	{
		basicunitofmeasurement.click();
	}
	//*************************************************************************************************
	//production starting year
	@FindBy(xpath = "//input[@formcontrolname='productionStartingYear']")
	WebElement Production_Starting_Year;
	public void Production_Starting_Year(String x)
	{

		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='productionStartingYear']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Production_Starting_Year.click();
		Production_Starting_Year.sendKeys(x);
	}

	//Procurement Type   (//span[@class=\"ng-arrow-wrapper\"])[5]
	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement ProcurementTypeclick;
	public void ProcurementTypeclick() throws Exception
	{
		ProcurementTypeclick.click();
		Thread.sleep(500);
	}
	//***************************************************************************************************
	//Procurement_Type_Text
	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement Procurement_Type_Text;
	public void Procurement_Type_Text(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		Procurement_Type_Text.sendKeys(x);
		Thread.sleep(500);
	}

	//Procurement_Type_Select

	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement Procurement_Type_Select;
	public void Procurement_Type_Select() throws Exception
	{

		Procurement_Type_Select.click();
		Thread.sleep(500);

	}

	//DropDown_Select

	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement DropDown_Select;
	public void DropDown_Select() throws Exception
	{

		DropDown_Select.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);

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


	//Specification_STP_No_SK
	@FindBy(xpath = "//input[@formcontrolname='stpNo']")
	WebElement Specification_STP_No_SK;
	public void Specification_STP_No_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='stpNo']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Specification_STP_No_SK.sendKeys(x);
		Thread.sleep(500);
	}
	//Rounding_Text
	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement Rounding_Text;
	public void Rounding_Text(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);

		Rounding_Text.sendKeys(x);
		Thread.sleep(500);
	}

	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='postalCode']")
		public WebElement postal;

		public void Postal_Code(String x) throws Exception {
			postal.clear();
			postal.sendKeys(x);
			Thread.sleep(2000);
		}
	//Remarks_SK
	@FindBy(xpath = "(//input[@formcontrolname='remark'])")
	WebElement Remarks_SK;
	public void Remarks_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("(//input[@formcontrolname='remark'])"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Remarks_SK.sendKeys(x);
		Thread.sleep(500);
	}

	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement Rounding;
	public void Rounding()
	{
		Rounding.click();
	}

	//Batch_Creation_Vendor_Batch
	@FindBy(xpath = "(//input[@name='radio'])[1]")
	WebElement Batch_Creation_Vendor_Batch;
	public void Batch_Creation_Vendor_Batch() throws Exception
	{
		Batch_Creation_Vendor_Batch.click();
		Thread.sleep(500);
	}


	//********************************************************************************************************************
	//Alternate_UOM_X
	@FindBy(xpath = "(//input[@type='text'])[15]")
	WebElement Alternate_UOM_X;
	public void Alternate_UOM_X(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("(//input[@type='text'])[15]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		Alternate_UOM_X.sendKeys(x);
		Thread.sleep(500);
	}

	//Alternate_UOM_Y
	@FindBy(xpath = "(//*[@type='number'])[1]")
	WebElement Alternate_UOM_Y;
	public void Alternate_UOM_Y(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("(//*[@type='number'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		Alternate_UOM_Y.sendKeys(x);
		Thread.sleep(500);
	}
	//********************************************************************************************************************
	@FindBy(xpath = "/html/body/app-root/div/div/app-material-master-create/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/table/tbody/tr/td[3]/select")
	WebElement Alt_UOM_DD;
	public void Alt_UOM_DD_Select(String x)
	{
		Select s=new Select(Alt_UOM_DD);
		s.selectByVisibleText(x);
		//s.selectByIndex(3);
	}

	@FindBy(xpath = "(/html/body/app-root/div/div/app-material-master-create/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/table/tbody/tr/td[3]/select)[2]")
	WebElement Alt_UOM_DD_Select2;
	public void Alt_UOM_DD_Select2(String x)
	{
		Select s=new Select(Alt_UOM_DD_Select2);
		s.selectByVisibleText(x);
		}

	@FindBy(xpath = "(//input[@type='number'])[2]")
	WebElement Altuomyear;
	public void Altuomyear(String altyear)
	{
		Altuomyear.sendKeys(altyear);
	}

	//Quality Management
	@FindBy(xpath = "//a[contains(text(),'Quality Management')]")
	WebElement QualityManagement_Click;
	public void QualityManagement_Click()
	{
		QualityManagement_Click.click();
	}
	//Alternate_UOM
	@FindBy(xpath = "//a[contains(text(),'Alternate UOM')]")
	WebElement Alternate_UOM_Click;
	public void Alternate_UOM_Click()
	{
		Alternate_UOM_Click.click();
	}

	//Inspect_Intervel_Period_SK
	@FindBy(xpath = "(//input[@type='number'])[2]")
	WebElement Inspect_Intervel_Period_SK;
	public void Inspect_Intervel_Period_SK(String x) throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);

		Inspect_Intervel_Period_SK.sendKeys(x);
		Thread.sleep(500);

	}

	//inspectYear
	@FindBy(xpath = "//*[@id='WOC1']/div/div[1]/div[2]/div/select")
	WebElement inspectYear;
	public void inspectYear(String user) throws Exception
	{
//		Select alt=new Select(inspectYear);
//		alt.selectByVisibleText(inspectyear);
		inspectYear.sendKeys(user);Thread.sleep(1000);
	}

	//***************************************************************************************************************************
	//InspectionType_MS TYPE[DD]
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[7]")
	WebElement InspectionType_Click;
	@FindBy(xpath = "(//*[@type='text'])[18]")
	WebElement Input_Text;
	//*******************************************************
	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement Select_First_Dropdown;
	//*******************************************************
	public void InspectionType(String user) throws Exception
	{
		InspectionType_Click.click();Thread.sleep(2000);
		Input_Text.sendKeys(user);Thread.sleep(1000);
		Select_First_Dropdown.click();Thread.sleep(1000);
	}
	//****************************************************************************************************************************

	//***************************************************************************************************************************
	//InspectionType_MS TYPE[DD]
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[8]")
	WebElement StorageLocations_Click1;

	@FindBy(xpath = "(//*[@type='text'])[19]")
	WebElement Input_Text1;


	public void StorageLocations1(String user) throws Exception
	{
		StorageLocations_Click1.click();Thread.sleep(1000);
		Input_Text1.sendKeys(user);Thread.sleep(1000);
		Select_First_Dropdown.click();Thread.sleep(1000);//Using Same click from previous function
	}
	//****************************************************************************************************************************
	//StorageLocation[DD]
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[9]")
	WebElement StorageLocations_Click2;

	@FindBy(xpath = "(//*[@type='text'])[19]")
	WebElement Input_Text11;


	public void StorageLocations2(String user) throws Exception
	{
		StorageLocations_Click2.click();Thread.sleep(1000);
		Input_Text11.sendKeys(user);Thread.sleep(1000);
		Select_First_Dropdown.click();Thread.sleep(1000);//Using Same click from previous function
	}















	//Storage Locations
	@FindBy(linkText = "Storage Locations")
	WebElement Storage_Locations_Click;
	public void Storage_Locations_Click() throws Exception
	{
		Storage_Locations_Click.click();
		Thread.sleep(500);
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
	// 2. Vendor_Master
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Vendor Master')]")
	public WebElement Vendor_Master;
	public void Vendor_Master()throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),'Vendor Master')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Vendor_Master.click();
		Thread.sleep(500);
	}

	//1. MaterialMaster



	@FindBy(how=How.XPATH,using="//*[@formcontrolname='vendorType']")
	public WebElement Vendor_Type_DD;
	//public void vendorTypeselect(String x)
	public void Vendor_Type_DDselect() throws Exception
	{
		Select c = new Select(Vendor_Type_DD);
		//c.selectByVisibleText(x);
		c.selectByIndex(1);
		Thread.sleep(500);

	}


	@FindBy(how=How.XPATH,using="//*[@formcontrolname='vendorName']")
	public WebElement Vendor_Name_SK;
	public void Vendor_Name_SK(String x)
	{
		Vendor_Name_SK.sendKeys(x);
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
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Manufacturer Assignment')]")
	public WebElement Manufacture_Master;
	public void Manufacture_Master() throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),'Manufacturer Assignment')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Manufacture_Master.click();
		Thread.sleep(500);
	}

	// 3. Customer_Master
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Customer')]")
	public WebElement Customer_Master;
	public void Customer_Master() throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),'Customer')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Customer_Master.click();
		Thread.sleep(500);
	}

	//Supplier_Assignment
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Supplier Assignment')]")
	public WebElement Supplier_Assignment;
	public void Supplier_Assignment() throws Exception
	{

		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),'Supplier Assignment')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Supplier_Assignment.click();
		Thread.sleep(500);
	}

	//Material_Description_Text******************************************************************************************************
	@FindBy(how=How.XPATH,using="(//*[@type='text'])[1]")
	public WebElement Material_Description_Text;
	public void Material_Description_Text(String x) throws Exception
	{
		Material_Description_Text.sendKeys(x);
		Thread.sleep(4000);
		Material_Description_Text.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
	}

	//	Name_of_the_Supplier
	@FindBy(how=How.XPATH,using="(//*[@type='text'])[12]")
	public WebElement Name_of_the_Supplier;
	public void Name_of_the_Supplier(String x) throws Exception
	{
		Name_of_the_Supplier.click();
		Name_of_the_Supplier.sendKeys(x);
		Thread.sleep(3000);
		Name_of_the_Supplier.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1500);
	}
	//Manfacturer_Name_Text***********************************************************************

	@FindBy(how=How.XPATH,using="(//*[@type='text'])[2]")
	public WebElement Manfacturer_Name_Text;
	public void Manfacturer_Name_Text(String x) throws Exception
	{
		Manfacturer_Name_Text.sendKeys(x);
		Thread.sleep(1000);Thread.sleep(500);
		Manfacturer_Name_Text.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(500);Thread.sleep(500);
	}

	//*****************************************************************************************************
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
	//	@FindBy(xpath="(//div[@class='ng-option ng-option-marked'])[1]")
	//	WebElement materialdown;
	public void MaterialName(String text) throws Exception
	{
		MaterialName.sendKeys(text);
		Thread.sleep(500);
		Nameofthemanufactureclick.click();
	}
	//Manfacturer Name
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement ManfacturerName;
	public void ManfacturerName(String text) throws Exception
	{
		ManfacturerName.sendKeys(text);
		Thread.sleep(500);

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

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[3]")
	WebElement basicunitofmeasurementclick;
	public void basicunitofmeasurementclick(String x)
	{
		basicunitofmeasurementclick.click();
	}








	//	//purchase uom
	//	@FindBy(xpath = "(//span[@class=\"ng-arrow-wrapper\"])[2]")
	//	WebElement purchaseuomclick;
	//	public void purchaseuomclick()
	//	{
	//		purchaseuomclick.click();
	//	}


	//	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
	//	WebElement meterialtypeclick;
	//	public void meterialclick()
	//	{
	//		meterialtypeclick.click();
	//	}
}
