package objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {
	
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="(//div[@id='content']//td/a)[2]")
	WebElement productEl;
	
	@FindBy(xpath="//table[@class='table table-striped']/tbody/tr")
	List <WebElement> productsLoc;
	public String getProductName() {
			return productEl.getText();
	}
	
	public int getProductsFromCart() {
		
		return productsLoc.size();
	}
		
	
	
	
}
