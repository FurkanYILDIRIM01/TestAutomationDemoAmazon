package StepDefinitions;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);


    @Given("User is on homepage")
    public void userIsOnHomepage() {
        AmazonPages.homePage();
    }

    @When("Click acccept cookies")
    public void clickAccceptCookies() {
        AmazonPages.acceptCokie();
    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        AmazonPages.clickSearchButton();
    }

    @When("Write product name")
    public void writeProductName() {
        AmazonPages.writeProduct();
    }

    @When("Click product search button")
    public void clickProductSearchButton() {
        AmazonPages.clickProductSearch();
    }

    @When("Filter for Shipped by Amazon")
    public void filterForShippedByAmazon() {
        AmazonPages.filterShippedByAmazon();
    }

    @When("Filter for Apple")
    public void filterForApple() {
        AmazonPages.filterApple();
    }

    @When("Click the first product")
    public void clickTheFirstProduct() {
        AmazonPages.clickFirstProduct();
    }

    @When("Add to card")
    public void addToCard() {
        AmazonPages.addCard();
    }

    @Then("Check add card")
    public void checkAddCard() {
        AmazonPages.checkCard();

    }
}
