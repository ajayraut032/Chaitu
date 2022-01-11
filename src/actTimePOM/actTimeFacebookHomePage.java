package actTimePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class actTimeFacebookHomePage {
	//Declaration [Private Data Members] 
	private WebElement ClickOnOptions;
	private WebElement CLickOnLogOut;
	WebDriver driver;
	
	//Initialization [Constructor]
	public actTimeFacebookHomePage(WebDriver driver) {
		this.driver=driver;
		ClickOnOptions=driver.findElement(By.xpath("//div[@class='j83agx80 l9j0dhe7']"));
		CLickOnLogOut=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span"));
	
	}
	
	//div[@class='oajrlxb2 tdjehn4e qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 j83agx80 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso i1ao9s8h esuyzwwr f1sip0of lzcic4wl s45kfl79 emlxlaya bkmhp75w spb7xbtv l9j0dhe7 abiwlrkh p8dawk7l bp9cbjyn rt8b4zig n8ej3o3l agehan2d sk4xxmp2 taijpn5t qypqp5cg q676j6op']
	
	//Uses [Methods]

	public void ClickForOptions() {
		ClickOnOptions.click();
		System.out.println("Click For Options ");
		
	}
	
	public void ClickForLOgOut() {
		CLickOnLogOut.click();
		System.out.println("Click for Log Out");
	}
}
