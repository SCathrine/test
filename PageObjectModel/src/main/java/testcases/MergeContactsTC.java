package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import pages.CreateLeadPage;
import pages.EditLeadPage;
import pages.LoginPage;
import pages.ViewLeadPage;


public class MergeContactsTC extends ProjectSpecificMethods{

	@BeforeTest
	public void setfile() {
		
		filename="MergeContact";
	}
	
	@Test(dataProvider="fetchdata")
	public  void runEditLead(String uname,String pwd,String verifytext) throws InterruptedException {
	
		new LoginPage(driver)
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.mClickContactMenu()
		.mClickMergeContactMenu()
		.mClickFromContact()
		.mSwitchToNewWindowFrom()
	    .mClickToContactMenu()
	 	.mSwitchToNewWindowTo()
	 	.mClickMergeButton()
		.mHandelAlert()
		.mVerifyMergeContacts(verifytext);
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		

	}

}
