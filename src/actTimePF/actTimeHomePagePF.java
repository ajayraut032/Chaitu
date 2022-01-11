package actTimePF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actTimeHomePagePF {
	
	// Declaration + Initialization 
	@FindBy(xpath = "//img[@height='61']")
	private WebElement logo ;
	
	@FindBy(xpath = "//a[@id='logoutLink']")
	private WebElement logoutButton ;
	WebDriver driver;

	// Initialization 
	public actTimeHomePagePF (WebDriver driver) {
		PageFactory.initElements(driver, this);			
	}

	// usage
	public void verifyActitimeLoginPageLogoPF() {
		boolean res = logo.isDisplayed();
		if (res == true) {
			System.out.println("Test Scenario Passed and Logo is Displayed");
		}
		else {
			System.out.println("Test Scenario Failed and Logo is Not Displayed");
		}
	}
	public void verifyActitimeLoginLogoutButtonPF() {
		logoutButton.click();
	}
}