package actTimeTestPF;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actTimePF.ActTimeLoginPagePF;
import actTimePF.actTimeHomePagePF;



public class ActitimeTestPF {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Files\\Web-Driver\\Chrome2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ActTimeLoginPagePF a = new ActTimeLoginPagePF(driver);
		a.setActitimeLoginPageUsernamePF();
		a.setActitimeLoginPagePasswordPF();
		a.verifyactitimeLoginPageLoginButtonPF();
		
		actTimeHomePagePF b = new actTimeHomePagePF(driver);
		b.verifyActitimeLoginPageLogoPF();
		b.verifyActitimeLoginLogoutButtonPF();
		Thread.sleep(2000);
		driver.quit();
	}
}