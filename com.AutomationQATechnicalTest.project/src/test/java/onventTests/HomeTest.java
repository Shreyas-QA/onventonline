package onventTests;

import org.testng.annotations.Test;
import onventPages.HomePage;

public class HomeTest extends BaseTest{

	HomePage objhpage;
	
	
	@Test(priority = 1)
	public void navigate_to_homepage() {
		
		objhpage = new HomePage(driver);
		objhpage.clickOnJoinAsAParticipant();
	}
	
}
