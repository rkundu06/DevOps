package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumBasicPractice {

	 WebDriver driver;

	public void invokeBrowser(String url) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\rajes\\Rajesh Kundu\\Selenium\\SeleniumDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void mouseHoverExample(){
		try {
			WebElement element= driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[2]"));
			Actions action= new Actions(driver);
			action.moveToElement(element).build().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a[@class='nav-action-button']/span[@class='nav-action-inner']")).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void closeBrowser() {
		driver.close();
	}

	public static void main(String[] args) {

		try {
			seleniumBasicPractice obj = new seleniumBasicPractice();
			obj.invokeBrowser("https://www.amazon.in");
			obj.mouseHoverExample();
			//obj.closeBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
