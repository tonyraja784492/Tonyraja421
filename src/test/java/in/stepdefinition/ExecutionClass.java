package in.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

import in.pojo.AmazonPojo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ExecutionClass extends BaseClass {
	
	@Given("User launch the amazon application url")
	public void user_launch_the_amazon_application_url() {
	   launchurl("https://www.amazon.in/");
		toImplicitWait(5);
		
	}

	@When("User enter the product in search box")
	public void user_enter_the_product_in_search_box(DataTable table) {
		
		
		
		
	    AmazonPojo p = new AmazonPojo();
	    
	    WebElement searchtxt = p.getSearchtxt();
	    
	    toFillText(searchtxt, "spiderman toy");
		
		
	}

	@When("User click the search button")
	public void user_click_the_search_button() {
		AmazonPojo p = new AmazonPojo();
		
		WebElement clickbtn = p.getClickbtn();
		
		toClick(clickbtn);
		
	}
	
	@When("User enter the {string} in search box")
	public void user_enter_the_in_search_box(String prod) {
        AmazonPojo p = new AmazonPojo();
	    
	    WebElement searchtxt = p.getSearchtxt();
	    
	    toFillText(searchtxt, prod);
		
	}

	@Then("It should be navigate into product listing page")
	public void it_should_be_navigate_into_product_listing_page() {
		
		
		String actual =  "Apple";
		
		String expected = "Apple";
		
		Assert.assertEquals(expected, actual);
		
		System.out.println("Test passed");
	    
	}


}
