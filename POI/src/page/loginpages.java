package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpages {
WebDriver driver;
	
	By username = By.id("username");
	By password = By.id("password");
	By click = By.xpath("//*[@type ='submit']");
	
	
	
	public loginpages(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void typeusername(String uid) 
	{
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typepassword(String pwd)
	{
	driver.findElement(password).sendKeys(pwd);	
	}
	
	public void clickbutton()
	{
		driver.findElement(click).click();
		
	}
}
