package cucumbercasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Casestudy4 {
	static{System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2d.02.11\\chromedriver\\chromedriver.exe");}
	WebDriver driver = new ChromeDriver();
	@Given("Alex has registered into the testmeapp")
	public void alex_has_registered_into_the_testmeapp() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  WebElement find= driver.findElement(By.linkText("SignIn"));//clicking signup button
		  find.click();
		  WebElement username= driver.findElement(By.name("userName"));
		  username.sendKeys("Lalitha");//entering username
		  WebElement password= driver.findElement(By.name("password"));
		  password.sendKeys("Password123");//entering password
		  WebElement button= driver.findElement(By.name("Login"));
		  button.click();//clicking login button
		  System.out.println("Login Success");
		
	}

	@When("Alex search a particular product like headphones")
	public void alex_search_a_particular_product_like_headphones() {
		WebElement search=driver.findElement(By.xpath("//div[@class='autocomplete']/input"));
		search.sendKeys("Head");
		WebElement enter=driver.findElement(By.xpath("//input[@type='submit']"));
		enter.click();
	    
	}

	@When("Try to proceed to payment without adding any product into the cart")
	public void try_to_proceed_to_payment_without_adding_any_product_into_the_cart() {
		  WebElement addtocart= driver.findElement(By.linkText("Add to cart"));
		  addtocart.click();//for adding to cart
		  driver.get("http://10.232.237.143:443/TestMeApp/displayCart.htm");
		  WebElement remove=driver.findElement(By.xpath("//form/input[2]"));
		  remove.click();
	}

	@Then("Testmeapp doesnt display cart icon")
	public void testmeapp_doesnt_display_cart_icon() {
		driver.get("http://10.232.237.143:443/TestMeApp/removeCartItem.htm?prodId=1");
	   
	}




}
