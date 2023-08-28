package com.Isagri.steps;

import com.Isagri.pages.BasePage;
import com.Isagri.pages.PigUp;
import com.Isagri.utility.BrowserUtil;
import com.Isagri.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Base64;

import static org.junit.Assert.assertTrue;

public class IsagriSteps {
    BasePage basePage = new BasePage();

    PigUp pigUp = new PigUp();

    @Given("user on the ISAGRI website")
    public void user_on_the_isagri_website() {

    }

    @When("user hover over the logo WORLDWIDE PIG MANAGEMENT SOLUTION and click")
    public void userHoverOverTheLogoWORLDWIDEPIGMANAGEMENTSOLUTIONAndClick() {
        BrowserUtil.waitForClickablility(basePage.pigManagement, 2).click();
    }

    @Then("user should be taken to the pig management solution website")
    public void user_should_be_taken_to_the_pig_management_solution_website() {

        String currentUrl = Driver.getDriver().getCurrentUrl();
        assertTrue(currentUrl.startsWith("https://pig-up.isagri.com/"));

    }
    @Then("user should navigate on the Book my Free Demo button and click")
    public void user_should_navigate_on_the_book_my_free_demo_button_and_click() {

        BrowserUtil.waitForClickablility(pigUp.bookDemoButton, 3).click();

    }
    @Then("user enters lastName {string}")
    public void user_enters_last_name(String lastNameField) {

        pigUp.lastName.sendKeys(lastNameField);

    }
    @Then("user enters firstName {string}")
    public void user_enters_first_name(String firstNameField) {
        pigUp.firstName.sendKeys(firstNameField);

    }
    @Then("user enters companyName {string}")
    public void user_enters_company_name(String companyName) {
        pigUp.companyName.sendKeys(companyName);

    }
    @Then("user enters email {string}")
    public void user_enters_email(String email) {
        pigUp.email.sendKeys(email);

    }
    @Then("user enters phoneNumber {string}")
    public void user_enters_phone_number(String phone) {
        pigUp.phone.sendKeys(phone);

    }

    @And("user enters country {string}")
    public void userEntersCountry(String countryName) {

        pigUp.country.sendKeys(countryName);

    }

    @Then("user enter how many sows do you have {string}")
    public void user_enter_how_many_sows_do_you_have(String count) {
        pigUp.quantity.sendKeys(count);

    }
    @Then("user enter message {string}")
    public void user_enter_message(String message) {

        pigUp.message.sendKeys(message);

    }
    @Then("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        pigUp.submitButton.click();


    }
    @Then("user should see {string} in the webpage")
    public void user_should_see_in_the_webpage(String message) {

        pigUp.conformationMessage.isDisplayed();

    }



}
