package com.webPagesPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonMethods.CommonMethodsClass;

public class WebPages {
	
	public WebPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath = "//input[@id='email']") public WebElement email;
	@FindBy(xpath = "//input[@id='pass']") public WebElement passWord;
	@FindBy(xpath = "//button[@name='login']") public WebElement logIn;
	
	
	public void emailField(CommonMethodsClass cmc) {
		cmc.enterText(email, "atqrrhman@gmail.com");
	}
	
	public void passWordField(CommonMethodsClass  cm) {
		cm.enterText(passWord, "wuokuhujh");
	}

	public void logInButton(CommonMethodsClass cmc) {
		cmc.clicking(logIn);
	}
}
