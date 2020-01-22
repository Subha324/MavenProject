package com.mrs.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverScript {
	public WebDriver myDriver;
	public Properties prop;
	String fis;

	public DriverScript()  {
		//test
		//test 2
			try
			{
				prop = new Properties();
				File src = new File("C:\\Eclipe Workspace 2\\OpenMRSTest\\src\\main\\java\\com\\mrs\\qa\\config\\config.properties");
				//File src = new File("user.dir" + "\\config.properties");
				FileInputStream fis = new FileInputStream(src);
				prop.load(fis);
				System.out.println(System.getProperty("user.dir"));
			
			}
			catch(Exception e)
			{
				System.out.println("Exception message is "+e);
			}
		}
		

	public  void initBrowser() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			myDriver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			myDriver = new FirefoxDriver();
		}
		myDriver.manage().window().maximize();
		myDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		myDriver.manage().deleteAllCookies();
		myDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		myDriver.get(prop.getProperty("url"));
		//myDriver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		//myDriver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		//myDriver.findElement(By.id("Inpatient Ward")).click();
		//myDriver.findElement(By.xpath("//input[@id='loginButton']")).click();
	}

}
