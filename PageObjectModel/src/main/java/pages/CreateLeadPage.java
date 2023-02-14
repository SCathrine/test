package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage(RemoteWebDriver driver) {
	this.driver=driver;
	}

	public  CreateLeadPage companyName(String compname) {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compname);
		return this;

	}
	
	public  CreateLeadPage Forename(String fname) {
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}


	public  CreateLeadPage Surname(String lname) {
	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}

	public  CreateLeadPage phoneNumber(String no) {
	
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(no);
		return this;
	}
	
	public  ViewLeadPage clickCreateLead() {
		
		driver.findElement(By.name("submitButton")).click();
		ViewLeadPage vp=new ViewLeadPage(driver);
		return new ViewLeadPage(driver);
	}


}
