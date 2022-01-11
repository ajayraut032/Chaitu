package actTimePF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeHomePage {
	// Declaration 
	private WebElement logo ;
	private WebElement logoutButton ;
	WebDriver driver;

	// Initialization 
	public ActitimeHomePage (WebDriver driver) {
		this.driver = driver;
		logo = driver.findElement(By.xpath("//img[@height='61']"));
		logoutButton = driver.findElement(By.xpath("//a[@id='logoutLink']"));
	}

	// usage
	public void verifyActitimeLoginPageLogo() {
		boolean res = logo.isDisplayed();
		if (res == true) {
			System.out.println("Test Scenario Passed and Logo is Displayed");
		}
		else {
			System.out.println("Test Scenario Failed and Logo is Not Displayed");
		}
	}
	public void verifyActitimeLoginLogoutButton() {
		logoutButton.click();
	}
}