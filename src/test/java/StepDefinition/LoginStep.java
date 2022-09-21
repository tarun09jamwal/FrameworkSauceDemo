package StepDefinition;

import Pages.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass
{
    @Given("user is on login page")
    public void user_is_on_login_page() {
        Setup();
        System.out.println("User is on login page");

    }
    @Given("user enters username and password")
    public void user_enters_username_and_password() {
        pageFactory.getLoginPage().LoginUser();
    }
    @Given("clicks on login button")
    public void clicks_on_login_button() {

    }
    @When("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {

    }
    @When("verify the product page")
    public void verify_the_product_page() {

    }
    @When("click on any add to cart button")
    public void click_on_any_add_to_cart_button() {

    }
    @When("navigate to the carts button")
    public void navigate_to_the_carts_button() {

    }
    @Then("user is navigated to the cart")
    public void user_is_navigated_to_the_cart() {

    }
    @Then("click on checkout fill the your information and click continue")
    public void click_on_checkout_fill_the_your_information_and_click_continue() {

    }
    @Then("Verify the item in overview page and click finish button")
    public void verify_the_item_in_overview_page_and_click_finish_button() {

    }
    @Then("user is logged out and browser closes")
    public void user_is_logged_out_and_browser_closes() {

    }

}
