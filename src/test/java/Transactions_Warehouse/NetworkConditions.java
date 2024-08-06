package Transactions_Warehouse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NetworkConditions {


	@DataProvider(name = "networkBandwidths")

	public Object[][] networkConditions() {

		return new Object[][] {

			{ 100000 , 100000 },
			{ 0, 0 },
		};
	}
	@Test(dataProvider = "networkBandwidths")

	public void test(int downloadSpeed, int uploadSpeed)

			throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		if (downloadSpeed > 0 && uploadSpeed > 0) {

			CommandExecutor executor = ((RemoteWebDriver) driver).getCommandExecutor();
			Map<String, Comparable> map = new HashMap();
			map.put("offline", false);
			map.put("latency", 5);
			map.put("download_throughput", downloadSpeed);
			map.put("upload_throughput", uploadSpeed);

			Response response = executor.execute(new Command(((RemoteWebDriver) driver).getSessionId(), "setNetworkConditions",
			ImmutableMap.of("network_conditions", ImmutableMap.copyOf(map))));

			driver.get("http://172.16.5.89/NewAudreeSpectrumApi/NewAudreeSpectrumWeb/");
			//driver.quit();
			}
	}}








