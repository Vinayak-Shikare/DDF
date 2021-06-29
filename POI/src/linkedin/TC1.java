package linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.loginpages;


public class TC1 {

	@Test
	public  void verifylogin()  {


		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.manage().window().maximize();
				
		loginpages login = new loginpages (driver);   
		
		login.typeusername("8095660343");
		login.typepassword("8095660343");
		login.clickbutton();
		
		driver.quit();
	}
}
