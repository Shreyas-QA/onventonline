package onventTests;

import org.testng.annotations.Test;
import onventPages.RegistrationPage;

public class RegistrationTest extends BaseTest{
	
	RegistrationPage objrpage;
	
	
	@Test(priority = 2)
	public void CompleteRegistrationForm() throws InterruptedException {
		
		objrpage = new RegistrationPage(driver);
		objrpage.EnterFirstName();
		objrpage.EnterLastName();
		objrpage.EnterEmail();
		objrpage.EnterPassword();
		objrpage.EnterCnfPassword();
		//objrpage.ImageUpload();
		objrpage.CheckTermsAndUse();
		objrpage.HitSubmitButton();;
		objrpage.FillOtp();
		objrpage.SelectCountry();
		objrpage.ClickPrivacyPolicy();
		objrpage.SubmitRegistration();
	
	}

}
