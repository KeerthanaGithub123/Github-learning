package stepDefinitions;

import com.Factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class google {
	
	@When("User enters the designated URL in the browser")
	public void user_enters_the_designated_url_in_the_browser() {
		DriverFactory.getDriver().get("https://www.google.com");
		DriverFactory.getDriver().manage().window().maximize();
	}

	@Then("the google has to opened in the driver")
	public void the_google_has_to_opened_in_the_driver() {
		
		System.out.println("Google URL is launched");
	}
}
