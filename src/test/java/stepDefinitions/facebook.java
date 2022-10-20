package stepDefinitions;

import com.Factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class facebook {

	@When("User enters the facebook URL in the browser")
	public void user_enters_the_facebook_url_in_the_browser() {
		System.out.println("google launch started");
		DriverFactory.getDriver().get("https://www.facebook.com");
		DriverFactory.getDriver().manage().window().maximize();
	}

	@Then("the facebook has to opened in the driver")
	public void the_facebook_has_to_opened_in_the_driver() {
	    System.out.println("Facebook URL is launched");
	}
}
