package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {

	public WishListPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//button[@class='btn btn-primary']//i[@class='fa fa-shopping-cart']")
	WebElement addToCartIconEl;
	
	public void clickAddToCart() {
		addToCartIconEl.click();
	}

}
