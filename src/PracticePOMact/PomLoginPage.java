package PracticePOMact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PomLoginPage {
	//Methodology : encapsulation

	// Initialization
	private WebElement id;
	private WebElement pass;
	private WebElement click;

	WebDriver driver;

	//DEclaration
	public PomLoginPage( WebDriver driver) {
		this.driver=driver;
		id=driver.findElement(By.xpath("//input[@id='username']"));
		pass=driver.findElement(By.xpath("//input[@name='pwd']"));
		click=driver.findElement(By.xpath("//a[@class='initial']"));



	}

	//Uses Method
	public void userid() {
		boolean status = id.isEnabled();
		if(status==true) {
			id.sendKeys("admin");	
			System.out.println("The UserID IS Enabled");
		}
		else {
			System.out.println("The UserID Not Enabled");
		}
	}
	public void pass() {
		boolean status = pass.isEnabled();
		if(status==true) {
			id.sendKeys("manager");	
			System.out.println("The Password IS Enabled");
		}
		else {
			System.out.println("The Password Not Enabled");
		}
	}
	public void click() {
		click.click();
	}
}
