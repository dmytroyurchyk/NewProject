package google.opener.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import google.opener.utilities.Driver;

public class GoogleHomePage {
	
	private WebDriver driver;

	public GoogleHomePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "lst-ib")
	public WebElement searchBar;
	
	

}
