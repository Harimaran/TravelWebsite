package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageObjects {
	
	WebDriver driver;

	public SignUpPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "inputFirstName")
	public WebElement FirstName;
	
	@FindBy(id = "inputLastName")
	public WebElement LastName;
	
	@FindBy(id = "inputEmail")
	public WebElement Email;
	
	@FindBy(id = "inputPhone")
	public WebElement Phone;

}

