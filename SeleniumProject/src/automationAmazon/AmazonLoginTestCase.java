package automationAmazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

class BaseSetup {

	public static WebDriver driver;
	@BeforeClass
	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\rajes\\Rajesh Kundu\\Selenium\\SeleniumDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public void closeBrowse() {
		driver.quit();
	}
}

public class AmazonLoginTestCase extends BaseSetup {

	AmazonLoginPage elements;

	@Test (priority=0)
	public void ivokeBrowser() {
		//super.invokeBrowser();
		elements = new AmazonLoginPage(driver);
	}

	@Test (priority=1)
	public void amazonLogin() {

		elements.clickSignIn();
		elements.clickLogin("rajesh.kundu06@gmail.com", "Rkundu@26");
	}
	
	@Test (priority=2)
	public void amazonLogout(){
		elements.clickLogout();
		
	}

}
