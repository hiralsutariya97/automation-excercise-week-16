package com.automationexcercise.steps;

import com.automationexcercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginUserWithCorrectEmailAndPasswordSteps {
    @When("The user enters correct email address {string}")
    public void theUserEntersCorrectEmailAddress(String loginEmailBoxText) {
        new LoginPage().enterLoginEmailBoxText(loginEmailBoxText);
    }

    @When("The user enters correct password {string}")
    public void theUserEntersCorrectPassword(String loginPasswordBoxText) {
        new LoginPage().enterLoginPasswordBoxText(loginPasswordBoxText);
    }

    @And("The user clicks Signup Login button")
    public void theUserClicksSignupLoginButton() {
        new LoginPage().clickLoginButton();
    }
}
