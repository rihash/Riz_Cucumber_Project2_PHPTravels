package pages;

import wrappers.GenericWrappers;



public class InvoicePage extends GenericWrappers{
	
	

	
	public InvoicePage getInvoiceNumber() {
		String invoice = getTextByXpath("//h3[contains(text(),'Invoice')]");
		System.out.println("The invoice number is : " + invoice);
		return this;
	}

}
