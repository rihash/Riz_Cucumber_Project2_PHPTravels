package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.InvoicePage;
import wrappers.GenericWrappers;

public class InvoicePageSteps extends GenericWrappers{
	
	InvoicePage invoice = new InvoicePage();
	
	@And("Get invoice number and print")
	public void get_invoice_number_and_print() {
		invoice.getInvoiceNumber();

	}

	@Then("Close browser")
	public void close_browser() {
		driver.close();

	}


}
