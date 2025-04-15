package stepdefinations;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginSteps {
	
	LoginPage loginpage ;
	
	@Given("User enters valid username")
	public void user_enters_username() {
		loginpage = new LoginPage(Hooks.driver);
		loginpage.enterUserName("Admin");
	}
	
	@And("User enters valid password")
	public void User_enters_password() {
		loginpage.enterUserPassword("admin123");
		
	}
	
	@And("User click on login button")
	public void User_click_on_login() {
		loginpage.clickLogin();
	}
		
	@Then("Home page should be dispalyed")
	public void Home_page_is_dispalyed() {
		String actualUrl = Hooks.driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		Assert.assertEquals(actualUrl, expectedUrl);
	}

		
	}
		
		
		
		
	


