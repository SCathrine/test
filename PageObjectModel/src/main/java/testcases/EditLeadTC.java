package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import pages.CreateLeadPage;
import pages.EditLeadPage;
import pages.LoginPage;
import pages.ViewLeadPage;


public class EditLeadTC extends ProjectSpecificMethods{

	@BeforeTest
	public void setfile() {
		
		filename="EditLead";
	}
	
	@Test(dataProvider="fetchdata")
	public  void runEditLead(String uname,String pwd,String no,String compname) throws InterruptedException {
	
		new LoginPage(driver)
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLead();
		
		new EditLeadPage(driver)
		
		.clickFindLeadsMenu()
		.clickPhone()
		.enterPhoneNumber(no)
		.clickFindLeadsButton()
		.clickFirstRecord()
		.clickEditMenu()
		.updateCompanyName(compname)
		.clickUpdateButton();
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		

	}

}
