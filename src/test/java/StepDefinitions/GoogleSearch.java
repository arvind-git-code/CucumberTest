package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {
	WebDriver driver =null;

	@Given("Browser is open")
	public void browser_is_open() {
		String projectPath= System.getProperty("user.dir");
		System.out.println("project path is :"+projectPath);
		//if the Chrome driver is inside the project then we can give relative path below by creating folder - src/test/resources/driver/chromedriver.exe


		System.setProperty("webdriver.chrome.driver", "/Users/arvin/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));


		//	   System.out.println("browser is opened");
	}

	@And("User is goging to search page")
	public void user_is_googing_to_search_page() {
		driver.get("https://google.com");

		//driver.navigate().to("https://google.com"); can be also use

		//		System.out.println("opened google page");
	}

	@When("User enter text in Search box")
	public void user_enter_text_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Maven Central");


		//		System.out.println("entered some keyword to search");
	}

	@And("hit enter button")
	public void hit_enter_button() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		//		System.out.println("Pass enter key");
	}

	@Then("User is navigated to search result")
	public void user_is_navigated_to_search_result() throws InterruptedException {
		String abc=driver.getCurrentUrl();
		System.out.println(abc);
		driver.getPageSource().contains("Central Repository");
		Thread.sleep(10000);
		driver.close();
		
		
		
		//System.out.println("User is able to navigate to search results");
		
	}

}
