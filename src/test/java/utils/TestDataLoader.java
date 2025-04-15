package utils;

import java.util.Properties;

import constants.FrameworkConstants;

public class TestDataLoader {
	
	private static TestDataLoader testDataloader;
	
	public static TestDataLoader getInstance()
	{
		if(testDataloader==null)
		{
			testDataloader = new TestDataLoader();
		}
		return testDataloader;
		
	}
	
	Properties prop;
	private TestDataLoader() {
		
		switch(FrameworkConstants.ENVIRONMENT)
		{
		case "QA":
			prop = PropertyUtils.propertyUtils(FrameworkConstants.QA_TEST_DATA_FILE);
			break;
			
		case "prod":
			prop = PropertyUtils.propertyUtils(FrameworkConstants.PROD_TEST_DATA_FILE);
			break;
		default:
			break;
		
		}
	}
	
	public String getAppUrl() {
		return prop.getProperty("appurl");
	}

}
