package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseClass.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

		
		//create method for each action
		
		public LoginPage(RemoteWebDriver driver) {
		
			this.driver=driver;
	}

		public LoginPage enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		
		//to pass driver control to other functions
		//create obj and then return the obj value to method
		
		// 1) LoginPage lp=new LoginPage(); 
		
		 //return lp; (or)
		// return new LoginPage();
		
		//no object created here and no memory wasteage
		// 2) return this;

		return this;
		
	}
		
		public LoginPage enterPassword(String pwd) {
			driver.findElement(By.id("password")).sendKeys(pwd);
			return this;

		}
		
		public WelcomePage clickLogin() {
			driver.findElement(By.className("decorativeSubmit")).click();
			
			//here control needs to move to next page.
			WelcomePage wp=new WelcomePage(driver);
			return new WelcomePage(driver);

		}

		

}
