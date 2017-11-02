import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class StepDef {

	@When("^I sign in$")
	public void i_sign_in() throws Throwable {
		System.out.println("Hello World");
	}

	@And("^I click \"(.*?)\"(?: for \"(.*?)\")?$")
	public void test(String args1, String args2) {
		System.out.println("Option step Start");
		System.out.println(args1);
		System.out.println(args2);
		System.out.println("Optional step End");
	}

	// @And("^I click \"(.*?)\"")
	// public void clickOnButton(String args1, String args2) {
	// System.out.println("Exact step Start");
	// System.out.println(args1);
	// System.out.println(args2);
	// System.out.println("Exact step End");
	// }
}
