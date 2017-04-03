package feature.exercise;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExerciseSteps {

/*	
	private WebDriver driver;
	 private WebElement departureElem;
	 private WebElement arrivalElem;
	
	 @Given("^user is on front page$")
	 public void user_is_on_front_page() throws Throwable {
	
	 // The geckodriver lives in the projects root folder
	 System.setProperty("webdriver.gecko.driver", "geckodriver");
	
	 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	 capabilities.setCapability("marionette", true);
	 capabilities.setBrowserName("firefox");
	 capabilities.setPlatform(Platform.ANY);
	
	 driver = new FirefoxDriver(capabilities);
	 driver.get("http://matkahuolto.fi");
	 }
	
	 @When("^\"([^\"]*)\" is written to from field$")
	 public void is_written_to_from_field(String arg1) throws Throwable {
	
	 departureElem = driver.findElement(By.name("departurePlaceName"));
	 arrivalElem = driver.findElement(By.name("arrivalPlaceName"));
	 departureElem.sendKeys(arg1);
	 arrivalElem.sendKeys("turku");
	 driver.findElement(By.cssSelector("form[action='/reittihaku/search'] button[type='submit']")).click();
	 }
*/
	@Given("^user is on the main page$")
	public void user_is_on_the_main_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the logo is displayed$")
	public void the_logo_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^ticket offers are displayed$")
	public void ticket_offers_are_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^the user is on the main page$")
	public void the_user_is_on_the_main_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^the link is displayed$")
	public void the_link_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user clicks the link$")
	public void user_clicks_the_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Online ticket sales page is loaded$")
	public void online_ticket_sales_page_is_loaded() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^parcel tracking system is on the main page$")
	public void parcel_tracking_system_is_on_the_main_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user inputs number \"([^\"]*)\"$")
	public void user_inputs_number(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^parcel submit button is pressed$")
	public void parcel_submit_button_is_pressed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^parcel sent \"([^\"]*)\" from \"([^\"]*)\" and arrived \"([^\"]*)\" to \"([^\"]*)\" will be displayed$")
	public void parcel_sent_from_and_arrived_to_will_be_displayed(String arg1, String arg2, String arg3, String arg4)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^\\(from, to, departuretime\\) information in the search field$")
	public void from_to_departuretime_information_in_the_search_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^\\(from, to, departuretime\\) information is entered$")
	public void from_to_departuretime_information_is_entered() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^Search button is pressed$")
	public void search_button_is_pressed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^search results for connections of all bus operators are displayed$")
	public void search_results_for_connections_of_all_bus_operators_are_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^\\(from, to\\) information in the search field$")
	public void from_to_information_in_the_search_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^\"([^\"]*)\", \"([^\"]*)\" information is entered$")
	public void information_is_entered(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^search results for connections of \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void search_results_for_connections_of(String arg1, String arg2, String arg3) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^Turku Helsinki information is entered$")
	public void turku_Helsinki_information_is_entered() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^Turku Tampere information is entered$")
	public void turku_Tampere_information_is_entered() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}