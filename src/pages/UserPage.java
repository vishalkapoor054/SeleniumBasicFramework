package pages;

import org.openqa.selenium.WebDriver;

import core.ActionDriver;
import or.LoginPageElements;
import or.UserPageElements;

public class UserPage extends ActionDriver{

	public UserPage(WebDriver driver) throws Exception {
		super(driver);
		if(!isElementDisplayed(UserPageElements.subjects)){
			throw new Exception("User is not on LoginPage and is on "+getTitle());
		}
	}
	
	public boolean verifySubjectPresent(){
		return isElementDisplayed(UserPageElements.subjects);
	}

}
