package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	@When("^the user navigates to the BQ login \"(.*)\"$")
	public void the_user_navigates_to_the_BQ_login_URL(String baseurl) {
		 driver.get(baseurl); 
		  }
	
	@When("^varify title$")
	public void varify_title() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | BOTTIE QUOTE | Unimicron";
		assertEquals(expectedTitle, expectedTitle);
	}
	    
    @When("^user will see With botti quote in bold latters$")
    public void user_will_see_Withbotti_quote_in_bolt_latters() {
	WebElement quoteElement = driver.findElement(By.xpath("//strong[contains(text(), 'BOTTIE QUOTE')]"));
    assertNotNull(quoteElement);
    }
    
    @When("^placeholder as User Name$")
    public void placeholder_as_User_Name() throws Throwable {
    	
    	WebElement inputEmail = driver.findElement(By.id("inputEmail"));
    	String placeholderText = inputEmail.getAttribute("placeholder");
    	String expectedPlaceholder = "User Name";
    	assertEquals(expectedPlaceholder, placeholderText);
    }

    @When("^placeholder as Password$")
    public void placeholder_as_Password() {
    	WebElement inputPassword = driver.findElement(By.id("inputPassword"));
    	String placeholderText = inputPassword.getAttribute("placeholder");
    	String expectedPlaceholder = "Password";
    	assertEquals(expectedPlaceholder, placeholderText);
    }

    @When("^by defult in English$")
    public void by_defult_in_English()  {
    	WebElement dropdownElement = driver.findElement(By.id("inputLanguage")); 
    	Select dropdown = new Select(dropdownElement);
    	WebElement selectedOption = dropdown.getFirstSelectedOption();
        assertEquals("English", selectedOption.getText());
    }

    @When("^enters the \"(.*)\"$")
    public void enters_the_username(String username) {
    	driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys(username);
		
    }
    
	@When("^enters the password \"(.*)\"$")
	public void enters_the_password(String password) {
		 driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys(password);
		
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button()  {
		driver.findElement(By.xpath("//*[@id=\"loginId\"]/div/div/div[6]/button")).click();
		
	}
	
	@When("^succeful authentication mesg$")
	public void succeful_authentication_mesg() {
		WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed
	    WebElement successmsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("msgDisplay")));   
		String successmsg1 = successmsg.getText();
    	String expectedsuccemsg = "User is successully authenticated.";
    	assertEquals(expectedsuccemsg, successmsg1);
		
	}
	   
	@Then("^the user should be on the BQ dashboard page$")
	public void the_user_should_be_on_the_BQ_dashboard_page() throws Throwable {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed
        WebElement nextPageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcomeId")));
		String actualdashboardTitle = driver.getTitle();
		String expecteddashboardTitle = "Unimicron";
		assertEquals(expecteddashboardTitle, actualdashboardTitle);
		 
		
	}
	
	@Then("^quite the browser$")
	public void close_the_browser()  {
		driver.quit();
	}
	


}
