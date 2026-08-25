package in.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class SnapDealPojo extends BaseClass {
	
	public SnapDealPojo() {		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id ="search-box-input")
	private WebElement searchtxt;
	
	
	
	public WebElement getSearchtxt() {
		return searchtxt;
	}

		
	
	
	

}
