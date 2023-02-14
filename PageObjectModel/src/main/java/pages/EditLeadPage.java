package pages;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{

	public EditLeadPage(RemoteWebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public FindLeadPage clickFindLeadsMenu() throws InterruptedException{
			
		Thread.sleep(2000);
		driver.findElement(By.linkText("Find Leads")).click();	
		//return this;
		FindLeadPage flp=new FindLeadPage(driver);
		return new FindLeadPage(driver);	
		
	}
	
	
	
		
	
	
	
	public EditLeadPage updateCompanyName(String compname) throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compname);
		return this;
	}
		
		
	public ViewLeadPage clickUpdateButton() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
		ViewLeadPage vp=new ViewLeadPage(driver);
		return new ViewLeadPage(driver);
		
	}

	
		
		
		

}






