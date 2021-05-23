package pages;

import org.openqa.selenium.WebDriver;

import core.ActionDriver;
import or.LoginPageElements;

public class LoginPage extends ActionDriver{

	public LoginPage(WebDriver driver) throws Exception {
		super(driver);
		if(!isElementDisplayed(LoginPageElements.username)){
			throw new Exception("User is not on LoginPage and is on "+getTitle());
		}
	}
	
	public UserPage signIn(String username, String password) throws Exception{
		type(LoginPageElements.username, username);
		type(LoginPageElements.password, password);
		click(LoginPageElements.loginBtn);
		return new UserPage(driver);
	}
	
	public LoginPage typeUsername(String username){
		type(LoginPageElements.username, username);
		return this;
	}
	
	public LoginPage typePassword(String password){
		type(LoginPageElements.password, password);
		return this;
	}
	
	public UserPage clickLoginBtn() throws Exception{
		click(LoginPageElements.loginBtn);
		return new UserPage(driver);
	}

}
