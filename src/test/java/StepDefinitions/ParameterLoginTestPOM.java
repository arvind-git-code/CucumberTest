package StepDefinitions;
import io.cucumber.java.en.Given;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ParameterloginaPOM;

public class ParameterLoginTestPOM {

	WebDriver driver=null;

	ParameterloginaPOM login;
	//Initialization of object reference



	@Given("user is on login page")
	protected void user_is_on_login_page() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/arvin/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		//before below statement if the object created of ParameterloginaPOM class then it will assign the value of driver is null
		//so we have to either put the below statement above or create object after this statement
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("^user enter (.*) and (.*)$")
	protected void user_enter_username_and_password(String username, String password) {
		login=new ParameterloginaPOM(driver);
		//creating object

		login.enterUserData(username, password);

		//		driver.findElement(By.name("user-name")).sendKeys(username);
		//		driver.findElement(By.name("password")).sendKeys(password);

	}

	@And("click on the login button")
	protected void click_on_the_login_button() {

		login.loginTest();
		//		driver.findElement(By.name("login-button")).click();

	}

	@Then("user id navigate to home page")		
	protected void user_id_navigate_to_home_page() 
	{


		login.checkLogin();




		//		if(!driver.getPageSource().contains("Sauce Labs Onesie"))
		//		{
		//			throw new IllegalStateException("this user is locked");
		//		}




		//or
		//driver.findElement(By.linkText("Sauce Labs Onesie")).isDisplayed();

		//or
		//Boolean abc= driver.getPageSource().contains("Sauce Labs Onesie");
		//		System.out.println(abc);
		//		if(abc.equals(false)) {
		//			System.out.println("this user  is locked");
		//		}

	}
}



