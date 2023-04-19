package onventPages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;
	
	@FindBy(xpath = "//textarea[@id='newPost']")
	WebElement PostText;
	
	@FindBy(xpath= "//button[@class='add-new-post']")
	WebElement AddPost;
	
	@FindBy(xpath= "//div[@id='myaccount']")
	WebElement Myaccount;
	
	@FindBy(xpath= "//span[contains(text(), 'Log out')]")
	WebElement LogoutBtn;
	

	public DashboardPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	

	public void PostMessageOnLiveWall() {
		
		PostText.sendKeys("The current dateand time is "+LocalDateTime.now().getYear()+LocalDateTime.now().getMonth()+LocalDateTime.now().getDayOfMonth()+" "+
				LocalDateTime.now().getHour()+LocalDateTime.now().getMinute()+LocalDateTime.now().getSecond());
		AddPost.click();
		
	}
	
	public void logout() {
		
		Myaccount.click();
		LogoutBtn.click();
		
	}
	
	// Take screenshot method
	public void captureScreenshot() throws IOException {

		// Take the screenshot and store as file format
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Open the current date and time
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

		//Copy the screenshot on the desire location with different name using current date and time
		FileUtils.copyFile(scrFile, new File("/Users/shreyassambare/Downloads" + "First_"+timestamp));
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}
}
