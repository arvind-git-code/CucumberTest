package hooksStepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HokSteps {
 
	WebDriver driver=null;
	//the reason i am declaring class lavel so that we do not have to declare in whole class every time
	
	//Before("@smoke",order=1)
	//@Before(order=1)
	//@Before
	@Before("@smoke or @smoke1")
	public void browserStep() {
		System.setProperty("webdriver.chrome.driver", "/Users/arvin/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//this function is become a hook which will run every time
		System.out.println("browser setup completed");
		driver.get("https://www.google.com");
	}
	
	
	@After("@smoke")
	public void teardown() throws InterruptedException {

		driver.close(); //for close tab
		driver.quit();//for close whole browser
		System.out.println("The browser is closed now");
		
	}
	
	
	@BeforeStep
	public void shortSleep() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("One step started here");
	}

	@AfterStep
	public void testAfter()
	{
		System.out.println("One step completed ");
	}
	
	
	//before and after hooks statement run every time even the test run or not 
	
	//we can have multiple before and after hook for that we need to write the order of hook i.e. @Before(order=1)  @After(order=0) etc even we can use negative numbers
	//We can use the conditional hooks like if i assign a anotation to a scenario like @smoke  and write @Before("@smoke") then before only run for the scenario which is tags by @smoke anotation
	
	
	
	
	@Given("browser is opened now")
	public void browser_is_opened_now() {
		
	}
	

	@And("user on login page")
	public void user_on_login_page() {
		System.out.println("title is :" +driver .getTitle());
	}

	@When("user enter login_id")
	public void user_enter_login_id() {
	}

	@And("press enter button")
	public void press_enter_button() {
	}

	@Then("the user is able to login")
	public void the_user_is_able_to_login() {
	}



}
