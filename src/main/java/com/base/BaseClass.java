package com.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.commonMethods.CommonMethodsClass;
import com.webPagesPackage.WebPages;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebPages wp;
	public CommonMethodsClass commonMethodsClass;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		initElement();
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

	public void initElement() {
		commonMethodsClass = new CommonMethodsClass();
		wp = new WebPages(driver);
	}
	
	
}
