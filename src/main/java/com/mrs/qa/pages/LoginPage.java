package com.mrs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mrs.qa.base.DriverScript;

public class LoginPage extends DriverScript  {
	@FindBy(id="username") WebElement  usernameTXBX;
	@FindBy(id="password") WebElement passwordTXBX;
	@FindBy(id="Inpatient Ward") WebElement  InpatientLocation;
	@FindBy(id="Isolation Ward") WebElement  IsolationLocation;
	@FindBy(id="Laboratory") WebElement  laboratoryLocation;
	@FindBy(id="Outpatient Clinic") WebElement OutpatientClinicLocation;
	@FindBy(xpath="//div[@class='logo']//a//img") WebElement logo;
	@FindBy(id="Pharmacy") WebElement PharmacyLocation;
	@FindBy(id="Registration Desk") WebElement RegistrationDeskLocation;
	@FindBy(xpath="cantLogin") WebElement cantLoginkText;
	@FindBy(xpath="loginButton") WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(myDriver, this);
			}
	public String verifyTitle() {
		return myDriver.getTitle();
	}
	
	public boolean logoIsDisplayed() {
		return logo.isDisplayed();
	}
	public void inPatientWard () {
		usernameTXBX.sendKeys("Admin");
		passwordTXBX.sendKeys("Admin123");
		InpatientLocation.click();
		loginButton.click();
	}
	
	public void isolationWard () {
		usernameTXBX.sendKeys("Admin");
		passwordTXBX.sendKeys("Admin123");
		IsolationLocation.click();
		loginButton.click();
	}
	
	public void outpatientClinic () {
		usernameTXBX.sendKeys("Admin");
		passwordTXBX.sendKeys("Admin123");
		OutpatientClinicLocation.click();
		loginButton.click();
	}
	
	public void pharmacy () {
		usernameTXBX.sendKeys("Admin");
		passwordTXBX.sendKeys("Admin123");
		PharmacyLocation.click();
		loginButton.click();
	}
	public void registrationDesk () {
		usernameTXBX.sendKeys("Admin");
		passwordTXBX.sendKeys("Admin123");
		RegistrationDeskLocation.click();
		loginButton.click();
	}
	public void cantLogin () {
		usernameTXBX.sendKeys("Admin");
		passwordTXBX.sendKeys("Admin123");
		cantLoginkText.click();
		loginButton.click();
	}
}
