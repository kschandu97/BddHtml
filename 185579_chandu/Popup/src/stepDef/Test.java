package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

	@Given("^A button saying \"([^\"]*)\"$")
	public void a_button_saying(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("A button is there saying "+arg1);
	}

	@When("^User clicks on the button$")
	public void user_clicks_on_the_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Clicking on that button");
	}

	@Then("^The new window should open having \"([^\"]*)\"$")
	public void the_new_window_should_open_having(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("New window pops up having "+arg1);
	}

}
