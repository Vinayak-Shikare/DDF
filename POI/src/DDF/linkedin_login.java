package DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class linkedin_login {
	
	WebDriver driver;
	
	@Test(dataProvider = "linkedin")
	public void loginverify(String username, String password) throws Exception
	{

	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.xpath("//*[@type ='submit']")).click();
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	
	Assert.assertTrue(driver.getTitle().contains("LinkedIn"), " user not able to login -invalid credentials");
	
	//System.out.println("page title verified - able to login");
	
	
	
	
	}
	@AfterMethod
	public void teardown()
	
	{
		
		driver.quit();
	}
	
	@DataProvider (name = "linkedin")
	public Object[][] passData()
	{
		//declaration of array
		Object [][] data = new Object [3][2];
		
		
		//Initialization of array:
		data[0][0]= "8095660343";
		data[0][1]= "8095660343";
		
		data[1][0]= "8095660343";
		data[1][1]= "8095660343";
		
		data[2][0]= "8095660343";
		data[2][1]= "809566034";	
		
		return data;
	}

}
