package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.LoginPage;
import wrappers.GenericWrappers;

public class LoginPageSteps extends GenericWrappers {
	
	// Creating object
	LoginPage login = new LoginPage();
	
	@And("Enter username")
	public void enter_username() {
		login.enterUserName();

	}

	@And("Enter password")
	public void enter_password() {
		login.enterPassword();

	}

	@When("Click capcha")
	public void click_capcha() throws InterruptedException {
		login.clickNotRobot();

	}

	@When("Click login")
	public void click_login() throws InterruptedException {
		login.clickLogin();

	}
	

}
