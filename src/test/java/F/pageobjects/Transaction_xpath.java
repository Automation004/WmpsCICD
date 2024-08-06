package F.pageobjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Transaction_xpath {

	WebDriver driver;
	public Transaction_xpath(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	public	WebDriverWait wait;//globally declared


	//Create
	@FindBy(how=How.XPATH,using="//button[contains(text(),'New') or @title='Create' or contains(text(),'Create')]")
	public WebElement Create;
	public void Create() throws Exception
	{
		Create.click();
		Thread.sleep(1000);
	}

	//ApplicationTileClick
//    (//*[@class='form-inline clearfix'])[3]
	@FindBy(xpath = "(//a[contains(.,'Intermediate CMS - Corporate ')])")
	public WebElement AppTile_Intermediate_CMS;
	public void AppTile_Intermediate_CMS() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((AppTile_Intermediate_CMS)));
		AppTile_Intermediate_CMS.click();
		Thread.sleep(1000);
	}
//  Approve
	@FindBy(xpath = "//button[contains(.,'Approve ')]")
	public WebElement Approve;
	public void Approve() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Approve)));
		Approve.click();
		Thread.sleep(1000);
	}

	//Menu_Click
	@FindBy(xpath = "//*[@id='navbarDropdown']")
	public WebElement Menu_Click;
	public void Menu_Click() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Menu_Click)));
		Menu_Click.click();
		Thread.sleep(1000);
	}

	//ForceClosure_Master
	@FindBy(xpath = "//*[contains(text(),'Force Closure')]")
	public WebElement ForceClosure_Master;
	public void ForceClosure_Master() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((ForceClosure_Master)));
		ForceClosure_Master.click();
		Thread.sleep(1000);
	}

	//ForceClosure_Button
	@FindBy(xpath = "//*[contains(text(),Force Close')]")
	public WebElement ForceClosure_Button;
	public void ForceClosure_Button() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((ForceClosure_Button)));
		ForceClosure_Button.click();
		Thread.sleep(1000);
	}
	//ReturnListInitiator Click
	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[3]")
	public WebElement ReturnListInitiator;
	public void ReturnListInitiator() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((ReturnListInitiator)));
		ReturnListInitiator.click();
		Thread.sleep(1000);
	}
	//SearchBox
	@FindBy(how=How.XPATH,using="//input[@type='search']")
	public WebElement SearchBox;
	public void SearchBox(String x) throws Exception
	{
		SearchBox.sendKeys(x);
		Thread.sleep(1000);
	}

	//CommentCFT

	@FindBy(how=How.XPATH,using="//*[@id='CFTComments']")
	public WebElement CommentCFT;
	public void CommentCFT(String x) throws Exception
	{
		CommentCFT.sendKeys(x);
		Thread.sleep(1000);
	}


	//S_No. Click
	@FindBy(xpath = "/html/body/app-root/app-dashboard/section/div[1]/div/div/div/div/div/div/div/div/table/thead/tr/th[1]")
	public WebElement S_No;
	public void S_No() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((S_No)));
		S_No.click();
		Thread.sleep(1000);
	}

	//CC_No. Click
	@FindBy(xpath = "/html/body/app-root/app-dashboard/section/div[1]/div/div/div/div/div/div/div/div/table/tbody/tr/td[3]/div[1]/a/span")
	public WebElement CC_No;
	public void CC_No() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CC_No)));
		CC_No.click();
		Thread.sleep(1000);
	}
	//CC_No.1 Click
	@FindBy(xpath = "/html/body/app-root/app-dashboard/section/div[1]/div/div/div/div/div/div/div/div/table/tbody/tr[1]/td[3]/div[2]/a/span")
	public WebElement CC_No1;
	public void CC_No1() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CC_No1)));
		CC_No1.click();
		Thread.sleep(1000);
	}

	//CC_No2. Click
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[3]/div[2]/a/span")
	public WebElement CC_No2;
	public void CC_No2() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CC_No2)));
		CC_No2.click();
		Thread.sleep(1000);
	}

	//Next_3 Click[Initiator first next]
	@FindBy(xpath = "(//*[@role='button'])[3]")
	public WebElement Next_3;
	public void Next_3() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Next_3)));
		Next_3.click();
		Thread.sleep(1000);
	}
	//Next_4 Click[Initiator 2nd 3rd next]
	@FindBy(xpath = "(//*[@role='button'])[4]")
	public WebElement Next_4;
	public void Next_4() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Next_4)));
		Next_4.click();
		Thread.sleep(1000);
	}
	//Submit
	@FindBy(how=How.XPATH,using="(//*[@type=\"submit\" or contains(text(),\"Submit\")])[2]")
	public WebElement submit2;
	public void submit2click() throws Exception
	{
		submit2.click();
		Thread.sleep(1000);
	}
	//Submit Button

	@FindBy(how=How.XPATH,using="//*[@type='submit' or contains(text(),'Submit') or contains(text(),'Verify')]")
	public WebElement Submit;
	public void Submit() throws Exception
	{
		Submit.click();
		Thread.sleep(2000);
	}

	//IHOD_REVIEW_Tab
	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[1]")
	public WebElement IHOD_REVIEW_Tab;
	public void IHOD_REVIEW_Tab() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((IHOD_REVIEW_Tab)));
		IHOD_REVIEW_Tab.click();
		Thread.sleep(1000);
	}
	// CC_Extension_IHOD_Review

	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[2]")
	public WebElement CC_Extension_HOD_Review;
	public void CC_Extension_HOD_Review() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CC_Extension_HOD_Review)));
		CC_Extension_HOD_Review.click();
		Thread.sleep(1000);
	}

	//Closure_IHOD

	@FindBy(xpath = "(//*[@id=\"deviationDraft-tab\"])[3]")
	public WebElement Closure_IHOD;
	public void Closure_IHOD() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Closure_IHOD)));
		Closure_IHOD.click();
		Thread.sleep(1000);
	}



	//Action_Plan_Execution
	@FindBy(xpath = "(//*[@id=\"deviationDraft-tab\"])[4]")
	public WebElement Action_Plan_Execution;
	public void Action_Plan_Execution() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Action_Plan_Execution)));
		Action_Plan_Execution.click();
		Thread.sleep(1000);
	}

	//Closure_CQA_CFT_Review

	@FindBy(xpath = "(//*[@id=\"deviationDraft-tab\"])[2]")
	public WebElement Closure_CQA_CFT_Review;
	public void Closure_CQA_CFT_Review() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Closure_CQA_CFT_Review)));
		Closure_CQA_CFT_Review.click();
		Thread.sleep(1000);
	}
	//CFT_REVIEW	 APP TILE
	@FindBy(xpath = "(//*[@id=\"deviationDraft-tab\"])[1]")
	public WebElement CFT_REVIEW_Tile;
	public void CFT_REVIEW_Tile() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CFT_REVIEW_Tile)));
		CFT_REVIEW_Tile.click();
		Thread.sleep(1000);
	}
	//CFT_REVIEW1
	@FindBy(xpath = "//a[@id='impact-tab' or text()='CFT Review ']")
	public WebElement CFT_REVIEW;
	public void CFT_REVIEW() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CFT_REVIEW)));
		CFT_REVIEW.click();
		Thread.sleep(1000);
	}
	// Preliminary_Information
	@FindBy(xpath = "(//*[@class='blueTitle'])[1]")
	public WebElement Preliminary_Information1;
	public void Preliminary_Information1_0() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Preliminary_Information1)));
		Preliminary_Information1.click();
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
	}
	//Supporting_Docs_Click
	@FindBy(xpath = "//*[@formcontrolname='supportdocumentname']")
	public WebElement Supporting_Docs_Click;
	public void Supporting_Docs_Click() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Supporting_Docs_Click)));
		Supporting_Docs_Click.click();
		Thread.sleep(1000);
	}

	//Review_Details
	@FindBy(xpath = "//*[@id=\"tab3-tab\"]")
	public WebElement Review_Details;
	public void Review_Details() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Review_Details)));
		Review_Details.click();
		Thread.sleep(1000);
	}


	//Comments
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='comments' or @formcontrolname='Comments\\']")
	public WebElement Comments;
	public void Comments(String x) throws Exception
	{
		Comments.sendKeys(x);
		Thread.sleep(1000);
	}
	//ActionPlan
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='actionPlan']")
	public WebElement ActionPlan;
	public void ActionPlan(String x) throws Exception
	{
		ActionPlan.sendKeys(x);
		Thread.sleep(1000);
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
		Thread.sleep(2000);
		departmentsearch.sendKeys(user);
		Thread.sleep(2000);
		departmentsearchselect.click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		ResponsiblePersonSearch.sendKeys(user);
		Thread.sleep(2000);
		ResponsiblePersonSearchSelect.click();
		Thread.sleep(2000);
	}

	//Save [BY TEXT]
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Save')]")
	public WebElement Save;
	public void Save()
	{
		Save.click();
	}

	//Action_Button
	//button[@class='editBtn' or @class='editBtn']
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
		Thread.sleep(1000);
	}

	//RA Regulatory Coordinator

	@FindBy(xpath = "//*[@id='tab5-tab']")
	public WebElement RA_Regulatory_Coordinator;
	public void RA_Regulatory_Coordinator() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_Regulatory_Coordinator)));
		RA_Regulatory_Coordinator.click();
		Thread.sleep(1000);
	}

	//RA_Regulatory_HOD
	@FindBy(id="deviationDraft-tab")
	public WebElement RA_Regulatory_HOD;
	public void RA_Regulatory_HOD() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_Regulatory_HOD)));
		RA_Regulatory_HOD.click();
		Thread.sleep(1000);
	}
	//Closure_RA_Regulatory_Review
	@FindBy(id="deviationDraft-tab")
	public WebElement Closure_RA_Regulatory_Review;
	public void Closure_RA_Regulatory_Review() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Closure_RA_Regulatory_Review)));
		Closure_RA_Regulatory_Review.click();
		Thread.sleep(1000);
	}

	//Return_IHOD
	@FindBy(xpath = "//*[@value='Return']")
	public WebElement Return_By_Value;
	public void Return_By_Value() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Return_By_Value)));
		Return_By_Value.click();
		Thread.sleep(1000);
	}

	//Accept_IHOD
	@FindBy(xpath = "//*[contains(text(),'Accept')]")
	public WebElement Accept_IHOD;
	public void Accept_IHOD() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Accept_IHOD)));
		Accept_IHOD.click();
		Thread.sleep(1000);
	}
	//RA Regulatory HOD

	//Reference_No_SK
	@FindBy(xpath = "//*[@formcontrolname='ReferenceNo']")
	WebElement Reference_No_SK;
	public void enteredReference_No_SK(String user) throws Exception
	{
		Reference_No_SK.clear();
		Reference_No_SK.sendKeys(user);
		Thread.sleep(1000);
	}
	//Brief_Description_of_Change_Control
	@FindBy(xpath = "//*[@formcontrolname='BriefDescription']")
	WebElement Brief_Description_of_Change_Control;
	public void enteredBrief_Description_of_Change_Control(String user) throws Exception
	{
		Brief_Description_of_Change_Control.clear();
		Brief_Description_of_Change_Control.sendKeys(user);
		Thread.sleep(1000);
	}

	//Change_Category[DD]
	@FindBy(xpath = "//*[@formcontrolname='ChangeCategory']")
	WebElement ChangeCategory;
	public void selectChangeCategory(String user) throws Exception
	{
		Select s=new Select(ChangeCategory);
		s.selectByVisibleText(user);
		//s.selectByIndex(16);
		Thread.sleep(1000);
	}
	//Product_General[C]
	@FindBy(xpath = "(//*[@formcontrolname='ProductGeneral'])[1]")
	public WebElement Product;
	public void Product() throws Exception
	{
		Product.click();
		Thread.sleep(1000);
	}

	//Product_General[C]
	@FindBy(xpath = "(//*[@formcontrolname='ProductGeneral'])[2]")
	public WebElement General;
	public void General() throws Exception
	{
		General.click();
		Thread.sleep(1000);
	}

	//Next_Click
	@FindBy(xpath = "//button[contains(.,'Next ')]")
	public WebElement Next_Click;
	public void Next_Click() throws Exception
	{
		Next_Click.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	//Change_Object[DD]
	@FindBy(xpath = "//select[@formcontrolname='ChangeObject']")
	WebElement Change_Object_DD;
	public void selectChange_Object_DD() throws Exception
	{
		Select s=new Select(Change_Object_DD);
		s.selectByIndex(1);
		Thread.sleep(1000);
	}
	//Change_Type[DD]
	@FindBy(xpath = "//select[@formcontrolname='ChangeParameter']")
	WebElement Change_Type_DD;
	public void selectChange_Type_DD() throws Exception
	{
		Select s=new Select(Change_Type_DD);
		s.selectByIndex(1);
		Thread.sleep(1000);
	}

	//Existing_and_Proposed_Document_No
	@FindBy(xpath = "//*[@formcontrolname='DocumentTitle']")
	WebElement Existing_and_Proposed_Document_No;
	public void enteredExisting_and_Proposed_Document_No(String user) throws Exception
	{
		Existing_and_Proposed_Document_No.clear();
		Existing_and_Proposed_Document_No.sendKeys(user);
		Thread.sleep(1000);
	}

	//Existing_No
	@FindBy(xpath = "//*[@formcontrolname='Existing']")
	WebElement Existing_No;
	public void enteredExisting_No(String user) throws Exception
	{
		Existing_No.clear();
		Existing_No.sendKeys(user);
		Thread.sleep(1000);
	}

	//Proposed__No
	@FindBy(xpath = "//*[@formcontrolname='Proposed']")
	WebElement Proposed__No;
	public void enteredProposed__No(String user) throws Exception
	{
		Proposed__No.clear();
		Proposed__No.sendKeys(user);
		Thread.sleep(1000);
	}
	//Plus1_Click
	@FindBy(xpath = "//*[@id='v-pills-home']/form/div[3]/div[4]/button")
	public WebElement Plus1_Click;
	public void Plus1_Click() throws Exception
	{
		Plus1_Click.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	//Plus2_Click
	@FindBy(xpath = "(//*[@title='Click to add'])[3]")
	public WebElement Plus2_Click;
	public void Plus2_Click() throws Exception
	{
		Plus2_Click.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	//Existing
	@FindBy(xpath = "//*[@formcontrolname='existingName']")
	WebElement Existing;
	public void enteredExisting(String user) throws Exception
	{
		Existing.clear();
		Existing.sendKeys(user);
		Thread.sleep(1000);
	}

	//Proposed
	@FindBy(xpath = "//*[@formcontrolname='proposedName']")
	WebElement Proposed;
	public void enteredProposed(String user) throws Exception
	{
		Proposed.clear();
		Proposed.sendKeys(user);
		Thread.sleep(1000);
	}

	//Reason_Justification
	@FindBy(xpath = "//*[@formcontrolname='resionName']")
	WebElement Reason_Justification;
	public void enteredReason_Justification(String user) throws Exception
	{
		Reason_Justification.clear();
		Reason_Justification.sendKeys(user);
		Thread.sleep(1000);
	}

	//Supporting_Documents_SK
	@FindBy(xpath = "//*[@formcontrolname='supportdocumentname']")
	WebElement Supporting_Documents_SK;
	public void enteredSupporting_Documents_SK(String user) throws Exception
	{
		Supporting_Documents_SK.clear();
		Supporting_Documents_SK.sendKeys(user);
		Thread.sleep(1000);
	}

	//Impact Assessment Check_Box
	//Training required in technical procedure_Check_Box
	@FindBy(xpath = "//*[@id='tab3']/div[1]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[3]/input[1]")
	public WebElement CB_YES_1;
	public void CB_YES_1() throws Exception
	{
		CB_YES_1.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	//Impact on assessment_Check_Box
	@FindBy(xpath = "//*[@id='tab3']/div[1]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[3]/input[1]")
	public WebElement CB_YES_2;
	public void CB_YES_2() throws Exception
	{
		CB_YES_2.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	//Supporting_Docs
	@FindBy(xpath = "//*[contains(text(),'Supporting Docs')]")
	public WebElement Supporting_Docs;
	public void Supporting_Docs() throws Exception
	{
		Supporting_Docs.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
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

	//Impact Assessment IHOD
	//Is there an impact on Procedure/Documents?

	@FindBy(xpath = "//*[@id='tab5']/div/div/div/table/tbody/tr[1]/td[3]/input[2]")
	public WebElement IHOD_CB_NO_1;
	public void IHOD_CB_NO_1() throws Exception
	{
		IHOD_CB_NO_1.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	//	Is there an impact on trainings?

	@FindBy(xpath = "//*[@id='tab5']/div/div/div/table/tbody/tr[2]/td[3]/input[2]")
	public WebElement IHOD_CB_NO_2;
	public void IHOD_CB_NO_2() throws Exception
	{
		IHOD_CB_NO_2.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	//Is there an impact on other products/Batches?

	@FindBy(xpath = "//*[@id='tab5']/div/div/div/table/tbody/tr[3]/td[3]/input[2]")
	public WebElement IHOD_CB_NO_3;
	public void IHOD_CB_NO_3() throws Exception
	{
		IHOD_CB_NO_3.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	//QA_Coordinator_Review
	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[1]")
	public WebElement QA_Coordinator_Review_Tab;
	public void QA_Coordinator_Review_Tab() throws Exception
	{
		QA_Coordinator_Review_Tab.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	//ActionPlan_Verification
	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[2]")
	public WebElement ActionPlan_Verification;
	public void ActionPlan_Verification() throws Exception
	{
		ActionPlan_Verification.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	//Effectiveness_Verification
	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[3]")
	public WebElement Effectiveness_Verification;
	public void Effectiveness_Verification() throws Exception
	{
		Effectiveness_Verification.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	//Closure_QA_Coordinator
	@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[4]")
	public WebElement Closure_QA_Coordinator;
	public void Closure_QA_Coordinator() throws Exception
	{
		Closure_QA_Coordinator.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}




	//CFT_Button
	@FindBy(xpath = "//div[@id='impact']/div/div/div/div/div/div/div[2]/button")
	public WebElement CFT_Button;
	public void CFT_Button() throws Exception
	{
		CFT_Button.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	//CFT_Button_Add_
	@FindBy(xpath = "//div[@id='myForm']/div/form/div/p/span")
	public WebElement CFT_Button_Add;
	public void CFT_Button_Add() throws Exception
	{
		CFT_Button_Add.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	//Department_DD_Click
	@FindBy(xpath = "//app-popup[3]/div/div/div/div[2]/form/div[2]/ng-select/div/span")
	public WebElement Department_DD_Click_CFT;
	public void Department_DD_Click_CFT() throws Exception
	{
		Department_DD_Click_CFT.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	//Search_Department
	@FindBy(xpath = "//div[2]/form/div[2]/ng-select/div/div/div[2]/input")
	WebElement Search_Department;
	public void enteredSearch_Department(String user) throws Exception
	{
		Search_Department.sendKeys(user);
		Thread.sleep(1000);
	}
	//RA_Regulatory
	@FindBy(xpath = "//div[@class='ng-option ng-star-inserted ng-option-marked']")
	public WebElement RA_Regulatory_Select;
	public void RA_Regulatory_Select() throws Exception
	{
		RA_Regulatory_Select.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	//Corporate_Quality_Assurance
	@FindBy(xpath = "/html/body/app-root/app-qacoordinator/app-popup[3]/div/div/div/div[2]/form/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span")
	public WebElement Corporate_Quality_Assurance_Select;
	public void Corporate_Quality_Assurance_Select() throws Exception
	{
		Corporate_Quality_Assurance_Select.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	//Save_CFT
	@FindBy(xpath = "//button[@class='btn btn-success btn-sm btsize']")
	public WebElement Save_CFT;
	public void Save_CFT() throws Exception
	{
		Save_CFT.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}


	//Accept_Value
	@FindBy(xpath = "//input[@value='Accept']")
	public WebElement Accept_By_Value;
	public void Accept_By_Value() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Accept_By_Value)));
		Accept_By_Value.click();
		Thread.sleep(1000);
	}

	//CQA_CFT_RADIO_Accept
	@FindBy(xpath = "//*[@id='inlineRadio1']")
	public WebElement CQA_CFT_RADIO_Accept;
	public void CQA_CFT_RADIO_Accept() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((CQA_CFT_RADIO_Accept)));
		CQA_CFT_RADIO_Accept.click();
		Thread.sleep(1000);
	}

	//RA_CFT_RADIO_Accept
	@FindBy(xpath = "(//*[@type='radio'])[1]")
	public WebElement RA_CFT_RADIO_Accept;
	public void RA_CFT_RADIO_Accept() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_CFT_RADIO_Accept)));
		RA_CFT_RADIO_Accept.click();
		Thread.sleep(1000);
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
		Thread.sleep(1000);
	}
	//	2	Is Regulatory agencies approval required prior to the implementation of this change?	 Yes  No
	@FindBy(xpath = "(//*[@type='radio'])[6]")
	public WebElement RA_CFT_RADIO_YES_2;
	public void RA_CFT_RADIO_YES_2() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_CFT_RADIO_YES_2)));
		RA_CFT_RADIO_YES_2.click();
		Thread.sleep(1000);
	}

	//Agency_Name[DD]
	@FindBy(xpath = "//select[@formcontrolname='agencyname']")
	WebElement Agency_Name_DD;
	public void selectAgency_Name_DD() throws Exception
	{
		Select s=new Select(Agency_Name_DD);
		s.selectByIndex(4);
		Thread.sleep(1000);
	}

	//Country_Name_Click
	@FindBy(xpath = "/html/body/app-root/app-regulatory-coordinator-review/app-regulatorypopup/div[1]/div/div[2]/form/div/div/div[2]/div/ng-multiselect-dropdown/div/div[1]/span")
	public WebElement Country_Name_Click;
	public void Country_Name_Click() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Country_Name_Click)));
		Country_Name_Click.click();
		Thread.sleep(1000);
	}
	//	Country_Name_SK
	@FindBy(how=How.XPATH,using="/html/body/app-root/app-regulatory-coordinator-review/app-regulatorypopup/div[1]/div/div[2]/form/div/div/div[2]/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li[2]/input")
	public WebElement Country_Name_SK;
	public void Country_Name_SK(String x) throws Exception
	{
		Country_Name_SK.sendKeys(x);
		Thread.sleep(1000);
	}
	//	Country_Name_SelelctAll
	@FindBy(xpath = "/html/body/app-root/app-regulatory-coordinator-review/app-regulatorypopup/div[1]/div/div[2]/form/div/div/div[2]/div/ng-multiselect-dropdown/div/div[2]/ul[1]/li[1]")
	public WebElement Country_Name_SelelctAll;
	public void Country_Name_SelelctAll() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Country_Name_SelelctAll)));
		Country_Name_SelelctAll.click();
		Thread.sleep(1000);
	}

	//Type_Of_Notification
	@FindBy(xpath = "//app-regulatory-coordinator-review/app-regulatorypopup/div[1]/div/div[2]/form/div/div/div[3]/div/select")
	WebElement Type_Of_Notification;
	public void selectType_Of_Notification() throws Exception
	{
		Select s=new Select(Type_Of_Notification);
		s.selectByIndex(2);
		Thread.sleep(1000);
	}
	//Save_By_Value
	@FindBy(xpath = "//*[@value='Save']")
	WebElement Save_By_Value;
	public void Save_By_Value() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((Save_By_Value)));
		Save_By_Value.click();
		Thread.sleep(1000);
	}

	//Department_DD_Click
	@FindBy(xpath = "//app-regulatory-coordinator-review/app-popup[1]/div/div/div/div[2]/div/form/div[1]/div[2]/div/ng-select/div/span")
	public WebElement Department_DD_Click_Action_Plan;
	public void Department_DD_Click_Action_Plan() throws Exception
	{
		Department_DD_Click_Action_Plan.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	//Comments_QAC
	@FindBy(xpath = "//app-regulatory-coordinator-review/app-popup[1]/div/div/div/div[2]/div/form/div[1]/div[2]/div/ng-select/div/div/div[2]/input")
	WebElement Department_DD_SK_Action_Plan;
	public void enteredDepartment_DD_SK_Action_Plan(String user) throws Exception
	{
		//Comments_QAC.clear();
		Department_DD_SK_Action_Plan.sendKeys(user);
		Thread.sleep(1000);
	}


	//Department_DD_Click
	@FindBy(xpath = "(//*[@role='option'])[8]")
	public WebElement Production_Click_Action_Plan;
	public void Production_Click_Action_Plan() throws Exception
	{
		Production_Click_Action_Plan.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}
	//Responsible_Person_DD_Click
	@FindBy(xpath = "(//input[@role='combobox'])[2]")
	public WebElement Responsible_Person_DD_Click;
	public void Responsible_Person_DD_Click() throws Exception
	{
		Responsible_Person_DD_Click.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
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
		Thread.sleep(1000);
	}

	//Customer_Details_RA_CFT
	@FindBy(xpath = "//textarea[@formcontrolname='customerName']")
	WebElement Customer_Details_RA_CFT;
	public void enteredCustomer_Details_RA_CFT(String user) throws Exception
	{
		//Comments_QAC.clear();
		Customer_Details_RA_CFT.sendKeys(user);
		Thread.sleep(1000);
	}

	//Comment_RA_CFT
	@FindBy(xpath = "//textarea[@formcontrolname='cftCommentDescription']")
	WebElement Comment_RA_CFT;
	public void enteredComment_RA_CFT(String user) throws Exception
	{
		//Comments_QAC.clear();
		Comment_RA_CFT.sendKeys(user);
		Thread.sleep(2000);
	}

	//Submit Button

	@FindBy(how=How.XPATH,using="//input[@value='Submit']")
	public WebElement Submit_By_Value;
	public void Submit_By_Value() throws Exception
	{
		Submit_By_Value.click();
		Thread.sleep(2000);
	}


	//RA_Regulatory_HOD_Review
	@FindBy(xpath = "//a[contains(text(),'RA Regulatory HOD')]")
	public WebElement RA_Regulatory_HOD_Review;
	public void RA_Regulatory_HOD_Review() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_Regulatory_HOD_Review)));
		RA_Regulatory_HOD_Review.click();
		Thread.sleep(1000);
	}
//RA_CFT_HOD_CB_Accept
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	public WebElement RA_CFT_HOD_CB_Accept;
	public void RA_CFT_HOD_CB_Accept() throws Exception
	{
		wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((RA_CFT_HOD_CB_Accept)));
		RA_CFT_HOD_CB_Accept.click();
		Thread.sleep(1000);
	}
	//Comments
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='comments' or @formcontrolname='Comments']")
	public WebElement Comment;
	public void Comment(String x)
	{
		Comment.sendKeys(x);
	}

//QA_Approver_Tab
		@FindBy(xpath = "(//*[@id='deviationDraft-tab'])[1]")
		public WebElement QA_Approver_Tab;
		public void QA_Approver_Tab() throws Exception
		{
			wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf((QA_Approver_Tab)));
			QA_Approver_Tab.click();
			Thread.sleep(1000);
		}
		//QA_Approver_
				@FindBy(xpath = "//*[@id='tab5-tab']")
				public WebElement QA_Approver_;
				public void QA_Approver_() throws Exception
				{
					wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
					wait.until(ExpectedConditions.visibilityOf((QA_Approver_)));
					QA_Approver_.click();
					Thread.sleep(1000);
				}
//CheckBox_1
		@FindBy(xpath = "(//*[@type='radio'])[1]")
		public WebElement CB_1;
		public void CB_1() throws Exception
		{
			CB_1.click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Thread.sleep(1000);
		}

//CheckBox_5
				@FindBy(xpath = "(//*[@type='radio'])[5]")
				public WebElement CB_5;
				public void CB_5() throws Exception
				{
					CB_5.click();
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					Thread.sleep(1000);
				}
//CheckBox_8
				@FindBy(xpath = "(//*[@type='radio'])[8]")
				public WebElement CB_8;
				public void CB_8() throws Exception
				{
					CB_8.click();
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					Thread.sleep(1000);
				}
	//FP_Mfg_Unit_primarypacktype
	@FindBy(xpath = "//div[@id='tab1']/div/div/form/div/div[6]/div/ng-multiselect-dropdown/div/div/span")
	WebElement Click_DD;

	@FindBy(xpath = "//div[@id='tab1']/div/div/form/div/div[6]/div/ng-multiselect-dropdown/div/div[2]/ul/li[2]/input")
	WebElement Search;

	@FindBy(xpath = "//app-initiation/section/div/div/div/div/div/div/div/div[1]/div/form/div/div[6]/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li/div")
	WebElement Add_CB;

	//@FindBy(xpath = "//div[@id='tab1']/div/div/form/div/div[6]/div/ng-multiselect-dropdown/div/div/span")
	//WebElement Close_DD;

	public void Product_MS(String data) throws Exception
	{
		Click_DD.click();
		Thread.sleep(2000);

		Search.sendKeys(data);
		Thread.sleep(2000);

		Add_CB.click();
		Thread.sleep(2000);

		Click_DD.click();
		Thread.sleep(2000);

		//		try
		//		{
		//			//Close_DD.click();
		//		}
		//		catch (Exception e)
		//		{
		//			e.printStackTrace();
		//		}
		//		Thread.sleep(2000);

	}



























}

