package com.base.mkmytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mkmytrip.common.ReadConfig;

public class InitiateDriver {
	public static WebDriver driver;
	
	public static void startDriverInstance() throws Exception {
		String browser = ReadConfig.readProjectConfig("BrowserName");
		if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty(ReadConfig.readProjectConfig("FF_Key"), ReadConfig.readProjectConfig("FF_Path"));
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(ReadConfig.readProjectConfig("ApplicationURL"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal ']")).click();
		Thread.sleep(3000);
	}
	
	public WebDriver getDriverInstance() throws Exception {
		InitiateDriver.startDriverInstance();
		return driver;
	}

}
