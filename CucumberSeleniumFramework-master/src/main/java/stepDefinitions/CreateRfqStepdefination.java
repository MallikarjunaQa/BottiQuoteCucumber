package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.CreateRfq;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateRfqStepdefination {

	
	public WebDriver driver;
	public CreateRfq Cr;
	
	@Given("^User navigates to the Customer Dashboard$")
	public void user_navigates_to_the_Customer_Dashboard()  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mallikarjuna.ss\\Desktop\\CucumberSeleniumFramework-master\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Cr = new CreateRfq(driver);
		driver.get("http://192.168.150.20:8080/bottie_quote/login.html");

		By InputName_or_Emial = By.xpath("//input[@id='inputEmail']");
		driver.findElement(InputName_or_Emial).sendKeys("Mallikarjuna.ss");
		By InputPassword = By.xpath("//input[@id='inputPassword']");
		driver.findElement(InputPassword).sendKeys("Malli@123karjuna");
		By SignInButton = By.xpath("//button[normalize-space()='Sign In']");
		driver.findElement(SignInButton).click();

	}

	@When("^User clicks on the Create RFQ button$")
	public void user_clicks_on_the_Create_RFQ_button() throws InterruptedException {
	    Cr.CrateRfqBotton();
	}

	@When("^navigated to the Create RFQ page$")
	public void navigated_to_the_Create_RFQ_page()  {	
	    Cr.InrCreaterfqpage();
	}
	

	@When("^Inquiry date is the same as the created date$")
	public void inquiry_date_is_the_same_as_the_created_date() throws InterruptedException  {  
	     Cr.inquiryDate();
	} 

	@When("^If priority is normalandQta, Due date UMG to Cust is four days ahead and is disabled$")
	public void if_priority_is_normalandQta_Due_date_UMG_to_Cust_is_4_days_ahead_and_is_disabled()  {
	     Cr.DueDateUnimicrontoCustomer("Normal");
	     Cr.DueDateUnimicrontoCustomer("QTA"); 
	}
  
	@When(" Due date NCS to UMG is the next date of the created date$")
	public void if_priority_is_QTA_Due_date_NCS_to_UMG_is_the_next_date_of_the_created_date()  { 
		 
	}
	

	@When("^Status UMG to Cust is open by default and is disabled$")
	public void status_UMG_to_Cust_is_open_by_default_and_is_disabled()  {
	    
	     
		
		
		
	}

	@When("^Status NCS to UMG is open and is disabled$")
	public void status_NCS_to_UMG_is_open_and_is_disabled()  {
	    
	     
	}

	@When("^User enters the account number$")
	public void user_enters_the_account_number()  {
	    
	     
	}

	@When("^Customer number is not null and is disabled$")
	public void customer_number_is_not_null_and_is_disabled()  {
	    
	     
	}

	@When("^Customer city is not null and is disabled$")
	public void customer_city_is_not_null_and_is_disabled()  {
	    
	     
	}

	@When("^Account manager is not null and selected from dropdown$")
	public void account_manager_is_not_null_and_selected_from_dropdown()  {
	    
	     
	}

	@When("^Salesperson is not null and selected from dropdown$")
	public void salesperson_is_not_null_and_selected_from_dropdown()  {
	    
	     
	}

	@When("^User adds remarks from the sales area$")
	public void user_adds_remarks_from_the_sales_area()  {
	    
	     
	}

	@When("^User adds comments from the NCS engineer area$")
	public void user_adds_comments_from_the_NCS_engineer_area()  {
	    
	     
	}

	@When("^User attaches files \\(drag & drop, upload, remove\\)$")
	public void user_attaches_files_drag_drop_upload_remove()  {
	    
	     
	}

	@When("^User verifies top bar features$")
	public void user_verifies_top_bar_features()  {
	    
	     
	}

	@When("^User verifies side nav bar features$")
	public void user_verifies_side_nav_bar_features()  {
	    
	     
	}

	@Then("^RFQ is successfully created$")
	public void rfq_is_successfully_created()  {
	    
	     
	}


}












