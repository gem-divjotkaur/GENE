package stepdefinitions;

import implementations.Implementations;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Screenshots;

import static implementations.Implementations.*;
import static utils.Screenshots.takeScreenShot;

public class StepDefinitions {
    @Given("^User enters the desired capabilities$")
    public void desiredCapabilities(){
        getDesiredCapabilities();
    }
    @Given("User selects the country as {string} from the dropdown")
    public void navigateCountry(String country){
        selectCountry(country);
    }
    @When("User selects the radio-button gender as {string}")
    public void navigateGender(String gender){
        selectGender(gender);
    }
    @Given("User selects the country as {string}")
    public void navigateToCountry(String country){
        selectCountry(country);
    }
    @When("User enters the name as {string}")
    public void navigateToEnterName(String name){
        enterName(name);
    }
    @And("User selects the gender as {string}")
    public void navigateToGender(String gender){
        selectGender(gender);
    }
    @And("User clicks on {string} button")
    public void navigateLetsShop(String click){
        selectLetsShop(click);
    }
    @And("User clicks on the {string} button")
    public void navigateToLetsShop(String click){
        selectLetsShop(click);
    }
    @Then("User handles the toast message")
    public void handleToast(){
        handleToastMessage();
    }
    @And("User enters shoe {string} to the cart")
    public void addShoeToCart(String shoe){
        addShoe(shoe);
    }
    @And("User enters another shoe {string} to the cart")
    public void addAnotherShoeToCart(String shoe){
        addAnotherShoe(shoe);
    }
    @And("^User go to the cart$")
    public void gotToCart(){
        clickCart();
    }
    @Then("User checks if shoe {string} and shoe {string} are added in the cart or not")
    public void checkShoe(String shoeName, String anotherShoeName){
        checkShoePresence(shoeName, anotherShoeName);
    }
}
