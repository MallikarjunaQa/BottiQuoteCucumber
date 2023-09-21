package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



public class LoginPage  {

	public WebDriver driver;

	public LoginPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}

	By logincontentbluebox = By.xpath("//div[@class='box unimicron-bg']");
	By BottiQuoteboldtextlatter = By.xpath("//strong[normalize-space()='BOTTIE QUOTE']");
	By InputName_or_Emial = By.xpath("//input[@id='inputEmail']");
	By InputPassword = By.xpath("//input[@id='inputPassword']");
	By InputLanguuge = By.xpath("//select[@id='inputLanguage']");
	By UnimicronLogo = By.xpath("//img[@src='image/logo.png']");
	By SignInButton = By.xpath("//button[normalize-space()='Sign In']");

	// Action method

	public WebElement LogincontentBluebox() {
		return driver.findElement(logincontentbluebox);
		 
	}

	public WebElement GetBottiQuoteInBoldlatters() {
		return driver.findElement(BottiQuoteboldtextlatter);
	}

	public void EnterBaseUrl(String baseurl) {
		driver.get(baseurl);
	}

	public String GetLoginPageTitle() {
		String loginactualTitle = driver.getTitle();
		return loginactualTitle;
	}

	public void MyUsername(String Username) {
		driver.findElement(InputName_or_Emial).sendKeys(Username);
	}

	public void MyPassword(String password) {
		driver.findElement(InputPassword).sendKeys(password);
	}

	public By LogoVrify() {
		driver.findElement(UnimicronLogo);
		return UnimicronLogo;
	}

	public void SignIn() {
		driver.findElement(SignInButton).click();
	}


	public String VarifyDisplayWord(String path) {
		
		WebElement element = driver.findElement(By.id(path));
		
		if (element != null) {
	        System.out.println("Element found with text: " + element.getText());
	        return element.getAttribute("placeholder");
	    } else  {
	    	System.out.println("Element not found.");
	    	return null;
	    }
		
		
	}
}
