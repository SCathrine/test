package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethods;

public class DuplicatePage extends ProjectSpecificMethods {

	public DuplicatePage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public  ViewLeadPage clickDupSubmitCreateLead() {
		
		driver.findElement(By.name("submitButton")).click();
		ViewLeadPage vlp=new ViewLeadPage(driver);
		return new ViewLeadPage(driver);
	}
	
	

}
