package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethods;

public class ViewContact extends ProjectSpecificMethods{

	public ViewContact(RemoteWebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public ViewContact mVerifyMergeContacts(String verifytext) throws InterruptedException {
 	    String title = driver.getTitle();
 	    if(title.equals(verifytext)) {
 	    	System.out.println("Verified");
 	    }
 	    else {
 	    	System.out.println("Not Verified");
 	    }
	
 	    return this;
	}

}
