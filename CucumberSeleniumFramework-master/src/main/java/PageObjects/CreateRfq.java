package PageObjects;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateRfq {

	public WebDriver driver;
	SoftAssertions softAssertions = new SoftAssertions();
	Calendar c = Calendar.getInstance();

	public CreateRfq(WebDriver driver) {
		this.driver = driver;
	}

	// locaters
	By CrateRfqBotton = By.xpath("//span[normalize-space()='Create R.F.Q']");
	String ExpextedBoldltter = "http://192.168.150.20:8080/bottie_quote/createOrder.html";
	By InqDate = By.xpath("//*[@id=\"enquiryDate\"]");
	By DueDateUnimicrontoCustomer = By.xpath("//*[@id=\"dueDateUnimToCustm\"]");
	By DueDateNCStoUMG = By.xpath("//*[@id=\"dueDateNcsToUnim\"]");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//methods
	public void CrateRfqBotton() throws InterruptedException {

		Thread.sleep(4000);
		WebElement CreateClick = driver.findElement(CrateRfqBotton);
		boolean isClickable = isElementClickable(CreateClick);
		Assert.assertTrue("Element is not clickable.", isClickable);
	}

	public void InrCreaterfqpage() {

		assertEquals("Eror while fatching quote dashboard url", ExpextedBoldltter, driver.getCurrentUrl());

	}

	public void inquiryDate() throws InterruptedException {

		try {
			// checks inqdate is created date
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement inqDateElement = wait.until(ExpectedConditions.elementToBeClickable(InqDate));

			String date1 = inqDateElement.getAttribute("value");
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			String SysDate = formatter.format(date);

			assertEquals("Enq date is should be datate of craeted date", SysDate, date1);
			// check inqdatefeild is date piker

			boolean inquiryDatecondition = driver.findElement(InqDate).isEnabled();
			Assert.assertTrue(inquiryDatecondition);

			WebElement inquiryDateelement = driver.findElement(InqDate);
			Assert.assertNotNull(inquiryDateelement);
			WebElement dateField = driver.findElement(InqDate);
			String classAttribute = dateField.getAttribute("class");
			Assert.assertTrue("The field is not a date picker.", classAttribute.contains("datepicker"));

		} catch (Exception e) {
			e.printStackTrace();
			// Take a screenshot or additional actions on failure
		}

	}

	public void DueDateUnimicrontoCustomer(String selectedPriority) {
		
	    WebElement priorityDropdown = driver.findElement(By.id("priority"));
	    Select dropdown = new Select(priorityDropdown);
	    dropdown.selectByValue(selectedPriority);

	    WebElement dueDateElement = driver.findElement(By.id("dueDateUnimToCustm"));
	    String actualDueDate = dueDateElement.getAttribute("value");

	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    Calendar c = Calendar.getInstance();

	    if (selectedPriority.equals("Normal")) {
	        c.add(Calendar.DATE, 4); // Adding 4 days
	    } else if (selectedPriority.equals("QTA")) {
	        c.add(Calendar.DATE, -3); // Subtracting 3 days
	    }

	    String expectedDueDate = sdf.format(c.getTime());

	    assertEquals("Due date does not match the expected value", expectedDueDate, actualDueDate);
	}

	
	
	public void DueDateNCStoUMG() {
		
		
		
		 WebElement dueDateElement = driver.findElement(By.id("dueDateUnimToCustm"));
		    String actualDueDate = dueDateElement.getAttribute("value");

		    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		    Calendar c = Calendar.getInstance();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	// All methods

	public boolean isElementClickable(WebElement element) {
		try {
			element.click(); // Attempt to click the element
			return true; // Element is clickable
		} catch (Exception e) {
			return false; // Element is not clickable
		}
	}

}
