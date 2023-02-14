package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;
import pages.LoginPage;

public class DeleteLeadTC extends ProjectSpecificMethods{

	@BeforeTest
	public void setfile() {
		
		filename="DeleteLeaddata";
	}
	
	@Test(dataProvider="fetchdata")
	public  void runDeleteTC(String uname,String pwd,String no) throws InterruptedException {
		
		new LoginPage(driver)
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.dclickLead()
		.dFindLeads()
		.clickPhone()
		.enterPhoneNumber(no)
		.clickFindLeadsButton()
		.dGetLeadIdAndClick()
		.dclickDeleteMenu()
		.dclickLead()
		.dFindLeads()
		.dSendLeadId()
		.dClickLeadsButton()
		.dGetTextMatch();
		
		

	}

}
