package baseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.PassExcelToFileName;

public class ProjectSpecificMethods {

	public RemoteWebDriver driver;
	public String filename;
	
	@BeforeMethod
	public void preConditions() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void postConditions() {
	
	driver.close();
}
	
	@DataProvider(name="fetchdata")
	public String[][] setData() throws IOException {
		
		
		return PassExcelToFileName.readData(filename);
	}
	
}
