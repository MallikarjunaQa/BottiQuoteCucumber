package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CustDashboard {
	
	public WebDriver driver;
	
	public CustDashboard(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	 

	By SideNavexpand = By.xpath("//a[@class='sidebarOption list-group-item list-group-item-action d-flex align-items-center']");
	By SideNavsubexpand = By.xpath("//i[@id='submenuIconDis']");
	By CloseSideNavexpand = By.xpath("//a[@class='sidebarOption list-group-item list-group-item-action d-flex align-items-center']//div[@class='d-flex w-100 justify-content-start align-items-center']");
	

	By UnimicironLogo = By.xpath("//img[@alt='Unimicron Germany']");
	By UnimicironText = By.xpath("//span[@id='applicationLabelId']");
	By VersionId = By.xpath("//span[@id='appVersionId']");
	By BuildNum = By.xpath("//span[@id='buildVersion']");
	
	
	By LangugeIcon = By.xpath("//i[@id='languageListDiv_Ital']");
	By Welcome = By.xpath("//span[@id='welcomeId']");
	By UserName = By.xpath("//span[@id='usernameId']");
	By LogOuticon  = By.xpath("//i[@class='fa fa-sign-out fa-lg']");
	
	

	//Search filds drop down ids
	By SerachDropdown = By.xpath("//select[@id='searchField']");//check list
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
		By sideNavLocator = By.xpath("//a[@class='sidebarOption list-group-item list-group-item-action d-flex align-items-center']");
	    
	    WebElement sideNavElement = driver.findElement(sideNavLocator);
	    sideNavElement.click();
	}
	
	public WebElement SideNavsubexpand () {
		return driver.findElement(SideNavsubexpand); 
	}
	public WebElement CloseSideNavexpand () {
		return driver.findElement(CloseSideNavexpand);
	}
	
	
	
	public WebElement UnimicironLogo() {
		return driver.findElement(UnimicironLogo);
		 
	}
	public WebElement UnimicironText() {
		return driver.findElement(UnimicironText);
		 
	}
	public WebElement VersionId() {
		return driver.findElement(VersionId);
		 
	}public WebElement BuildNum() {
		return driver.findElement(BuildNum);
	}
	public WebElement LangugeIcon() {
		return driver.findElement(LangugeIcon);
		 
	}public WebElement Welcome() {
		return driver.findElement(Welcome);
		 
	}public WebElement UserName() {
		return driver.findElement(UserName);
		 
	}public WebElement LogOuticon() {
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
	
	
	
	
	
	public WebElement RfqNumb() {
		return driver.findElement(RfqNumb);
	}
	
	public WebElement InqNum() {
		return driver.findElement(InqNum);
	}
	public WebElement CustName() {
		return driver.findElement(CustName);
	}
	public WebElement CustDwg() {
		return driver.findElement(CustDwg);
	}
	public WebElement SalesPerson() {
		return driver.findElement(SalesPerson);
	}
	public WebElement CalcType() {
		return driver.findElement(CalcType);
	}
	public WebElement Priority() {
		return driver.findElement(Priority);
	}
	public WebElement Status() {
		return driver.findElement(Status );
	}
	public WebElement Created() {
		return driver.findElement(Created );
	}
	public WebElement DueDate() {
		return driver.findElement(DueDate );
	}
	public WebElement ClosedDate() {
		return driver.findElement(ClosedDate );
	}
	public WebElement Action() {
		return driver.findElement(Action );
	}
	
	//Action column ids
	
	public WebElement EditRfq() {
		return driver.findElement(EditRfq );
	}
	
	public WebElement ObsoluteBotton() {
		return driver.findElement(ObsoluteBotton);
	}
	
	public WebElement ObsoluteNo() {
		return driver.findElement(ObsoluteNo);
	}
	
	public WebElement ObsoluteYes() {
		return driver.findElement(ObsoluteYes);
	}
	
	public WebElement ObsoluteComment() {
		return driver.findElement(ObsoluteComment);
	}
	public WebElement DataSheet() {
		return driver.findElement(DataSheet);
	}
	
	
	
	
	
	
	
	
	
}
