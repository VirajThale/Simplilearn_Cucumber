
package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepDefs {
	
	
		WebDriver driver = Baseclass.driver;

	    @Given("^user has navigated to the Login Page$")
	    public void user_has_navigated_to_the_login_page() throws Throwable {
	    	
	        driver.get("https://www.simplilearn.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
	        
	        WebElement LoginLink = driver.findElement(By.linkText("Log in"));
	        WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOf(LoginLink));
	        
	        LoginLink.click();
  
	    }

	    @When("^user enter correct username and password$")
	    public void user_enter_correct_username_and_password() throws Throwable {
	    	
	    	WebElement Username =driver.findElement(By.name("user_login"));
			Username.sendKeys("abc@gmail.com");
			WebElement password =driver.findElement(By.id("password"));
			password.sendKeys("PAss@123445");	

	    }

	    @And("^user clicks on Login Button$")
	    public void user_clicks_on_login_button() throws Throwable {

			WebElement btn_login = driver.findElement(By.name("btn_login"));
			btn_login.click();
	       
	    }
	    
	    @Then("^user should be exit$")
	    public void  user_should_be_exit() throws Throwable{
//	    	driver.close();
	    }

	    @When("^user enter correct username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_enter_correct_username_something_and_password_something(String usernameVal, String passwordVal) throws Throwable {
	
	    	WebElement Username =driver.findElement(By.name("user_login"));
			Username.sendKeys(usernameVal);
			WebElement password =driver.findElement(By.id("password"));
			password.sendKeys(passwordVal);
	    }
	    
	  
	    
	    @Then("^you should get error messgae\"([^\"]*)\"$")
	    public void you_should_get_error_messgaesomething(String Expmsg) throws Throwable {
	     	WebElement Error1= driver.findElement(By.id("msg_box"));
			String Actualmsg= Error1.getText();
			
			Assert.assertEquals(Expmsg,Actualmsg);
	       
	    }
	    

	    @When("^user enter correct credentials$")
	    
	    public void user_enter_correct_cred(DataTable table) throws Throwable {
	    	
	    	String UserNameval =table.cell(1, 1);
	    	String Passwordval =table.cell(2, 1);
	    	
	    	WebElement Username =driver.findElement(By.name("user_login"));
			Username.sendKeys(UserNameval);
			WebElement password =driver.findElement(By.id("password"));
			password.sendKeys(Passwordval);
	    	
	    	
	       
	    }

	    

	
	
	    	
	   

}
