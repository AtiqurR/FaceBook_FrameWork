package facebookTestPackage;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.packageReporting.Java_Logger;

public class LogInTest  extends BaseClass{
	
	@Test(invocationCount = 3)
	public void logInTest() {
	wp.emailField(commonMethodsClass);
	
		
	}
	@Test
	public void logInTest2()
	{
		wp.passWordField(commonMethodsClass);
		wp.logInButton(commonMethodsClass);
		Java_Logger.getLog("FacebookTest");
	}
}
