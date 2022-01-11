package actTimePF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActTimeLoginPagePF {
	//Declaration + Initialization
	@FindBy(id="username")
	private WebElement uid; 

	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pass;

	@FindBy(id="loginButton")
	private WebElement loginbutton;

	WebDriver driver;

	// Initialization  			[ Constructor ]
	public ActTimeLoginPagePF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//Uses (  Methods )

	public void setActitimeLoginPageUsernamePF() {
		uid.sendKeys("admin");
	}
	public void setActitimeLoginPagePasswordPF() {
		pass.sendKeys("manager");
	}
	public void verifyactitimeLoginPageLoginButtonPF() {
		loginbutton.click();
	}
}

