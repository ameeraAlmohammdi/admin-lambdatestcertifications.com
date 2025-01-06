package ameera.CertificationTests;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

	RemoteWebDriver driver;
	String testName;

	@BeforeMethod
	@Parameters({ "browser" })
	public void setUp(String browser) throws Exception {
		// LambdaTest URL with username and access key
		String lambdaTestUrl = "https://wakefulness020:agMhJlpsKIuXoPKrUWZagoOZ7keo83hFXIbgJAqqpmrIIPk5eS@hub.lambdatest.com/wd/hub";
		URL url = URI.create(lambdaTestUrl).toURL();

		// Configure browser/OS combinations
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions browserOptions = new ChromeOptions();
			browserOptions.setPlatformName("Windows 10");
			browserOptions.setBrowserVersion("dev");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "almohammadiameera");
			ltOptions.put("accessKey", "zo7yBTveIfGrjBrZSVYrgVarjVXxZZqCQtb3UHFAQj77KqCJVW");
			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("build", "Chrome Builds");
			ltOptions.put("project", "Chrome");
			ltOptions.put("console", "true");
			ltOptions.put("w3c", true);
			ltOptions.put("plugin", "java-java");
			browserOptions.setCapability("LT:Options", ltOptions);
			driver = new RemoteWebDriver(url, browserOptions);

		} else if (browser.equalsIgnoreCase("safari")) {
			SafariOptions browserOptions = new SafariOptions();
			browserOptions.setPlatformName("MacOS Sequoia");
			browserOptions.setBrowserVersion("18");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "almohammadiameera");
			ltOptions.put("accessKey", "zo7yBTveIfGrjBrZSVYrgVarjVXxZZqCQtb3UHFAQj77KqCJVW");
			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("build", "Safari Builds");
			ltOptions.put("project", "Safari");
			ltOptions.put("console", "true");
			ltOptions.put("w3c", true);
			ltOptions.put("plugin", "java-java");
			browserOptions.setCapability("LT:Options", ltOptions);
			driver = new RemoteWebDriver(url, browserOptions);
			
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
