package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginTC extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setfile() {
		
		filename="Logindata";
		
	}
	
	
	@Test(dataProvider="fetchdata")
	public void runLogin(String uname,String pwd) {
	
		/* if we don't pass/return control then,
		
		LoginPage lp=new LoginPage();
		lp.enterUserName();
		lp.enterPAssword();
		
		 */
		
		new LoginPage(driver)
		.enterUserName(uname)	
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.verifyTitle()
		.clickLead()
		.createLeadPage();
	
}

}
