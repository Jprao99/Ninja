package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='logo']/h1/a")
	WebElement homeLogoLink;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement continueEl;
	
	@FindBy(xpath="//li/a[normalize-space()='Login']")
	WebElement loginEl;
	
	@FindBy(xpath="//div/a[normalize-space()='Logout']")
	WebElement logoutLink;
	
	
	public void clickHomeLogoLink() {
		homeLogoLink.click();
	}
	
	public boolean displayLoginLink() {
		return loginEl.isDisplayed();
	}

	public void clickContinueBtn() {
		continueEl.click();
	}
	
	public void clickLogoutLink() {
		logoutLink.click();
	}
}
