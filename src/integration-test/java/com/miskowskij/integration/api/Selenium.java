package com.miskowskij.integration.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.LoggerFactory;

public class Selenium {

	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(Selenium.class);
	
	private String driverPath;
	private WebDriver driver;
	
	public Selenium() {
		
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getDriverPath() {
		return this.driverPath;
	}
	
	public void setDriverPath(String driverPath) {
		this.driverPath = driverPath;
	}
	
	public void setup() {
		// ChromeDriver requires SystemProperty 'webdriver.chrome.driver' to be set
		// with the full path as value.
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--no-sandbox");

		driver = new ChromeDriver(options); // Default driver
		// driver = new FirefoxDriver();
	}

	public void close() {
		driver.quit();
	}
	
}
