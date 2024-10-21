package pageFactoryPackage;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class UserLogin_PF {
	
	// we can use @CacheLookup  anotaion to store the webelement if the webelement does not change during execution of test script
	@FindBy(name="user-name")
	WebElement usertext;
	
	@FindBy(name="password")
	WebElement passwdText;
	
	@FindBy(name="login-button")
	WebElement login_btn;
	
	//@FindBy(how=How.PARTIAL_LINK_TEXT,using="Labs")
	@FindBy(partialLinkText="Labs")
	List<WebElement> elements;
	
	
	
	WebDriver driver;
	public UserLogin_PF(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(driver, UserLogin_PF.class); here this refer to this class i.e. UserLogin_PF so we can write both 
	
		
	//for ajax pages need some time so we can use below 	
		
		
//		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver1, 30);
//		PageFactory.initElements(factory, this);
		
//		or
		
//		PageFactory.initElements(new AjaxElementLocatorFactory(driver1,30), this);
		
		
	}
	
	
	public void userLogin_PF(String user_name, String passwd) {
		
		usertext.sendKeys(user_name);
		passwdText.sendKeys(passwd);
	}
	
	public void login_pf() 
	{
		login_btn.click();
	}
	
	public void login_check_PF() {
		
//		for(Object obj:elements) {
//			System.out.println(obj);
//		}
//			
	if(!driver.getPageSource().contains("Sauce Labs Onesie"))
			{
				throw new IllegalStateException("this user is locked");
			}
	}
	
}
