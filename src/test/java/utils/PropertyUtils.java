package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
	
	public static Properties propertyUtils(String filePath) {
		
		Properties prop = new Properties();
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(filePath));
			prop.load(reader);
		} catch (IOException e) {
			System.out.println("Error loading properties file: " + e.getMessage());
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing reader: " + e.getMessage());
			}
		}
		
		return prop;
	}
}
