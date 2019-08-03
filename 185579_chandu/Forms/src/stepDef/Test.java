package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

	@Given("^A user filling a form$")
	public void a_user_filling_a_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Filling the fields");
	}

	@When("^user clicks on Submit$")
	public void user_clicks_on_Submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Clicking on submit");
	}

	@When("^user clicks on Reset$")
	public void user_clicks_on_Reset() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Clicking on reset");
	}

	@Then("^Details should be seen on URL$")
	public void details_should_be_seen_on_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Details appear on the URL");
	}

	@Then("^Fields will be reset to blank$")
	public void fields_will_be_reset_to_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("All fields become blank");
	}
}
