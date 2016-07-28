import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by subbu on 28/07/2016.
 */
public class StepDfs {

    WebDriver driver= new FirefoxDriver();

    @Given("^I am on Gov\\.uk$")
    public void i_am_on_Gov_uk() throws Throwable {
        driver.get("https://www.gov.uk/");

    }
    @When("^I click Benefits$")
    public void i_click_Benefits() throws Throwable {

    }
    @When("^I click Benefits for familes$")
    public void i_click_Benefits_for_familes() throws Throwable {

    }
    @When("^I click Benefits calculators$")
    public void i_click_Benefits_calculators() throws Throwable {

    }
    @Then("^I should see Benefits calculators page$")
    public void i_should_see_Benefits_calculators_page() throws Throwable {

    }
}
