package in.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class AmazonPojo extends BaseClass {
	
	public AmazonPojo() {		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id ="twotabsearchtextbox")
	private WebElement searchtxt;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement clickbtn;
	
	@FindBy(xpath = "(//span[contains(text(),'iPhone Air 256 GB')])[1]")
	private WebElement productClk;
	
    @FindBy(xpath = "//span[text()=' Regular Price ']")
	private WebElement buyClk;
	
    @FindBy(id = "buy-now-button")
    private WebElement buyNowbtn;
    
	
	public WebElement getSearchtxt() {
		return searchtxt;
	}

	public WebElement getProductClk() {
		return productClk;
	}

	public WebElement getClickbtn() {
		return clickbtn;
	}

	public WebElement getBuyNowbtn() {
		return buyNowbtn;
	}

	public WebElement getBuyClk() {
		return buyClk;
	}
	
	
	
	

}
