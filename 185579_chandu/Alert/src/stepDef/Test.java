package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

	@Given("^A button saying \"([^\"]*)\"$")
	public void a_button_saying(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Page with a button "+arg1+" and a field");
	}

	@When("^User click on that button$")
	public void user_click_on_that_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("When click on the button");
	}

	@Then("^Alert box will appear saying \"([^\"]*)\"$")
	public void alert_box_will_appear_saying(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Alert box appears saying "+arg1);
	}

}
