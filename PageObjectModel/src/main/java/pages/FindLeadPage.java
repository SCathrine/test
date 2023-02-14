package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethods;

//import org.openqa.selenium.remote.RemoteWebDriver;

public class FindLeadPage extends ProjectSpecificMethods{
	
	public static String leadID;
	
	public FindLeadPage(RemoteWebDriver driver) {
		
		this.driver=driver;
		
	}
	

	public FindLeadPage clickPhone() throws InterruptedException{
	
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
		
		
	}
	
	public FindLeadPage enterPhoneNumber(String no) throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(no);
		return this;
		
		
	}
	
	public FindLeadPage clickFindLeadsButton() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
			}
	
	
	public ViewLeadPage clickFirstRecord() throws InterruptedException{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//return this;
		ViewLeadPage vp=new ViewLeadPage(driver);
		return new ViewLeadPage(driver);
	}
	
	public ViewLeadPage dGetLeadIdAndClick() throws InterruptedException {
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		ViewLeadPage vp=new ViewLeadPage(driver);
		return new ViewLeadPage(driver);
	}
	
	public FindLeadPage dSendLeadId() throws InterruptedException {
		
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	
	public FindLeadPage dClickLeadsButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public FindLeadPage dGetTextMatch() throws InterruptedException {
		Thread.sleep(2000);
		String text = driver.findElement(By.className("x-paging-info")).getText();
		Thread.sleep(2000);
		if (text.equals("No records to display")) {
			System.out.println("Text matched-Record Deleted");
		} else {
			System.out.println("Text not matched-Record Not Deleted");
		}
		
		return this;
	}

}
