package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethods;

public class MergeContactPage extends ProjectSpecificMethods {
	
	public MergeContactPage(RemoteWebDriver driver) {
		
		this.driver=driver;
		
	}
	public MergeContactPage mClickMergeContactMenu() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		return this;
	}
	
	
	public MergeContactPage mClickFromContact() throws InterruptedException {
		
		driver.findElement(By.xpath("(//a/img)[4]")).click();
		Thread.sleep(2000);
		return this;
	}
	
	  public MergeContactPage mSwitchToNewWindowFrom() throws InterruptedException {
		  
		     Set<String> s = driver.getWindowHandles();
			 List<String> w=new ArrayList<String>(s);

			    //switch tab 1
			    driver.switchTo().window(w.get(1));
			    Thread.sleep(2000);
			    WebElement findElement = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a)[1]"));
			    findElement.click();
			    Thread.sleep(2000);
			 // driver.close();
			       driver.switchTo().window(w.get(0));
			       
			       Thread.sleep(2000);
			       return this;
		}
	
	
	public MergeContactPage mClickToContactMenu() throws InterruptedException {
 	    driver.findElement(By.xpath("(//a/img)[5]")).click();
 	   Thread.sleep(5000);
 	 return this;
	}
	
	
	 public MergeContactPage mSwitchToNewWindowTo() throws InterruptedException {
	 	  Set<String> s1 = driver.getWindowHandles();
		  List<String> w1=new ArrayList<String>(s1);
			    //switch tab 1
			driver.switchTo().window(w1.get(1));
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='x-grid3-row    x-grid3-row-alt']/table[@class='x-grid3-row-table']/tbody/tr/td[1]/div/a)[1]")).click();
			Thread.sleep(2000);
			driver.switchTo().window(w1.get(0));
		 	 return this;
		
			
		}
	
	public MergeContactPage mClickMergeButton() throws InterruptedException {
 	   driver.findElement(By.xpath("//a[text()='Merge']")).click();
 	   return this;
	}
	
	public ViewContact mHandelAlert() throws InterruptedException {
 	    Alert a=driver.switchTo().alert();
 	    a.accept();
 	    ViewContact v=new ViewContact(driver);
 	    return new ViewContact(driver);
	}
	

	

}
