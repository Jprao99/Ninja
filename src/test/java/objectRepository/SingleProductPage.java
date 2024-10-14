package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingleProductPage extends BasePage{

	public SingleProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addToCartButtonEl;
	
	@FindBy(xpath="//div[contains(@class,'alert-success')]")
	WebElement alertMessageContainerEl;
	
	@FindBy(xpath="//div[contains(@class,'alert-success')]//a[normalize-space()='shopping cart']")
	WebElement alertShoppingcartLinkEl; 
	
	public void clickAddToCartButton() {
		addToCartButtonEl.click();
	}
	
	public String getAlertMessage() {
		
	try {
			String message = alertMessageContainerEl.getText();
			return message;	
		}
	catch(Exception e) {
		   return e.getMessage();
		}
		
	}
	public void clickAlertShoppingCart() {
		alertShoppingcartLinkEl.click();
	}


}
