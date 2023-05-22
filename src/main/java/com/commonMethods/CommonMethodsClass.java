package com.commonMethods;

import org.openqa.selenium.WebElement;

public class CommonMethodsClass {

	public void clicking(WebElement element) {
		element.click();
	}
	
	public void enterText(WebElement element, String value) {
		element.sendKeys(value);
		
	}
	
}
