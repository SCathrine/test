package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethods;

public class LeadPage extends ProjectSpecificMethods{

	public LeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public CreateLeadPage createLeadPage () {
		
		driver.findElement(By.linkText("Create Lead")).click();
		CreateLeadPage cp=new CreateLeadPage(driver);
		return new CreateLeadPage(driver);

	}
	
	public FindLeadPage dClickFindLeadLink () throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Find Leads")).click();
		FindLeadPage cp=new FindLeadPage(driver);
		return new FindLeadPage(driver);

	}

}
