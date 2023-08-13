package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Ebayhome_Steps {
	WebDriver driver;
	@Given("User is on Ebay home page")
	public void user_is_on_ebay_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "Webdrivers/chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://www.ebay.com/");
	     System.out.println("I am on Ebay home page");
	     driver.manage().window().maximize();
	}

	@When("User click on Advance link")
	public void user_click_on_advance_link() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Advanced")).click();
	    System.out.println("I click on Advance link");
	}

	@Then("User navigate to Advanced search page")
	public void user_navigate_to_advanced_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I navigate to Advanced search page");
	    driver.close();
	}


}
