package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{

	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public  DuplicatePage clickDuplicatePage() {
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		DuplicatePage dp=new DuplicatePage(driver);
		return new DuplicatePage(driver);

	}
	
	
	public EditLeadPage clickEditMenu() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
	//	return this;
		EditLeadPage elp=new EditLeadPage(driver);
		return new EditLeadPage(driver);
		
	}
	
	public  HomePage dclickDeleteMenu() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Delete")).click();
		HomePage ldp=new HomePage(driver);
		return new HomePage(driver);

	}
	

}
