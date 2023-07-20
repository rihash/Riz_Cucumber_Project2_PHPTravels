package pages;

import org.openqa.selenium.WebElement;
import wrappers.GenericWrappers;

public class ShoppingPage extends GenericWrappers{
	

	
	public ShoppingPage clickOnMobileTab() {
		clickByXpath("//a[contains(text(),'Mobile')]");
		return this;
		
	}
	
	public ShoppingPage chooseMobileApp() {
		clickByXpath("//a[@id='product1-order-button']");
		return this;
		
	}
	
	public ShoppingPage clickAddToCartContinue() {
		clickByXpath("//button[@class='btn btn-primary btn-lg']");
		return this;
	}
	
	
	public ShoppingPage validateIfAdded() {
		verifyTextContainsByXpath("//span[contains(text(),'Mobile Applications')]", "Mobile Applications");
		return this;
	}
	
	
	public ShoppingPage clickCheckout() {
		clickByXpath("//a[contains(text(),'Checkout')]");
		return this;
		
	}
	
	public InvoicePage clickCompleteOrder() throws InterruptedException {
		WebElement element = getElementByXpath("//button[@id='btnCompleteOrder']");
		scrollToElement(element);
		clickByXpath("//button[@id='btnCompleteOrder']");
		return new InvoicePage();
	}
	}
	


