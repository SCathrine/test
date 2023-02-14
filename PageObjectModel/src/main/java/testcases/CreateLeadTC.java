package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLeadTC extends ProjectSpecificMethods{

	@BeforeTest
	public void setfile() {
		
		filename="CreateLeaddata";
		
	}
	
	@Test(dataProvider="fetchdata")
	public  void runCreateLead(String uname,String pwd,String compname,String fname,String lname,String no) {
		
		new LoginPage(driver)
		.enterUserName(uname)	
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.verifyTitle()
		.clickLead()
		.createLeadPage()
		.companyName(compname)
		.Forename(fname)
		.Surname(lname)
		.phoneNumber(no)
		.clickCreateLead()
		.clickDuplicatePage()
		.clickDupSubmitCreateLead();
		
		
		

	}

}
