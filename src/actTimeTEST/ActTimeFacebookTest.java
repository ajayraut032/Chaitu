package actTimeTEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actTimePOM.actTimeFacebookHomePage;
import actTimePOM.actTimeFacebookLoginPage;

public class ActTimeFacebookTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Z:\\\\Selenium Files\\\\Web-Driver\\\\Chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		actTimeFacebookLoginPage fb1 = new actTimeFacebookLoginPage(driver);
		fb1.setFacebookID();
		
		fb1.setFacebookPawword();
		
		fb1.ClickOnSUbmit();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		actTimeFacebookHomePage fb2 = new actTimeFacebookHomePage(driver) ;
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		fb2.ClickForOptions();
		Thread.sleep(2000);
		fb2.ClickForLOgOut();
		Thread.sleep(2000);
		
		fb1.closepage();
		
		
		
		

	}

}
