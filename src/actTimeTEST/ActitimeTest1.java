package actTimeTEST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actTimePF.ActitimeHomePage;
import actTimePOM.ActitimeLoginPage;

public class ActitimeTest1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Files\\Web-Driver\\Chrome2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		ActitimeLoginPage a = new ActitimeLoginPage(driver);
		a.setActitimeLoginPageUsername();
		a.setActitimeLoginPagePassword();
		a.verifyactitimeLoginPageLoginButton();
		
		
		ActitimeHomePage b = new ActitimeHomePage(driver);
		b.verifyActitimeLoginPageLogo();
		b.verifyActitimeLoginLogoutButton();
		Thread.sleep(2000);
		driver.quit();
		
	}
}