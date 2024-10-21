package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParameterloginaPOM {
	
	WebDriver driver;
	
	By userSelect= new By.ByName("user-name");
	By passwordSelect= new By.ByName("password");
	By loginBtnSelect= new By.ByName("login-button");
	//we can make all selector private and webdriver protected for security but not mandatory
	
	
	//creating constructor and initialize the driver so that the driver where its object created 
	//their driver assign to this driver of this class so that driver object may not change during the execution
	
	public ParameterloginaPOM(WebDriver driver){
		this.driver=driver; 
		
	}
	
	
	
	
	public void enterUserData(String username, String password) {
		
		driver.findElement(userSelect).sendKeys(username);
		driver.findElement(passwordSelect).sendKeys(password);
	}

	public void loginTest() 
	{
		driver.findElement(loginBtnSelect).click();
	}
	
	public void checkLogin() {
		if(!driver.getPageSource().contains("Sauce Labs Onesie"))
		{
				throw new IllegalStateException("this user is locked");
			}
	}
	
}

