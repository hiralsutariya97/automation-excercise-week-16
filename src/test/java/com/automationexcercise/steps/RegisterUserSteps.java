package com.automationexcercise.steps;

import com.automationexcercise.pages.HomePage;
import com.automationexcercise.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterUserSteps {
    @Given("The user is on the homepage")
    public void theUserIsOnTheHomepage() {
    }

    @When("The user clicks Signup Login menu button")
    public void theUserClicksSignupLoginMenuButton() {
        new HomePage().clickLoginLink();
    }

    @Then("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertEquals(new RegisterPage().verifyNewUserSignupText(),"New User Signup!");
    }

    @When("The user enters name {string}")
    public void theUserEntersName(String nameBoxText) {
        new RegisterPage().enterNameBoxText(nameBoxText);
    }

    @When("The user enters email {string}")
    public void theUserEntersEmail(String enterEmailBoxText) {
        new RegisterPage().enterEmailBoxText(enterEmailBoxText);
    }

    @And("The user clicks Signup button")
    public void theUserClicksSignupButton() {
        new RegisterPage().clickSignupButton();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertEquals(new RegisterPage().verifyEnterAccountText(),"ENTER ACCOUNT INFORMATION");
    }

    @When("User selects Mrs")
    public void userSelectsMrs() {
        new RegisterPage().clickGenderButton();
    }

    @When("User Enters Password {string}")
    public void userEntersPassword(String passwordBoxText) {
        new RegisterPage().enterPasswordBoxText(passwordBoxText);
    }

    @When("User Selects Day {string}")
    public void userSelectsDay(String day) {
        new RegisterPage().selectDay(day);
    }

    @When("User Selects Month {string}")
    public void userSelectsMonth(String month) {
        new RegisterPage().selectMonth(month);
    }

    @When("User Selects Year {string}")
    public void userSelectsYear(String year) {
        new RegisterPage().selectYear(year);
    }

    @When("User Enters First Name {string}")
    public void userEntersFirstName(String firstNameBoxText) {
        new RegisterPage().enterFirstNameBoxText(firstNameBoxText);
    }

    @When("User Enters Last Name {string}")
    public void userEntersLastName(String lastNameBoxText) {
        new RegisterPage().enterLastNameBox(lastNameBoxText);
    }

    @When("User Enters Address {string}")
    public void userEntersAddress(String address1BoxText) {
        new RegisterPage().enterAddress1Box(address1BoxText);
    }

    @When("User Enters Country {string}")
    public void userEntersCountry(String country) {
        new RegisterPage().selectCountry(country);
    }

    @When("User Enters State {string}")
    public void userEntersState(String stateBoxText) {
        new RegisterPage().enterStateBox(stateBoxText);
    }

    @When("User Enters City {string}")
    public void userEntersCity(String cityBoxText) {
        new RegisterPage().enterCityBox(cityBoxText);
    }

    @When("User Enters Zipcode {string}")
    public void userEntersZipcode(String zipcodeBoxText) {
        new RegisterPage().enterZipcodeBox(zipcodeBoxText);
    }

    @When("User Enters Mobile {string}")
    public void userEntersMobile(String mobileNumberBoxText) {
        new RegisterPage().enterMobileNumberBox(mobileNumberBoxText);
    }

    @And("The user clicks Create Account button")
    public void theUserClicksCreateAccountButton() {
        new RegisterPage().clickCreateAccountButton();
    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        Assert.assertEquals(new RegisterPage().verifyAccountText(),"ACCOUNT CREATED!");
    }

    @When("The user clicks Continue button")
    public void theUserClicksContinueButton() {
        new RegisterPage().clickContinueButton();
    }

    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertEquals(new RegisterPage().verifyLoggedInText(),"Logged in as Hiral");
    }

    @When("The user clicks Delete Account button")
    public void theUserClicksDeleteAccountButton() {
        new RegisterPage().clickDeleteAccountButton();
    }

    @Then("Verify that ACCOUNT DELETED is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        Assert.assertEquals(new RegisterPage().verifyAccountDeletedText(),"ACCOUNT DELETED!");
    }

    @And("The user clicks Other Continue button")
    public void theUserClicksOtherContinueButton() {
        new RegisterPage().clickDeleteContinueButton();
    }
}
