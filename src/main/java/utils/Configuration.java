package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Configuration {
	//private static Configuration configuration;
	private Properties properties;
	private final String defaultpath = "configuration/config.properties";
	
	
	public Configuration(String path) {
		if(path==null) {
			loadProperty(defaultpath);
		}
		else {
			loadProperty(path);
		}
		
	}
	private void loadProperty(String path) {
		properties = new Properties();
		try {
			InputStream isStream = new FileInputStream(path);
			properties.load(isStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getConfiguration(String key) {
		if(key != null) {
		return properties.getProperty(key);
	}else {
		return null;
	}
	}
	
}
