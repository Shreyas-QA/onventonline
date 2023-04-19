package onventPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='menu-wrapper ']/div[@class='menu-links']/a[@class='participant']/span[contains(text(),'Join as participant')]")
	WebElement JoinAsAParticipant;
	

	public HomePage(WebDriver driver) {
		
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	}

	public void clickOnJoinAsAParticipant() {
		
		JoinAsAParticipant.click();
		
		}
}

