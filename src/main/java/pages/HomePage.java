package pages;

import wrappers.GenericWrappers;


public class HomePage extends GenericWrappers{
	

	
		public HomePage clickOnServiceTab() {
			clickByXpath("(//a[@data-toggle='dropdown'])[1]");
			return this;
		}
		
		public ShoppingPage clickOrderNewService() {
			clickByXpath("//a[contains(text(),'Order New Services')]");
			return new ShoppingPage();
			
		}
		
	
	
		

}
