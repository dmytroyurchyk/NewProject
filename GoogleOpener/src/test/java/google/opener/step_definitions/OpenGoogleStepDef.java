package google.opener.step_definitions;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import google.opener.pages.GoogleHomePage;
import google.opener.utilities.BrowserUtils;
import google.opener.utilities.Driver;

public class OpenGoogleStepDef {
	
	GoogleHomePage homePage = new GoogleHomePage();
	
	@When("^I want to open Google Chrome$")
	public void I_want_to_open_Google_Chrome() {
		// it should already open the browser
	}

	@And("^google for a \"([^\"]*)\" for example$")
	public void google_for_a_for_example(String word) {
		homePage.searchBar.sendKeys(word + Keys.ENTER);
		BrowserUtils.waitFor(3);
	}
	
	@Then("^I want to close browser$")
	public void I_want_to_close_browser() {
		Driver.closeDriver();
	}

}
