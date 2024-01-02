package com.automationexcercise.steps;

import com.automationexcercise.pages.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterUserWithExistingEmailSteps {
    @When("The user enters existing name {string}")
    public void theUserEntersExistingName(String nameBoxText) {
        new RegisterPage().enterNameBoxText(nameBoxText);

    }

    @When("The user enters existing email {string}")
    public void theUserEntersExistingEmail(String enterEmailBoxText) {
        new RegisterPage().enterEmailBoxText(enterEmailBoxText);
    }

    @Then("Verify error Email Address already exist is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertEquals(new RegisterPage().verifyAlreadyExistText(),"Email Address already exist!");
    }
}
