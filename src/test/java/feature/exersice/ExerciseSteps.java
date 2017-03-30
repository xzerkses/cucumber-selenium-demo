package feature.exersice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExerciseSteps {

	private WebDriver driver;
	private WebElement elem;

	@Given("^user is on front page$")
	public void user_is_on_front_page() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("matkahuolto.fi");
	}

	@When("^\"([^\"]*)\"  is written to from field$")
	public void is_written_to_from_field(String arg1) throws Throwable {
		elem = driver.findElement(By.name("departurePlaceName"));
		elem.sendKeys(arg1);
	}

	@Then("^\"([^\"]*)\" should be visible$")
	public void should_be_visible(String arg1) throws Throwable {
		Assert.assertEquals(arg1, elem.getText());
	}

}
