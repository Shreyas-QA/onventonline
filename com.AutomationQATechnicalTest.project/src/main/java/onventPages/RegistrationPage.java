package onventPages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;

	@FindBy(name = "first")
	WebElement FirstName;

	@FindBy(name = "last")
	WebElement LastName;

	@FindBy(name = "email")
	WebElement EmailId;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "passwordConfirmation")
	WebElement CnfPassword;

	@FindBy(className = "upload-image")
	WebElement uploadImage;

	@FindBy(xpath = "//span/input[@class='jss8']")
	WebElement checkTerms;

	@FindBy(xpath = "//button[@class='register-button']")
	WebElement SignInButton;

	@FindBy(id = "mui-component-select-country")
	WebElement clickCountryButton;

	@FindBy(xpath = "//input[@class='jss16']")
	WebElement CheckPrivacyPolicy;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submit;

	@FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li")
	public List<WebElement> GetCountryName;

	public RegistrationPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void EnterFirstName() {

		FirstName.sendKeys("shreyas");

	}

	public void EnterLastName() {

		LastName.sendKeys("sambare");

	}

	public void EnterEmail() {

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		EmailId.sendKeys("testbot-swd-" + randomInt + "6677" + "@onvent.online");

	}

	public void EnterPassword() {

		Password.sendKeys("Selenium22#");

	}

	public void EnterCnfPassword() {

		CnfPassword.sendKeys("Selenium22#");
	}

	public void ImageUpload() throws InterruptedException {

		WebElement ele = driver.findElement(By.xpath("//input[@id='file']"));
		ele.sendKeys("/Users/shreyassambare/Downloads/man1.png");

	}

	public void CheckTermsAndUse() throws InterruptedException {

		checkTerms.click();
	}

	public void HitSubmitButton() {

		SignInButton.click();
	}

	public void SelectCountry() {

		clickCountryButton.click();
		try {

			for (WebElement sel : GetCountryName) {

				if (sel.getText().contains("Ukraine")) {

					sel.click();

				}
			}
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {

			for (WebElement sel : GetCountryName) {

				if (sel.getText().contains("Ukraine")) {

					sel.click();
				}
			}
		}
	}

	public void ClickPrivacyPolicy() {
		
		CheckPrivacyPolicy.click();
	}

	public void SubmitRegistration() {

		Submit.click();
	}

	public void FillOtp() {

		List<WebElement> inputs = driver.findElements(By.xpath("//div[@class='code-input']/input"));
		for (WebElement option : inputs) {

			option.sendKeys("2");
		}

	}

}
