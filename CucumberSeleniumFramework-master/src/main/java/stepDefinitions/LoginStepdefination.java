package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import PageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefination{

	public WebDriver driver;
	public LoginPage lp;

	private SoftAssert softAssert = new SoftAssert();
	
	@Given("^the user opens a Chrome browser$")
	public void the_user_opens_a_Chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mallikarjuna.ss\\Desktop\\CucumberSeleniumFramework-master\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		lp = new LoginPage(driver);

	}

	@When("^the user enter to the BQ login \"(.*)\"$")
	public void the_user_enter_to_the_BQ_login_URL(String baseurl) {
	    lp.EnterBaseUrl(baseurl);
		
	}

	@When("^varify title$")
	public void varify_title() {
		String expectedTitle = "Login | BOTTIE QUOTE | Unimicron";
		assertEquals("LogIn Page title does not match.", expectedTitle, lp.GetLoginPageTitle());
	}

	@When("^varify LoginPage LargeBluebox$")
	public void varify_LoginPage_LargeBluebox() {

		String actualrest = lp.LogincontentBluebox().getText();
		String expectedreslt = "BOTTIE QUOTE User Name Password English German Sign In";
		// Remove all whitespace characters from both strings
		actualrest = actualrest.replaceAll("\\s+", "");
		expectedreslt = expectedreslt.replaceAll("\\s+", "");
		assertEquals("Large BlueBox which contains all login elements, modified.?", expectedreslt, actualrest);

	}

	@When("^user will see With botti quote in bold latters$")
	public void user_will_see_Withbotti_quote_in_bolt_latters() {

		String ExpextedBoldltter = "BOTTIE QUOTE";

		assertEquals("Varifies BottiQuote in large latter.modified?", ExpextedBoldltter,
				lp.GetBottiQuoteInBoldlatters().getText());

	}

	@When("^placeholder as User Name$")
	public void placeholder_as_User_Name() {
		String path = "inputEmail";
		String expectUserNamePlaceholder = "User Name";
		assertEquals("UserName placeholder not correct", expectUserNamePlaceholder, lp.VarifyDisplayWord(path));
	}

	@When("^placeholder as Password$")
	public void placeholder_as_Password() {

		String path = "inputPassword";
		String expectedPasswordPlaceholder = "Password";
		assertEquals("PassWord placeholder not correct", expectedPasswordPlaceholder, lp.VarifyDisplayWord(path));

	}

	@When("^by defult in English$")
	public void by_defult_in_English() {
		WebElement dropdownElement = driver.findElement(By.id("inputLanguage"));
		Select dropdown = new Select(dropdownElement);
		WebElement selectedOption = dropdown.getFirstSelectedOption();
		assertEquals("English", selectedOption.getText());
	}

	@When("^enters the Username \"(.*)\"$")
	public void enters_the_username(String Username) {
		lp.MyUsername(Username);
	}

	@When("^enters the password \"(.*)\"$")
	public void enters_the_password(String password) {
		lp.MyPassword(password);
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() {
		lp.SignIn();
	}

	@Test
	@When("^succeful authentication mesg$")
	public void succeful_authentication_mesg() {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 try {
		        String actual = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("msgDisplay"))).getText();
		        String expectedsuccemsg = "User is successfully authenticated.";
		        softAssert.assertEquals("User is successfully authenticated,message modified?", expectedsuccemsg, actual);
		    } catch (TimeoutException e) {
		        // Handle the TimeoutException here
		        System.out.println("TimeoutException: " + e.getMessage());
		        softAssert.fail("TimeoutException: " + e.getMessage());
		    }
	}

	@When("^Unimicorn logo present$")
	public void unimicorn_logo_present() {

		WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed
		WebElement logoElement = wait.until(ExpectedConditions.presenceOfElementLocated(lp.LogoVrify()));
		assert (logoElement != null);

	}

	@Then("^the user should be on the BQ dashboard page$")
	public void the_user_should_be_on_the_BQ_dashboard_page() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcomeId")));
		String actualdashboardTitle = driver.getTitle();
		String expecteddashboardTitle = "Unimicron";
		assertEquals("Home Page title does not match.", expecteddashboardTitle, actualdashboardTitle);
	}

	
	@Then("^quite the browser$")
	public void close_the_browser() {
		 driver.quit();
		 
		 
	}
}
