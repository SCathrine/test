package pages;


//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;

public class DeleteLeadPage extends ProjectSpecificMethods {

	public String leadID;
	
	public DeleteLeadPage(RemoteWebDriver driver) {
		
		this.driver=driver;
		
	}

	
	public FindLeadPage dFindLeads() throws InterruptedException {
		
		
		driver.findElement(By.linkText("Find Leads")).click();
		FindLeadPage f=new FindLeadPage(driver);
		return new FindLeadPage(driver);
	}
	
	
	
	
	
		

}






