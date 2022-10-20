package stepDefinitions;

import com.Factory.DriverFactory;
import com.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_StepDef {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	@Given("User enters the website through URL")
	public void user_enters_the_website_through_url() {
		DriverFactory.getDriver().get("https://rahulshettyacademy.com/client");
}
	

	@Then("User gets the title of the page {string}")
	public void user_gets_the_title_of_the_page(String string) {
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
		
	}
	
	//Login
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://rahulshettyacademy.com/client");
	    System.out.println("Login started");
	}

	@When("user enters email {string}")
	public void user_enters_email(String Email) {
		loginPage.enterEmail(Email);
	   
	}

	@When("user enters password {string}")
	public void user_enters_password(String pwd) {
	  loginPage.enterPassword(pwd);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    loginPage.clickOnLogin();
	}



}
