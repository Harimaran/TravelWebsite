package pages;

import browserUtility.Browser;
import pageObjects.SignUpPageObjects;

public class SignUpPage {
	
	SignUpPageObjects signUp;
	
	public SignUpPage() {
		signUp = new SignUpPageObjects(Browser.driver);
	}

	
}
