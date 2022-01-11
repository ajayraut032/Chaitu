package PracticePomTestact;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PracticePOMact.PomLoginPage;

public class PomTestPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Files\\Web-Driver\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PomLoginPage aj = new PomLoginPage(driver);
		
		aj.userid();
		Thread.sleep(2000);
		aj.pass();
		Thread.sleep(2000);
		aj.click();
		Thread.sleep(5000);
		
	}

}
