package objectRepository;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
	
	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='content']/div")
	List <WebElement> productContainerElements;
	
	@FindBy(xpath="//div[contains(@class,'product-layout')]//a")
	WebElement productLink;
	
	
	public void clickProductLink() {
		productLink.click();
	}
	
	public void validateDisplayProducts() {
		
		if(productContainerElements.size()>1) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	
	

}
