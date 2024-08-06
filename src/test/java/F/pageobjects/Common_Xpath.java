
package F.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common_Xpath {

	WebDriver driver;
	public Common_Xpath(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
public	WebDriverWait wait;//globally declared

	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Login\")]")
	public WebElement login;
	public void loginclick()
	{
		login.click();
	}

	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"LoginId\"]")
	public WebElement userid;
	public void useridfill(String x)
	{
		userid.sendKeys(x);
	}

//PASSWORD FILL ie 123
	@FindBy(how=How.XPATH,using="//*[@formcontrolname='password' or formcontrolname='Password']")
	public WebElement password;
	public void passwordfill(String x)
	{
		password.sendKeys(x);
	}

//Submit Button

	@FindBy(how=How.XPATH,using="//*[@type='submit' or contains(text(),'Submit') or contains(text(),'Verify')]")
	public WebElement submit;
	public void submitclick()
	{
		submit.click();
	}

	@FindBy(how=How.XPATH,using="(//*[@type=\"submit\" or contains(text(),\"Submit\")])[2]")
	public WebElement submit2;
	public void submit2click()
	{
		submit2.click();
	}
//	(//*[@type="submit" or contains(text(),'Submit')])[4]
//common clicks

@FindBy(how=How.XPATH,using="//*[@id=\"menuNavigate\"]")
	public WebElement rightalign;
	public void rightalignclick()
	{
		rightalign.click();
	}
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"Second-Level\")]")
	public WebElement secondapprovals;
	public void secondapprovalsclick()
	{
		secondapprovals.click();
	}
//*************************************************************************************************************************************************CREATE
	@FindBy(how=How.XPATH,using="//button[contains(text(),\"New\") or @title=\"Create\" or contains(text(),\"Create\")]")
	public WebElement create;
	public void create()
	{
		create.click();
	}

	@FindBy(how=How.XPATH,using="//*[@formcontrolname='comments' or @formcontrolname='Comments']")
	public WebElement comments;
	public void commentsFill(String x)
	{
		comments.sendKeys(x);
	}

	@FindBy(how=How.XPATH,using="//input[@type=\"search\"]")
	public WebElement search;
	public void searchfill(String x)
	{
		search.sendKeys(x);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"Second-level-search\"]")
	public WebElement searchc;
	public void searchClick()
	{
		searchc.click();
	}
	@FindBy(how=How.XPATH,using="(//*[@class=\"fa fa-pencil-alt\"])[1] |  (//*[@type=\"checkbox\"])")
	public WebElement edit;
	public void editClick()
	{
		edit.click();
	}
	@FindBy(how=How.XPATH,using="(//*[@class=\"fa fa-pencil-alt\"])[2]")
	public WebElement edit2;
	public void edit2Click()
	{
		edit2.click();
	}


//EditMaster
			@FindBy(how=How.XPATH,using="(//*[@class=\"editBtn\"])[1]")
			public WebElement EditMaster;
			public void EditMaster()
			{
				EditMaster.click();
			}
//searchedit
			@FindBy(how=How.XPATH,using="//*[@class=\"editBtn\"]")
			public WebElement searchedit;
			public void searcheditClick()
			{
				searchedit.click();
			}
	@FindBy(how=How.XPATH,using="//*[@type=\"checkbox\"]")
	public WebElement enable;
	public void enableClick()
	{
		enable.click();
	}


	//update
	@FindBy(how=How.XPATH,using="//button[contains(text(),\"Update\")]")
	public WebElement update;
	public void updateClick()
	{
		update.click();
	}

	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"password\"]")
	public WebElement pswrd;
	public void pswrdfill(String x)
	{
		pswrd.sendKeys(x);
	}

	//save
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Save') or @ title='submit' or @type='submit' or contains(text(),'Submit')]")
	public WebElement save;
	public void saveClick()
	{
		save.click();
	}

	//button
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Yes') or contains(text(),'yes')]")
	public WebElement Yes;
	public void Yes()
	{
		Yes.click();
	}
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Ok') or contains(text(),'OK')]")
	public WebElement ok;
	public void okClick()
	{
		ok.click();
	}



	//logout
	@FindBy(how=How.XPATH,using="//*[@class=\"avatarIcon\"]")
	public WebElement icon;
	public void iconClick()
	{
		icon.click();
		//Actions a = new Actions(driver);
		//a.doubleClick(icon).perform();
	}
	@FindBy(how=How.XPATH,using="//*[@data-target=\"#logOutModal\"]")
	public WebElement quit;
	public void quitClick()
	{
		quit.click();
	}


	//For Double Logout

	@FindBy(how=How.XPATH,using="//*[@class=\"avatarIcon\"]")
	public WebElement icon2;
	public void icon2Click()
	{
		icon2.click();
	}
	@FindBy(how=How.XPATH,using="//*[@data-target=\"#logOutModal\"]")
	public WebElement logout;
	public void logoutClick()
	{
		logout.click();

	}


//**************************************************************************************************

//CREATE LEFT CLICK
	@FindBy(xpath = "//*[@id='iniBtn1']")
	public WebElement Create;
	public void Create()
	{
		Create.click();
	}

//CHECKBOX TICK//ENABLE DISABLE

	 @FindBy(xpath = "//*[@type='checkbox']")
	public WebElement CheckBox;
	public void CheckBox()
	{
		CheckBox.click();
	}

//COMMENTS BEFORE UPDATING
	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"Comments\"]")
	public WebElement Comments;
	public void enteredComments(String user)
	{
		Comments.clear();
		Comments.sendKeys(user);
	}




//ApplicationTileClick
		 @FindBy(xpath = "//a[contains(.,'CMS - Corporate')]")
		public WebElement AppTile;
		public void AppTile()
		{
			wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf((AppTile)));
			AppTile.click();
		}
//Menu Click
		 @FindBy(xpath = "(//*[@id='navbarDropdown'])[1]")
		public WebElement Menu;
		public void Menu() throws Exception
		{
			wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf((Menu)));
			Menu.click();
			Thread.sleep(3000);
		}
}
