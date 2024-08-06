
package F.pageobjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PWO_Xpath {

	WebDriver driver;
	public PWO_Xpath(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	public	WebDriverWait wait;//globally declared

	//common clicks
	@FindBy(how=How.XPATH,using="/html/body/app-root/div/app-layout/nav/div/ul[1]/li[3]/a/span")
	public WebElement menu;
	public void menuclick()
	{
		Actions a = new Actions(driver);
		a.doubleClick(menu).perform();
	}
	//Create
	@FindBy(how=How.XPATH,using="//button[contains(text(),'New') or @title='Create' or contains(text(),'Create')]")
	public WebElement Create;
	public void Create() throws Exception
	{
		Create.click();
		Thread.sleep(2500);
	}

	//Create2
	@FindBy(how=How.XPATH,using="(//button[contains(text(),'Create')])[2]")
	public WebElement Create2;
	public void Create2() throws Exception
	{
		Create2.click();
		Thread.sleep(2500);
	}

	//ApplicationTileClick

	@FindBy(xpath = "(//a[contains(.,'WMSPWO - Unit-5 ')])")
	public WebElement AppTile_Intermediate_WMSPWO;
	public void AppTile_Intermediate_WMSPWO() throws Exception
	{
		//wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOf((AppTile_Intermediate_WMSPWO)));


WebElement Color = driver.findElement(By.xpath("(//a[contains(.,'WMSPWO - Unit-5 ')])"));
JavascriptExecutor Js = (JavascriptExecutor) driver;
Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);

		AppTile_Intermediate_WMSPWO.click();
		Thread.sleep(3000);
	}


	//Menu_Click
	@FindBy(xpath = "//*[@id='navbarDropdown']")
	public WebElement Menu_Click;
	public void Menu_Click() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Menu_Click)));
		Menu_Click.click();
		Thread.sleep(2500);
	}

	//Area_Master
	@FindBy(xpath = "(//*[@class='nav-link'])[7]")
	public WebElement Area_Master;
	public void Area_Master() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Area_Master)));
		Area_Master.click();
		Thread.sleep(2500);
	}

	//Work_Order_Log
	@FindBy(xpath = "(//*[@class='nav-link'])[13]")
	public WebElement Work_Order_Log;
	public void Work_Order_Log() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Work_Order_Log)));
		Work_Order_Log.click();
		Thread.sleep(3000);
	}

	//Work_Order_Trend
	@FindBy(xpath = "(//*[@class='nav-link'])[15]")
	public WebElement Work_Order_Trend;
	public void Work_Order_Trend() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Work_Order_Trend)));
		Work_Order_Trend.click();
		Thread.sleep(2500);
	}

	//Get_List
	@FindBy(xpath = "//button[contains(.,'Get List ')]")
	public WebElement Get_List;
	public void Get_List() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Get_List)));
		Get_List.click();
		Thread.sleep(3000);
	}

	//Get_List
	@FindBy(xpath = "//*[@id='Get']")
	public WebElement Get;
	public void Get() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Get)));
		Get.click();
		Thread.sleep(3000);
	}

	//Reset
	@FindBy(xpath = "//button[contains(.,'//button[contains(.,'Reset ')]')]")
	public WebElement Reset;
	public void Reset() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Reset)));
		Reset.click();
		Thread.sleep(2500);
	}


	//Equipment_History_Log
	@FindBy(xpath = "(//*[@class='nav-link'])[14]")
	public WebElement Equipment_History_Log;
	public void Equipment_History_Log() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Equipment_History_Log)));
		Equipment_History_Log.click();
		Thread.sleep(2500);
	}

	//Area_SK
	@FindBy(xpath = "//*[@formcontrolname='areaName']")
	WebElement Area_SK;
	public void enteredArea_SK(String user) throws Exception
	{
		Area_SK.clear();
		Area_SK.sendKeys(user);
		Thread.sleep(2500);
	}

	//Room_No_SK
	@FindBy(xpath = "//*[@formcontrolname='roomNo']")
	WebElement Room_No_SK;
	public void enteredRoom_No_SK(String user) throws Exception
	{
		Room_No_SK.clear();
		Room_No_SK.sendKeys(user);
		Thread.sleep(2500);
	}

	//Equipment_Master
	@FindBy(xpath = "(//*[@class='nav-link'])[8]")
	public WebElement Equipment_Master;
	public void Equipment_Master() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Equipment_Master)));
		Equipment_Master.click();
		Thread.sleep(2500);
	}
	//Area_SK
	@FindBy(xpath = "//*[@formcontrolname='equipmentId']")
	WebElement equipmentId_SK;
	public void enteredequipmentId_SK(String user) throws Exception
	{
		equipmentId_SK.clear();
		equipmentId_SK.sendKeys(user);
		Thread.sleep(2500);
	}



	//equipmentName_SK
	@FindBy(xpath = "//*[@formcontrolname='equipmentName']")
	WebElement equipmentName_SK;
	public void enteredequipmentName_SK(String user) throws Exception
	{
		equipmentName_SK.clear();
		equipmentName_SK.sendKeys(user);
		Thread.sleep(2500);
	}

	//make

	//model

	//serialNo

	//capacity

	//manufacturerORSupplier

	//NatureOfBreakdown_Master

	@FindBy(xpath = "(//*[@class='nav-link'])[9]")
	public WebElement NatureOfBreakdown_Master;
	public void NatureOfBreakdown_Master() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((NatureOfBreakdown_Master)));
		NatureOfBreakdown_Master.click();
		Thread.sleep(2500);
	}

	//NatureOfBreakdown_Master_SK
	@FindBy(xpath = "//*[@formcontrolname='natureOfBreakdownName']")
	WebElement NatureOfBreakdown_Master_SK;
	public void enteredNatureOfBreakdown_Master_SK(String user) throws Exception
	{
		NatureOfBreakdown_Master_SK.clear();
		NatureOfBreakdown_Master_SK.sendKeys(user);
		Thread.sleep(2500);
	}

	//Root_Cause_Type_Master
	@FindBy(xpath = "(//*[@class='nav-link'])[10]")
	public WebElement Root_Cause_Type_Master;
	public void Root_Cause_Type_Master() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Root_Cause_Type_Master)));
		Root_Cause_Type_Master.click();
		Thread.sleep(2500);
	}
	//Root_Cause_Type_SK
	@FindBy(xpath = "//*[@formcontrolname='equipmentName']")
	WebElement Root_Cause_Type_SK;
	public void enteredRoot_Cause_Type_SK(String user) throws Exception
	{
		Root_Cause_Type_SK.clear();
		Root_Cause_Type_SK.sendKeys(user);
		Thread.sleep(2500);
	}

	//Job_Concern_To_Master
	@FindBy(xpath = "(//*[@class='nav-link'])[11]")
	public WebElement Job_Concern_To_Master;
	public void Job_Concern_To_Master() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Job_Concern_To_Master)));
		Job_Concern_To_Master.click();
		Thread.sleep(2500);
	}

	//Job_Concern_To_SK
	@FindBy(xpath = "//*[@formcontrolname='jobConcernDescription']")
	WebElement Job_Concern_To_SK;
	public void enteredJob_Concern_To_SK(String user) throws Exception
	{
		Job_Concern_To_SK.clear();
		Job_Concern_To_SK.sendKeys(user);
		Thread.sleep(2500);
	}

	//EHR_Initiator_Master
	@FindBy(xpath = "(//*[@class='nav-link'])[16]")
	public WebElement EHR_Initiator_Master;
	public void EHR_Initiator_Master() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((EHR_Initiator_Master)));
		EHR_Initiator_Master.click();
		Thread.sleep(2500);
	}

	//EHR_Initiator
	@FindBy(how=How.XPATH,using="//button[contains(text(),'EHR Initiate ')]")
	public WebElement EHR_Initiator;
	public void EHR_Initiator() throws Exception
	{
		EHR_Initiator.click();
		Thread.sleep(2500);
	}

	//EquipmentId_DD[DD]
	@FindBy(xpath = "//select[@formcontrolname='equipmentId']")
	WebElement EquipmentId_DD;
	public void selectEquipmentId_DD() throws Exception
	{
		Select s=new Select(EquipmentId_DD);
		s.selectByIndex(1);
		Thread.sleep(2500);
	}

	//Details_Of_Work_SK
	@FindBy(xpath = "//*[@formcontrolname='detailsOfWork']")
	WebElement Details_Of_Work_SK;
	public void enteredDetails_Of_Work_SK(String user) throws Exception
	{
		Details_Of_Work_SK.clear();
		Details_Of_Work_SK.sendKeys(user);
		Thread.sleep(3000);
	}

	//SpareDetails_SK
	@FindBy(xpath = "//*[@formcontrolname='spareDetails']")
	WebElement SpareDetails_SK;
	public void enteredSpareDetails_SK(String user) throws Exception
	{
		SpareDetails_SK.clear();
		SpareDetails_SK.sendKeys(user);
		Thread.sleep(2500);
	}




	//CheckBox_2
			@FindBy(xpath = "(//*[@type='radio'])[2]")
			public WebElement CB_2;
			public void CB_2() throws Exception
			{
				CB_2.click();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				Thread.sleep(2500);
			}
			//CheckBox_4
			@FindBy(xpath = "(//*[@type='radio'])[4]")
			public WebElement CB_4;
			public void CB_4() throws Exception
			{
				CB_4.click();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				Thread.sleep(2500);
			}


			//Date_TIme_Click
			@FindBy(xpath = "//*[@formcontrolname='initiateDateTime']")
			public WebElement Date_Time_Click_Future;
			public void Date_Time_Click_Future() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Date_Time_Click_Future)));
				//Date_TIme_Click.click();
				WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='initiateDateTime']"));
				JavascriptExecutor Js = (JavascriptExecutor) driver;
				Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);
				Date_Time_Click_Future.sendKeys("230520231010");
				Thread.sleep(2500);
			}

			//Date_TIme_Click
			@FindBy(xpath = "//*[@formcontrolname='initiateDateTime']")
			public WebElement Date_Time_Click_Ok;
			public void Date_Time_Click_Ok() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Date_Time_Click_Ok)));
				//Date_TIme_Click.click();
				WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='initiateDateTime']"));
				JavascriptExecutor Js = (JavascriptExecutor) driver;
				Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);
				Date_Time_Click_Ok.sendKeys("220520221010");
				Thread.sleep(2500);
			}


			//EHR_Approver_Master
			@FindBy(xpath = "(//*[@class='nav-link'])[17]")
			public WebElement EHR_Approver_Master;
			public void EHR_Approver_Master() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((EHR_Approver_Master)));
				EHR_Approver_Master.click();
				Thread.sleep(2500);
			}

			//EYE_1
			@FindBy(xpath = "(//*[@class='fa fa-eye'])[1]")
			public WebElement EYE_1;
			public void EYE_1() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((EYE_1)));
				EYE_1.click();
				Thread.sleep(2500);
			}

			//click_to_view_1
			@FindBy(how=How.XPATH,using="(//*[@title='click to view'])[1]")
			public WebElement click_to_view_1;
			public void click_to_view_1() throws Exception
			{
				try {
					click_to_view_1.click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Thread.sleep(4000);
			}

			//click_to_view_2
			@FindBy(how=How.XPATH,using="(//*[@title='click to view'])[2]")
			public WebElement click_to_view_2;
			public void click_to_view_2() throws Exception
			{
				try {
					click_to_view_2.click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Thread.sleep(4000);
			}

			//click_to_view_3
			@FindBy(how=How.XPATH,using="(//*[@title='click to view'])[3]")
			public WebElement click_to_view_3;
			public void click_to_view_3() throws Exception
			{
				try {
					click_to_view_3.click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Thread.sleep(4000);
			}

			//Initiated_List
			@FindBy(how=How.XPATH,using="//a[contains(.,'Initiated List')]")
			public WebElement Initiated_List;
			public void Initiated_List() throws Exception
			{

WebElement Color = driver.findElement(By.xpath("//a[contains(.,'Initiated List')]"));
JavascriptExecutor Js = (JavascriptExecutor) driver;
Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);
				Initiated_List.click();
				Thread.sleep(2500);
			}

			//Return_List
			@FindBy(how=How.XPATH,using="//a[contains(.,'Return List')]")
			public WebElement Return_List;
			public void Return_List() throws Exception
			{
				Return_List.click();
				Thread.sleep(2500);
			}

			//Initiate_Button
			@FindBy(how=How.XPATH,using="//button[contains(text(),'Initiate ')]")
			public WebElement Initiate_Button;
			public void Initiate_Button() throws Exception
			{


				WebElement Color = driver.findElement(By.xpath("//button[contains(text(),'Initiate ')]"));
				JavascriptExecutor Js = (JavascriptExecutor) driver;
				Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);

				Initiate_Button.click();
				Thread.sleep(2500);
			}


			//Area_DD[DD]
			@FindBy(xpath = "//select[@formcontrolname='areaId']")
			WebElement Area_DD;
			public void selectArea_DD() throws Exception
			{
				Select s=new Select(Area_DD);
				s.selectByIndex(3);
				Thread.sleep(2500);
			}

			//briefDescription_SK
			@FindBy(xpath = "//*[@formcontrolname='briefDescription']")
			WebElement briefDescription_SK;
			public void enteredbriefDescription_SK(String user) throws Exception
			{
				WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='briefDescription']"));
				JavascriptExecutor Js = (JavascriptExecutor) driver;
				Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid red;');", Color);
				briefDescription_SK.clear();
				briefDescription_SK.sendKeys(user);
				Thread.sleep(2500);
			}

			//activityInProcess_SK
			@FindBy(xpath = "//*[@formcontrolname='activityInProcess']")
			WebElement activityInProcess_SK;
			public void enteredactivityInProcess_SK(String user) throws Exception
			{
				WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='activityInProcess']"));
				JavascriptExecutor Js = (JavascriptExecutor) driver;
				Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid red;');", Color);
				activityInProcess_SK.clear();
				activityInProcess_SK.sendKeys(user);
				Thread.sleep(2500);
			}

			//PreviousActivity_SK
			@FindBy(xpath = "//*[@formcontrolname='PreviousActivity']")
			WebElement PreviousActivity_SK;
			public void enteredPreviousActivity_SK(String user) throws Exception
			{
				WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='PreviousActivity']"));
				JavascriptExecutor Js = (JavascriptExecutor) driver;
				Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid red;');", Color);
				PreviousActivity_SK.clear();
				PreviousActivity_SK.sendKeys(user);
				Thread.sleep(2500);
			}



			//activityInProcess_SK
			@FindBy(xpath = "//*[@formcontrolname='proposedActions']")
			WebElement proposedActions_SK;
			public void enteredproposedActions_SK(String user) throws Exception
			{
				WebElement Color = driver.findElement(By.xpath("//*[@formcontrolname='proposedActions']"));
				JavascriptExecutor Js = (JavascriptExecutor) driver;
				Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid red;');", Color);
				proposedActions_SK.sendKeys(user);
				Thread.sleep(2500);
				proposedActions_SK.clear();
				Thread.sleep(2500);
				proposedActions_SK.sendKeys(user);
				Thread.sleep(2500);
			}


			//Pending_For_Initial_Review
			@FindBy(how=How.XPATH,using="//a[contains(.,'Pending For Initial Review')]")
			public WebElement Pending_For_Initial_Review;
			public void Pending_For_Initial_Review() throws Exception
			{
				Pending_For_Initial_Review.click();
				Thread.sleep(2500);
			}

			//Pending_For_QA_Review
			@FindBy(how=How.XPATH,using="//a[contains(.,'Pending For  QA Review')]")
			public WebElement Pending_For_QA_Review;
			public void Pending_For_QA_Review() throws Exception
			{
				Pending_For_QA_Review.click();
				Thread.sleep(2500);
			}

			//Work_Order_ID
			@FindBy(how=How.XPATH,using="//*[@class='blueC text-center']")
			public WebElement Work_Order_ID;
			public void Work_Order_ID() throws Exception
			{
				Work_Order_ID.click();
				Thread.sleep(2500);
			}

			//Initial_Review_by_Engineering
			@FindBy(how=How.XPATH,using="(//div[contains(.,' Initial Review by Engineering ')])[2]")
			public WebElement Initial_Review_by_Engineering;
			public void Initial_Review_by_Engineering() throws Exception
			{
				Initial_Review_by_Engineering.click();
				Thread.sleep(2500);
			}

			//Review_By_QA
			@FindBy(how=How.XPATH,using="(//div[contains(.,' Review By QA')])[2]")
			public WebElement Review_By_QA;
			public void Review_By_QA() throws Exception
			{
				Review_By_QA.click();
				Thread.sleep(2500);
			}

//Approver Screen
			//NatureOfBreakDown_DD[DD]
			@FindBy(xpath = "//select[@formcontrolname='natureOfBreakdownId']")
			WebElement NatureOfBreakDown_DD_Minor;
			public void selectNatureOfBreakDown_DD_Minor(String x) throws Exception
			{
				NatureOfBreakDown_DD_Minor.click();
				Select s=new Select(NatureOfBreakDown_DD_Minor);

				//s.selectByVisibleText(x);
				s.selectByIndex(2);
				Thread.sleep(3000);
			}

			//NatureOfBreakDown_DD[DD]
			@FindBy(xpath = "//select[@formcontrolname='natureOfBreakdownId']")
			WebElement NatureOfBreakDown_DD_Major;
			public void selectNatureOfBreakDown_DD_Major(String x) throws Exception
			{
				NatureOfBreakDown_DD_Major.click();
				Select s=new Select(NatureOfBreakDown_DD_Major);

				//s.selectByVisibleText(x);
				s.selectByIndex(1);
				Thread.sleep(3000);
			}


			@FindBy(xpath = "//button[contains(.,'Approve ')]")
			public WebElement Approve_;
			public void Approve_() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Approve_)));
				Approve_.click();
				Thread.sleep(2500);
			}

			@FindBy(xpath = "//button[contains(.,'Approve')]")
			public WebElement Approve;
			public void Approve() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Approve)));
				Approve.click();
				Thread.sleep(2500);
			}
			//Return
			@FindBy(xpath = "//a[contains(.,'Return')]")
			public WebElement Return;
			public void Return() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Return)));

				WebElement Color = driver.findElement(By.xpath("//a[contains(.,'Return')]"));
				JavascriptExecutor Js = (JavascriptExecutor) driver;
				Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid red;');", Color);
				Return.click();
				Thread.sleep(2500);
			}

			//Cancel
			@FindBy(xpath = "//*[contains(text(),'Cancel ')]")
			public WebElement Cancel;
			public void Cancel() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Cancel)));
				Cancel.click();
				Thread.sleep(2500);
			}


			//RootCauseType_DD[DD]
			@FindBy(xpath = "//select[@formcontrolname='rootCauseType']")
			WebElement RootCauseType_DD;
			public void selectRootCauseType_DD() throws Exception
			{
				Select s=new Select(RootCauseType_DD);
				s.selectByIndex(6);
				//s.selectByVisibleText("Others");
				Thread.sleep(2500);
			}

			//ReInitiate
			@FindBy(xpath = "//a[contains(.,'Re-Initiate ')]")
			public WebElement ReInitiate;
			public void ReInitiate() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((ReInitiate)));
				ReInitiate.click();
				Thread.sleep(2500);
			}


			//Reject
			@FindBy(xpath = "//a[contains(.,'Reject ')]")
			public WebElement Reject;
			public void Reject() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Reject)));
				Reject.click();
				Thread.sleep(2500);
			}

			//Document_View
			@FindBy(how=How.XPATH,using="//*[@title='Click to view']")
			public WebElement Document_View;
			public void Document_View() throws Exception
			{
				Document_View.click();
				Thread.sleep(4000);
			}


			//Document_Delete
			@FindBy(how=How.XPATH,using="//*[@title='Click to delete']")
			public WebElement Document_Delete;
			public void Document_Delete() throws Exception
			{
				Document_Delete.click();
				Thread.sleep(4000);
			}

//Work_Order_Initiation_Details
			@FindBy(xpath = "(//*[contains(text(),' Work Order Initiation Details')])[1]")
			public WebElement Work_Order_Initiation_Details;
			public void Work_Order_Initiation_Details() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Work_Order_Initiation_Details)));
				Work_Order_Initiation_Details.click();
				Thread.sleep(2500);
			}

//Review_by_QA
			@FindBy(xpath = "(//*[contains(text(), 'Review By QA')])[1]")
			public WebElement Approve_by_QA;
			public void Approve_by_QA() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Approve_by_QA)));
				Approve_by_QA.click();
				Thread.sleep(2500);
			}

//Work_Clearance_Details
			@FindBy(xpath = "//*[contains(text(),' Work Clearance Details')]")
			public WebElement Work_Clearance_Details;
			public void Work_Clearance_Details() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Work_Clearance_Details)));
				Work_Clearance_Details.click();
				Thread.sleep(2500);
			}
			//Execution_by_Engineering
			@FindBy(xpath = "(//*[contains(.,' Execution by Engineering')])[10]")
			public WebElement Execution_by_Engineering;
			public void Execution_by_Engineering() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Execution_by_Engineering)));
				Execution_by_Engineering.click();
				Thread.sleep(2500);
			}

			//Execution_Review_by_Engineering
			@FindBy(xpath = "(//*[contains(.,' Execution Review By Engineering')])[9]")
			public WebElement Execution_Review_by_Engineering;
			public void Execution_Review_by_Engineering() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Execution_Review_by_Engineering)));
				Execution_Review_by_Engineering.click();
				Thread.sleep(2500);
			}

	//Back_To_List
			@FindBy(xpath = "//*[contains(text(),'Back To List ')]")
			public WebElement Back_To_List;
			public void Back_To_List() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Back_To_List)));
				Back_To_List.click();
				Thread.sleep(2500);
			}

		//Dashboard
			@FindBy(xpath = "//*[contains(text(),'Dashboard')]")
			public WebElement Dashboard;
			public void Dashboard() throws Exception
			{
				wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf((Dashboard)));
				Dashboard.click();
				Thread.sleep(2500);
			}

	//ForceClosure_Button
	@FindBy(xpath = "//*[contains(text(),Force Close')]")
	public WebElement ForceClosure_Button;
	public void ForceClosure_Button() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((ForceClosure_Button)));
		ForceClosure_Button.click();
		Thread.sleep(2500);
	}
	//ReturnListInitiator Click
	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[3]")
	public WebElement ReturnListInitiator;
	public void ReturnListInitiator() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((ReturnListInitiator)));
		ReturnListInitiator.click();
		Thread.sleep(2500);
	}
	//SearchBox
	@FindBy(how=How.XPATH,using="//input[@type='search']")
	public WebElement SearchBox;
	public void SearchBox(String x) throws Exception
	{


		SearchBox.sendKeys(x);
		Thread.sleep(2500);
	}

	//CommentCFT

	@FindBy(how=How.XPATH,using="//*[@id='CFTComments']")
	public WebElement CommentCFT;
	public void CommentCFT(String x) throws Exception
	{
		CommentCFT.sendKeys(x);
		Thread.sleep(2500);
	}


	//S_No. Click
	@FindBy(xpath = "/html/body/app-root/app-dashboard/section/div[1]/div/div/div/div/div/div/div/div/table/thead/tr/th[1]")
	public WebElement S_No;
	public void S_No() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((S_No)));
		S_No.click();
		Thread.sleep(2500);
	}

	//CC_No. Click
	@FindBy(xpath = "/html/body/app-root/app-dashboard/section/div[1]/div/div/div/div/div/div/div/div/table/tbody/tr/td[3]/div[1]/a/span")
	public WebElement CC_No;
	public void CC_No() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CC_No)));
		CC_No.click();
		Thread.sleep(2500);
	}
	//CC_No.1 Click
	@FindBy(xpath = "/html/body/app-root/app-dashboard/section/div[1]/div/div/div/div/div/div/div/div/table/tbody/tr[1]/td[3]/div[2]/a/span")
	public WebElement CC_No1;
	public void CC_No1() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CC_No1)));
		CC_No1.click();
		Thread.sleep(2500);
	}

	//CC_No2. Click
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[3]/div[2]/a/span")
	public WebElement CC_No2;
	public void CC_No2() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CC_No2)));
		CC_No2.click();
		Thread.sleep(2500);
	}

	//Next_3 Click[Initiator first next]
	@FindBy(xpath = "(//*[@role='button'])[3]")
	public WebElement Next_3;
	public void Next_3() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Next_3)));
		Next_3.click();
		Thread.sleep(2500);
	}
	//Next_4 Click[Initiator 2nd 3rd next]
	@FindBy(xpath = "(//*[@role='button'])[4]")
	public WebElement Next_4;
	public void Next_4() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Next_4)));
		Next_4.click();
		Thread.sleep(2500);
	}
	//Submit
	@FindBy(how=How.XPATH,using="(//*[@type=\"submit\" or contains(text(),\"Submit\")])[2]")
	public WebElement submit2;
	public void submit2click() throws Exception
	{
		submit2.click();
		Thread.sleep(2500);
	}
	//Submit Button

	@FindBy(how=How.XPATH,using="//*[@type='submit' or contains(text(),'Submit') or contains(text(),'Verify')]")
	public WebElement Submit;
	public void Submit() throws Exception
	{
		Submit.click();

		WebElement Color = driver.findElement(By.xpath("//*[@type='submit' or contains(text(),'Submit') or contains(text(),'Verify')]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);

		Thread.sleep(2500);
	}

	//Not_Create Button

	@FindBy(how=How.XPATH,using="(//button[contains(.,'No')])[3]")
	public WebElement Not_Create;
	public void Not_Create() throws Exception
	{
		WebElement Color = driver.findElement(By.xpath("(//button[contains(.,'No')])[3]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid red;');", Color);
		Not_Create.click();
		Thread.sleep(2500);
	}

	//IHOD_REVIEW_Tab
	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[1]")
	public WebElement IHOD_REVIEW_Tab;
	public void IHOD_REVIEW_Tab() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((IHOD_REVIEW_Tab)));
		IHOD_REVIEW_Tab.click();
		Thread.sleep(2500);
	}
	// CC_Extension_IHOD_Review

	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[2]")
	public WebElement CC_Extension_HOD_Review;
	public void CC_Extension_HOD_Review() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CC_Extension_HOD_Review)));
		CC_Extension_HOD_Review.click();
		Thread.sleep(2500);
	}

	//Closure_IHOD

	@FindBy(xpath = "(//*[@id=\"deviationDraft-tab\"])[3]")
	public WebElement Closure_IHOD;
	public void Closure_IHOD() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Closure_IHOD)));
		Closure_IHOD.click();
		Thread.sleep(2500);
	}



	//Action_Plan_Execution
	@FindBy(xpath = "(//*[@id=\"deviationDraft-tab\"])[4]")
	public WebElement Action_Plan_Execution;
	public void Action_Plan_Execution() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Action_Plan_Execution)));
		Action_Plan_Execution.click();
		Thread.sleep(2500);
	}

	//Closure_CQA_CFT_Review

	@FindBy(xpath = "(//*[@id=\"deviationDraft-tab\"])[2]")
	public WebElement Closure_CQA_CFT_Review;
	public void Closure_CQA_CFT_Review() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Closure_CQA_CFT_Review)));
		Closure_CQA_CFT_Review.click();
		Thread.sleep(2500);
	}
	//CFT_REVIEW	 APP TILE
	@FindBy(xpath = "(//*[@id=\"deviationDraft-tab\"])[1]")
	public WebElement CFT_REVIEW_Tile;
	public void CFT_REVIEW_Tile() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CFT_REVIEW_Tile)));
		CFT_REVIEW_Tile.click();
		Thread.sleep(2500);
	}
	//CFT_REVIEW1
	@FindBy(xpath = "//a[@id='impact-tab' or text()='CFT Review ']")
	public WebElement CFT_REVIEW;
	public void CFT_REVIEW() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CFT_REVIEW)));
		CFT_REVIEW.click();
		Thread.sleep(2500);
	}
	// Preliminary_Information
	@FindBy(xpath = "(//*[@class='blueTitle'])[1]")
	public WebElement Preliminary_Information1;
	public void Preliminary_Information1_0() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Preliminary_Information1)));
		Preliminary_Information1.click();
		Thread.sleep(2500);
	}
	// Preliminary_Information
	@FindBy(xpath = "(//*[@class='blueTitle'])[2]")
	public WebElement Preliminary_Information1_1;
	public void Preliminary_Information1_1() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Preliminary_Information1_1)));
		Preliminary_Information1_1.click();
		Thread.sleep(3000);
	}
	// Preliminary_Information
	@FindBy(xpath = "(//*[@class='blueTitle'])[3]")
	public WebElement Preliminary_Information1_2;
	public void Preliminary_Information1_2() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Preliminary_Information1_1)));
		Preliminary_Information1_2.click();
		Thread.sleep(3000);
	}
	// Preliminary_Information1_3
	@FindBy(xpath = "(//*[@class='blueTitle'])[4]")
	public WebElement Preliminary_Information1_3;
	public void Preliminary_Information1_3() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Preliminary_Information1_3)));
		Preliminary_Information1_3.click();
		Thread.sleep(2500);
	}
	//
	// Preliminary_Information1_4
	@FindBy(xpath = "(//*[@class='blueTitle'])[5]")
	public WebElement Preliminary_Information1_4;
	public void Preliminary_Information1_4() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Preliminary_Information1_4)));
		Preliminary_Information1_4.click();
		Thread.sleep(2500);
	}
	//Supporting_Docs_Click
	@FindBy(xpath = "//*[@formcontrolname='supportdocumentname']")
	public WebElement Supporting_Docs_Click;
	public void Supporting_Docs_Click() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Supporting_Docs_Click)));
		Supporting_Docs_Click.click();
		Thread.sleep(2500);
	}

	//Review_Details
	@FindBy(xpath = "//*[@id=\"tab3-tab\"]")
	public WebElement Review_Details;
	public void Review_Details() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Review_Details)));
		Review_Details.click();
		Thread.sleep(2500);
	}


	//Comments
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='comments' or @formcontrolname='Comments']")
	public WebElement Comments;
	public void Comments(String x) throws Exception
	{
		Comments.clear();
		Thread.sleep(2500);

		Comments.sendKeys(x);
		Thread.sleep(2500);
	}
	//ActionPlan
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='actionPlan']")
	public WebElement ActionPlan;
	public void ActionPlan(String x) throws Exception
	{
		ActionPlan.sendKeys(x);
		Thread.sleep(2500);
	}
	//Department[DD]
	@FindBy(xpath = "(//*[@role='listbox'])[1]")
	WebElement DepartmentDD;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement departmentsearch;
	@FindBy(xpath = "(//div[@class='ng-option ng-star-inserted ng-option-marked'])[1]")
	WebElement departmentsearchselect;

	public void selectDepartmentDD(String user) throws Exception
	{
		DepartmentDD.click();
		Thread.sleep(2500);
		departmentsearch.sendKeys(user);
		Thread.sleep(2500);
		departmentsearchselect.click();
		Thread.sleep(2500);
	}
	//ResponsiblePersonId
	@FindBy(xpath = "(//*[@role='combobox'])[2]")
	WebElement ResponsiblePersonDD;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement ResponsiblePersonSearch;
	@FindBy(xpath = "/html/body/app-root/app-ihod/app-popup[2]/div/div/div/div[2]/form/div[2]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span")
	WebElement ResponsiblePersonSearchSelect;

	public void selectResponsiblePersonDD(String user) throws Exception
	{
		ResponsiblePersonDD.click();
		Thread.sleep(2500);
		ResponsiblePersonSearch.sendKeys(user);
		Thread.sleep(2500);
		ResponsiblePersonSearchSelect.click();
		Thread.sleep(2500);
	}

	//Save [BY TEXT]
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Save')]")
	public WebElement Save;
	public void Save()
	{
		Save.click();
	}
	//Action_Button
	////button[@class='editBtn' or @class='editBtn']
	@FindBy(how=How.XPATH,using="//button[@class='editBtn']")
	public WebElement Action_Button;
	public void Action_Button() throws Exception
	{
		Action_Button.click();
		Thread.sleep(4000);
	}


	//RA Regulatory Coordinator
	@FindBy(xpath = "//*[@id=\"deviationDraft-tab\"]")
	public WebElement RA_Regulatory_Coordinator_Tile;
	public void RA_Regulatory_Coordinator_Tile() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_Regulatory_Coordinator_Tile)));
		RA_Regulatory_Coordinator_Tile.click();
		Thread.sleep(2500);
	}

	//RA Regulatory Coordinator

	@FindBy(xpath = "//*[@id='tab5-tab']")
	public WebElement RA_Regulatory_Coordinator;
	public void RA_Regulatory_Coordinator() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_Regulatory_Coordinator)));
		RA_Regulatory_Coordinator.click();
		Thread.sleep(2500);
	}

	//RA_Regulatory_HOD
	@FindBy(id="deviationDraft-tab")
	public WebElement RA_Regulatory_HOD;
	public void RA_Regulatory_HOD() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_Regulatory_HOD)));
		RA_Regulatory_HOD.click();
		Thread.sleep(2500);
	}
	//Closure_RA_Regulatory_Review
	@FindBy(id="deviationDraft-tab")
	public WebElement Closure_RA_Regulatory_Review;
	public void Closure_RA_Regulatory_Review() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Closure_RA_Regulatory_Review)));
		Closure_RA_Regulatory_Review.click();
		Thread.sleep(2500);
	}

	//Return_IHOD
	@FindBy(xpath = "//*[@value='Return']")
	public WebElement Return_By_Value;
	public void Return_By_Value() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Return_By_Value)));
		Return_By_Value.click();
		Thread.sleep(2500);
	}

	//Accept_IHOD
	@FindBy(xpath = "//*[contains(text(),'Accept')]")
	public WebElement Accept_IHOD;
	public void Accept_IHOD() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Accept_IHOD)));
		Accept_IHOD.click();
		Thread.sleep(2500);
	}
	//RA Regulatory HOD

	//Reference_No_SK
	@FindBy(xpath = "//*[@formcontrolname='ReferenceNo']")
	WebElement Reference_No_SK;
	public void enteredReference_No_SK(String user) throws Exception
	{
		Reference_No_SK.clear();
		Reference_No_SK.sendKeys(user);
		Thread.sleep(2500);
	}
	//Brief_Description_of_Change_Control
	@FindBy(xpath = "//*[@formcontrolname='BriefDescription']")
	WebElement Brief_Description_of_Change_Control;
	public void enteredBrief_Description_of_Change_Control(String user) throws Exception
	{
		Brief_Description_of_Change_Control.clear();
		Brief_Description_of_Change_Control.sendKeys(user);
		Thread.sleep(2500);
	}

	//Change_Category[DD]
	@FindBy(xpath = "//*[@formcontrolname='ChangeCategory']")
	WebElement ChangeCategory;
	public void selectChangeCategory(String user) throws Exception
	{
		Select s=new Select(ChangeCategory);
		s.selectByVisibleText(user);
		//s.selectByIndex(16);
		Thread.sleep(2500);
	}
	//Product_General[C]
	@FindBy(xpath = "(//*[@formcontrolname='ProductGeneral'])[1]")
	public WebElement Product;
	public void Product() throws Exception
	{
		Product.click();
		Thread.sleep(2500);
	}

	//Product_General[C]
	@FindBy(xpath = "(//*[@formcontrolname='ProductGeneral'])[2]")
	public WebElement General;
	public void General() throws Exception
	{
		General.click();
		Thread.sleep(2500);
	}

	//Next_Click
	@FindBy(xpath = "//button[contains(.,'Next ')]")
	public WebElement Next_Click;
	public void Next_Click() throws Exception
	{
		Next_Click.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}

	//Change_Object[DD]
	@FindBy(xpath = "//select[@formcontrolname='ChangeObject']")
	WebElement Change_Object_DD;
	public void selectChange_Object_DD() throws Exception
	{
		Select s=new Select(Change_Object_DD);
		s.selectByIndex(1);
		Thread.sleep(2500);
	}
	//Change_Type[DD]
	@FindBy(xpath = "//select[@formcontrolname='ChangeParameter']")
	WebElement Change_Type_DD;
	public void selectChange_Type_DD() throws Exception
	{
		Select s=new Select(Change_Type_DD);
		s.selectByIndex(1);
		Thread.sleep(2500);
	}

	//Existing_and_Proposed_Document_No
	@FindBy(xpath = "//*[@formcontrolname='DocumentTitle']")
	WebElement Existing_and_Proposed_Document_No;
	public void enteredExisting_and_Proposed_Document_No(String user) throws Exception
	{
		Existing_and_Proposed_Document_No.clear();
		Existing_and_Proposed_Document_No.sendKeys(user);
		Thread.sleep(2500);
	}

	//Existing_No
	@FindBy(xpath = "//*[@formcontrolname='Existing']")
	WebElement Existing_No;
	public void enteredExisting_No(String user) throws Exception
	{
		Existing_No.clear();
		Existing_No.sendKeys(user);
		Thread.sleep(2500);
	}

	//Proposed__No
	@FindBy(xpath = "//*[@formcontrolname='Proposed']")
	WebElement Proposed__No;
	public void enteredProposed__No(String user) throws Exception
	{
		Proposed__No.clear();
		Proposed__No.sendKeys(user);
		Thread.sleep(2500);
	}
	//Plus1_Click
	@FindBy(xpath = "//*[@id='v-pills-home']/form/div[3]/div[4]/button")
	public WebElement Plus1_Click;
	public void Plus1_Click() throws Exception
	{
		Plus1_Click.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}

	//Plus2_Click
	@FindBy(xpath = "(//*[@title='Click to add'])[3]")
	public WebElement Plus2_Click;
	public void Plus2_Click() throws Exception
	{
		Plus2_Click.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}
	//Existing
	@FindBy(xpath = "//*[@formcontrolname='existingName']")
	WebElement Existing;
	public void enteredExisting(String user) throws Exception
	{
		Existing.clear();
		Existing.sendKeys(user);
		Thread.sleep(2500);
	}

	//Proposed
	@FindBy(xpath = "//*[@formcontrolname='proposedName']")
	WebElement Proposed;
	public void enteredProposed(String user) throws Exception
	{
		Proposed.clear();
		Proposed.sendKeys(user);
		Thread.sleep(2500);
	}

	//Reason_Justification
	@FindBy(xpath = "//*[@formcontrolname='resionName']")
	WebElement Reason_Justification;
	public void enteredReason_Justification(String user) throws Exception
	{
		Reason_Justification.clear();
		Reason_Justification.sendKeys(user);
		Thread.sleep(2500);
	}

	//Supporting_Documents_SK
	@FindBy(xpath = "//*[@formcontrolname='supportdocumentname']")
	WebElement Supporting_Documents_SK;
	public void enteredSupporting_Documents_SK(String user) throws Exception
	{
		Supporting_Documents_SK.clear();
		Supporting_Documents_SK.sendKeys(user);
		Thread.sleep(2500);
	}

	//Impact Assessment Check_Box
	//Training required in technical procedure_Check_Box
	@FindBy(xpath = "//*[@id='tab3']/div[1]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[3]/input[1]")
	public WebElement CB_YES_1;
	public void CB_YES_1() throws Exception
	{
		CB_YES_1.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}

	//Impact on assessment_Check_Box
	@FindBy(xpath = "//*[@id='tab3']/div[1]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[3]/input[1]")
	public WebElement CB_YES_2;
	public void CB_YES_2() throws Exception
	{
		CB_YES_2.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}
	//Supporting_Docs
	@FindBy(xpath = "//*[contains(text(),'Supporting Docs')]")
	public WebElement Supporting_Docs;
	public void Supporting_Docs() throws Exception
	{
		Supporting_Docs.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}

	//QA_Coordinator_Review 	//*[contains(text(),'QA Coordinator Review ')]
	@FindBy(xpath = "//*[contains(text(),'QA Coordinator Review ')]")
	public WebElement QA_Coordinator_Review;
	public void QA_Coordinator_Review() throws Exception
	{
		QA_Coordinator_Review.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	//QA_Coordinator_Review
	@FindBy(xpath = "//*[contains(text(),'QA- Coordinator Review ')]")
	public WebElement QA_Coordinator_Review_;
	public void QA_Coordinator_Review_() throws Exception
	{
		QA_Coordinator_Review_.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	//HOD_Review
	@FindBy(xpath = "//*[contains(text(),'HOD Review')]")
	public WebElement HOD_Review;
	public void HOD_Review() throws Exception
	{
		HOD_Review.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}



	//QA_Coordinator_Review
	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[1]")
	public WebElement QA_Coordinator_Review_Tab;
	public void QA_Coordinator_Review_Tab() throws Exception
	{
		QA_Coordinator_Review_Tab.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}
	//ActionPlan_Verification
	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[2]")
	public WebElement ActionPlan_Verification;
	public void ActionPlan_Verification() throws Exception
	{
		ActionPlan_Verification.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}
	//Effectiveness_Verification
	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[3]")
	public WebElement Effectiveness_Verification;
	public void Effectiveness_Verification() throws Exception
	{
		Effectiveness_Verification.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}
	//Closure_QA_Coordinator
	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[4]")
	public WebElement Closure_QA_Coordinator;
	public void Closure_QA_Coordinator() throws Exception
	{
		Closure_QA_Coordinator.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}


	//			8	Is there any impact on the Computerized System (ex: WMPS, LIMS, LMS, BIMS, UMS, etc.,)?	 Yes  No  NA
	@FindBy(xpath = "(//*[@type='radio'])[49]")
	public WebElement QAC_CB_NO_19;
	public void QAC_CB_NO_19() throws Exception
	{
		QAC_CB_NO_19.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}

	//Comments_QAC
	@FindBy(xpath = "//*[@formcontrolname='remarks']")
	WebElement Comments_QAC;
	public void enteredComments_QAC(String user) throws Exception
	{
		Comments_QAC.clear();
		Comments_QAC.sendKeys(user);
		Thread.sleep(2500);
	}

	//CFT_Button
	@FindBy(xpath = "//div[@id='impact']/div/div/div/div/div/div/div[2]/button")
	public WebElement CFT_Button;
	public void CFT_Button() throws Exception
	{
		CFT_Button.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}

	//CFT_Button_Add_
	@FindBy(xpath = "//div[@id='myForm']/div/form/div/p/span")
	public WebElement CFT_Button_Add;
	public void CFT_Button_Add() throws Exception
	{
		CFT_Button_Add.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}

	//Department_DD_Click
	@FindBy(xpath = "//app-popup[3]/div/div/div/div[2]/form/div[2]/ng-select/div/span")
	public WebElement Department_DD_Click_CFT;
	public void Department_DD_Click_CFT() throws Exception
	{
		Department_DD_Click_CFT.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}

	//Search_Department
	@FindBy(xpath = "//div[2]/form/div[2]/ng-select/div/div/div[2]/input")
	WebElement Search_Department;
	public void enteredSearch_Department(String user) throws Exception
	{
		Search_Department.sendKeys(user);
		Thread.sleep(2500);
	}
	//RA_Regulatory
	@FindBy(xpath = "//div[@class='ng-option ng-star-inserted ng-option-marked']")
	public WebElement RA_Regulatory_Select;
	public void RA_Regulatory_Select() throws Exception
	{
		RA_Regulatory_Select.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}
	//Corporate_Quality_Assurance
	@FindBy(xpath = "/html/body/app-root/app-qacoordinator/app-popup[3]/div/div/div/div[2]/form/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span")
	public WebElement Corporate_Quality_Assurance_Select;
	public void Corporate_Quality_Assurance_Select() throws Exception
	{
		Corporate_Quality_Assurance_Select.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}
	//Save_CFT
	@FindBy(xpath = "//button[@class='btn btn-success btn-sm btsize']")
	public WebElement Save_CFT;
	public void Save_CFT() throws Exception
	{
		Save_CFT.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}


	//Accept_Value
	@FindBy(xpath = "//input[@value='Accept']")
	public WebElement Accept_By_Value;
	public void Accept_By_Value() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Accept_By_Value)));
		Accept_By_Value.click();
		Thread.sleep(2500);
	}

	//CQA_CFT_RADIO_Accept
	@FindBy(xpath = "//*[@id='inlineRadio1']")
	public WebElement CQA_CFT_RADIO_Accept;
	public void CQA_CFT_RADIO_Accept() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CQA_CFT_RADIO_Accept)));
		CQA_CFT_RADIO_Accept.click();
		Thread.sleep(2500);
	}

	//RA_CFT_RADIO_Accept
	@FindBy(xpath = "(//*[@type='radio'])[1]")
	public WebElement RA_CFT_RADIO_Accept;
	public void RA_CFT_RADIO_Accept() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_CFT_RADIO_Accept)));
		RA_CFT_RADIO_Accept.click();
		Thread.sleep(2500);
	}
	//	Impact Assessment
	//	1	Is Customer to be notified?	 Yes  No
	@FindBy(xpath = "(//*[@type='radio'])[4]")
	public WebElement RA_CFT_RADIO_YES_1;
	public void RA_CFT_RADIO_YES_1() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_CFT_RADIO_YES_1)));
		RA_CFT_RADIO_YES_1.click();
		Thread.sleep(2500);
	}
	//	2	Is Regulatory agencies approval required prior to the implementation of this change?	 Yes  No
	@FindBy(xpath = "(//*[@type='radio'])[6]")
	public WebElement RA_CFT_RADIO_YES_2;
	public void RA_CFT_RADIO_YES_2() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_CFT_RADIO_YES_2)));
		RA_CFT_RADIO_YES_2.click();
		Thread.sleep(2500);
	}

	//Agency_Name[DD]
	@FindBy(xpath = "//select[@formcontrolname='agencyname']")
	WebElement Agency_Name_DD;
	public void selectAgency_Name_DD() throws Exception
	{
		Select s=new Select(Agency_Name_DD);
		s.selectByIndex(4);
		Thread.sleep(2500);
	}

	//Country_Name_Click
	@FindBy(xpath = "/html/body/app-root/app-regulatory-coordinator-review/app-regulatorypopup/div[1]/div/div[2]/form/div/div/div[2]/div/ng-multiselect-dropdown/div/div[1]/span")
	public WebElement Country_Name_Click;
	public void Country_Name_Click() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Country_Name_Click)));
		Country_Name_Click.click();
		Thread.sleep(2500);
	}
	//	Country_Name_SK
	@FindBy(how=How.XPATH,using="/html/body/app-root/app-regulatory-coordinator-review/app-regulatorypopup/div[1]/div/div[2]/form/div/div/div[2]/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li[2]/input")
	public WebElement Country_Name_SK;
	public void Country_Name_SK(String x) throws Exception
	{
		Country_Name_SK.sendKeys(x);
		Thread.sleep(2500);
	}
	//	Country_Name_SelelctAll
	@FindBy(xpath = "/html/body/app-root/app-regulatory-coordinator-review/app-regulatorypopup/div[1]/div/div[2]/form/div/div/div[2]/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li[1]")
	public WebElement Country_Name_SelelctAll;
	public void Country_Name_SelelctAll() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Country_Name_SelelctAll)));
		Country_Name_SelelctAll.click();
		Thread.sleep(2500);
	}

	//Type_Of_Notification
	@FindBy(xpath = "//app-regulatory-coordinator-review/app-regulatorypopup/div[1]/div/div[2]/form/div/div/div[3]/div/select")
	WebElement Type_Of_Notification;
	public void selectType_Of_Notification() throws Exception
	{
		Select s=new Select(Type_Of_Notification);
		s.selectByIndex(2);
		Thread.sleep(2500);
	}
	//Save_By_Value
	@FindBy(xpath = "//*[@value='Save']")
	WebElement Save_By_Value;
	public void Save_By_Value() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Save_By_Value)));
		Save_By_Value.click();
		Thread.sleep(2500);
	}

	//Department_DD_Click
	@FindBy(xpath = "//app-regulatory-coordinator-review/app-popup[1]/div/div/div/div[2]/div/form/div[1]/div[2]/div/ng-select/div/span")
	public WebElement Department_DD_Click_Action_Plan;
	public void Department_DD_Click_Action_Plan() throws Exception
	{
		Department_DD_Click_Action_Plan.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}

	//Comments_QAC
	@FindBy(xpath = "//app-regulatory-coordinator-review/app-popup[1]/div/div/div/div[2]/div/form/div[1]/div[2]/div/ng-select/div/div/div[2]/input")
	WebElement Department_DD_SK_Action_Plan;
	public void enteredDepartment_DD_SK_Action_Plan(String user) throws Exception
	{
		//Comments_QAC.clear();
		Department_DD_SK_Action_Plan.sendKeys(user);
		Thread.sleep(2500);
	}


	//Department_DD_Click
	@FindBy(xpath = "(//*[@role='option'])[8]")
	public WebElement Production_Click_Action_Plan;
	public void Production_Click_Action_Plan() throws Exception
	{
		Production_Click_Action_Plan.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}
	//Responsible_Person_DD_Click
	@FindBy(xpath = "(//input[@role='combobox'])[2]")
	public WebElement Responsible_Person_DD_Click;
	public void Responsible_Person_DD_Click() throws Exception
	{
		Responsible_Person_DD_Click.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2500);
	}

	//Responsible_Person_DD_Select
	@FindBy(how=How.XPATH,using="//*[contains(text(),' Rahul Initiator(797970)')]")
	public WebElement Responsible_Person_DD_Select;
	public void Responsible_Person_DD_Select()
	{
		Responsible_Person_DD_Select.click();
	}

	//Update_By_Value
	@FindBy(xpath = "//*[@value='Update']")
	WebElement Update_By_Value;
	public void Update_By_Value() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Update_By_Value)));
		Update_By_Value.click();
		Thread.sleep(2500);
	}

	//Customer_Details_RA_CFT
	@FindBy(xpath = "//textarea[@formcontrolname='customerName']")
	WebElement Customer_Details_RA_CFT;
	public void enteredCustomer_Details_RA_CFT(String user) throws Exception
	{
		//Comments_QAC.clear();
		Customer_Details_RA_CFT.sendKeys(user);
		Thread.sleep(2500);
	}

	//Comment_RA_CFT
	@FindBy(xpath = "//textarea[@formcontrolname='cftCommentDescription']")
	WebElement Comment_RA_CFT;
	public void enteredComment_RA_CFT(String user) throws Exception
	{
		//Comments_QAC.clear();
		Comment_RA_CFT.sendKeys(user);
		Thread.sleep(2500);
	}

	//Submit Button

	@FindBy(how=How.XPATH,using="//input[@value='Submit']")
	public WebElement Submit_By_Value;
	public void Submit_By_Value() throws Exception
	{
		Submit_By_Value.click();
		Thread.sleep(2500);
	}


	//RA_Regulatory_HOD_Review
	@FindBy(xpath = "//a[contains(text(),'RA Regulatory HOD')]")
	public WebElement RA_Regulatory_HOD_Review;
	public void RA_Regulatory_HOD_Review() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_Regulatory_HOD_Review)));
		RA_Regulatory_HOD_Review.click();
		Thread.sleep(2500);
	}
//RA_CFT_HOD_CB_Accept
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	public WebElement RA_CFT_HOD_CB_Accept;
	public void RA_CFT_HOD_CB_Accept() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_CFT_HOD_CB_Accept)));
		RA_CFT_HOD_CB_Accept.click();
		Thread.sleep(2500);
	}
	//Comments
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='comments' or @formcontrolname='Comments']")
	public WebElement Comment;
	public void Comment(String x) throws Exception
	{
		Comment.sendKeys(x);
		Thread.sleep(2500);
		Comment.clear();
		Thread.sleep(2500);
		Comment.sendKeys(x);
		Thread.sleep(2500);
	}

//QA_Approver_Tab
		@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[1]")
		public WebElement QA_Approver_Tab;
		public void QA_Approver_Tab() throws Exception
		{
			wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf((QA_Approver_Tab)));
			QA_Approver_Tab.click();
			Thread.sleep(2500);
		}
		//QA_Approver_
				@FindBy(xpath = "//*[@id='tab5-tab']")
				public WebElement QA_Approver_;
				public void QA_Approver_() throws Exception
				{
					wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
					wait.until(ExpectedConditions.visibilityOf((QA_Approver_)));
					QA_Approver_.click();
					Thread.sleep(2500);
				}
//CheckBox_1
		@FindBy(xpath = "(//*[@type='radio'])[1]")
		public WebElement CB_1;
		public void CB_1() throws Exception
		{
			CB_1.click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Thread.sleep(2500);
		}




	//Department_Name_DD[DD]
	@FindBy(xpath = "//select[@formcontrolname='departmentId']")
	WebElement Department_Name_DD;
	public void selectDepartment_Name_DD() throws Exception
	{
		Select s=new Select(Department_Name_DD);
		s.selectByIndex(8);
		Thread.sleep(3000);
	}


	//Work_Related_DD[DD]	Facility
	@FindBy(xpath = "//select[@formcontrolname='workRelatedTo']")
	WebElement Work_Related_DD_Facility;
	public void selectWork_Related_DD_Facility() throws Exception
	{
		Select s=new Select(Work_Related_DD_Facility);
		s.selectByIndex(1);
		Thread.sleep(2500);
	}


	//Work_Related_DD[DD]	Equipment
	@FindBy(xpath = "//select[@formcontrolname='workRelatedTo']")
	WebElement Work_Related_DD_Equipment;
	public void selectWork_Related_DD_Equipment() throws Exception
	{
		Select s=new Select(Work_Related_DD_Equipment);
		s.selectByIndex(2);
		Thread.sleep(2500);
	}

	//Area_DD[DD]
	@FindBy(xpath = "//select[@formcontrolname='areaName']")
	WebElement AreaName_DD;
	public void selectAreaName_DD() throws Exception
	{
		Select s=new Select(AreaName_DD);
		s.selectByIndex(15);
		Thread.sleep(3000);
	}

	//EquipmentId_DD[DD]
	@FindBy(xpath = "//select[@formcontrolname='equipmentId']")
	WebElement EquipmentId_DD_;
	public void selectEquipmentId_DD_EHL() throws Exception
	{
		Select s=new Select(EquipmentId_DD);
		s.selectByIndex(11);
		Thread.sleep(2500);
	}

	//EquipmentId_DD[DD]

	@FindBy(xpath = "//select[@formcontrolname='workOrderLog']")
	WebElement Work_Order_Log_DD_Empty;
	public void selectWork_Order_Log_DD_Empty() throws Exception
	{
		Select s=new Select(Work_Order_Log_DD_Empty);
		s.selectByIndex(0);
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//select[@formcontrolname='workOrderLog']")
	WebElement Work_Order_Log_DD_Return;
	public void selectWork_Order_Log_DD_Return() throws Exception
	{
		Select s=new Select(Work_Order_Log_DD_Return);
		s.selectByIndex(1);
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//select[@formcontrolname='workOrderLog']")
	WebElement Work_Order_Log_DD_Reject;
	public void selectWork_Order_Log_DD_Reject() throws Exception
	{
		Select s=new Select(Work_Order_Log_DD_Reject);
		s.selectByIndex(2);
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//select[@formcontrolname='workOrderLog']")
	WebElement Work_Order_Log_DD_Open;
	public void selectWork_Order_Log_DD_Open() throws Exception
	{
		Select s=new Select(Work_Order_Log_DD_Open);
		s.selectByIndex(3);
		Thread.sleep(2500);
	}


	@FindBy(xpath = "//select[@formcontrolname='workOrderLog']")
	WebElement Work_Order_Log_DD_Closed;
	public void selectWork_Order_Log_DD_Closed() throws Exception
	{
		Select s=new Select(Work_Order_Log_DD_Closed);
		s.selectByIndex(4);
		Thread.sleep(2500);
	}

	@FindBy(xpath = "//select[@formcontrolname='natureOfBreakdownName']")
	WebElement Nature_of_Breakdown_DD_Major;
	public void selectNature_of_Breakdown_DD_Major() throws Exception
	{
		Select s=new Select(Nature_of_Breakdown_DD_Major);
		s.selectByIndex(1);
		Thread.sleep(2500);
	}

	@FindBy(xpath = "//select[@formcontrolname='natureOfBreakdownName']")
	WebElement Nature_of_Breakdown_DD_Minor;
	public void selectNature_of_Breakdown_DD_Minor() throws Exception
	{
		Select s=new Select(Nature_of_Breakdown_DD_Major);
		s.selectByIndex(2);
		Thread.sleep(2500);
	}

	@FindBy(xpath = "//select[@formcontrolname='rootCause']")
	WebElement RootCause_Type_DD;
	public void selectRootCause_Type_DD() throws Exception
	{
		Select s=new Select(RootCause_Type_DD);
		s.selectByIndex(13);
		Thread.sleep(2500);
	}


	@FindBy(xpath = "//select[@formcontrolname='executionStatus']")
	WebElement ExecutionStatus_DD_Complete;
	public void selectExecutionStatus_DD_Complete() throws Exception
	{
		Select s=new Select(ExecutionStatus_DD_Complete);
		s.selectByIndex(1);
		Thread.sleep(2500);
	}

	@FindBy(xpath = "//select[@formcontrolname='executionStatus']")
	WebElement ExecutionStatus_DD_NotComplete;
	public void selectExecutionStatus_DD_NotComplete() throws Exception
	{
		Select s=new Select(ExecutionStatus_DD_NotComplete);
		s.selectByIndex(2);
		Thread.sleep(2500);
	}


}

