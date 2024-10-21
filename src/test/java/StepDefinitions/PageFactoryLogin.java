package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactoryPackage.UserLogin_PF;

public class PageFactoryLogin {
	
	
	WebDriver driver=null;
	UserLogin_PF login;
	
	
	@Given("browser is open")
	protected void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "/Users/arvin/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		driver =new ChromeDriver();
	}

	@And("Login page is open")
	protected void login_page_is_open() {
	   driver.get("https://www.saucedemo.com/");
		
	}

	@When("^user enters (.*) and (.*)$")
	protected void user_enters_user_name_and_passwd(String user_name,String passwd) {
		login=new UserLogin_PF(driver);
		login.userLogin_PF(user_name, passwd);
		
	   
	}

	@And("click on login button")
	protected void click_on_login_button() {
	   login.login_pf();
		
	}

	@Then("user is navidate to home page")
	protected void user_is_navidate_to_home_page() {
		login.login_check_PF();
	    
	}


}
