package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ShoppingPage;
import wrappers.GenericWrappers;

public class ShoppingPageSteps extends GenericWrappers {

	ShoppingPage shopping = new ShoppingPage();

	@And("Click mobile category")
	public void click_mobile_category() {
		shopping.clickOnMobileTab();

	}

	@And("Select mobile application")
	public void select_mobile_application() {
		shopping.chooseMobileApp();

	}

	@Then("Add to cart and continue")
	public void add_to_cart_and_continue() {
		shopping.clickAddToCartContinue();

	}

	@And("Validate product is added")
	public void validate_product_is_added() {
		shopping.validateIfAdded();

	}

	@Then("Click checkout")
	public void click_checkout() {
		shopping.clickCheckout();

	}

	@And("Click complete order")
	public void click_complete_order() throws InterruptedException {
		shopping.clickCompleteOrder();

	}

}
