package F.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConfigurationsPage {

public 	WebDriver driver;
	public ConfigurationsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//Storage Location To WareHouse
	@FindBy(xpath = "//a[contains(.,'Storage Location to Warehouse')]")
	WebElement slw;
	public void clickon_storagelocationtowarehouse()
	{
		slw.click();
	}

	//Storage Location To WareHouse Create
	@FindBy(xpath = "//button[@title='Create']")
	WebElement slwCreate;
	public void clickon_storagelocationtowarehouseCreate()
	{
		slwCreate.click();
	}

	//warehousenumber
	@FindBy(xpath = "//ng-select[@formcontrolname='warehouseNumberid']")
	WebElement warehousenumber;
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement warehousenumbersendk;
	@FindBy(xpath="(//div[@role='option'])[1]")
	WebElement role;
	public void warehousenumber(String data) throws Exception
	{
		warehousenumber.click();
		Thread.sleep(2000);
		warehousenumbersendk.clear();
		Thread.sleep(2000);
		warehousenumbersendk.sendKeys(data);
		Thread.sleep(2000);
		role.click();
	}

	//StorageLocation
	@FindBy(xpath = "//ng-select[@formcontrolname='storageLocationid']")
	WebElement StorageLocation;
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[2]")
	WebElement warehousenumbersendks;
	public void StorageLocation(String data) throws Exception
	{
		StorageLocation.click();
		Thread.sleep(2000);
		warehousenumbersendks.clear();
		Thread.sleep(2000);
		warehousenumbersendks.sendKeys(data);
		Thread.sleep(2000);
		role.click();
	}

	// Create
	@FindBy(xpath = "(//button[@title='Create'])[2]")
	WebElement Create;
	public void Create()
	{
		Create.click();
	}

	//Edit
	@FindBy(xpath = "(//button[@title='Edit'])[1]")
	WebElement Edit;
	public void Edit()
	{
		Edit.click();
	}

	//comments
	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	WebElement comments;
	public void comments(String data)
	{
		comments.sendKeys(data);
	}

	//checkbox
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement checkbox;
	public void checkbox()
	{
		checkbox.click();
	}

	//Batch Numbering System

	@FindBy(xpath = "//a[contains(.,'Batch Numbering System')]")
	WebElement bns;
	public void clickon_Batch_Numbering_System()
	{
		bns.click();
	}

	//materialType
	@FindBy(xpath = "//select[@formcontrolname='materialType']")
	WebElement materialtype;
	public void selectmaterialtype(String data)
	{
		Select mt=new Select(materialtype);
		mt.selectByVisibleText(data);
	}
	//materialLable
	@FindBy(xpath = "//select[@formcontrolname='materialLabel']")
	WebElement materialLable;
	public void selectmaterialLable(String data)
	{
		Select mt=new Select(materialLable);
		mt.selectByVisibleText(data);
	}

	//add
	@FindBy(id = "BOM-proceed")
	WebElement add;
	public void add()
	{
		add.click();
	}

	//print
	@FindBy(xpath = "(//button[@type='button'])[5]")
	WebElement print;
	public void print()
	{
		print.click();
	}

    //ApprovalConfiguration
	@FindBy(xpath = "//a[contains(.,'Approval Configuration')]")
	WebElement ApprovalConfiguration;
	public void click_on_ApprovalConfiguration()
	{
		ApprovalConfiguration.click();
	}

	//radiobuttons
	//radiomasters
	@FindBy(xpath = "(//input[@name='radio1'])[1]")
	WebElement radiomasters;
	public void radiomasters()
	{
		radiomasters.click();
	}

	//radiotransaction
	@FindBy(xpath = "(//input[@name='radio1'])[2]")
	WebElement radiotransaction;
	public void radiotransaction()
	{
		radiotransaction.click();
	}

	//Screens
	@FindBy(xpath = "//select[@formcontrolname='Screens']")
	WebElement Screens;
	public void Screens(String data)
	{
		Select sc=new Select(Screens);
	    sc.selectByVisibleText(data);
	}

	//NoApprovalsRequired
	@FindBy(xpath = "//select[@formcontrolname='NoApprovalsRequired']")
	WebElement NoApprovalsRequired;
	public void NoApprovalsRequired(String data)
	{
		Select sc=new Select(NoApprovalsRequired);
	    sc.selectByVisibleText(data);
	}

	//approver
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement approver;
	public void approver(String data) throws Exception
	{
		approver.clear();
		Thread.sleep(2000);
		approver.sendKeys(data);
		Thread.sleep(2000);
		role.click();
	}


	//comments
	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	WebElement commentsapprovalconfiguration;
	public void commentsapprovalconfiguration(String data)
	{
		commentsapprovalconfiguration.sendKeys(data);
	}




















}
