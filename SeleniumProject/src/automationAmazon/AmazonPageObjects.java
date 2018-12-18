package automationAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class AmazonLoginPage {

	public WebDriver driver;

	@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//a")
	WebElement yourAccount;
	@FindBy(xpath = "//a[@id='nav-link-yourAccount']")
	WebElement signInButton;
	@FindBy(id = "ap_email")
	WebElement useid;
	@FindBy(id = "ap_password")
	WebElement password;
	@FindBy(id = "continue")
	WebElement continuebtn;
	@FindBy(id = "signInSubmit")
	WebElement login;
	@FindBy(xpath = "//div[@id='nav-tools']/a//child::span[text()='Your Orders' and @class='nav-line-2']")
	WebElement hoverLogout;
	@FindBy(xpath="*//span[text()='Sign Out']") WebElement logout;

	AmazonLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickSignIn() {

		try {
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			action.moveToElement(signInButton).build().perform();
			yourAccount.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickLogin(String userid, String passwd) {

		try {
			useid.sendKeys(userid);
			continuebtn.click();
			password.sendKeys(passwd);
			login.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void clickLogout() {
		
		try {
			Thread.sleep(3000);
			Actions action=new Actions(driver);
			action.moveToElement(hoverLogout).build().perform();	
			Thread.sleep(3000);
			logout.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	

	}
}
