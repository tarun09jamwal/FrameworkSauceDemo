package StepDefinition;

import Pages.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

public class LoginStep extends BaseClass {
    @Given("user is on login page")
    public void user_is_on_login_page() throws IOException {
        Setup();
        System.out.println("User is on login page");
    }

    @Given("user enters username and password")
    public void user_enters_username_and_password() throws IOException {
        pageFactory.getLoginPage().LoginUser();
        System.out.println("User entered the username and password");
    }

    @Given("clicks on login button")
    public void clicks_on_login_button() {
        pageFactory.getLoginPage().LoginButton();
        System.out.println("User clicked on the login button");
    }

    @When("user is navigated to the product page and verify the page")
    public void user_is_navigated_to_the_product_page_and_verify_the_page() {
        pageFactory.getLoginPage().VerifyHomePage();
        System.out.println("user is navigated to the product page and verified the page");
    }

    @When("click on any add to cart button")
    public void click_on_any_add_to_cart_button() {
        pageFactory.getLoginPage().AddToCartButton();
        System.out.println("user click on any add to cart button");
    }

    @When("navigate to the carts button and verify the page")
    public void navigate_to_the_carts_button_and_verify_the_page() {
        pageFactory.getLoginPage().Cart();
        System.out.println("user navigate to the carts button and verified the page");
    }

    @Then("click on checkout fill the your information and click continue")
    public void click_on_checkout_fill_the_your_information_and_click_continue() throws IOException {
        pageFactory.getLoginPage().UserInformation();
        System.out.println("user clicked on checkout fill the your information and clicked continue");
    }

    @Then("Verify the item in overview page and click finish button")
    public void verify_the_item_in_overview_page_and_click_finish_button() {
        pageFactory.getLoginPage().VerifyProduct();
        System.out.println("user verified the item in overview page and click finish button");

    }

    @Then("user is logged out and browser closes")
    public void user_is_logged_out_and_browser_closes() {
        pageFactory.getLoginPage().Logout();
        System.out.println("user is logged out and browser closes");
    }

}
