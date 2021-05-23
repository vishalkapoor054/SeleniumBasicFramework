package test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import core.ActionDriver;
import core.OpenAndCloseBrowser;
import or.HomePageElements;
import or.LoginPageElements;
import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;

public class LoginPageTest extends OpenAndCloseBrowser{


	@BeforeMethod
	public void openUrl(){
		ActionDriver loginPage = new ActionDriver(driver);
		loginPage.navigateTo("https://meritnation.com");
	}
	
	@Test(priority=1, groups="smoke")
	public void test() throws Exception{
		/*ActionDriver loginPage = new ActionDriver(driver);
		loginPage.navigateTo("https://meritnation.com");
		loginPage.click(HomePageElements.loginLink);
		loginPage.type(LoginPageElements.username, "sunaina@test.com");
		loginPage.type(LoginPageElements.password, "12345678");
		loginPage.click(LoginPageElements.loginBtn);
		*/
		
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = homePage.clickLoginLink();
		UserPage userPage = loginPage.signIn("sunaina@test.com", "12345678");
		assert userPage.verifySubjectPresent():"Expected: fail";
		
	}
	
	@Test
	public void test2(){
		
	}
	
}
