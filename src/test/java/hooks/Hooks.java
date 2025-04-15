package hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import constants.FrameworkConstants;
import driver.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import utils.PropertyUtils;
import utils.TestDataLoader;

public class Hooks {
	
	public static WebDriver driver;
	
	@BeforeAll
	public static void beforeHooks() {
	Properties properties = PropertyUtils.propertyUtils(FrameworkConstants.CONFIG_FILE_PATH);
	
	//System.out.println("Browser name: " + FrameworkConstants.BROWSER);

	
	FrameworkConstants.BROWSER= properties.getProperty("browser");
	
	FrameworkConstants.ENVIRONMENT= properties.getProperty("environment");
	
	driver = DriverFactory.initDriver(FrameworkConstants.BROWSER);
	
	driver.get(TestDataLoader.getInstance().getAppUrl());
	}
	
	@AfterAll
	public static void afterHooks() {
		driver.quit();
		
	}
    
}
