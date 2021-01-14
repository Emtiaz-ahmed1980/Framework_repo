package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import utils.WD_function_genericclass;

public class Configure_Enviroment_setting extends WD_function_genericclass{
	
	@BeforeSuite
	public void beforesuite() {
		log.info("........... Test Suite is started.................");
		//System.out.println("........... Test Suite is started.................");
	}
	
	@AfterSuite
	public void aftersuite() {
		log.info("...............Test Suite is ended.................");
		//System.out.println("...............Test Suite is ended.................");
	}
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void browseropen(String browser_name, String url) {
		//System.out.println(System.getProperty("user.dir"));
	//System.setProperty("webdriver.gecko.driver","C://Users//EMTI//eclipse-workspace//Walmart_MDF//DRIVER//geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C://Users//EMTI//eclipse-workspace//Walmart_handle//DRIVER//chromedriver.exe");
		 
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/DRIVER/geckodriver.exe");
        
        driver = new FirefoxDriver();	
		driver.get(url);
		log.info("Webpage open successfully by Emtiaz Ahmed");
		System.out.println("Webpage open successfully by Emtiaz Ahmed");
	
		maximizePage ();
	}

	
	
@AfterMethod
public void closedriver() {
	log.info("browser get closed");
	System.out.println("browser get closed");
	//driver.close();
}
}