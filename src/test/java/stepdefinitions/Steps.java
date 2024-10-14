package stepdefinitions;
import java.awt.AWTException;

import org.junit.Assert;

import com.ninja.Utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.MyAccountPage;
import objectRepository.ProductsPage;
import objectRepository.ShoppingCartPage;
import objectRepository.SingleProductPage;
import objectRepository.WishListPage;

public class Steps extends BaseClass {
	
	
	public LoginPage lp = new LoginPage(driver);
	public HomePage hp = new HomePage(driver);
	public MyAccountPage accountPage= new MyAccountPage(driver);
	public ProductsPage productsPage= new ProductsPage(driver);
	public SingleProductPage singleProductPage= new SingleProductPage(driver);
	public ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
	public WishListPage wishListPage = new WishListPage(driver);
	public String homePageUrl ="https://tutorialsninja.com/demo/index.php?route=common/home";
	
	

	//	WebDriver driver = new ChromeDriver();
	@Given("user has navigate to the login page")
	public void user_has_navigate_to_the_login_page() {
		
		hp.clickMyAccountNavLink();
		hp.clickLoginNavLink();
	}
	@When("^user enters the email and password \"(.+)\" \"(.+)\"$")
	public void user_enters_the_email_and_password(String email, String password) {
		
		
		lp.setEmail(email);
		lp.setPassword(password);
	
	
	}
	@When("user clicks on login button")
	public void user_click_on_login_button() {
		
		lp.clickLoginButton();
	  
	}
	
	@When("user navigates to home page")
	public void user_navigates_to_home_page() {
		
		accountPage.clickHomeLogoLink();
		
	}
	@Then("user should see my account page")
	public void user_should_see_my_account_page() {
		String currentUrl = driver.getCurrentUrl();
		String ActUrl="https://tutorialsninja.com/demo/index.php?route=account/account";
		if(currentUrl.equals(ActUrl))
		Assert.assertTrue(true);
		else
		Assert.fail("Failed");

	}
	
	@When ("^user enters the valid email and invalid password \"(.+)\" \"(.+)\"$")
	public void user_enters_the_valid_email_and_invalid_password(String email,String password) {
	
		lp.setEmail(email);
		lp.setPassword(password);
	}
	
	@When("^user enters the invalid email and valid password \"(.+)\" \"(.+)\"$")
	public void user_enters_the_invalid_email_and_valid_password(String email, String password) {
		
		lp.setEmail(email);
		lp.setPassword(password);
	}
	
	@When("^user enters the invalid email and invalid password \"(.+)\" \"(.+)\"$")
	public void user_enters_the_invalid_email_and_invalid_password(String email, String password) {
		
		lp.setEmail(email);
		lp.setPassword(password);
	}

	@Then("^user should able to see error message$")
	public void user_should_able_to_see_error_message() {
		
		String actRes = lp.getErrorMsg();
		Assert.assertEquals("Warning: No match for E-Mail Address and/or Password.",actRes);
	}
	
	
	@When("^user enters the product name \"(.+)\" in the search box$")
	public void user_enters_the_product_name_in_the_search_box(String pname) {
		
		hp.setSearchInputBox(pname);
	}
	
	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
		
		hp.clickSearchButton();
	}
	@Then("user should able to see the product in the result")
	public void user_should_able_to_see_the_product_in_the_result() {
		
	    productsPage.validateDisplayProducts();
		
	}
	

	@When("user add items to wishlist")
	public void user_add_items_to_wishlist() {
		
		hp.clickWishListButton();
	   
	}
	@Then("user should see success message")
	public void user_should_see_success_message() {
		String value = hp.getSuccessMessage();
		if(value.contains("Success")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	    
	}
	

	@When("user clicks on software navigation option")
	public void user_clicks_on_software_navigation_option() throws InterruptedException, AWTException {
		hp.clickSoftwareNav();
	    
	}

	@When("^user enter product (.+) into the search text box$")
	public void user_enter_product_i_mac_into_the_search_text_box(String productName) {
	   
		hp.setSearchInputBox(productName);
	}
	@When("user click on the button having search icon")
	public void user_click_on_the_button_having_search_icon() {
	   hp.clickSearchButton();
	}
	@When("user click on the product displayed in the search result")
	public void user_click_on_the_product_displayed_in_the_search_result() {
	    productsPage.clickProductLink();
	}
	@When("user click on the Add to cart button")
	public void user_click_on_the_add_to_cart_button() {
	   singleProductPage.clickAddToCartButton();
	}
	@Then("user should see a success message")
	public void user_should_see_a_success_message() {
	    String message  = singleProductPage.getAlertMessage();
	    if(message.contains("Success")) {
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }
	}
	@Then("user click on the shopping cart link in the message")
	public void user_click_on_the_shopping_cart_link_in_the_message() {
		singleProductPage.clickAlertShoppingCart();
	}
	@Then("^user should see product (.+) in the shopping cart page$")
	public void user_should_see_product_in_the_shopping_cart_page(String name) {
		
		String actualName = shoppingCartPage.getProductName();
		
	    if(actualName.equals(name)) {
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);   
	    }

	}
	
	@When("user navigates to wishlist page by clicking wishlist menu link")
	public void user_navigates_to_wishlist_page_by_clicking_wishlist_menu_link() {
	   hp.clickWishListMenuLink();
	}
	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() throws InterruptedException {
		
		wishListPage.clickAddToCart();
		Thread.sleep(4000);
	}
	

	@When("user navigates to shopping cart page by clicking shopping cart menu link")
	public void user_navigates_to_shopping_cart_page_by_clicking_shopping_cart_menu_link() {
	    hp.clickShoppingCartMenuLink();
	}
	@Then("user should able to see the product in the page")
	public void user_should_able_to_see_the_product_in_the_page() {
		
		int count = shoppingCartPage.getProductsFromCart();
		if(count >0) {
			Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);   
	    }
		
	    
	}

	@When("user clicks on My accounts menu link and clicks on logout option")
	public void user_clicks_on_my_accounts_menu_link_and_clicks_on_logout_option() {
	    hp.clickMyAccountNavLink();
	    hp.clickLogoutBtn();
	}
	

	@Then("user should see login option in my accounts menu")
	public void user_should_see_login_option_in_my_accounts_menu() {
		hp.clickMyAccountNavLink();
		boolean result = accountPage.displayLoginLink();
		if(result) {
			Assert.assertTrue(true);
	    }else {
	    	Assert.assertTrue(false);
	    }
	}
	@When("user clicks on Continue option")
	public void user_clicks_on_continue_option() {
		accountPage.clickContinueBtn();
	}
	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
		String currentUrl = driver.getCurrentUrl();
	    if(currentUrl.equalsIgnoreCase(homePageUrl)) {
	    	Assert.assertTrue(true);
	    }else {
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on logout link in the myAccounts Page")
	public void user_clicks_on_logout_link_in_the_my_accounts_page() {
	   accountPage.clickLogoutLink();
	}















	
}
