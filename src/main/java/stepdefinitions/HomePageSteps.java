package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import wrappers.GenericWrappers;

public class HomePageSteps extends GenericWrappers{
	
	HomePage homepage = new HomePage();
	
	@Then("Click servicetab")
	public void click_servicetab() {
		homepage.clickOnServiceTab();

	}

	@And("Click order new service")
	public void click_order_new_service() {
		homepage.clickOrderNewService();

	}

}
