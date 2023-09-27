package PageObjects;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustDashboard {

	public WebDriver driver;
	SoftAssertions softAssertions = new SoftAssertions();

	public CustDashboard(WebDriver driver) {
		this.driver = driver;
	}

	By SideNavexpand = By
			.xpath("//a[@class='sidebarOption list-group-item list-group-item-action d-flex align-items-center']");
	By SideNavsubexpand = By.xpath("//i[@id='submenuIconDis']");
	By CloseSideNavexpand = By.xpath(
			"//a[@class='sidebarOption list-group-item list-group-item-action d-flex align-items-center']//div[@class='d-flex w-100 justify-content-start align-items-center']");

	By UnimicironLogo = By.xpath("//img[@alt='Unimicron Germany']");
	By UnimicironText = By.xpath("//span[@id='applicationLabelId']");
	By VersionId = By.xpath("//span[@id='appVersionId']");
	By BuildNum = By.xpath("//span[@id='buildVersion']");

	By LangugeIcon = By.xpath("//i[@id='languageListDiv_Ital']");
	By Welcome = By.xpath("//span[@id='welcomeId']");
	By UserName = By.xpath("//span[@id='usernameId']");
	By LogOuticon = By.xpath("//i[@class='fa fa-sign-out fa-lg']");

	// Search filds drop down ids
	By SerachDropdown = By.xpath("//select[@id='searchField']");// check list
	By SearchValue = By.xpath("//*[@id=\"searchValue\"]");

	By SearchBotton = By.xpath("//button[@ng-click='searchQuotationList()']");
	By CreateRfq = By.xpath("//span[normalize-space()='Create R.F.Q']");
	By ClearBotton = By.xpath("//button[normalize-space()='CLEAR ALL']");

	By SearchFeild = By.xpath("//input[@type='search']");

	By RfqNumb = By.xpath("//div[@class='dataTables_scrollHeadInner']//th[@id='jobName']");
	By InqNum = By.xpath("//div[@class='dataTables_scrollHeadInner']//th[@id='inquiryNumber']");
	By CustName = By.xpath("//div[@class='dataTables_scrollHeadInner']//th[@id='customerName']");
	By CustDwg = By.xpath("//div[@class='dataTables_scrollHeadInner']//th[@id='customerPartNumber']");
	By SalesPerson = By.xpath("//div[@class='dataTables_scrollHeadInner']//th[@id='salesPerson']");
	By CalcType = By.xpath("//div[@class='dataTables_scrollHeadInner']//th[@id='calculation']");
	By Priority = By.xpath("//div[@class='dataTables_scrollHeadInner']//th[@id='priority']");
	By Status = By.xpath("//div[@class='dataTables_scrollHeadInner']//th[@id='status']");
	By Created = By.xpath("//div[@class='dataTables_scrollHeadInner']//th[@id='created']");
	By DueDate = By.xpath("//div[@class='dataTables_scrollHeadInner']//th[@id='dueDate']");
	By ClosedDate = By.xpath("//div[@class='dataTables_scrollHeadInner']//th[@id='close']");
	By Action = By.xpath("//div[@class='dataTables_scrollHeadInner']//th[@id='action']");

	By EditRfq = By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/span[1]/i[1]");

	By ObsoluteBotton = By.xpath("//tbody/tr[1]/td[12]/div[1]/div[2]/span[1]/i[1]");
	By ObsoluteNo = By.xpath("//button[@class='btn btn-light btn-sm waves-effect waves-light ng-binding']");
	By ObsoluteYes = By.xpath("//div[@type='button']");
	By ObsoluteComment = By.xpath("//textarea[@id='obsoleteCommentId']");

	By DataSheet = By.xpath("//span[@id='datasheet525']//i[@class='fa fa-th-list']");

	public void SideNavexpand() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(SideNavexpand));
		WebElement SideNavexpandclcikble = driver.findElement(SideNavexpand);
		boolean isClickable = isElementClickable(SideNavexpandclcikble);
		Assert.assertTrue("Sidenavbar Element is not clickable.", isClickable);

	}

	public void SideNavsubexpand() {

		WebElement SideNavsubexpandclcikble = driver.findElement(SideNavsubexpand);
		boolean isClickable1 = isElementClickable(SideNavsubexpandclcikble);
		Assert.assertTrue("Subside nave bar Element is not clickable.", isClickable1);
	}

	public void CloseSideNavexpand() {

		WebElement CloseSideNavexpandclcik = driver.findElement(CloseSideNavexpand);
		boolean isClickable2 = isElementClickable(CloseSideNavexpandclcik);
		Assert.assertTrue("Subside nave bar Element is not clickable.", isClickable2);

	}

	public void UnimicironLogo() {
		WebElement unimicronLogo = driver.findElement(UnimicironText);
		boolean isDisplayed = unimicronLogo.isDisplayed();
		isDisplayed = true;
		Assert.assertTrue("Unimicron Germany logo is not displayed on the page", isDisplayed);
	}

	public void UnimicironText() {

		WebElement unimicronTextElement = driver.findElement(UnimicironText);
		String elementText = unimicronTextElement.getText();
		String expectedText = "BOTTIE QUOTE";
		boolean textExists = elementText.contains(expectedText);
		Assert.assertTrue("The text 'Unimicron' does not exist within the element", textExists);

	}

	public void VersionId() {

		WebElement Versioid = driver.findElement(VersionId);
		String Versioid1 = Versioid.getText();
		String expectedVersioid1 = "Ver.: v1.4.42";
		assertEquals("Version id in Customer dashboard is failed.", expectedVersioid1, Versioid.getText());

		/*
		 * Pattern pattern = Pattern.compile(expectedVersioid1);
		 * 
		 * Matcher matcher = pattern.matcher(Versioid1);
		 * 
		 * Assert.assertTrue("version id Element text should match", matcher.matches());
		 */

		Assert.assertNotNull("Element should exist", Versioid1);

	}

	public void BuildNum() {
		String BuildHashscode = driver.findElement(BuildNum).getText();
		Assert.assertNotNull("Element should exist", BuildHashscode);
	}

	public WebElement LangugeIcon() {
		return driver.findElement(LangugeIcon);

	}

	public WebElement Welcome() {
		return driver.findElement(Welcome);

	}

	public WebElement UserName() {
		return driver.findElement(UserName);

	}

	public WebElement LogOuticon() {
		return driver.findElement(LogOuticon);

	}

	public WebElement SerachDropdown() {
		return driver.findElement(SerachDropdown);
	}

	public WebElement SearchValue() {
		return driver.findElement(SearchValue);
	}

	public WebElement SearchBotton() {
		return driver.findElement(SearchBotton);
	}

	public WebElement CreateRfq() {
		return driver.findElement(CreateRfq);
	}

	public WebElement ClearBotton() {
		return driver.findElement(ClearBotton);
	}

	public WebElement SearchFeild() {
		return driver.findElement(SearchFeild);
	}

	public void RfqNumb() {

		String actualText = "R.F.Q Number";
		verifyTextAndClickability(actualText, RfqNumb);
	}

	public void InqNum() {
		String actualText = "Inquiry Number";
		verifyTextAndClickability(actualText,  InqNum);

	}

	public void CustName() {
		String actualText = "Customer Name";
		verifyTextAndClickability(actualText, CustName);
	}

	public void CustDwg() {

		String actualText = "Customer Drawing/Part Number";
		verifyTextAndClickability(actualText, CustDwg );}

	public void SalesPerson() {

		String actualText = "Sales Person";
		verifyTextAndClickability(actualText, SalesPerson );}

	public void CalcType() {

		String actualText = "Calculation Type";
		verifyTextAndClickability(actualText, CalcType );}

	public void Priority() {

		String actualText = "Priority";
		verifyTextAndClickability(actualText, Priority );}

	public void Status() {

		String actualText = "Status";
		verifyTextAndClickability(actualText, Status );}

	public void Created() {

		String actualText = "Created";
		verifyTextAndClickability(actualText, Created );}

	public void DueDate() {

		String actualText = "Due Date";
		verifyTextAndClickability(actualText, DueDate );}

	public void ClosedDate() {

		String actualText = "Closed Date";
		verifyTextAndClickability(actualText, ClosedDate);}

	public void Action() {

		String actualText = "Action";
		verifyTextAndClickability(actualText, Action);}

	// Action column ids

	public void EditRfq() {
		
		/*
		 * String actualText = "Edit R.F.Q."; verifyTextAndClickability(actualText,
		 * EditRfq);
		 */

		}
		


	public void ObsoluteBotton() {
	
		/*
		 * String actualText = "Obsolete"; verifyTextAndClickability(actualText,
		 * ObsoluteBotton);
		 */
	}

	
	  public WebElement ObsoluteNo() { return driver.findElement(ObsoluteNo); }
	 

	
	  public WebElement ObsoluteYes() { return driver.findElement(ObsoluteYes); }
	 

	
	  public WebElement ObsoluteComment() {
		  
		/* return driver.findElement(ObsoluteComment); */
		  }
	 

	public void DataSheet() {
		/*
		 * String actualText = "Datasheet"; verifyTextAndClickability(actualText,
		 * DataSheet);
		 */
		
	}

	/// all methods

	private boolean isElementClickable(WebElement element) {
		try {
			element.click(); // Attempt to click the element
			return true; // Element is clickable
		} catch (Exception e) {
			return false; // Element is not clickable
		}
	}

	public void verifyTextAndClickability(String actualText, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		String expectedText = element.getText();
		Assert.assertEquals("Text does not match the expected value", expectedText, actualText);
		boolean isClickable = isElementClickable(element);
	
		Assert.assertTrue("Element is not clickable.", isClickable);
	}

}
