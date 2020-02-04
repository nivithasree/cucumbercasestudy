package cucumbercasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Casestudy3 {
	static{System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2d.02.11\\chromedriver\\chromedriver.exe");}
	WebDriver driver = new ChromeDriver();
	@Given("User enters the testmeapp and logs in")
	public void user_enters_the_testmeapp_and_logs_in() {
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

	@When("User search for a product in search engine")
	public void user_search_for_a_product_in_search_engine() {
		WebElement search=driver.findElement(By.xpath("//div[@class='autocomplete']/input"));
		search.sendKeys("Head");
		WebElement enter=driver.findElement(By.xpath("//input[@type='submit']"));
		enter.click();
	   
	}

	@Then("User purchases the product")
	public void user_purchases_the_product() {
		  WebElement addtocart= driver.findElement(By.linkText("Add to cart"));
		  addtocart.click();//for adding to cart
		  driver.get("http://10.232.237.143:443/TestMeApp/displayCart.htm");
		  driver.get("http://10.232.237.143:443/PaymentGateway/getOrderDetails.htm");
		  driver.get("http://10.232.237.143:443/PaymentGateway/loginhere.htm?radio=Andhra%20Bank");
		  WebElement username=driver.findElement(By.name("username"));
		  username.sendKeys("123456");
		  WebElement password=driver.findElement(By.name("password"));
		  password.sendKeys("Pass@456");
		  WebElement log= driver.findElement(By.xpath("//div[@class='user-right'][2]/input"));
		  log.click();
		  WebElement trans= driver.findElement(By.name("transpwd"));
		  trans.sendKeys("Trans@456");
		  WebElement paynow= driver.findElement(By.xpath("//div[@class='user-right']/input"));
		  paynow.click();
		  WebElement logout=driver.findElement(By.linkText("SignOut"));//for clicking 
		  logout.click();  
	}

}
