package onventTests;

import java.io.IOException;
import java.time.LocalDateTime;

import org.testng.annotations.Test;

import onventPages.DashboardPage;

public class DashboardTest extends BaseTest {

	DashboardPage dpageobj;
	
	@Test(priority = 3)
	public void TakeScreenshot() throws Exception {

		dpageobj = new DashboardPage(driver);
		//dpageobj.captureScreenshot();
		DashboardPage.takeSnapShot(driver, "/Users/shreyassambare/Downloads/First_"+ LocalDateTime.now().getHour()+LocalDateTime.now().getMinute()+LocalDateTime.now().getSecond()+".png");

	}
	@Test(priority = 4)
	public void AddPostonLiveWall() {
		dpageobj = new DashboardPage(driver);
		dpageobj.PostMessageOnLiveWall();
	}

	@Test(priority = 5)
	public void LogoutDashboard() {
		dpageobj = new DashboardPage(driver);
		dpageobj.logout();
	}
}
