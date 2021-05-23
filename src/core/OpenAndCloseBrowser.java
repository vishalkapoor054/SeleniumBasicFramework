package core;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class OpenAndCloseBrowser {
  
	protected static WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser){
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.internetexplorer.driver", "");
			driver = new InternetExplorerDriver();
		}else{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}

	public static WebDriver getDriverInstance() {
		// TODO Auto-generated method stub
		return driver;
	}
	
}
