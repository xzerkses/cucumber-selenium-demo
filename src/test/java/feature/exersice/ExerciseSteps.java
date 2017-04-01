package feature.exersice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExerciseSteps {

	private WebDriver driver;
	private WebElement departureElem;
//	private WebElement arrivalElem;

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
//		arrivalElem = driver.findElement(By.name("arrivalPlaceName"));
		departureElem.sendKeys(arg1);
	}

	@Then("^\"([^\"]*)\" should be visible$")
	public void should_be_visible(String arg1) throws Throwable {
//		Assert.assertEquals(arg1, departureElem.getText());
	}

}
