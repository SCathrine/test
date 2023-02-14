package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}


	public  HomePage verifyTitle() {
		
		System.out.println(driver.getTitle());
		return this;

	}
	
	
	public  LeadPage clickLead() {
		
		driver.findElement(By.linkText("Leads")).click();
		System.out.println(driver.getTitle());
		LeadPage ldp=new LeadPage(driver);
		return new LeadPage(driver);

	}
	
		public  DeleteLeadPage dclickLead() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		System.out.println(driver.getTitle());
		DeleteLeadPage ldp=new DeleteLeadPage(driver);
		return new DeleteLeadPage(driver);

	}
		
		public MergeContactPage mClickContactMenu() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			MergeContactPage m=new MergeContactPage(driver);
			return new MergeContactPage(driver);
		}

}
