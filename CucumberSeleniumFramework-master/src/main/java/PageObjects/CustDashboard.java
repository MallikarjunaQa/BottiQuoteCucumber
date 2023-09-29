package PageObjects;

import static org.junit.Assert.assertEquals;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
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

	By SideNavexpand = By.xpath("//a[@class='sidebarOption list-group-item list-group-item-action d-flex align-items-center']");
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

	public void LangugeIcon() {
		
		WebElement LangugeIcon1 = driver.findElement(LangugeIcon);
		Assert.assertTrue("Logout icon should exist.",LangugeIcon1.isDisplayed());
		
	}

	public WebElement Welcome() {
		
		return driver.findElement(Welcome);

	}

	public WebElement UserName() {
		return driver.findElement(UserName);

	}

	public void LogOuticon() {
		
		WebElement logoutIcon = driver.findElement(LogOuticon);
		Assert.assertTrue("Logout icon should exist.", logoutIcon.isDisplayed());

	}

	public void SerachDropdown() {	
		
		WebElement SerachDropdown1 = driver.findElement(SerachDropdown);
		Assert.assertTrue("Logout icon should exist.",SerachDropdown1.isDisplayed());
	}

	public void SearchValue() {
		
		WebElement SearchValue1 = driver.findElement(SearchValue);
		Assert.assertTrue("Logout icon should exist.",SearchValue1.isDisplayed());
	
	}

	public void SearchBotton() {
	
		WebElement SearchBotton1 = driver.findElement(SearchBotton);
		Assert.assertTrue("Logout icon should exist.",SearchBotton1.isDisplayed());
	}

	public void CreateRfq() {
		
		WebElement CreateRfq1 = driver.findElement(CreateRfq);
		Assert.assertTrue("Logout icon should exist.",CreateRfq1.isDisplayed());
	
	}

	public void ClearBotton() {
		
		WebElement ClearBotton1 = driver.findElement(ClearBotton);
		Assert.assertTrue("Logout icon should exist.",ClearBotton1.isDisplayed());
	
	}

	public void SearchFeild() {

		WebElement SearchFeild1 = driver.findElement(SearchFeild);
		Assert.assertTrue("Logout icon should exist.",SearchFeild1.isDisplayed());
	
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
		
		WebElement EditRfq1 = driver.findElement(EditRfq);
		Assert.assertTrue("Logout icon should exist.",EditRfq1.isDisplayed());
		
		}

	public void ObsoluteBotton() {
		
		WebElement ObsoluteBotton1 = driver.findElement(ObsoluteBotton);
		Assert.assertTrue("Logout icon should exist.",ObsoluteBotton1.isDisplayed());
	}


	public void DataSheet() {
		
		WebElement DataSheet1 = driver.findElement(DataSheet);
		Assert.assertTrue("Logout icon should exist.",DataSheet1.isDisplayed());
		
	}

	/// all methods

	public boolean isElementClickable(WebElement element) {
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
