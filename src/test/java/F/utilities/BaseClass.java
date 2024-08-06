package F.utilities;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("deprecation")
public class BaseClass {
	public static WebDriver driver;
	// public static ExtentHtmlReporter Report;
	static ExtentHtmlReporter Report;
	public static ExtentReports extent;
	public static ExtentTest Test;
	protected static Properties Pro;
	protected static Properties Pro1;
	public static Robot r;
	public static WebDriverWait wait;// globally declared
	// *********************************************************************************************************************
	// public static Xls_Reader xls0 = new Xls_Reader(
	// "C:\\Users\\rahul.a\\eclipse-workspace\\WMPS_Old\\src\\test\\resources\\ExcelData\\TestData.CMS.xlsx");
	public static Xls_Reader xls = new Xls_Reader(
			"C:\\Users\\sharuk.k\\eclipse-workspaceOOS\\WMPS_2.0\\WMPS_New\\src\\test\\resources\\ExcelData\\WMPS_EXCELData_Hetero.xlsx");

	// Before heat
	@BeforeTest(alwaysRun = true)
	public static void suiteSetUp() throws IOException {
		Pro = new Properties();

		// ******************************************************************************************************************
		// InputStream input = new FileInputStream(
		// System.getProperty("user.dir") +
		// "\\src\\test\\resources\\properties\\Config.properties");
		// Pro.load(input);//
		// C:\Users\rahul.a\eclipse-workspace\CMSL\src\test\resources\Configuration\CMS.properties
		//
		// WebDriverManager.chromedriver().setup();
		// ChromeOptions co = new ChromeOptions();
		// co.addArguments("--disable-notifications");
		// String[] s = new String[] { "enable-automation" };
		// co.setExperimentalOption("excludeSwitches", s);
		//
		//
		// Map<String, Object> prefs = new HashMap<String, Object>();
		// prefs.put("credentials_enable_service", false);
		// prefs.put("profile.password_manager_enabled", false);
		//
		// co.setExperimentalOption("prefs", prefs);
		//
		// driver = new ChromeDriver(co); // 1
		// System.setProperty("webdriver.chrome.silentOutput", "true");
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// driver.manage().deleteAllCookies();
		// driver.get(Pro.getProperty("url"));
		// driver.manage().window().maximize();

		// ************************************************************************************************

		FileInputStream ip = new FileInputStream(
				"C:\\Users\\sharuk.k\\eclipse-workspaceOOS\\WMPS_2.0\\WMPS_New\\src\\test\\resources\\properties\\Config.properties");
		Pro.load(ip);
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		// WebDriverManager.edgedriver().clearResolutionCache();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver.manage().window().maximize();
		driver.get(Pro.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	// EXTEND
	// REPORT***********************************************************************

	@BeforeTest()
	public ExtentReports getReportObject() {
		String className = this.getClass().getSimpleName(); // Get the class nam
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd--HH.mm.ss").format(new Date());// time stamp
		String repName = className + " Test-Report-" + timeStamp + ".html";
		// String repName="Test-Report-"+".html";
		Report = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/" + repName);// specify location of
		// the report
		Report.config().setEncoding("utf-8");
//		Report.config().setDocumentTitle("Automation Report");
		Report.config().setReportName("Automation Test Result");
		Report.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(Report);

		extent.setSystemInfo("Organization", "Audree Infotech Pvt Ltd");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("Tester", "Sharuk Komminapalli");// *********************************************************************************
		Report.config().setDocumentTitle("WMPS 2.0"); // Tile of report
		Report.config().setReportName("WMPS 2.0"); // name of the report
		return extent;

	}

	@AfterMethod()
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			Test.log(Status.FAIL, "Test Case Failed2 " + result.getName());
			Test.log(Status.FAIL, "Test Case Failed " + result.getThrowable()); // get exception in extent Reports
			String scrceenshotpath = BaseClass.getScreenshot(driver, result.getMethod().getMethodName());
			Test.fail(result.getName(), MediaEntityBuilder.createScreenCaptureFromPath(scrceenshotpath).build()); // To
			// Add screenshot in extent report
		} else if (result.getStatus() == ITestResult.SKIP) {
			Test.log(Status.SKIP, "Test Case Skipped " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {

			Test.log(Status.PASS, "Test Case Failed " + result.getName());
			Test.log(Status.PASS, "Test Case Failed " + result.getThrowable()); // get exception in extent Reports
			String scrceenshotpath = BaseClass.getScreenshot1(driver, result.getName());
			Test.pass(result.getName(), MediaEntityBuilder.createScreenCaptureFromPath(scrceenshotpath).build()); // To
			// Add
			// screensh
		}
	}

	@AfterMethod()
	public void EndReport() {
		extent.flush();
	}

	// Takes Screenshot
	private static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		File source = ((TakesScreenshot) (driver)).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/WMPSScreenShots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		org.apache.commons.io.FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	private static String getScreenshot1(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		File source = ((TakesScreenshot) (driver)).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/PassScreenshots/" + screenshotName + dateName + "png";
		File finalDestination = new File(destination);
		org.apache.commons.io.FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	public static void Login(String Login_Id, String Password) throws Exception {

		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Color = driver.findElement(By.xpath("//button[contains(.,'Login')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);

		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		Thread.sleep(3000); // Sign Button

		// *******************************************************************************************************************
		// WebElement Color1 =
		// driver.findElement(By.xpath("//*[contains(text(),'Login')]"));
		// Js.executeScript("arguments[0].setAttribute('style', 'background: ; border:
		// 2px solid red;');", Color1);

		driver.findElement(By.xpath("//*[contains(text(),'Login')]")).sendKeys(Pro.getProperty(Login_Id));
		Thread.sleep(3000);
		// **********************************************************************************************************************
		WebElement Color2 = driver.findElement(By.name("Password"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid blue;');", Color2);

		driver.findElement(By.name("Password")).sendKeys(Pro.getProperty(Password));
		// **********************************************************************************************************************

		driver.findElement(By.xpath("//*[@class='btn btn-success minW100']")).click();
		Thread.sleep(3000);
		// **********************************************************************************************************************

		List<WebElement> enabledButtonsa2 = driver.findElements(By.xpath("//*[@id='BtnWApp']"));
		if (!enabledButtonsa2.isEmpty()) {
			enabledButtonsa2.get(0).click();
		}
		Thread.sleep(3000);
		// click on menu
		// Actions a=new Actions(driver);
		// WebElement m= driver.findElement(By.id("navbarDropdown"));
		// a.doubleClick(m).perform();
		// Thread.sleep(3000);
		// driver.findElement(By.id("navbarDropdown")).click();
		// Thread.sleep(3000);

	}

	public static void Quit() throws Exception {
		WebElement icon = driver.findElement(By.xpath("//*[@class='avatarIcon']"));
		// Actions a = new
		// Actions(driver);//*************************************************************************
		// a.doubleClick(icon).perform();//***************************Double Click
		icon.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,' Quit')]")).click(); // Quit
		Test.log(Status.PASS, "User Clicked on Quit  button");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Yes')]")).click(); // Yes
		Test.log(Status.PASS, "User Clicked on Yes  button");
		Thread.sleep(3000);
	}

	public static void Logout() throws Exception {
		// Logout
		// Test.log(Status.INFO, "System should display QMS Spectrum dashboard screen");
		driver.findElement(By.xpath("//*[@id='navbarDropdown1']")).click();
		// Test.log(Status.PASS, "Profile Clicked");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'Quit')]")).click();
		// Test.log(Status.PASS, "Quit Clicked");
		Thread.sleep(3000);
		// Test.log(Status.INFO, "System should display QMS Spectrum dashboard screen");
		driver.findElement(By.xpath("//a[contains(.,'Yes')]")).click();
		Thread.sleep(3000);
		// Test.log(Status.PASS, "yes Clicked");
		driver.findElement(By.xpath("//*[@id='navbarDropdown1']")).click();
		// Test.log(Status.PASS, "Profile Clicked");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
		// Test.log(Status.PASS, "Logout Clicked");
		Thread.sleep(3000);
		// Test.log(Status.INFO, "System should display Welcome to QMS Spectrum login
		// page");
		driver.findElement(By.xpath("//a[contains(.,'Yes')]")).click();
		// Test.log(Status.INFO, "Yes Clicked and displayed login page");
		Thread.sleep(3000);
		Test.createNode("CMS Initiated Successfully");
	}

	public static void Disable() throws Exception {
		driver.findElement(By.xpath("(//*[@title=\"Click to Edit\"])[1]")).click(); // Edit
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@formcontrolname=\"Comments\"]")).sendKeys(Pro.getProperty("Comments"));// comments
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).click(); // checkbox
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title=\"Click to Update\"]")).click(); // Update
		Thread.sleep(3000);
	}

	public static WebElement waitForWebElementToAppear(WebElement findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement isExistes = wait.until(ExpectedConditions.visibilityOf(findBy));
		return isExistes;
	}

	// ***************************************************************************************************
	public static void scrollPagedown() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
	}

	// ***************************************************************************************************
	public static void scrollPageup() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(3000);
	}

	// ***************************************************************************************************
	public static void scrollPagedownSlow() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
	}

	// ***************************************************************************************************
	public static void UploadFile(String path) throws Exception {

		r = new Robot();
		r.delay(3000);
		// put path to file in a clipboard
		StringSelection s = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// ctrl+V press
		r.keyPress(KeyEvent.VK_CONTROL);// press on ctrl key
		r.keyPress(KeyEvent.VK_V);// press on ctrl key
		r.delay(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.delay(3000);
		// Enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.delay(6000);
		System.out.println("uploaded Successfully");
	}

	public static void AttachFile() throws Exception {
		WebElement Color = driver.findElement(By.xpath("//*[@type='file']"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid black;');", Color);
		// ******************************************************************************************************************************************
		WebElement AttachFile = driver.findElement(By.xpath("//*[@type='file']"));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.click(AttachFile).perform();
		Thread.sleep(3000);
	}

	// ***********************************************************************************************************************
	// MoveCursor
	@FindBy(how = How.XPATH, using = "//*[@type='submit' or contains(text(),'Submit') or contains(text(),'Verify')]")
	public WebElement submit;

	public void submitclick() {
		submit.click();
	}

	// *****************************************************************************************************************
	// public WebElement MoveCursor;
	public static void MoveCursor() throws Exception {
		WebElement MoveCursor;
		Actions actions = new Actions(driver);

		MoveCursor = driver.findElement(By.xpath("//*[text()='Masters']"));
		Thread.sleep(2000);
		actions.moveToElement(MoveCursor).perform();

		Thread.sleep(1000);
	}

	/*******************************************/
	public static void Close_Opened_File() throws Exception {
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		JavascriptExecutor jj = (JavascriptExecutor) driver;
		jj.executeScript("window.scrollTo(0,1000)", "");
		Thread.sleep(2000);
	}

	public static void Password(String Password) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		WebElement Color2 = driver
				.findElement(By.xpath("//*[@formcontrolname='password' or formcontrolname='Password']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color2);
		driver.findElement(By.xpath("//*[@formcontrolname='password' or formcontrolname='Password']"))
				.sendKeys(Pro.getProperty(Password));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public static void WMPS_Login(String username, String Password) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		WebElement Color1 = driver.findElement(By.xpath("//*[@formcontrolname='LoginId']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color1);
		driver.findElement(By.xpath("//*[@formcontrolname='LoginId']")).sendKeys(Pro.getProperty(username));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement Color2 = driver.findElement(By.xpath("//*[@formcontrolname='Password']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color2);
		driver.findElement(By.xpath("//*[@formcontrolname='Password']")).sendKeys(Pro.getProperty(Password));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement Color3 = driver.findElement(By.xpath("(//button[text()='Login'])"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color3);
		driver.findElement(By.xpath("(//button[text()='Login'])")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		List<WebElement> termination = driver.findElements(By.xpath("//*[@id='BtnWApp']"));
		if (!termination.isEmpty()) {
			termination.get(0).click();
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
		// WebElement Color4 = driver.findElement(By.xpath("//*[contains(text(),'WMPS -
		// Hetero Labs Limited (Unit-9) ')]"));
		// WebElement Color4 = driver.findElement(By.xpath("//*[contains(text(),'WMPS -
		// Hindys Lab Private Limited ')]"));

		// ***************************************************************************************************************************
		WebElement Color4 = driver.findElement(By.xpath("//*[contains(text(),'WMPS - ')]"));
		// ***************************************************************************************************************************

		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color4);
		try {
			// ********************************************************************************************************************************
			driver.findElement(By.xpath("//*[contains(text(),'WMPS - ')]")).click();
			// driver.findElement(By.xpath("//*[contains(text(),'WMPS - Hindys Lab Private
			// Limited ')]")).click();
			// driver.findElement(By.xpath("//*[contains(text(),'WMPS - Hetero Labs Limited
			// (Unit-9) ')]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		// ********************************************************************************************************************************

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public static void WMPS_Login_Release(String username, String Password) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Color1 = driver.findElement(By.xpath("//*[@formcontrolname='LoginId']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color1);
		driver.findElement(By.xpath("//*[@formcontrolname='LoginId']")).sendKeys(Pro.getProperty(username));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Thread.sleep(2000);

		WebElement Color2 = driver.findElement(By.xpath("//*[@formcontrolname='Password']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color2);
		driver.findElement(By.xpath("//*[@formcontrolname='Password']")).sendKeys(Pro.getProperty(Password));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Thread.sleep(2000);

		WebElement Color3 = driver.findElement(By.xpath("(//button[text()='Login'])"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color3);
		driver.findElement(By.xpath("(//button[text()='Login'])")).click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Thread.sleep(2000);

		List<WebElement> termination = driver.findElements(By.xpath("//*[@id='BtnWApp']"));
		if (!termination.isEmpty()) {
			termination.get(0).click();
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	// public static void WMPS_Login(String UserName, String Password) throws
	// Exception
	// {
	// JavascriptExecutor Js = (JavascriptExecutor) driver;
	//
	// WebElement Color1 =
	// driver.findElement(By.xpath("//*[@formcontrolname='LoginId']"));
	// Js.executeScript("arguments[0].setAttribute('style', 'background: ; border:
	// 4px solid black;');", Color1);
	// driver.findElement(By.xpath("//*[@formcontrolname='LoginId']")).sendKeys(UserName);Thread.sleep(2000);
	//
	// WebElement Color2 =
	// driver.findElement(By.xpath("//*[@formcontrolname='Password']"));
	// Js.executeScript("arguments[0].setAttribute('style', 'background: ; border:
	// 4px solid black;');", Color2);
	// driver.findElement(By.xpath("//*[@formcontrolname='Password']")).sendKeys(Password);Thread.sleep(2000);
	//
	// WebElement Color3 =
	// driver.findElement(By.xpath("(//button[text()='Login'])"));
	// Js.executeScript("arguments[0].setAttribute('style', 'background: ; border:
	// 4px solid black;');", Color3);
	// driver.findElement(By.xpath("(//button[text()='Login'])")).click();Thread.sleep(2000);
	// }
	public static void Disable(String Password) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Color0 = driver.findElement(By.xpath("(//*[@title='Edit'])[1]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color0);
		driver.findElement(By.xpath("(//*[@title='Edit'])[1]")).click();
		Thread.sleep(3000);

		WebElement Color1 = driver
				.findElement(By.xpath("//*[@formcontrolname='comments' or @formcontrolname='Comments']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color1);
		driver.findElement(By.xpath("//*[@formcontrolname='comments' or @formcontrolname='Comments']"))
				.sendKeys("Disable_Comment");
		Thread.sleep(3000);

		WebElement CheckBox = driver.findElement(By.xpath("//*[@type='checkbox']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", CheckBox);
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		Thread.sleep(3000);

		WebElement Color2 = driver.findElement(By.xpath(
				"//*[@type='submit' or @ title='submit'  or @ title='Click to update' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color2);
		driver.findElement(By.xpath(
				"//*[@type='submit' or @ title='submit'  or @ title='Click to update' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"))
				.click();
		Thread.sleep(3000);

		WebElement Color3 = driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color3);
		driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]")).click();
		Thread.sleep(3000);

		WebElement Color4 = driver.findElement(By.xpath("//input[@type='password']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color4);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Pro.getProperty(Password));
		Thread.sleep(3000);

		WebElement Color5 = driver.findElement(By.xpath(
				"//*[@type='submit' or @value='Log In' or @title='submit' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color5);
		driver.findElement(By.xpath(
				"//*[@type='submit' or @value='Log In' or @title='submit' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"))
				.click();
		Thread.sleep(3000);

		WebElement Color6 = driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color6);
		driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]")).click();
		Thread.sleep(3000);// (Hima)
	}

	/*****************************************************************/
	public static void Enable(String Password) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Color0 = driver.findElement(By.xpath("(//*[@title='Edit'])[1]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color0);
		driver.findElement(By.xpath("(//*[@title='Edit'])[1]")).click();
		Thread.sleep(3000);

		WebElement Color1 = driver
				.findElement(By.xpath("//*[@formcontrolname='comments' or @formcontrolname='Comments']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color1);
		driver.findElement(By.xpath("//*[@formcontrolname='comments' or @formcontrolname='Comments']"))
				.sendKeys("Enable_Comment");
		Thread.sleep(3000);

		WebElement CheckBox = driver.findElement(By.xpath("//*[@type='checkbox']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", CheckBox);
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		Thread.sleep(3000);

		WebElement Color2 = driver.findElement(By.xpath(
				"//*[@type='submit' or @ title='submit'  or @ title='Click to update' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color2);
		driver.findElement(By.xpath(
				"//*[@type='submit' or @ title='submit'  or @ title='Click to update' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"))
				.click();
		Thread.sleep(3000);

		WebElement Color3 = driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color3);
		driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]")).click();
		Thread.sleep(3000);

		WebElement Color4 = driver.findElement(By.xpath("//input[@type='password']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color4);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Pro.getProperty(Password));
		Thread.sleep(3000);

		WebElement Color5 = driver.findElement(By.xpath(
				"//*[@type='submit' or @value='Log In' or @title='submit' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color5);
		driver.findElement(By.xpath(
				"//*[@type='submit' or @value='Log In' or @title='submit' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"))
				.click();
		Thread.sleep(3000);

		WebElement Color6 = driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color6);
		driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]")).click();
		Thread.sleep(3000);// (Hima)
	}

	public static void Update(String Password) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Color1 = driver
				.findElement(By.xpath("//*[@formcontrolname='comments' or @formcontrolname='Comments']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color1);
		driver.findElement(By.xpath("//*[@formcontrolname='comments' or @formcontrolname='Comments']"))
				.sendKeys("Update_Comment");
		Thread.sleep(1000);

		WebElement Color2 = driver.findElement(By.xpath(
				"//*[@type='submit' or @ title='submit'  or @ title='Click to update' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color2);
		driver.findElement(By.xpath(
				"//*[@type='submit' or @ title='submit'  or @ title='Click to update' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"))
				.click();
		Thread.sleep(1000);

		WebElement Color3 = driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color3);
		driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]")).click();
		Thread.sleep(1000);

		WebElement Color4 = driver.findElement(By.xpath("//input[@type='password']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color4);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Pro.getProperty(Password));
		Thread.sleep(1000);

		WebElement Color5 = driver.findElement(By.xpath(
				"//*[@type='submit' or @value='Log In' or @title='submit' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color5);
		driver.findElement(By.xpath(
				"//*[@type='submit' or @value='Log In' or @title='submit' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"))
				.click();
		Thread.sleep(3000);

		WebElement Color6 = driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color6);
		driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]")).click();
		Thread.sleep(1000);// (Hima)
	}

	public static void Submit_E_Signature(String Password) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Color2 = driver.findElement(By.xpath(
				"//*[@type='submit' or @ title='submit'  or @ title='Click to update' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color2);
		driver.findElement(By.xpath(
				"//*[@type='submit' or @ title='submit'  or @ title='Click to update' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"))
				.click();
		Thread.sleep(3000);

		WebElement Color3 = driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color3);
		driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]")).click();
		Thread.sleep(3000);

		WebElement Color4 = driver.findElement(By.xpath("//input[@type='password']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color4);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Pro.getProperty(Password));
		Thread.sleep(3000);

		WebElement Color5 = driver.findElement(By.xpath(
				"//*[@type='submit' or @value='Log In' or @title='submit' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color5);
		driver.findElement(By.xpath(
				"//*[@type='submit' or @value='Log In' or @title='submit' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"))
				.click();
		Thread.sleep(3000);

		WebElement Color6 = driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color6);
		driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]")).click();
		Thread.sleep(3000);// (Hima)
	}

	public static void E_Signature(String Password) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Color1 = driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color1);
		driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]")).click();
		Thread.sleep(3000);

		WebElement Color2 = driver.findElement(By.xpath("//input[@type='password']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color2);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Pro.getProperty(Password));
		Thread.sleep(3000);

		WebElement Color3 = driver.findElement(By.xpath(
				"//*[@type='submit' or @value='Log In' or @title='submit' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color3);
		driver.findElement(By.xpath(
				"//*[@type='submit' or @value='Log In' or @title='submit' or contains(text(),'Submit') or contains(text(),'Save') or contains(text(),'Verify')]"))
				.click();
		Thread.sleep(3000);

		WebElement Color4 = driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color4);
		driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]")).click();
		Thread.sleep(3000);
	}

	public static void Save(String Password) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Color1 = driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color1);
		driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]")).click();
		Thread.sleep(3000);

		WebElement Color2 = driver.findElement(By.xpath("//input[@type='password']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color2);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Pro.getProperty(Password));
		Thread.sleep(3000);

		WebElement Color3 = driver.findElement(By.xpath("//button[contains(.,'Submit')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color3);
		driver.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
		Thread.sleep(3000);

		WebElement Color4 = driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color4);
		driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]")).click();
		Thread.sleep(3000);
	}

	public static void E_Signature_Masters(String Password) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Color1 = driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color1);
		driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]")).click();
		Thread.sleep(3000);

		WebElement Color2 = driver.findElement(By.xpath("//input[@type='password']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color2);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Pro.getProperty(Password));
		Thread.sleep(3000);

		WebElement Color3 = driver.findElement(By.xpath("//*[@type='submit']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color3);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);

		WebElement Color4 = driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color4);
		driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]")).click();
		Thread.sleep(3000);
	}

	public static void E_Signature1(String Password) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Color1 = driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color1);
		driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]")).click();
		Thread.sleep(3000);

		WebElement Color2 = driver.findElement(By.xpath("//input[@type='password']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color2);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Pro.getProperty("Password"));
		Thread.sleep(3000);

		WebElement Color3 = driver.findElement(By.xpath(
				"//*[@type='submit' or @value='Log In' or @title='submit'  or contains(text(),'Save') or contains(text(),'Verify')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color3);
		driver.findElement(By.xpath(
				"//*[@type='submit' or @value='Log In' or @title='submit'  or contains(text(),'Save') or contains(text(),'Verify')]"))
				.click();
		Thread.sleep(3000);

		WebElement Color4 = driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color4);
		driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]")).click();
		Thread.sleep(3000);
	}

	public static void E_Signature2(String Password) throws Exception {
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Color1 = driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color1);
		driver.findElement(By.xpath("//button[contains(text(),'Yes') or contains(text(),'yes')]")).click();
		Thread.sleep(3000);

		WebElement Color2 = driver.findElement(By.xpath("//input[@type='password']"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color2);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Pro.getProperty("Password"));
		Thread.sleep(3000);

		WebElement Color3 = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color3);
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		Thread.sleep(3000);

		WebElement Color4 = driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]"));
		Js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 4px solid black;');", Color4);
		driver.findElement(By.xpath("//*[contains(text(),'OK') or contains(text(),'Ok')]")).click();
		Thread.sleep(3000);
	}

	public static void scrollPagedownWithActions(WebElement element) throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		Thread.sleep(3000);
	}

	@SuppressWarnings("unlikely-arg-type")
	public static void handleWhitecardPopup(int copyNumberGiven) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait for the whitecard element to be visible
//		WebElement whitecard = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("div[class='modal-body']")));
		// Scroll down to the whitecard (if necessary)
		WebElement copyNumber = driver.findElement(By.xpath("//tbody/tr[4]/td[1]"));
		scrollPagedownWithActions(copyNumber);
		String copyNumberTest = copyNumber.getText().trim();
		System.out.print(copyNumberTest);
		// Assert the copy number
		Assert.assertEquals(copyNumberTest, String.valueOf(copyNumberGiven), "Copy number mismatch!");

		// Interact with the whitecard elements
		driver.findElement(By.xpath("//*[@class='close']")).click(); // Update the XPath
	}

	@SuppressWarnings("unlikely-arg-type")
	public static void openedPrintFile(int copyNumberGiven) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait for the whitecard element to be visible
//		WebElement whitecard = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("div[class='modal-body']")));
		// Scroll down to the whitecard (if necessary)
		WebElement copyNumber = driver.findElement(By.xpath("//tbody/tr[4]/td[1]"));
		scrollPagedownWithActions(copyNumber);
		String copyNumberTest = copyNumber.getText().trim();
		System.out.print(copyNumberTest);
		// Assert the copy number
		Assert.assertEquals(copyNumberTest, String.valueOf(copyNumberGiven), "Copy number mismatch!");

		// Interact with the whitecard elements
		driver.findElement(By.xpath("//*[@class='close']")).click(); // Update the XPath
	}

	public static boolean doesValueExistInTable(List<WebElement> viewData, String value) {
		for (WebElement cell : viewData) {
			if (cell.getText().equals(value)) {
				return true;
			}
		}
		return false;
	}
}
