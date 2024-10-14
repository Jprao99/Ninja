package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver){
		
		super(driver);
		//PageFactory.initElements(driver, this);
	}
	
	
	
	//Locators
	
	@FindBy (xpath="//input[@id='input-email']")
	WebElement email_input_el;
	@FindBy (xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement error_msg_el;
	@FindBy (xpath="//input[@id='input-password']")
	WebElement password_input_el;
	@FindBy (xpath="//input[@id='input-password']/following::input[@type='submit']")
	WebElement login_button_el;
	
	
	//Methods 
	public void setEmail(String email) {
		email_input_el.sendKeys(email);
	}

	public void setPassword(String password) {
		password_input_el.sendKeys(password);
	}
	
	public void clickLoginButton () {
		login_button_el.click();
	}
	
	public String getErrorMsg() {
		
		try {
		return error_msg_el.getText();
		}
		catch(Exception e) {
			return e.getStackTrace().toString();
		}
	}
}
