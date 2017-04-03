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

	@When("^\"([^\"]*)\"  is written to from field$")
	public void is_written_to_from_field(String arg1) throws Throwable {

		departureElem = driver.findElement(By.name("departurePlaceName"));
		arrivalElem = driver.findElement(By.name("arrivalPlaceName"));
		departureElem.sendKeys(arg1);
		arrivalElem.sendKeys("turku");
		driver.findElement(By.cssSelector("form[action='/reittihaku/search'] button[type='submit']")).click();
	}

	@Then("^\"([^\"]*)\" should be visible$")
	public void should_be_visible(String arg1) throws Throwable {
		// Assert.assertEquals(arg1, departureElem.getText());
	}

	@Given("^the user opens the browser$")
	public void the_user_opens_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^the user navigates to matkahuolto\\.fi$")
	public void the_user_navigates_to_matkahuolto_fi() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Logo becomes visible on the top left of the MainPage$")
	public void logo_becomes_visible_on_the_top_left_of_the_MainPage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Ticket offers are visible$")
	public void ticket_offers_are_visible() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the consignment number input field is visible$")
	public void the_consignment_number_input_field_is_visible() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

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

	@Then("^the logo is on top left$")
	public void the_logo_is_on_top_left() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^ticket offers are displayed$")
	public void ticket_offers_are_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the link is displayed$")
	public void the_link_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^the user is on the main page$")
	public void the_user_is_on_the_main_page() throws Throwable {
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

	@When("^user inputs number (\\d+)$")
	public void user_inputs_number(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^a popup window should show a parcel tracking information table$")
	public void a_popup_window_should_show_a_parcel_tracking_information_table() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the table should contain 'sent (\\d+)\\.(\\d+)\\. from Helsinki' and 'arrived (\\d+)\\.(\\d+)\\. to Littoinen'$")
	public void the_table_should_contain_sent_from_Helsinki_and_arrived_to_Littoinen(int arg1, int arg2, int arg3,
			int arg4) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user inputs wrong consignment number$")
	public void user_inputs_wrong_consignment_number() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^a popup window should appear with error message$")
	public void a_popup_window_should_appear_with_error_message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user can see the timetable input fields$")
	public void user_can_see_the_timetable_input_fields() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^from field is 'Kuopio' and to field is 'Helsinki' and depature date is '(\\d+)\\.(\\d+)\\.(\\d+)' and time is '(\\d+)\\.(\\d+)'\\.$")
	public void from_field_is_Kuopio_and_to_field_is_Helsinki_and_depature_date_is_and_time_is(int arg1, int arg2,
			int arg3, int arg4, int arg5) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^result contains only 'Onnibus' route$")
	public void result_contains_only_Onnibus_route() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^from field is Helsinki and to field is Turku and depature date is (\\d+)\\.(\\d+)\\. (\\d+)\\.(\\d+)$")
	public void from_field_is_Helsinki_and_to_field_is_Turku_and_depature_date_is(int arg1, int arg2, int arg3,
			int arg4) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Onnibus, Vainionliikenne, Launokorpi are returned$")
	public void onnibus_Vainionliikenne_Launokorpi_are_returned() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^from field is Kuopio and to field is Turku and depature date is (\\d+)\\.(\\d+)\\. (\\d+)\\.(\\d+)$")
	public void from_field_is_Kuopio_and_to_field_is_Turku_and_depature_date_is(int arg1, int arg2, int arg3, int arg4)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^TVO, Vainionliikenne, Launokorpi are returned$")
	public void tvo_Vainionliikenne_Launokorpi_are_returned() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
