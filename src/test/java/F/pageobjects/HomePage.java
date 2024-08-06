package F.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
	public WebDriver driver;
	public	WebDriverWait wait;//globally declared

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Login')]")
	public WebElement login;
	public void loginclick()
	{
		login.click();
	}

	@FindBy(how=How.XPATH,using="//*[@formcontrolname='LoginId']")
	public WebElement userid;
	public void useridfill(String x)
	{
		userid.sendKeys(x);
	}

	@FindBy(how=How.XPATH,using="//*[@formcontrolname=\"Password\"]")
	public WebElement password;
	public void passwordfill(String x)
	{
		password.sendKeys(x);
	}

	@FindBy(how=How.XPATH,using="//*[@type='submit' or contains(text(),'Submit')]")
	public WebElement submit;
	public void submitclick()
	{
		submit.click();
	}
	@FindBy(how=How.XPATH,using="(//*[@type='submit' or contains(text(),'Submit')])[2]")
	public WebElement submit2;
	public void submit2click()
	{
		submit2.click();
	}
	@FindBy(xpath = "//*[contains(text(),'WMPS - Hetero Labs Limited (Unit-IX) ')]")
	public WebElement plant;
	public void plantclick()
	{
		plant.click();
	}


	//common clicks
	@FindBy(how=How.XPATH,using="/html/body/app-root/div/app-layout/nav/div/ul[1]/li[3]/a/span")
	public WebElement menu;
	public void menuclick()
	{
		Actions a = new Actions(driver);
		a.doubleClick(menu).perform();
	}

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



	@FindBy(how=How.XPATH,using="//*[@type=\"search\"]")
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
	@FindBy(how=How.XPATH,using="(//*[@class='fa fa-pencil-alt'])[1] |  (//*[@type='checkbox'])")
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
	@FindBy(how=How.XPATH,using="//*[@type=\"checkbox\"]")
	public WebElement enable;
	@FindBy(how=How.XPATH,using="(//*[@type=\"checkbox\"])[6]")
	public WebElement enable1;
	public void enableClick()
	{
		try {
			enable.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			enable1.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	//update
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Update')]")
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
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public WebElement yes;
	public void yesButtonClick()
	{
		yes.click();
	}
	@FindBy(how=How.XPATH,using="//*[contains(text(),\"OK\") or contains(text(),\"Ok\")]")
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
		Actions a = new Actions(driver);
		a.doubleClick(icon).perform();
	}
	@FindBy(how=How.XPATH,using="//*[@data-target=\"#logOutModal\"]")
	public WebElement quit;
	public void quitClick()
	{
		quit.click();
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),\"Yes\")]")
	public WebElement Yes;
	public void YesAnchorClick()
	{
		Yes.click();
	}
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
}
