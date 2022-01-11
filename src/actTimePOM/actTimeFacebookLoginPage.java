package actTimePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
						//All Operation based on the POM and Pom is Run On Encapulation Concept below be like that 
public class actTimeFacebookLoginPage {				
	//Declaration  (WebElements) 	
	private WebElement Fb_id;
	private WebElement Fb_password;
	private WebElement Fb_click;
	WebDriver driver;
	
	//Initilization 
	public actTimeFacebookLoginPage(WebDriver driver) {							//COnstructor 
		this.driver=driver;
		Fb_id=driver.findElement(By.xpath("//input[@id='email'] "));
		Fb_password=driver.findElement(By.xpath("//input[@name='pass'] "));
		Fb_click=driver.findElement(By.xpath("//button[@name='login'] "));
		
		
	}
	
	//uses (Methods)

	public void setFacebookID() {
		Fb_id.sendKeys("AjayRaut032@gmail.com");
		System.out.println("ID Done");
		
	}
	public void setFacebookPawword() {
		Fb_password.sendKeys("Ajay@1998");
		System.out.println("Password Done");
	}
	public void ClickOnSUbmit() {
		Fb_click.click();
		System.out.println("Click on Submit Done");
	}
	public void closepage() {
		System.out.println("Browser Closed");
		driver.close();
		
	}
}
