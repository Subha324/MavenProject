package com.mrs.qa.testcases;

import org.testng.annotations.BeforeMethod;

import com.mrs.qa.base.DriverScript;
import com.mrs.qa.pages.LoginPage;


public class BaseTest extends DriverScript {
	LoginPage lp;
	
	
	
	@BeforeMethod
	public void startTest(){
	initBrowser();
		lp = new LoginPage();
	}
}