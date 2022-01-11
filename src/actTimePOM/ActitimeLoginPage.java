package actTimePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLoginPage {
	
	// Declaration 
	private WebElement un ;
	private WebElement pwd ;
	private WebElement loginbutton ;
	WebDriver driver;
	
	// Initialization 
	public ActitimeLoginPage (WebDriver driver) {
		this.driver = driver;
		un = driver.findElement(By.id("username"));
		pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
		loginbutton = driver.findElement(By.id("loginButton"));
	}
	
	// usage
	public void setActitimeLoginPageUsername() {
		un.sendKeys("admin");
	}
	public void setActitimeLoginPagePassword() {
		pwd.sendKeys("manager");
	}
	public void verifyactitimeLoginPageLoginButton() {
		loginbutton.click();
	}
	
}