package pages;
import wrappers.GenericWrappers;


public class LoginPage extends GenericWrappers{
	

	public LoginPage enterUserName() {
		enterByXpath("//input[@name='username']", UN);
		return this;
		
		
	}
	
	public LoginPage enterPassword() {
		enterByXpath("//input[@name='password']", PW);
		return this;
		
	}
	
	public LoginPage clickNotRobot() throws InterruptedException {
		clickByXpath("//div[@class='g-recaptcha']");
		Thread.sleep(10000);
		return this;
		
	}
	
	public HomePage clickLogin() throws InterruptedException {
		Thread.sleep(8000);
		clickByXpath("//button[contains(text(),'Login')]");
		return new HomePage();
	}
	
	
	
}
