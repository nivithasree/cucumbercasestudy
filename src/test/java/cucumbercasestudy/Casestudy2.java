package cucumbercasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Casestudy2 {
	static{System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2d.02.11\\chromedriver\\chromedriver.exe");}
	WebDriver driver = new ChromeDriver();
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("User enters {string} and {string} and clicks submit button")
	public void user_enters_and_and_clicks_submit_button(String string, String string2) {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  WebElement find= driver.findElement(By.linkText("SignIn"));//clicking signup button
		  find.click();
		  WebElement username= driver.findElement(By.name("userName"));
		  username.sendKeys(string);//entering username
		  WebElement password= driver.findElement(By.name("password"));
		  password.sendKeys(string2);//entering password
		  WebElement button= driver.findElement(By.name("Login"));
		  button.click();//clicking login button
		  System.out.println("Login Success");
		
	}
	@Then("User does Successfull login")
	public void user_does_Successfull_login() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}
	
	    
	
}
