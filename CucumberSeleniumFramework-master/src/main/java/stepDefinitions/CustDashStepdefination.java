package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.CustDashboard;
import PageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustDashStepdefination {

	public WebDriver driver;
	public CustDashboard Cd;
	
	
	
	 
	
	@Given("^the User is logged in with \"([^\"]*)\" already on the Customer Quotation Dashboard page$")
	public void the_User_is_logged_in_with_already_on_the_Customer_Quotation_Dashboard_page(String baseurl) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mallikarjuna.ss\\Desktop\\CucumberSeleniumFramework-master\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Cd = new CustDashboard(driver);
		driver.get("http://192.168.150.20:8080/bottie_quote/login.html");
		
		By InputName_or_Emial = By.xpath("//input[@id='inputEmail']");
		driver.findElement(InputName_or_Emial).sendKeys("Mallikarjuna.ss");
		By InputPassword = By.xpath("//input[@id='inputPassword']");
		driver.findElement(InputPassword).sendKeys("Malli@123karjuna");
		By SignInButton = By.xpath("//button[normalize-space()='Sign In']");
		driver.findElement(SignInButton).click();
		
	}

	@When("^the User navigates to the Customer Quotations Page By \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_User_navigates_to_Customer_Quotations_Page(String username, String password) throws Throwable   {
		//wriet later 
	}
	
	  @When("^verifies the existence and clickability of the side navigation bar$")
	  public void
	  verifies_the_existence_and_clickability_of_the_side_navigation_bar() {
		  Cd.SideNavexpand();
		  Cd.SideNavsubexpand();
		  Cd.CloseSideNavexpand(); 
	  }
	  
	  
	  @When("^verifies the existence of the quotation table with table headers$")
	  public void verifies_the_existence_of_the_quotation_table_with_table_headers() {
	      
	  }

	  @When("^verifies the existence and clickability of the Search button$")
	  public void verifies_the_existence_and_clickability_of_the_Search_button()  {
	   
	  }

	  @When("^verifies the existence and clickability of the Create RFQ button$")
	  public void verifies_the_existence_and_clickability_of_the_Create_RFQ_button()  {
	     
	    
	  }

	  @When("^verifies the existence of the Search Dropdown with a specific value$")
	  public void verifies_the_existence_of_the_Search_Dropdown_with_a_specific_value() {
	 
	  }

	  @When("^verifies the existence and clickability of the Clear button$")
	  public void verifies_the_existence_and_clickability_of_the_Clear_button()   {
	      
	       
	  }

	  @When("^verifies the exisistence of the search text box and confirms that the user can enter text$")
	  public void verifies_the_exisistence_of_the_search_text_box_and_confirms_that_the_user_can_enter_text()   {
	      
	       
	  }

	  @When("^verifies the presence of the Unimicron logo$")
	  public void verifies_the_presence_of_the_Unimicron_logo()   {
	      
	       
	  }

	  @When("^verifies the BQ title$")
	  public void verifies_the_BQ_title()   {
	      
	       
	  }

	  @When("^verifies the application version$")
	  public void verifies_the_application_version()   {
	     
	  }

	  @When("^verifies the existence of the language icon and confirms its clickability$")
	  public void verifies_the_existence_of_the_language_icon_and_confirms_its_clickability()   {
		  
	  }
	      

	  @When("^verifies the existence of the logout icon$")
	  public void verifies_the_existence_of_the_logout_icon()   {
	      
	       
	  }

	  @Then("^click on the login icon, and the user is taken to the login page$")
	  public void click_on_the_login_icon_and_the_user_is_taken_to_the_login_page()   {
	      
	        
	  }

	@Then("^quit the browser$")
	public void quit_the_browser()   {
		/* driver.quit(); */
	}

}
