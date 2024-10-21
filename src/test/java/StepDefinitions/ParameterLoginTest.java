//package StepDefinitions;
//import io.cucumber.java.en.Given;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class ParameterLoginTest {
//	WebDriver driver;
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		driver=new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "/Users/arvin/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");	
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//	}
//
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_username_and_password(String username, String password) {
//		driver.findElement(By.name("user-name")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//
//	}
//
//	@And("click on the login button")
//	public void click_on_the_login_button() {
//		driver.findElement(By.name("login-button")).click();
//
//	}
//
//	@Then("user id navigate to home page")		
//	public void user_id_navigate_to_home_page() 
//	{
//		
//		if(!driver.getPageSource().contains("Sauce Labs Onesie"))
//		{
//			throw new IllegalStateException("this user is locked");
//		}
//		
		
		
		//commenting to work ParameterloginaPOM
		//or
		//driver.findElement(By.linkText("Sauce Labs Onesie")).isDisplayed();
		
		//or
		//Boolean abc= driver.getPageSource().contains("Sauce Labs Onesie");
//		System.out.println(abc);
//		if(abc.equals(false)) {
//			System.out.println("this user  is locked");
//		}
		
//	}
//}



