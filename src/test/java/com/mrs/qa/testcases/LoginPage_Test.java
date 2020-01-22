package com.mrs.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mrs.qa.base.DriverScript;
import com.mrs.qa.pages.LoginPage;

public class LoginPage_Test extends DriverScript {

	LoginPage lp;

	public LoginPage_Test() {
		super();
	}
	@BeforeMethod
	public void startTest() {
		initBrowser();
		lp = new LoginPage();
	}
	@Test
	public void validateVerifyTitle() {
		//lp = new LoginPage();
		String title = lp.verifyTitle();
		System.out.println(" login" + "Page" + title);
	}

}
