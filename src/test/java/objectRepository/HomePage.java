package objectRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	//Locators
	
	@FindBy (xpath="//span[@class='hidden-xs hidden-sm hidden-md' and normalize-space()='My Account']")
	WebElement myAccountNavLink;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li[normalize-space()='Login']")
	WebElement loginNavLink;
	
	@FindBy(xpath="//div[@id='search']/input[@name='search']")
	WebElement searchInputBox;
	
	@FindBy(xpath="//div[@id='search']/span/button")
	WebElement searchButton;
	
	@FindBy(xpath="//div[@id='common-home']/div[@class='alert alert-success alert-dismissible']")
	WebElement errorDivElement;
	
	@FindBy(xpath="//button[@type='button']/i[@class='fa fa-heart']")
	WebElement wishListIconElement;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']/li[normalize-space()='Software']")
	WebElement softwareNav;
	
	@FindBy(xpath="//a[@id='wishlist-total']")
	WebElement wishListMenuLinkEl;
	
	@FindBy(xpath="//li/a[normalize-space()='Shopping Cart']")
	WebElement shoppingCartMenuLinkEl;
	
	@FindBy(xpath="//li/a[normalize-space()='Logout']")
	WebElement logoutEl;
	
	@FindBy(xpath="//li/a[normalize-space()='Login']")
	WebElement loginEl;
	
	//Methods
	
	public void clickMyAccountNavLink() {
		myAccountNavLink.click();
	}
	
	public void clickLoginNavLink() {
		loginNavLink.click();
	}
	
	public void setSearchInputBox(String pname) {
		searchInputBox.sendKeys(pname);
	}
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public void clickWishListButton() {
		wishListIconElement.click();
	}
	
    public String getSuccessMessage() {
    	String value = errorDivElement.getText();
    	return value;
    		
    	
    }
    
    public void clickLogoutBtn() {
    	logoutEl.click();
    }
    
    public void clickLoginBtn() {
    	loginEl.click();
    }
    
    public void clickWishListMenuLink() {
    	wishListMenuLinkEl.click();
    }
    
    public void clickShoppingCartMenuLink() {
    	shoppingCartMenuLinkEl.click();
    }
    
    public void clickSoftwareNav() throws InterruptedException {
    	Actions act = new Actions(driver);
    	String parentId = driver.getWindowHandle();
    	System.out.println(parentId);
    	act.keyDown(Keys.CONTROL).click(softwareNav).keyUp(Keys.CONTROL).perform();
    	Set<String> wh = driver.getWindowHandles();
    	List<String> whl = new ArrayList<String>(wh);
    	String childId = whl.get(1);
    	driver.switchTo().window(childId);
    	
    	Thread.sleep(3000);
    	System.out.println(childId);
    	
    	driver.close();
    	Thread.sleep(3000);
    	
    	
    	

    	
    }
}
