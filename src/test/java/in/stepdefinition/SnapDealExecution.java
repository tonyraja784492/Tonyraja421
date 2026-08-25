package in.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

import in.pojo.SnapDealPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SnapDealExecution extends BaseClass {

	@Given("User launch the snapdeal application url")
	public void user_launch_the_snapdeal_application_url() {
	    launchurl("https://www.snapdeal.com/");
		toImplicitWait(5);
	}

	@When("User enter the product in search box in snapdeal")
	public void user_enter_the_product_in_search_box_in_snapdeal() {
	    
		SnapDealPojo sn = new SnapDealPojo();
		
		WebElement searchtxt = sn.getSearchtxt();
		
		toFillText(searchtxt, "kids toy");
	}

	@When("User click the search button in snapdeal")
	public void user_click_the_search_button_in_snapdeal() throws AWTException {
	    
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

	@Then("It should be navigate into product listing page in snapdeal")
	public void it_should_be_navigate_into_product_listing_page_in_snapdeal() {
	    
		System.out.println("kids toy entered");
	}
}
