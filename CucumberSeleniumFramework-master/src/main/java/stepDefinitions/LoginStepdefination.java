package stepDefinitions;

import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefination{
	
	public WebDriver driver;

	@Given("^the user opens a Chrome browser$")
	public void the_user_opens_a_Chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mallikarjuna.ss\\Desktop\\CucumberSeleniumFramework-master\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}

	@When("^the user navigates to the BQ login URL$")
	public void the_user_navigates_to_the_BQ_login_URL() throws Throwable {
		 driver.get("http://192.168.150.20:8080/bottie_quote/login.html"); 
		  }
	

    @When("^user will see With botti quote in bolt latters$")
    public void user_will_see_Withbotti_quote_in_bolt_latters() {

	WebElement quoteElement = driver.findElement(By.xpath("//strong[contains(text(), 'BOTTIE QUOTE')]"));
    assertNotNull(quoteElement);
    
}


	@When("^enters the username \"([^\"]*)\"$")
	public void enters_the_username(String arg1) throws InterruptedException  {
		
		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("mallikarjuna.ss");
		
	}

	@When("^enters the password \"([^\"]*)\"$")
	public void enters_the_password(String arg1) {
		 driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("Malli@123karjuna");
		
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button()  {
		driver.findElement(By.xpath("//*[@id=\"loginId\"]/div/div/div[6]/button")).click();
		
	}

	@Then("^the user should be on the BQ dashboard page$")
	public void the_user_should_be_on_the_BQ_dashboard_page() throws Throwable {
	   
	}


}
