package DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.exceldataconfig;

public class linkedin_login2 {
	
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
	
	
	
	
	
	
	}
	@AfterMethod
	public void teardown()
	
	{
		
		driver.quit();
	}
	
	@DataProvider (name = "linkedin")
	public Object[][] passData() throws Exception 
	{
		
		
		exceldataconfig  configs = new exceldataconfig("C:\\Users\\DELL\\Desktop\\i compass\\POI\\testdata\\inputdata.xlsx");
		 
		int rows = configs.getRowcount(0);
		
		

		//declaration of array
		Object [][] data = new Object [20][20];
		
			for (int i=0; i <=rows; i++)
			{
				data [i][0] = configs.getData(0,i, 0);
				data [i][1] = configs.getData(0,i, 1);
			}
			return data;
		
	
	}

}
