package F.pageobjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WmpsObj {
	public static WebDriver driver;
	public WebDriverWait wait;// globally declared

	public WmpsObj(WebDriver driver)// constructor call
	{
		WmpsObj.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	// Menu
	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/app-layout/nav/div/ul[1]/li[3]/a/span")
	public WebElement Menu;

	public void Menu() {
		Actions a = new Actions(driver);
		a.doubleClick(Menu).perform();
	}

	// Transactions
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Transactions')]")
	public WebElement Transactions;

	public void Transactions() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),'Transactions')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Transactions.click();
		Thread.sleep(500);
	}

	// WareHouse
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'WareHouse')])")
	public static WebElement WareHouse;

	public void WareHouse() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//a[contains(text(),'WareHouse')])"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		WareHouse.click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}

	// Production
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Production')])[1]")
	public WebElement Production;

	public void Production() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Production')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Production.click();
		Thread.sleep(500);
	}

	// BatchOrder
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Batch Order')]")
	public WebElement BatchOrder;

	public void BatchOrder() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//li[contains(text(),'Batch Order')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		BatchOrder.click();
		Thread.sleep(4500);
	}

	// Bil- l Of Material
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Bill Of Material')]")
	public WebElement BillOfMaterial;

	public void BillOfMaterial() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//li[contains(text(),'Bill Of Material')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		BillOfMaterial.click();
		Thread.sleep(4500);
	}

	// Quality_Control
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Quality-Control')]")
	public WebElement Quality_Control;

	public void Quality_Control() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//a[contains(text(),'Quality-Control')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Quality_Control.click();
		Thread.sleep(500);
	}

	// Pharma_Dispatch
	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Pharma-Dispatch')]")
	public WebElement Pharma_Dispatch;

	public void Pharma_Dispatch() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),' Pharma-Dispatch')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Pharma_Dispatch.click();
		Thread.sleep(500);
	}

	// Second_Level
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Second-Level')])[1]")
	public WebElement Second_Level;

	public void Second_Level() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Second-Level')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Thread.sleep(1000);
		Second_Level.click();

		// Thread.sleep(500);
	}

	// Purchase_Order
	@FindBy(how = How.XPATH, using = "//a[contains(text(),' Purchase-Order')]")
	public WebElement Purchase_Order;

	@SuppressWarnings("deprecation")
	public void Purchase_Order() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//a[contains(text(),' Purchase-Order')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Purchase_Order.click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// Purchase_Order_Entry
	@FindBy(how = How.XPATH, using = "(//li[contains(text(),'Purchase Order Entry')])[1]")
	public WebElement Purchase_Order_Entry;

	public void Purchase_Order_Entry() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//li[contains(text(),'Purchase Order Entry')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Purchase_Order_Entry.click();
		Thread.sleep(3500);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	// Quality_Inspection
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Quality Inspection')]")
	public WebElement Quality_Inspection;

	public void Quality_Inspection() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),'Quality Inspection')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Quality_Inspection.click();
		Thread.sleep(500);
	}

	// Goods_Receipt
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Goods Receipt')])[1]")
	public WebElement Goods_Receipt;

	@SuppressWarnings("deprecation")
	public void Goods_Receipt() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Goods Receipt')])[1]")));

		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Goods Receipt')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		Goods_Receipt.click();
		Thread.sleep(1500);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// Test_Request_Warehouse
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Test Request Warehouse ')]")
	public WebElement Test_Request_Warehouse;

	public void Test_Request_Warehouse() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),'Test Request Warehouse ')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Test_Request_Warehouse.click();
		Thread.sleep(500);
	}

	// Material_Return_To_Vendor
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Material Return To Vendor ')])[1]")
	public WebElement Material_Return_To_Vendor;

	public void Material_Return_To_Vendor() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Material Return To Vendor ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Material_Return_To_Vendor.click();
		Thread.sleep(500);
	}

	// Goods_Issue_Mat_Req

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Goods Issue ag(st) Mat Req ')])[1]")
	public WebElement Goods_Issue_Mat_Req;

	public void Goods_Issue_Mat_Req() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Goods Issue ag(st) Mat Req ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Goods_Issue_Mat_Req.click();
		Thread.sleep(500);
	}
	// Goods_Issue_Mat_Req

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='MaterialInventories Reports']")
	public WebElement materialInventoriesReports;

	public void materialInventoriesReports() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Goods Issue ag(st) Mat Req ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		materialInventoriesReports.click();
		Thread.sleep(500);
	}

	// General_Indent_Issuance
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'General Indent Issuance ')])[1]")
	public WebElement General_Indent_Issuance;

	public void General_Indent_Issuance() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'General Indent Issuance ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		General_Indent_Issuance.click();
		Thread.sleep(500);
	}

	// Material_Inventory
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Material Inventory ')])[1]")
	public WebElement Material_Inventory;

	public void Material_Inventory() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Material Inventory ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Material_Inventory.click();
		Thread.sleep(500);
	}

	// ReTest_Report
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Re-Test Report')])[1]")
	public WebElement ReTest_Report;

	public void ReTest_Report() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Re-Test Report')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		ReTest_Report.click();
		Thread.sleep(500);
	}

	// Batch_Change
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Batch Change ')])[1]")
	public WebElement Batch_Change;

	public void Batch_Change() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Batch Change ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Batch_Change.click();
		Thread.sleep(500);
	}

	// Batch_Mixing
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Batch Mixing ')])[1]")
	public WebElement Batch_Mixing;

	public void Batch_Mixing() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Batch Mixing ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Batch_Mixing.click();
		Thread.sleep(500);
	}

	// Material_Transfer_Receipt
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Material Transfer Receipt')])[1]")
	public WebElement Material_Transfer_Receipt;

	public void Material_Transfer_Receipt() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Material Transfer Receipt')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Material_Transfer_Receipt.click();
		Thread.sleep(500);
	}

	// Return_To_Warehouse
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'')])[1]")
	public WebElement Return_To_Warehouse;

	public void Return_To_Warehouse() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'MaterialTransferReceipt ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Return_To_Warehouse.click();
		Thread.sleep(500);
	}

	// Transfer_Posting
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Transfer Posting ')])[1]")
	public WebElement Transfer_Posting;

	public void Transfer_Posting() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Transfer Posting ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Transfer_Posting.click();
		Thread.sleep(500);
	}

	// Print_Issue_Slip
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Print Issue Slip ')])[1]")
	public WebElement Print_Issue_Slip;

	public void Print_Issue_Slip() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Print Issue Slip ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Print_Issue_Slip.click();
		Thread.sleep(500);
	}

	// Handling_Of_Quantities
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Handling of Quantities ')])[1]")
	public WebElement Handling_Of_Quantities;

	public void Handling_Of_Quantities() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Handling of Quantities ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Handling_Of_Quantities.click();
		Thread.sleep(500);
	}

	// Create_Test_Request_Production
	@FindBy(how = How.XPATH, using = "(//li[contains(text(),'Create Test Request Production')])[1]")
	public WebElement Create_Test_Request_Production;

	public void Create_Test_Request_Production() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//li[contains(text(),'Create Test Request Production')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Create_Test_Request_Production.click();
		Thread.sleep(500);
	}

	// Batch_Process_Closure
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Batch Process Closure ')])[1]")
	public WebElement Batch_Process_Closure;

	public void Batch_Process_Closure() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Batch Process Closure ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Batch_Process_Closure.click();
		Thread.sleep(2500);
	}

	// General_Indent
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'General Indent ')])[2]")
	public WebElement General_Indent;

	public void General_Indent() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'General Indent ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		General_Indent.click();
		Thread.sleep(500);
	}

	// Material_Transfer_Note
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),' Material Transfer Note ')])[1]")
	public WebElement Material_Transfer_Note;

	public void Material_Transfer_Note() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),' Material Transfer Note ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Material_Transfer_Note.click();
		Thread.sleep(500);
	}

	// Productions_Returns
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Production Returns ')])[1]")
	public WebElement Productions_Returns;

	public void Productions_Returns() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Production Returns ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Productions_Returns.click();
		Thread.sleep(500);
	}

	// Intermediate_Reconciliation_Record
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Intermediate Reconciliation Record ')])[1]")
	public WebElement Intermediate_Reconciliation_Record;

	public void Intermediate_Reconciliation_Record() throws Exception {
		WebElement Color = driver
				.findElement(By.xpath("(//*[contains(text(),'Intermediate Reconciliation Record ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Intermediate_Reconciliation_Record.click();
		Thread.sleep(500);
	}

	// Post_Goods_Issue
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Post Goods Issue ')])[1]")
	public WebElement Post_Goods_Issue;

	public void Post_Goods_Issue() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Post Goods Issue ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Post_Goods_Issue.click();
		Thread.sleep(500);
	}

	// Dispatch_Request
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Dispatch Request ')])[1]")
	public WebElement Dispatch_Request;

	public void Dispatch_Request() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Dispatch Request ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Dispatch_Request.click();
		Thread.sleep(500);
	}

	// Post_Goods_Issue_Return
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Post Goods Issue Return ')])[1]")
	public WebElement Post_Goods_Issue_Return;

	public void Post_Goods_Issue_Return() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'Post Goods Issue Return ')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Post_Goods_Issue_Return.click();
		Thread.sleep(500);
	}

	// Finished_Good_Issue
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Finished Goods Issue')]")
	public WebElement Finished_Good_Issue;

	public void Finished_Good_Issue() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),'Finished Goods Issue')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Finished_Good_Issue.click();
		Thread.sleep(500);
	}

	// QA_Release
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'QA Release(Batch Tree)')]")
	public WebElement QA_Release;

	public void QA_Release() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),'QA Release(Batch Tree)')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		QA_Release.click();
		Thread.sleep(500);
	}

	// Handling_Of_Returned_Goods
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Handling Of Returned Goods ')]")
	public WebElement Handling_Of_Returned_Goods;

	public void Handling_Of_Returned_Goods() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),'Handling Of Returned Goods ')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Handling_Of_Returned_Goods.click();
		Thread.sleep(500);
	}

	// Menu_Navigate
	@FindBy(how = How.XPATH, using = "//a[@id='menuNavigate']")
	public WebElement Menu_Navigate;

	public void Menu_Navigate() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//a[@id='menuNavigate']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		Menu_Navigate.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}

	// CREATE
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'New') or contains(text(),'Create ') or @title='Create' or contains(text(),'Create')]")
	public WebElement Create;

	public void Create() throws Exception {
		WebElement Color = driver.findElement(By.xpath(
				"//button[contains(text(),'New') or contains(text(),'Create ') or @title='Create' or contains(text(),'Create')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Create.click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// CREATE
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Create')])[1]")
	public WebElement Create_Button;

	public void Create_Button() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Create')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Create_Button.click();
		Thread.sleep(2500);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// *****************************************************************************************************************
	// *****************************************************************************************************************
	// *****************************************************************************************************************
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='stage']") // ****************************************************
	public WebElement Stage;

	public void Stage(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='stage']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Stage.sendKeys(x);
		Thread.sleep(500);
	}

	public void Stage_Select(String x) throws Exception {
		Stage.click();
		Select s = new Select(Stage);
		s.selectByVisibleText(x);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// *****************************************************************************************************************
	// *****************************************************************************************************************
	// ManufactureName
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='manifactureBlockId' or @formcontrolname='manufactureName']")
	public WebElement ManufactureName;

	public void ManufactureName(String x) throws Exception {
		WebElement Color = driver.findElement(
				By.xpath("//*[@formcontrolname='manifactureBlockId' or @formcontrolname='manufactureName']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		ManufactureName.sendKeys(x);
		Thread.sleep(1500);
	}

	public void ManufactureNameByIndex() throws Exception {
		Select s = new Select(ManufactureName);
		s.selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void ManufactureNameByIndex1() throws Exception {
		Select s = new Select(ManufactureName);
		s.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// *****************************************************************************************************************
	// *****************************************************************************************************************
	// MarketName
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='marketName']")
	public WebElement MarketName;

	// 01
	public void MarketName(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='marketName']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		MarketName.sendKeys(x);
		Thread.sleep(500);
	}

	public void MarketName_Select(String x) throws Exception {
		Select s = new Select(MarketName);
		s.selectByVisibleText(x);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// **********************************************************************************************************
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Clear')])[1]")
	public WebElement Clear_Button;

	public void Clear_Button() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Clear')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Clear_Button.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Thread.sleep(500);
	}

	// *************************************************************************************************************************
	// *************************************************************************************************************************
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'SMPL')])[1]")
	public WebElement SMPL;

	public void SMPL() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'SMPL')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		SMPL.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Thread.sleep(500);
	}

	// *************************************************************************************************************************
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'USDE')])[1]")
	public WebElement USDE;

	public void USDE() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//*[contains(text(),'USDE')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		USDE.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Preview')])[1]")
	public WebElement Preview;

	public void Preview() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Preview')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Preview.click();
		Thread.sleep(500);
	}

	// **********************************************************************************************************************
	// TITLE_SUBMIT
	@FindBy(how = How.XPATH, using = "//*[@title='Submit']")
	public WebElement TITLE_SUBMIT;

	public void TITLE_SUBMIT() throws Exception {

		WebElement Color = driver.findElement(By.xpath("//*[@title='Submit']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		TITLE_SUBMIT.click();
		Thread.sleep(500);
	}

	// Submit_Title
	@FindBy(how = How.XPATH, using = "//*[@title='Submit']")
	public WebElement st;

	public void Submit_Title() throws Exception {

		WebElement Color = driver.findElement(By.xpath("//*[@title='Submit']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		st.click();
		Thread.sleep(500);
	}

	// *********************************************************************************************************************
	// EDIT_TITLE
	@FindBy(how = How.XPATH, using = "(//*[@title='Edit'])[1]")
	public WebElement EDIT_TITLE;

	public void EDIT_TITLE() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//*[@title='Edit'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		EDIT_TITLE.click();
		Thread.sleep(500);
	}

	// SubmitType12

	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[1]")
	public WebElement SubmitType1;
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[2]")
	public WebElement SubmitType2;

	public void SubmitType12() throws Exception {
		try {
			WebElement Color = driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

			SubmitType1.click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			WebElement Color = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

			SubmitType2.click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// SubmitText01
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Submit')])[1]")
	public WebElement SubmitText01;

	public void SubmitText01() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		SubmitText01.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// SubmitText04
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Submit')])[4]")
	public WebElement Submit_Button4;

	public void Submit_Button4() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[4]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Submit_Button4.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// *****************************************************************************************************************
	// *****************************************************************************************************************
	// *****************************************************************************************************************
	// Save Button
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Save')])[1]")
	public WebElement Save1;
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Save')])[2]")
	public WebElement Save2;

	public void Save_Button_TCB() throws Exception {
		try {
			WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Save')])[1]"));
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
			Save1.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// *****************************************************************************************************************
		try {
			WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]"));
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

			Save2.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// *****************************************************************************************************************
	// *****************************************************************************************************************

	public void Save_Button() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Save')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Save1.click();
	}

	// *****************************************************************************************************************
	public void Save_Button2() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Save2.click();
	}
	// *********************************************************************************************************************
	// SUBMIT_BUTTON
	// *[@type='submit' or @value='Log In' or @title='submit' or
	// contains(text(),'Save') or contains(text(),'Verify')]"));

	// *[@type='submit' or @ title='submit' or contains(text(),'Submit') or
	// contains(text(),'Save') or contains(text(),'Verify')]

	@FindBy(how = How.XPATH, using = "//*[@type='submit' or @ title='submit' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]")
	public WebElement Submit;

	public void Submit() throws Exception {
		WebElement Color = driver.findElement(By.xpath(
				"//*[@type='submit' or @ title='submit' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Submit.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// *********************************************************************************************************************
	// Submit_Text
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Submit')])[1]")
	public WebElement Submit_Text_01;
	// *********************************************************************************************************************
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Submit')])[2]")
	public WebElement Submit_Text_02;
	// *********************************************************************************************************************
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Submit')])[3]")
	public WebElement Submit_Text_03;

	// *********************************************************************************************************************
	// *********************************************************************************************************************
	public void Submit_Button() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Submit_Text_01.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// *********************************************************************************************************************
	// *********************************************************************************************************************
	public void Submit_Button2() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//button[contains (text(),'Submit')])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Submit_Text_02.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// *********************************************************************************************************************
	// *********************************************************************************************************************
	public void Submit_Button3() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[3]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Submit_Text_03.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// *********************************************************************************************************************
	// *********************************************************************************************************************
	public void Submit_Button_TCB() throws Exception {
		try {
			WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]"));
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

			Submit_Text_01.click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[2]"));
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

			Submit_Text_02.click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[3]"));
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

			Submit_Text_03.click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// *********************************************************************************************************************
	// *********************************************************************************************************************
	// *********************************************************************************************************************
	// *********************************************************************************************************************
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK') or contains(text(),'Ok')]")
	public WebElement h;

	public void Ok_Button() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//button[contains(text(),'OK') or contains(text(),'Ok')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		h.click();
		Thread.sleep(2500);
	}

	// SubmitType_1
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[1]")
	public WebElement SubmitType_1;

	public void SubmitType_1() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		SubmitType_1.click();
		Thread.sleep(500);
	}

	// SubmitType_2
	@FindBy(how = How.XPATH, using = "(//*[@type='submit'])[2]")
	public WebElement SubmitType_2;

	public void SubmitType_2() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		SubmitType_2.click();
		Thread.sleep(500);
	}

	// Submit_Type
	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[1]")
	public WebElement ST1;

	public void Submit_Type1() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		ST1.click();
		Thread.sleep(500);
	}

	// Submit_Type
	@FindBy(how = How.XPATH, using = "(//*[@title='Submit'])[1]")
	public WebElement Submit_Type;

	public void Submit_Type() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//*[@title='Submit'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Submit_Type.click();
		Thread.sleep(500);
	}

	// Add_Button_FFPC
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add') or contains(text(),'ADD')]")
	public WebElement Add_Button;

	public void Add_Button() throws Exception {

		WebElement Color = driver.findElement(By.xpath("//button[contains(text(),'Add') or contains(text(),'ADD')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Add_Button.click();
		Thread.sleep(1500);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes') or contains(text(),'yes')]")
	public WebElement Yes;

	public void Yes() throws Exception {

		WebElement Color = driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Yes.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Thread.sleep(500);
	}

	// Ok
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK') or contains(text(),'Ok')]")
	public WebElement Ok;

	public void Ok() throws Exception {

		WebElement Color = driver.findElement(By.xpath("//button[contains(text(),'OK') or contains(text(),'Ok')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Thread.sleep(2000);
		Ok.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	// SEARCHBOX
	@FindBy(how = How.XPATH, using = "(//input[@type='search'])[1]")
	public WebElement SearchBox;

	public void SearchBox(String x) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", SearchBox);

		SearchBox.click();
		Thread.sleep(1500);
		SearchBox.clear();
		Thread.sleep(1500);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		SearchBox.sendKeys(x);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void SearchBox2(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//input[@type='search']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		SearchBox.sendKeys(x);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// Comments
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='comments' or @formcontrolname='Comments']")
	public WebElement Comments;

	public void Comments(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath(
				"//*[@formcontrolname='comments' or @formcontrolname='Comments' or @formcontrolname='remarks']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Comments.clear();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Thread.sleep(500);
		Comments.sendKeys(x);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Thread.sleep(500);
	}

	// Comments
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='ExpiryDate' or @formcontrolname='ExpiryDate']")
	public WebElement ExpiryDate;

	public void ExpiryDate(String x) throws Exception {
		WebElement Color = driver
				.findElement(By.xpath("//*[@formcontrolname='ExpiryDate' or @formcontrolname='ExpiryDate']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		ExpiryDate.sendKeys(x);
		Thread.sleep(500);
	}

	// Date01SK
	@FindBy(how = How.XPATH, using = "(//*[@type='date'])[3]")
	public WebElement Date01SK;

	public void Date01SK(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='date'])[3]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Date01SK.sendKeys(x);
		Thread.sleep(500);
	}

	// Comments_Text
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Comment')]")
	public WebElement Comments_Text;

	public void Comments_Text(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),'Comment')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Comments_Text.sendKeys(x);
		Thread.sleep(500);
	}

	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='comments' or @formcontrolname='Comments']")
	public WebElement Comments55;

	public void Comment_Box(String x) throws Exception {
		WebElement Color = driver
				.findElement(By.xpath("//*[@formcontrolname='comments' or @formcontrolname='Comments']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Comments.clear();// Thread.sleep(500);
		Comments.sendKeys(x);// Thread.sleep(500);
	}

	// Comments_Id
	@FindBy(how = How.XPATH, using = "//*[@id='comments']")
	public WebElement Comments_Id;

	public void Comments_Id(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@id='comments']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Comments_Id.sendKeys(x);
		Thread.sleep(500);
	}

	// Comments2
	@FindBy(how = How.XPATH, using = "(//*[@formcontrolname='comments' or @formcontrolname='Comments'])[2]")
	public WebElement Comments2;

	public void Comments2(String x) throws Exception {
		WebElement Color = driver
				.findElement(By.xpath("(//*[@formcontrolname='comments' or @formcontrolname='Comments'])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Comments2.clear();
		Thread.sleep(500);
		Comments2.sendKeys(x);
		Thread.sleep(500);
	}

	// Remarks
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='noofContainers' or @formcontrolname='numberOfContainers' or @formcontrolname='numberOfContainers' or @formcontrolname='numberOfContainers' ]")
	public WebElement Container_No;

	public void Container_No(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath(
				"//*[@formcontrolname='noofContainers' or @formcontrolname='numberOfContainers' or @formcontrolname='numberOfContainers' or @formcontrolname='numberOfContainers' ]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Container_No.clear();
		Thread.sleep(1500);
		Container_No.sendKeys(x);
	}

	// DCEInvoiceNumber
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='challanNumber']")
	public WebElement DCEInvoiceNumber;

	public void DCEInvoiceNumber(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='challanNumber']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		// DCEInvoiceNumber.clear();
		DCEInvoiceNumber.sendKeys(x);
		Thread.sleep(500);
	}

	// VendorStorageCondition
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='vendorstorageLocation']")
	public WebElement VendorStorageCondition;

	public void VendorStorageCondition(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='vendorstorageLocation']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		VendorStorageCondition.clear();
		VendorStorageCondition.sendKeys(x);
		Thread.sleep(500);
	}

	// Quantity
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='quantity' or @formcontrolname='quantity']")
	public WebElement Quantity;

	public void Quantity(String x) throws Exception {
		WebElement Color = driver
				.findElement(By.xpath("//*[@formcontrolname='quantity' or @formcontrolname='quantity']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Quantity.clear();
		Thread.sleep(500);
		Quantity.sendKeys(x);
		Thread.sleep(500);
	}

	// RequestQuantity
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='requestQuantity' or @formcontrolname='requestQuantity']")
	public WebElement RequestQuantity;

	public void RequestQuantity(String x) throws Exception {
		WebElement Color = driver
				.findElement(By.xpath("//*[@formcontrolname='requestQuantity' or @formcontrolname='requestQuantity']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		RequestQuantity.clear();
		Thread.sleep(500);
		RequestQuantity.sendKeys(x);
		Thread.sleep(500);
	}

	// ReceivedQuantity
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='receivedQuantity' or @formcontrolname='receivedQuantity']")
	public WebElement ReceivedQuantity;

	public void ReceivedQuantity(String x) throws Exception {
		// WebElement Color =
		// driver.findElement(By.xpath("//*[@formcontrolname='receivedQuantity' or
		// @formcontrolname='receivedQuantity']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');",
				ReceivedQuantity);

		ReceivedQuantity.clear();
		Thread.sleep(500);
		ReceivedQuantity.sendKeys(x);
		Thread.sleep(500);
	}

	// *****************************************************************************************************
	// *****************************************************************************************************
	// Remarks
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='remark'  or @formcontrolname='returnedRemarks' or @formcontrolname='Remark' or @formcontrolname='remarks' or @formcontrolname='Remarks' ]")
	public WebElement Remarks;

	public void Remarks(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath(
				"//*[@formcontrolname='remark'  or @formcontrolname='returnedRemarks' or @formcontrolname='Remark' or @formcontrolname='remarks' or @formcontrolname='Remarks' ]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Remarks.clear();
		Thread.sleep(500);
		Remarks.sendKeys(x);
		Thread.sleep(500);
	}

	public void Remarks_SK(String x) throws Exception// ******************
	{
		WebElement Color = driver.findElement(By.xpath(
				"//*[@formcontrolname='remark'  or @formcontrolname='returnedRemarks' or @formcontrolname='Remark' or @formcontrolname='remarks' or @formcontrolname='Remarks' ]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Remarks.sendKeys(x);
		Thread.sleep(1500);
	}

	// *****************************************************************************************************
	// *****************************************************************************************************
	// Batch_Number
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='batchNumber']")
	public WebElement Batch_Number;

	public void Batch_Number(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='batchNumber']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Batch_Number.clear();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Batch_Number.sendKeys(x);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	// Password_Fill
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='password' or formcontrolname='Password']")
	public WebElement Password_Fill;

	public void Password_Fill(String x) throws Exception {
		WebElement Color = driver
				.findElement(By.xpath("//*[@formcontrolname='password' or formcontrolname='Password']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		// Password_Fill.sendKeys(x);Thread.sleep(500);
		// Password_Fill.clear();Thread.sleep(500);
		// Password_Fill.sendKeys(Pro.getProperty(Password));

		Password_Fill.sendKeys(x);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// Return
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Return')]")
	public WebElement Return_Button;

	public void Return_Button() throws Exception {

		WebElement Color = driver.findElement(By.xpath("//button[contains(text(),'Return')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Return_Button.click();
		Thread.sleep(500);
	}

	// Cancel_Button
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
	public WebElement Cancel_Button;

	public void Cancel_Button() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Cancel_Button.click();
		Thread.sleep(500);
	}

	// UPDATE
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Update')]")
	public WebElement UpdateButton;

	public void UpdateButton() throws Exception {

		WebElement Color = driver.findElement(By.xpath("//button[contains(text(),'Update')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		UpdateButton.click();
		Thread.sleep(500);
	}

	// Split_Button
	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Split ')]")
	public WebElement Split_Button;

	public void Split_Button() throws Exception {

		WebElement Color = driver.findElement(By.xpath("//button[contains(text(),' Split ')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Split_Button.click();
		Thread.sleep(500);
	}

	// Proceed_Button
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Proceed')]")
	public WebElement Proceed_Button;

	public void Proceed_Button() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//button[contains(text(),'Proceed')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Proceed_Button.click();
		Thread.sleep(500);
	}

	// Get_Button //button[contains(text(),' Get ')]
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Get') or contains(text(),'Get')]")
	public WebElement Get_Button;

	public void Get_Button() throws Exception {

		WebElement Color = driver.findElement(By.xpath("//button[contains(text(),'Get') or contains(text(),'Get')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		Get_Button.click();
		Thread.sleep(2500);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}

	// Issue_Button
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Issue')]")
	public WebElement Issue_Button;

	public void Issue_Button() throws Exception {

		WebElement Color = driver.findElement(By.xpath("//button[contains(text(),' Issue')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Issue_Button.click();
		Thread.sleep(500);
	}

	// Back_Button
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Back')])[1]")
	public WebElement Back_Button;

	public void Back_Button() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Back')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Back_Button.click();
		Thread.sleep(500);
	}

	// Back_Button
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Modify')])[1]")
	public WebElement Modify_Button;

	public void Modify_Button() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Modify')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Modify_Button.click();
		Thread.sleep(500);
	}

	// Back_Button
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Back')])[2]")
	public WebElement Back_Button2;

	public void Back_Button2() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Back')])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Back_Button2.click();
		Thread.sleep(500);
	}

	// Print//Reprint button
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Print') or contains(text(),'RePrint')]")
	public WebElement Print_Button;

	public void Print_Button() throws Exception {

		WebElement Color = driver
				.findElement(By.xpath("//button[contains(text(),'Print') or contains(text(),'RePrint')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Print_Button.click();
		Thread.sleep(500);
	}

	// ***************************************************************************Merge
	// with multiple edits if possible
	// EDIT_BUTTON
	@FindBy(how = How.XPATH, using = "(//*[@title='Edit' or @actiontype='Edit'])[1]")
	public WebElement Edit_Action_Button;

	public void Edit_Action_Button() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[@title='Edit' or @actiontype='Edit'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Edit_Action_Button.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// ActionEye01
	@FindBy(how = How.XPATH, using = "(//*[@title='View' or @class='fa fa-eye'])[1]")
	public WebElement ActionEye01;

	public void ViewButton() throws Exception {
		try {
			WebElement Color = driver.findElement(By.xpath("(//*[@title='View' or @class='fa fa-eye'])[1] "));
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);

			ActionEye01.click();
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		Thread.sleep(3000);
	}

	// ActionEye01
	@FindBy(how = How.XPATH, using = "(//*[@title='View' or @class='fa fa-eye'])[2]")
	public WebElement ActionEye02;

	public void ViewButton2() throws Exception {
		try {
			WebElement Color = driver.findElement(By.xpath("(//*[@title='View' or @class='fa fa-eye'])[2]"));
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);

			ActionEye02.click();
		} catch (Exception e) {
		}
		Thread.sleep(3000);
	}

	// ActionType_EditAction_Button
	@FindBy(how = How.XPATH, using = "(//*[@actiontype='editAction'])[1]")
	public WebElement ActionType_EditAction_Button;

	public void ActionType_EditAction_Button() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[@actiontype='editAction'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		ActionType_EditAction_Button.click();
		Thread.sleep(500);
	}

	// ActionType_EditAction_Button2
	@FindBy(how = How.XPATH, using = "(//*[@title='Edit' or @actiontype='editAction'])[2]")
	public WebElement ActionType_EditAction_Button2;

	public void ActionType_EditAction_Button2() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[@title='Edit' or @actiontype='editAction'])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		ActionType_EditAction_Button2.click();
		Thread.sleep(500);
	}

	// ActionType_EditAction_Button3
	@FindBy(how = How.XPATH, using = "(//*[@title='Edit' or @actiontype='editAction'])[3]")
	public WebElement ActionType_EditAction_Button3;

	public void ActionType_EditAction_Button3() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[@title='Edit' or @actiontype='editAction'])[3]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		ActionType_EditAction_Button3.click();
		Thread.sleep(500);
	}

	// CROSS_CLOSE_BUTTON
	@FindBy(how = How.XPATH, using = "//*[@class='close']")
	public WebElement Cross_Close_Button;

	public void Cross_Close_Button() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@class='close']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Cross_Close_Button.click();
		Thread.sleep(500);
		Thread.sleep(500);
	}

	// PurchaseOrderNumber
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='purchaseOrderNumber']")
	public WebElement PurchaseOrderNumber;

	public void PurchaseOrderNumber(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='purchaseOrderNumber']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		PurchaseOrderNumber.clear();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Thread.sleep(500);
		PurchaseOrderNumber.sendKeys(x);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Thread.sleep(500);
	}

	// PurchaseOrderNumber
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='purchaseOrderDate']")
	public WebElement PurchaseOrderDate;

	public void PurchaseOrderDate(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='purchaseOrderDate']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		PurchaseOrderDate.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
		PurchaseOrderDate.sendKeys(x);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1500);
	}

	// CustomerName
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='customerName']")
	public WebElement CustomerName;

	public void CustomerName(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='customerName']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		CustomerName.clear();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		CustomerName.sendKeys(x);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// PO_Number
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='PONumber']")
	public WebElement PO_Number;

	public void PO_Number(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='PONumber']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		PO_Number.clear();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
		PO_Number.sendKeys(x);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}
	// Not_Create Button

	@FindBy(how = How.XPATH, using = "(//button[contains(.,'No')])[3]")
	public WebElement Not_Create;

	public void Not_Create() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//button[contains(.,'No')])[3]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid red;');", Color);

		Not_Create.click();
		Thread.sleep(500);
	}

	// Plus_Button_FFPC
	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-plus-circle'])[1]")
	public WebElement Plus_Button_FFPC;

	public void Plus_Button_FFPC() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//*[@class='fa fa-plus-circle'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Plus_Button_FFPC.click();
		Thread.sleep(500);
	}

	// PlusButton3_FFPC
	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-plus-circle'])[3]")
	public WebElement PlusButton3_FFPC;

	public void PlusButton3_FFPC() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//*[@class='fa fa-plus-circle'])[3]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		PlusButton3_FFPC.click();
		Thread.sleep(500);
	}

	// PlusButton4_FFPC
	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-plus-circle'])[4]")
	public WebElement PlusButton4_FFPC;

	public void PlusButton4_FFPC() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//*[@class='fa fa-plus-circle'])[4]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		PlusButton4_FFPC.click();
		Thread.sleep(500);
	}

	// PlusButton5_FFPC
	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-plus-circle'])[5]")
	public WebElement PlusButton5_FFPC;

	public void PlusButton5_FFPC() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//*[@class='fa fa-plus-circle'])[5]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		PlusButton5_FFPC.click();
		Thread.sleep(500);
	}

	// MinusButton4_FFMC
	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-minus-circle'])[4]")
	public WebElement MinusButton4_FFMC;

	public void MinusButton4_FFMC() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//*[@class='fa fa-minus-circle'])[4]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		MinusButton4_FFMC.click();
		Thread.sleep(500);
	}

	// MinusButton6_FFMC
	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-minus-circle'])[6]")
	public WebElement MinusButton6_FFMC;

	public void MinusButton6_FFMC() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//*[@class='fa fa-minus-circle'])[6]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		MinusButton6_FFMC.click();
		Thread.sleep(500);
	}

	// //SEARCH_BUTTON
	//
	// @FindBy(how=How.XPATH,using="(//button[contains(text(),'Entry')])[1]")
	// public WebElement Search_Button;
	// public void Search_Button() throws Exception
	// {
	//
	// WebElement Color =
	// driver.findElement(By.xpath("(//button[contains(text(),'Entry')])[1]"));
	// JavascriptExecutor Js = (JavascriptExecutor) driver;
	// Js.executeScript("arguments[0].setAttribute('style', 'background: ; border:
	// 4px solid black;');", Color);
	//
	// Search_Button.click();Thread.sleep(500);Thread.sleep(500);
	// }

	// SEARCH_BUTTON
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Search') or contains(text(),'Search')]")
	public WebElement Search_Button;

	public void Search_Button() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),'Search') or contains(text(),'Search')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Search_Button.click();
		Thread.sleep(500);
		Thread.sleep(500);
	}

	// ENTRY_BUTTON
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Entry')])[1]")
	public WebElement Entry_Button;

	public void Entry_Button() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//button[contains(text(),'Entry')])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		Entry_Button.click();
		Thread.sleep(2500);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	}

	// Radio_Button_1
	@FindBy(xpath = "(//*[@type='radio'])[1]")
	public WebElement Radio_Button_1;

	public void Radio_Button_1() throws Exception {
		Radio_Button_1.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// ********************************
	// @FindBy(how=How.XPATH,using="//*[@formcontrolname='AnalysisStatus']")
	// public WebElement Action_Level_Select;//Globally Declare
	//
	// public void Function(String X) throws Exception
	// {
	//
	// Select Action_Level_Select1= new Select(Action_Level_Select);
	//
	//
	// }
	//

	// WebElement Color =
	// driver.findElement(By.xpath("//*[@formcontrolname='AnalysisStatus']"));
	// JavascriptExecutor Js = (JavascriptExecutor) driver;
	// Js.executeScript("arguments[0].setAttribute('style', 'background: ; border:
	// 4px solid black;');", Color);
	// Action_Level_Select.click();//WebElement Click
	// Action_Level_Select.sendKeys(X);

	// *****************************************************

	// ***************************************************
	// CheckBox_1
	public void checkBoxClickWithValidation() throws Exception {
		// Check if the checkbox is displayed on screen and not selected
		if (CheckBox_1.isDisplayed()) // 1-checking if checkbox is present in screen or not
		{
			if (!CheckBox_1.isSelected())// 2-if it is present and not Selected
			{
				CheckBox_1.click();// 3- than click on that checkbox
				System.out.println("Checkbox selected.");
			} else {
				System.out.println("Checkbox is already selected.");// 4- else print already selected
			}
		} else {
			System.out.println("Checkbox is not displayed on the page.");// 5- if path is only not present in screen
		}
	}

	// CheckBox_1
	@FindBy(xpath = "(//*[@type='checkbox'])[1]")
	public WebElement CheckBox_1;

	public void CheckBox_1() throws Exception {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		CheckBox_1.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}

	// CheckBox_2
	@FindBy(xpath = "(//*[@type='checkbox'])[2]")
	public WebElement CheckBox_2;

	public void CheckBox_2() throws Exception {
		CheckBox_2.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_3
	@FindBy(xpath = "(//*[@type='checkbox'])[3]")
	public WebElement CheckBox_3;

	public void CheckBox_3() throws Exception {
		CheckBox_3.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_4
	@FindBy(xpath = "(//*[@type='checkbox'])[4]")
	public WebElement CheckBox_4;

	public void CheckBox_4() throws Exception {
		CheckBox_4.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_5
	@FindBy(xpath = "(//*[@type='checkbox'])[5]")
	public WebElement CheckBox_5;

	public void CheckBox_5() throws Exception {
		CheckBox_5.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_6
	@FindBy(xpath = "(//*[@type='checkbox'])[6]")
	public WebElement CheckBox_6;

	public void CheckBox_6() throws Exception {
		CheckBox_6.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_7
	@FindBy(xpath = "(//*[@type='checkbox'])[7]")
	public WebElement CheckBox_7;

	public void CheckBox_7() throws Exception {
		CheckBox_7.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_8
	@FindBy(xpath = "(//*[@type='checkbox'])[8]")
	public WebElement CheckBox_8;

	public void CheckBox_8() throws Exception {
		CheckBox_8.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_8
	@FindBy(xpath = "(//*[@type='checkbox'])[9]")
	public WebElement CheckBox_9;

	public void CheckBox_9() throws Exception {
		CheckBox_9.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_8
	@FindBy(xpath = "(//*[@type='checkbox'])[10]")
	public WebElement CheckBox_10;

	public void CheckBox_10() throws Exception {
		CheckBox_10.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_11
	@FindBy(xpath = "(//*[@type='checkbox'])[11]")
	public WebElement CheckBox_11;

	public void CheckBox_11() throws Exception {
		CheckBox_11.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_12
	@FindBy(xpath = "(//*[@type='checkbox'])[12]")
	public WebElement CheckBox_12;

	public void CheckBox_12() throws Exception {
		CheckBox_12.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_13
	@FindBy(xpath = "(//*[@type='checkbox'])[13]")
	public WebElement CheckBox_13;

	public void CheckBox_13() throws Exception {
		CheckBox_13.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_14
	@FindBy(xpath = "(//*[@type='checkbox'])[14]")
	public WebElement CheckBox_14;

	public void CheckBox_14() throws Exception {
		CheckBox_14.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_15
	@FindBy(xpath = "(//*[@type='checkbox'])[15]")
	public WebElement CheckBox_15;

	public void CheckBox_15() throws Exception {
		CheckBox_15.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// CheckBox_16
	@FindBy(xpath = "(//*[@type='checkbox'])[16]")
	public WebElement CheckBox_16;

	public void CheckBox_16() throws Exception {
		CheckBox_16.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// FFP_01
	@FindBy(xpath = "(//*[@class='fa fa-pencil-alt'])[1]")
	WebElement FFP_01;

	public void FFP_01() throws Exception {
		FFP_01.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	// DropDown1Select
	@FindBy(how = How.XPATH, using = "(//div[@role='option'])[1]")
	public WebElement DropDown1Select;

	public void DropDown1Select() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//div[@role='option'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid red;');", Color);

		DropDown1Select.click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	// DropDown2Select
	@FindBy(how = How.XPATH, using = "(//div[@role='option'])[2]")
	public WebElement DropDown2Select;

	public void DropDown2Select() throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//div[@role='option'])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid red;');", Color);

		DropDown2Select.click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	// Inventory_Card
	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Inventory Card')]")
	public WebElement Inventory_Card;

	public void Inventory_Card() throws Exception {

		WebElement Color = driver.findElement(By.xpath("//*[contains(text(),' Inventory Card')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Inventory_Card.click();
		Thread.sleep(500);
	}

	// Inventory_Card
	@FindBy(how = How.XPATH, using = "(//a[normalize-space()='Inventory Card'])[1]")
	public WebElement InventoryCard;

	public void InventoryCard() throws Exception {

		WebElement Color = driver.findElement(By.xpath("(//a[normalize-space()='Inventory Card'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		InventoryCard.click();
		Thread.sleep(500);
	}

	// ARNumber
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='ARNumber']")
	public WebElement ARNumber;

	public void ARNumber(String x) throws Exception {

		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='ARNumber']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		ARNumber.sendKeys(x);
		Thread.sleep(500);
	}

	// PharmacopoeiaId
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='pharmacopoeiaId']")
	public WebElement PharmacopoeiaId;

	public void PharmacopoeiaId(String x) throws Exception {

		WebElement Color = driver.findElement(By.xpath("//select[@formcontrolname='pharmacopoeiaId']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		PharmacopoeiaId.sendKeys(x);
		Thread.sleep(500);
	}

	// Action
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='AnalysisStatus']")
	public WebElement Action;

	public void Action(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//select[@formcontrolname='AnalysisStatus']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Action.sendKeys(x);
		Thread.sleep(500);
	}

	// SampledQuantity
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='SampledQuantity']")
	public WebElement SampledQuantity;

	public void SampledQuantity(String x) throws Exception {

		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='SampledQuantity']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		SampledQuantity.clear();
		SampledQuantity.sendKeys(x);
		Thread.sleep(500);

	}

	// SampledQuantityUOM
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='SampledQuantityUOM']")
	public WebElement SampledQuantityUOM;

	public void SampledQuantityUOM(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//select[@formcontrolname='SampledQuantityUOM']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		SampledQuantityUOM.sendKeys(x);
		Thread.sleep(500);
		// SampledQuantity.clear();
	}

	// PO_Selection
	// ******************************************************************************************
	@FindBy(how = How.XPATH, using = "//*[@class='form-control']")
	public WebElement PO_Selection;

	public void PO_Selection() throws Exception {
		Select s = new Select(PO_Selection);
		s.selectByVisibleText("Other Goods Receipt");
	}

	public void PO_Selection_WithPO() throws Exception {
		Select s = new Select(PO_Selection);
		s.selectByVisibleText("Goods Receipt With PO");
	}

	// ******************************************************************************************
	// InwardType_Selection
	// ******************************************************************************************
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='InwardType']")
	public WebElement InwardType_Selection;

	public void InwardType_Selection() throws Exception {
		Select s = new Select(InwardType_Selection);
		s.selectByIndex(2);
	}

	// ******************************************************************************************
	// MaterialType_Selection
	// ******************************************************************************************
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='materialType']")
	public WebElement MaterialType_Selection;

	public void MaterialType_Selection() throws Exception {
		Select s = new Select(MaterialType_Selection);
		s.selectByIndex(2);
	}

	// StorageLocation_Selection
	// ******************************************************************************************
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='storageLocation']")
	public WebElement StorageLocation_Selection;

	public void StorageLocation_Selection() throws Exception {
		Select s = new Select(StorageLocation_Selection);
		s.selectByIndex(2);
	}

	// StorageCondition_Selection
	// ******************************************************************************************
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='uom']")
	public WebElement u;

	public void UOM_DDI() throws Exception {
		Select s = new Select(u);
		s.selectByIndex(2);
	}

	// ******************************************************************************************
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='storageCondition']")
	public WebElement StorageCondition_Selection;

	public void StorageCondition_Selection() throws Exception {
		Select s = new Select(StorageCondition_Selection);
		s.selectByIndex(2);
	}

	// ******************************************************************************************
	// ******************************************************************************************
	// ManufacturingDateFormat_Selection
	// ******************************************************************************************
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='mfgDateFormat']")
	public WebElement ManufacturingDateFormat_Selection;

	public void ManufacturingDateFormat_Selection() throws Exception {
		Select s = new Select(ManufacturingDateFormat_Selection);
		s.selectByIndex(2);
		Thread.sleep(2000);
	}

	// ******************************************************************************************
	// ******************************************************************************************
	// Request UOM
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='requestUOMId']")
	public WebElement RequestUOM;

	// ******************************************************************************************
	public void RequestUOM_SK(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//select[@formcontrolname='requestUOMId']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		RequestUOM.sendKeys(x);
		Thread.sleep(500);
	}

	// ******************************************************************************************
	public void RequestUOM_Select(String x) throws Exception {
		RequestUOM.click();
		Select s = new Select(RequestUOM);
		s.selectByVisibleText(x);
	}
	// **************************************uomId***********************************************
	// ******************************************************************************************

	// Request UOM
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='uomId']")
	public WebElement RecievedUOM;

	public void RecievedUOM_SK(String x) throws Exception {
		RecievedUOM.sendKeys(x);
		Thread.sleep(500);
	}

	public void RecievedUOM_Select(String x) throws Exception {
		RecievedUOM.click();
		Select s = new Select(RecievedUOM);
		s.selectByVisibleText(x);
	}

	public void RecievedUOM_DDI() throws Exception {
		RecievedUOM.click();
		Select s = new Select(RecievedUOM);
		s.selectByIndex(1);
	}
	// ******************************************************************************************
	// ******************************************************************************************

	// BatchSize
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='batchSize']")
	public WebElement BatchSize;

	public void BatchSize(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='batchSize']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		BatchSize.clear();
		BatchSize.sendKeys(x);// Thread.sleep(500);

	}

	// BPR_Number
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='bprNumber']")
	public WebElement BPR_Number;

	public void BPR_Number(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='bprNumber']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		BPR_Number.clear();
		Thread.sleep(2500);
		BPR_Number.sendKeys(x);
		Thread.sleep(500);
	}

	// ChallanNumber
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='challanNumber']")
	public WebElement ChallanNumber;

	public void ChallanNumber(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//input[@formcontrolname='challanNumber']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		// ChallanNumber.clear();
		ChallanNumber.sendKeys(x);
		Thread.sleep(500);
	}

	// Version_Number
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='bprVersionNumber']")
	public WebElement Version_Number;

	public void Version_Number(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='bprVersionNumber']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Version_Number.clear();
		Version_Number.sendKeys(x);// Thread.sleep(500);

	}

	public void Version_Number2(String x) throws Exception {
		Version_Number.sendKeys(x);
		Thread.sleep(500);
	}

	// BPRType
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='bprTypeId']")
	public WebElement BPRType;

	public void BPRType(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='bprTypeId']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		// BPRType.clear();
		BPRType.sendKeys(x);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	// Protocol_Number
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='protocolNumber']")
	public WebElement Protocol_Number;

	public void Protocol_Number(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='protocolNumber']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Protocol_Number.sendKeys(x);
		Thread.sleep(500);
		// SampledQuantity.clear();

	}

	// Type_Search_01
	@FindBy(how = How.XPATH, using = "(//input[@type='search'])[1]")
	public WebElement Type_Search_01;

	public void Type_Search_01(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//input[@type='search'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Type_Search_01.clear();
		Type_Search_01.sendKeys(x);
		Thread.sleep(500);

	}

	// Type_Search_02
	@FindBy(how = How.XPATH, using = "(//input[@type='search'])[2]")
	public WebElement Type_Search_02;

	public void Type_Search_02(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//input[@type='search'])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Type_Search_02.clear();
		Type_Search_02.sendKeys(x);
		Thread.sleep(500);

	}

	// Type_Search_03
	@FindBy(how = How.XPATH, using = "(//input[@type='search'])[3]")
	public WebElement Type_Search_03;

	public void Type_Search_03(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//input[@type='search'])[3]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Type_Search_03.clear();
		Type_Search_03.sendKeys(x);
		Thread.sleep(500);

	}

	// Type_Search_04
	@FindBy(how = How.XPATH, using = "(//input[@type='search'])[4]")
	public WebElement Type_Search_04;

	public void Type_Search_04(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//input[@type='search'])[4]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Type_Search_04.clear();
		Type_Search_04.sendKeys(x);
		Thread.sleep(500);

	}

	// Type_Search_05
	@FindBy(how = How.XPATH, using = "(//input[@type='search'])[5]")
	public WebElement Type_Search_05;

	public void Type_Search_05(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//input[@type='search'])[5]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Type_Search_05.clear();
		Type_Search_05.sendKeys(x);
		Thread.sleep(500);

	}

	// Type_Search_06
	@FindBy(how = How.XPATH, using = "(//input[@type='search'])[6]")
	public WebElement Type_Search_06;

	public void Type_Search_06(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//input[@type='search'])[6]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Type_Search_06.clear();
		Type_Search_06.sendKeys(x);
		Thread.sleep(500);

	}

	// Type_Search_08
	@FindBy(how = How.XPATH, using = "(//input[@type='search'])[8]")
	public WebElement Type_Search_08;

	public void Type_Search_08(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//input[@type='search'])[8]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Type_Search_08.clear();
		Type_Search_08.sendKeys(x);
		Thread.sleep(500);

	}

	// Type_Number_01
	@FindBy(how = How.XPATH, using = "(//input[@type='number'])[1]")
	public WebElement Type_Number_01;

	public void Type_Number_01(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Type_Number_01.click();
		Type_Number_01.clear();
		Thread.sleep(2500);
		Type_Number_01.sendKeys(x);
		Thread.sleep(500);

	}

	// Type_Number_02
	@FindBy(how = How.XPATH, using = "(//input[@type='number'])[2]")
	public WebElement Type_Number_02;

	public void Type_Number_02(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Type_Number_02.clear();
		Type_Number_02.sendKeys(x);
		Thread.sleep(500);

	}

	// Type_Number_03
	@FindBy(how = How.XPATH, using = "(//input[@type='number'])[3]")
	public WebElement Type_Number_03;

	public void Type_Number_03(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//input[@type='number'])[3]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Type_Number_03.clear();
		Type_Number_03.sendKeys(x);
		Thread.sleep(500);
	}

	// Type_Number_04
	@FindBy(how = How.XPATH, using = "(//input[@type='number'])[4]")
	public WebElement Type_Number_04;

	public void Type_Number_04(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//input[@type='number'])[4]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Type_Number_04.clear();
		Type_Number_04.sendKeys(x);
		Thread.sleep(500);

	}

	// EffectiveDate
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='EffectiveDate']")
	public WebElement EffectiveDate;

	public void EffectiveDate(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='EffectiveDate']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		// EffectiveDate.clear();
		EffectiveDate.sendKeys(x);
		Thread.sleep(500);

	}

	// TT_1
	@FindBy(xpath = "(//*[@type='text'])[1]")
	WebElement TT_1;

	public void TT_1(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_1.clear();
		TT_1.sendKeys(x);
		Thread.sleep(500);
		TT_1.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Thread.sleep(500);
	}

	// **********************************************************************************************************************
	// **********************************************************************************************************************
	// **********************************************************************************************************************
	// Special DropDown 1
	@FindBy(xpath = "(//*[@aria-autocomplete='list'])[1]")
	WebElement AA;

	@SuppressWarnings("deprecation")
	public void DD_01(String x) throws InterruptedException {
		// JavascriptExecutor Js = (JavascriptExecutor) driver;
		// Js.executeScript("arguments[0].setAttribute('style', 'background: ; border:
		// 1px solid red;');", AA);
		AA.click();
		AA.sendKeys(x);
		Thread.sleep(1000);
		AA.sendKeys(Keys.DOWN, Keys.ENTER);
		// AA.sendKeys(Keys.ARROW_DOWN, Keys.ENTER, Keys.ENTER);
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@SuppressWarnings("deprecation")
	public void DD_01M(String x) throws InterruptedException {
		AA.click();
		AA.sendKeys(x);
		Thread.sleep(1000);
		AA.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		Thread.sleep(1000);
		AA.sendKeys(Keys.DOWN, Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// Special DropDown 2
	@FindBy(xpath = "(//*[@aria-autocomplete='list'])[2]")
	WebElement BB;

	public void DD_02(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		BB.click();
		Thread.sleep(1000);
		BB.sendKeys(x);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		BB.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// Special DropDown 3
	@FindBy(xpath = "(//*[@aria-autocomplete='list'])[3]")
	WebElement CC;

	public void DD_03(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[3]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		CC.click();// Thread.sleep(2000);
		CC.sendKeys(x);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		CC.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// Special DropDown 4
	@FindBy(xpath = "(//*[@aria-autocomplete='list'])[4]")
	WebElement DD;

	public void DD_04(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[4]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		DD.click();// Thread.sleep(2000);
		DD.sendKeys(x);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		DD.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// Special DropDown 5
	@FindBy(xpath = "(//*[@aria-autocomplete='list'])[5]")
	WebElement EE;

	public void DD_05(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[5]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		EE.click();
		Thread.sleep(2000);
		EE.sendKeys(x);
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		EE.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// Special DropDown 6
	@FindBy(xpath = "(//*[@aria-autocomplete='list'])[6]")
	WebElement FF;

	public void DD_06(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[6]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		FF.click();// Thread.sleep(2000);
		FF.sendKeys(x);
		Thread.sleep(2000);// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		FF.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// Special DropDown 7
	@FindBy(xpath = "(//*[@aria-autocomplete='list'])[7]")
	WebElement GG;

	public void DD_07(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[7]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		GG.click();// Thread.sleep(2000);
		GG.sendKeys(x);
		Thread.sleep(2000);// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		GG.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// Special DropDown 8
	@FindBy(xpath = "(//*[@aria-autocomplete='list'])[8]")
	WebElement HH;

	public void DD_08(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[8]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		HH.click();// Thread.sleep(2000);
		HH.sendKeys(x);
		Thread.sleep(2000);// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		HH.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// Special DropDown 9
	@FindBy(xpath = "(//*[@aria-autocomplete='list'])[9]")
	WebElement II;

	public void DD_09(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[9]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		II.click();// Thread.sleep(2000);
		II.sendKeys(x);
		Thread.sleep(2000);// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		II.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// Special DropDown 10
	@FindBy(xpath = "(//*[@aria-autocomplete='list'])[10]")
	WebElement JJ;

	public void DD_10(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@aria-autocomplete='list'])[5]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		JJ.click();// Thread.sleep(2000);
		JJ.sendKeys(x);
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JJ.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// **********************************************************************************************************************
	// **********************************************************************************************************************
	// **********************************************************************************************************************
	// TT_1_AD_E
	@FindBy(xpath = "(//*[@type='text'])[1]")
	WebElement TT_1_AD_E;

	public void TT_1_AD_E(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_1_AD_E.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		TT_1_AD_E.sendKeys(x);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		TT_1_AD_E.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	// TT_4_AD_E
	@FindBy(xpath = "(//*[@type='text'])[4]")
	WebElement TT_4_AD_E;

	public void TT_4_AD_E(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[4]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_4_AD_E.click();
		Thread.sleep(2000);
		TT_4_AD_E.sendKeys(x);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		TT_4_AD_E.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "(//*[@type='text'])[11]")
	WebElement TT_11_AD_E;

	public void TT_11_AD_E(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[11]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_11_AD_E.click();
		Thread.sleep(2000);
		TT_11_AD_E.sendKeys(x);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		TT_11_AD_E.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	@FindBy(xpath = "(//*[@type='text'])[6]")
	WebElement TT_06_AD_E;

	public void TT_06_AD_E(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[6]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_06_AD_E.click();
		Thread.sleep(2000);
		TT_06_AD_E.sendKeys(x);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		TT_06_AD_E.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	@FindBy(xpath = "(//*[@type='text'])[8]")
	WebElement TT_08_AD_E;

	public void TT_08_AD_E(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[8]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_08_AD_E.click();
		Thread.sleep(2000);
		TT_08_AD_E.sendKeys(x);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		TT_08_AD_E.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(500);
	}

	@FindBy(xpath = "(//*[@type='text'])[index]")
	WebElement inputField;

	public void inputValuePlaceHolder(int index, String value) throws InterruptedException {
		WebElement inputElement = driver.findElement(By.xpath("(//*[@type='text'])[" + index + "]"));
		System.out.println(inputElement);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", inputElement);

		js.executeScript("arguments[0].click();", inputElement); // Use JavaScript to click
		Thread.sleep(500);
		inputElement.clear();
		inputElement.sendKeys(value);
		Thread.sleep(500);
		inputElement.sendKeys(Keys.ENTER);
		Thread.sleep(500);
	}

	// TT_2
	@FindBy(xpath = "(//*[@type='text'])[2]")
	WebElement TT_2;

	public void TT_2(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_2.click();
		Thread.sleep(1500);
		TT_2.clear();
		TT_2.sendKeys(x);
		Thread.sleep(1500);
		// TT_2.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);Thread.sleep(500);
	}

	// TT_3
	@FindBy(xpath = "(//*[@type='text'])[2]")
	WebElement TT_3;

	public void TT_3(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_3.click();
		Thread.sleep(500);
		TT_3.clear();
		TT_3.sendKeys(x);
		Thread.sleep(500);
		TT_3.sendKeys(Keys.ENTER);
		Thread.sleep(500);
	}

	// TT_4
	@FindBy(xpath = "(//*[@type='text'])[4]")
	WebElement TT_4;

	public void TT_4(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[4]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_4.click();
		Thread.sleep(500);
		TT_4.clear();
		TT_4.sendKeys(x);
		Thread.sleep(500);
		TT_4.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		// driver.findElement(By.xpath("(//div[@role='option'])[1]")).click();
		// TT_4.sendKeys(Keys.ENTER);Thread.sleep(500);
	}

	// TT_5
	@FindBy(xpath = "(//*[@type='text'])[5]")
	WebElement TT_5;

	public void TT_5(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[5]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_5.click();
		Thread.sleep(500);
		TT_5.clear();
		TT_5.sendKeys(x);
		Thread.sleep(500);

		TT_5.sendKeys(Keys.ENTER);
		Thread.sleep(500);
	}

	// TT_6
	@FindBy(xpath = "(//*[@type='text'])[6]")
	WebElement TT_6;

	public void TT_6(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[6]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_6.click();
		Thread.sleep(500);
		TT_6.clear();
		TT_6.sendKeys(x);
		Thread.sleep(500);
		TT_6.sendKeys(Keys.ENTER);
		Thread.sleep(500);
	}

	// TT_7
	@FindBy(xpath = "(//*[@type='text'])[7]")
	WebElement TT_7;

	public void TT_7(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[7]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_7.click();
		Thread.sleep(200);
		TT_7.clear();// Thread.sleep(500);

		TT_7.sendKeys(x);
		Thread.sleep(500);
		TT_7.sendKeys(Keys.ENTER);
		Thread.sleep(500);
	}

	// TT_8
	@FindBy(xpath = "(//*[@type='text'])[8]")
	WebElement TT_08;

	public void TT_08(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[8]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_08.click();
		Thread.sleep(500);
		TT_08.clear();// Thread.sleep(500);
		TT_08.sendKeys(x);
		Thread.sleep(500);
		TT_08.sendKeys(Keys.ENTER);
		Thread.sleep(500);
	}

	// TT_9
	@FindBy(xpath = "(//*[@type='text'])[9]")
	WebElement TT_09;

	public void TT_09(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[9]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_09.click();// Thread.sleep(500);
		TT_09.clear();// Thread.sleep(500);
		TT_09.sendKeys(x);// Thread.sleep(500);
		TT_09.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_10
	@FindBy(xpath = "(//*[@type='text'])[10]")
	WebElement TT_10;

	public void TT_10(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[10]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_10.click();// Thread.sleep(500);
		TT_10.clear();// Thread.sleep(500);

		TT_10.sendKeys(x);// Thread.sleep(500);
		// TT_10.sendKeys(Keys.ENTER);//Thread.sleep(500);
	}

	// TT_11
	@FindBy(xpath = "(//*[@type='text'])[11]")
	WebElement TT_11;

	public void TT_11(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[11]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_11.click();// Thread.sleep(500);
		TT_11.clear();// Thread.sleep(500);

		TT_11.sendKeys(x);// Thread.sleep(500);
		// TT_11.sendKeys(Keys.ENTER);//Thread.sleep(500);
	}

	// TT_12
	@FindBy(xpath = "(//*[@type='text'])[12]")
	WebElement TT_12;

	public void TT_12(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[12]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_12.click();// Thread.sleep(500);
		TT_12.clear();// Thread.sleep(500);

		TT_12.sendKeys(x);// Thread.sleep(500);
		TT_12.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_13
	@FindBy(xpath = "(//*[@type='text'])[13]")
	WebElement TT_13;

	public void TT_13(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[13]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_13.click();// Thread.sleep(500);
		TT_13.clear();// Thread.sleep(500);

		TT_13.sendKeys(x);// Thread.sleep(500);
		// TT_13.sendKeys(Keys.ENTER);//Thread.sleep(500);
	}

	// TT_14
	@FindBy(xpath = "(//*[@type='text'])[14]")
	WebElement TT_14;

	public void TT_14(String x) throws InterruptedException {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[14]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_14.click();// Thread.sleep(500);
		TT_14.clear();// Thread.sleep(500);

		TT_14.sendKeys(x);// Thread.sleep(500);
		// TT_14.sendKeys(Keys.ENTER);//Thread.sleep(500);
	}

	// TT_15
	@FindBy(xpath = "(//*[@type='text'])[15]")
	WebElement TT_15;

	public void TT_15(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[15]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_15.click();// Thread.sleep(500);
		TT_15.clear();// Thread.sleep(500);

		TT_15.sendKeys(x);// Thread.sleep(500);
		TT_15.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_16
	@FindBy(xpath = "(//*[@type='text'])[16]")
	WebElement TT_16;

	public void TT_16(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[16]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_16.click();// Thread.sleep(500);
		TT_16.clear();// Thread.sleep(500);

		TT_16.sendKeys(x);// Thread.sleep(500);
		TT_16.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	@FindBy(xpath = "(//*[@type='text'])[17]")
	WebElement TT_17;

	public void TT_17(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[17]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_17.click();// Thread.sleep(500);
		TT_17.clear();// Thread.sleep(500);

		TT_17.sendKeys(x);// Thread.sleep(500);
		TT_17.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_20
	@FindBy(xpath = "(//*[@type='text'])[20]")
	WebElement TT_20;

	public void TT_20(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[16]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_20.click();// Thread.sleep(500);
		TT_20.sendKeys(x);// Thread.sleep(500);
		TT_20.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_16_CSE//Click SendKeys Enter
	@FindBy(xpath = "(//*[@type='text'])[16]")
	WebElement TT_16_CSE;

	public void TT_16_CSE(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[16]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_16_CSE.click();// Thread.sleep(500);
		TT_16_CSE.sendKeys(x);// Thread.sleep(500);
		TT_16_CSE.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_16_CSE//Click SendKeys Enter
	@FindBy(xpath = "(//*[@type='text'])[14]")
	WebElement TT_14_CSE;

	public void TT_14_CSE(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[14]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_14_CSE.click();// Thread.sleep(500);
		TT_14_CSE.clear();
		TT_14_CSE.sendKeys(x);// Thread.sleep(500);
		TT_14_CSE.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_16_CSE//Click SendKeys Enter
	@FindBy(xpath = "(//*[@type='text'])[15]")
	WebElement TT_15_CSE;

	public void TT_15_CSE(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[15]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_15_CSE.click();// Thread.sleep(500);
		TT_15_CSE.sendKeys(x);// Thread.sleep(500);
		TT_15_CSE.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_25_CSE//Click SendKeys Enter
	@FindBy(xpath = "(//*[@type='text'])[25]")
	WebElement TT_25_CSE;

	public void TT_25_CSE(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[25]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_25_CSE.click();// Thread.sleep(500);
		TT_25_CSE.sendKeys(x);// Thread.sleep(500);
		TT_25_CSE.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_17_CSE//Click SendKeys Enter
	@FindBy(xpath = "(//*[@type='text'])[17]")
	WebElement TT_17_CSE;

	public void TT_17_CSE(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[17]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_17_CSE.click();// Thread.sleep(500);
		TT_17_CSE.clear();
		TT_17_CSE.sendKeys(x);// Thread.sleep(500);
		TT_17_CSE.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// @FindBy(xpath = "(//*[@type='text'])[17]")
	//
	// WebElement TT_17;
	//
	// public void TextBox17E(String x) throws InterruptedException
	//
	// {
	//
	// WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[17]"));
	//
	// JavascriptExecutor Js = (JavascriptExecutor) driver;
	//
	// Js.executeScript("arguments[0].setAttribute('style', 'background: ; border:
	// 1px solid red;');", Color);
	//
	// TT_17.click();// Thread.sleep(500);
	// TT_17.clear();// Thread.sleep(500);
	// TT_17.sendKeys(x);// Thread.sleep(500);
	//
	// TT_17.sendKeys(Keys.ENTER);// Thread.sleep(500);
	//
	// }
	// TT_18_CSE//Click SendKeys Enter
	@FindBy(xpath = "(//*[@type='text'])[18]")
	WebElement TT_18_CSE;

	public void TT_18_CSE(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[18]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_18_CSE.click();// Thread.sleep(500);
		TT_18_CSE.clear();
		TT_18_CSE.sendKeys(x);// Thread.sleep(500);
		TT_18_CSE.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_19_CSE//Click SendKeys Enter
	@FindBy(xpath = "(//*[@type='text'])[19]")
	WebElement TT_19_CSE;

	public void TT_19_CSE(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[19]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_19_CSE.click();// Thread.sleep(500);
		TT_19_CSE.clear();
		TT_19_CSE.sendKeys(x);// Thread.sleep(500);
		TT_19_CSE.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_20_CSE//Click SendKeys Enter
	@FindBy(xpath = "(//*[@type='text'])[20]")
	WebElement TT_20_CSE;

	public void TT_20_CSE(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[20]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_20_CSE.click();// Thread.sleep(500);
		TT_20_CSE.clear();
		TT_20_CSE.sendKeys(x);// Thread.sleep(500);
		TT_20_CSE.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_21_CSE//Click SendKeys Enter
	@FindBy(xpath = "(//*[@type='text'])[21]")
	WebElement TT_21_CSE;

	public void TT_21_CSE(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[21]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_21_CSE.click();
		Thread.sleep(500);
		TT_21_CSE.sendKeys(x);
		Thread.sleep(500);
		TT_21_CSE.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_22_CSE//Click SendKeys Enter
	@FindBy(xpath = "(//*[@type='text'])[22]")
	WebElement TT_22_CSE;

	public void TT_22_CSE(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[22]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_22_CSE.click();// Thread.sleep(500);
		TT_22_CSE.sendKeys(x);// Thread.sleep(500);
		TT_22_CSE.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TT_22_CSE//Click SendKeys Enter
	@FindBy(xpath = "(//*[@type='text'])[23]")
	WebElement TT_23_CSE;

	public void TT_23_CSE(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[23]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_23_CSE.click();// Thread.sleep(500);
		TT_23_CSE.sendKeys(x);// Thread.sleep(500);
		TT_23_CSE.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	@FindBy(xpath = "(//*[@type='text'])[24]")
	WebElement TT_24_CSE;

	public void TT_24_CSE(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[24]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TT_24_CSE.click();// Thread.sleep(500);
		TT_24_CSE.sendKeys(x);// Thread.sleep(500);
		TT_24_CSE.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TextBox27
	@FindBy(xpath = "(//*[@type='text'])[27]")
	WebElement TextBox27;

	public void TT27(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[27]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TextBox27.click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TextBox27.clear();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TextBox27.sendKeys(x);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// TextBox28
	@FindBy(xpath = "(//*[@type='text'])[28]")
	WebElement TextBox28;

	public void TT28(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[28]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TextBox28.click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TextBox28.clear();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TextBox28.sendKeys(x);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// TextBox29
	@FindBy(xpath = "(//*[@type='text'])[29]")
	WebElement TextBox29;

	public void TT29(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[29]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TextBox29.click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TextBox29.clear();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TextBox29.sendKeys(x);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// TextBox28
	@FindBy(xpath = "(//*[@type='text'])[30]")
	WebElement TextBox30;

	public void TT30(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[30]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TextBox30.click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TextBox30.clear();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TextBox30.sendKeys(x);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "(//*[@type='text'])[31]")
	WebElement TextBox31;

	public void TT31(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[31]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TextBox31.click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TextBox31.clear();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TextBox31.sendKeys(x);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "(//*[@type='text'])[32]")
	WebElement TextBox32;

	public void TT32(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='text'])[32]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TextBox32.click();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TextBox32.clear();
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TextBox32.sendKeys(x);
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// **************************************************************************************************************8*****
	// TEN_01
	@FindBy(xpath = "(//*[@type='number'])[1]")
	WebElement TEN_01;

	public void TEN_01(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='number'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TEN_01.click();// Thread.sleep(500);
		TEN_01.clear();
		TEN_01.sendKeys(x);// Thread.sleep(500);
		TEN_01.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TEN_02
	@FindBy(xpath = "(//*[@type='number'])[2]")
	WebElement TEN_02;

	public void TEN_02(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='number'])[2]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TEN_02.click();// Thread.sleep(500);
		TEN_02.clear();
		TEN_02.sendKeys(x);// Thread.sleep(500);
		TEN_02.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// TEN3
	@FindBy(xpath = "(//*[@type='number'])[3]")
	WebElement TEN03;

	public void TEN_03(String x) throws InterruptedException {

		WebElement Color = driver.findElement(By.xpath("(//*[@type='number'])[3]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 1px solid red;');", Color);

		TEN03.click();// Thread.sleep(500);
		TEN03.clear();
		TEN03.sendKeys(x);// Thread.sleep(500);
		TEN03.sendKeys(Keys.ENTER);// Thread.sleep(500);
	}

	// *************************************************************************************
	// CustomerPONumber
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='customerPONumber']")
	public WebElement CustomerPONumber;

	public void CustomerPONumber(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='customerPONumber']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		// CustomerPONumber.clear();
		CustomerPONumber.sendKeys(x);
		Thread.sleep(500);

	}

	// CustomerPOQuantity
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='customerPoQuantity']")
	public WebElement CustomerPOQuantity;

	public void CustomerPOQuantity(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='customerPoQuantity']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		CustomerPOQuantity.sendKeys(x);
		Thread.sleep(500);

	}

	// DispatchType
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='dispatchTypeId']")
	public WebElement DispatchType;

	public void DispatchType(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='dispatchTypeId']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		DispatchType.sendKeys(x);
		Thread.sleep(500);

	}

	// Market
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='marketId']")
	public WebElement Market;

	public void Market(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='marketId']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Market.sendKeys(x);
		Thread.sleep(500);

	}

	// PharmaCopeiaId
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='pharmaCopeiaId']")
	public WebElement PharmaCopeia;

	public void PharmaCopeia(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='pharmaCopeiaId']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		PharmaCopeia.sendKeys(x);
		Thread.sleep(500);

	}

	// Street
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='street']")
	public WebElement Street;

	public void Street(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='street']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Street.clear();
		Street.sendKeys(x);
		Thread.sleep(500);

	}

	// Street1
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='street1']")
	public WebElement Street1;

	public void Street1(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='street1']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Street1.sendKeys(x);
		Thread.sleep(500);

	}

	// Street2
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='street2']")
	public WebElement Street2;

	public void Street2(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='street2']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		Street2.sendKeys(x);
		Thread.sleep(500);

	}

	// Country
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='country' or @formcontrolname='countryId' ]")
	public WebElement Country;

	public void Country(String x) throws Exception {
		WebElement Color = driver
				.findElement(By.xpath("//*[@formcontrolname='country' or @formcontrolname='countryId' ]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		Country.sendKeys(x);
		Thread.sleep(500);
	}

	public void Country_DD_VT(String x) throws Exception {
		Country.click();
		Select S = new Select(Country);
		S.selectByVisibleText(x);
		Thread.sleep(1000);
	}

	// *******************************************-State-********************************************************
	// **********************************************************************************************************
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='state' or @formcontrolname='stateId']")
	public WebElement State;

	public void State(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='state' or @formcontrolname='stateId']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		State.sendKeys(x);
		Thread.sleep(500);
	}

	public void State_DDVT(String x) throws Exception {
		State.click();
		Select S = new Select(State);
		S.selectByVisibleText(x);
		Thread.sleep(1000);
	}

	public void State_DDI() throws Exception {
		// State.click();
		Select S = new Select(State);
		S.selectByIndex(2);
		Thread.sleep(1000);
	}

	// *******************************************-City-*********************************************************
	// **********************************************************************************************************
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='cityId']")
	public WebElement CityId;

	public void CityId(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='cityId']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);

		CityId.sendKeys(x);
		Thread.sleep(1500);
	}

	public void City_DDVT(String x) throws Exception {
		CityId.click();
		Select S = new Select(CityId);
		S.selectByVisibleText(x);
		Thread.sleep(1000);
	}

	public void City_DDI() throws Exception {
		// CityId.click();
		Select S = new Select(CityId);
		S.selectByIndex(2);
		Thread.sleep(1000);
	}

	// **********************************************************************************************************
	// **********************************************************************************************************
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='postalCode']")
	public WebElement postal;

	public void Postal_Code(String x) throws Exception {
		postal.clear();
		postal.sendKeys(x);
		Thread.sleep(2000);
	}

	// VendorType
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='vendorType']")
	public WebElement VendorType;

	public void VendorType(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='vendorType']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		VendorType.sendKeys(x);
		Thread.sleep(500);

	}

	// ReviewApprovalCategory
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='Category']")
	public WebElement ReviewApprovalCategory;

	public void ReviewApprovalCategory(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='Category']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		ReviewApprovalCategory.sendKeys(x);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Thread.sleep(500);

	}

	// ActionLevelApproverAction
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='approverAction' or @formcontrolname='actionLevelId' or  @formcontrolname='actionLevel' or@formcontrolname='status'  or @formcontrolname='action' or @formcontrolname='AnalysisStatus']")
	public WebElement ActionLevelApproverAction;

	public void ActionLevelApproverAction(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath(
				"//*[@formcontrolname='approverAction' or @formcontrolname='actionLevelId' or  @formcontrolname='actionLevel' or@formcontrolname='status'  or @formcontrolname='action' or @formcontrolname='AnalysisStatus']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		ActionLevelApproverAction.sendKeys(x);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Thread.sleep(500);

	}

	// ActionLevel
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='approverAction' or @formcontrolname='status']")
	public WebElement ActionLevel;

	public void ActionLevel(String x) throws Exception {
		WebElement Color = driver
				.findElement(By.xpath("//*[@formcontrolname='approverAction' or @formcontrolname='status']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		ActionLevel.sendKeys(x);
		Thread.sleep(500);

	}

	// VendorStatus
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='vendorStatus']")
	public WebElement VendorStatus;

	public void VendorStatus(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='vendorStatus']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		VendorStatus.sendKeys(x);
		Thread.sleep(500);

	}

	// fromDate
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='fromDate']")
	public WebElement fromDate;

	public void fromDate(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='fromDate']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		fromDate.sendKeys(x);
		Thread.sleep(500);

	}

	// TypeDate
	@FindBy(how = How.XPATH, using = "(//*[@type='date'])[1]")
	public WebElement typeDate;

	public void typeDate(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("(//*[@type='date'])[1]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		typeDate.sendKeys(x);
		Thread.sleep(500);

	}

	// todate
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='todate']")
	public WebElement todate;

	public void todate(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='todate']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		todate.sendKeys(x);
		Thread.sleep(500);

	}

	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='manufacturingDate']")
	public WebElement ManufacturingDate;

	public void ManufacturingDate(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='manufacturingDate']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		ManufacturingDate.sendKeys(x);
		Thread.sleep(500);

	}

	// qualifiedDate
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='qualifiedDate']")
	public WebElement qualifiedDate;

	public void qualifiedDate(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='qualifiedDate']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		qualifiedDate.sendKeys(x);
		Thread.sleep(500);

	}

	// VendorStatusDD
	@FindBy(how = How.XPATH, using = "//*[@formcontrolname='supplierStatus']")
	public WebElement VendorStatusDD;

	public void VendorStatusDD(String x) throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='supplierStatus']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color);
		VendorStatusDD.sendKeys(x);
		Thread.sleep(500);

	}

	// **********************************************************************************************************************************************************
	// Eye_FF_01
	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-eye'])[1]")
	public WebElement Eye_FF_01;

	public void Eye_FF_01() throws Exception {
		try {
			Eye_FF_01.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(4000);
	}
	// **********************************************************************************************************************************************************
}
