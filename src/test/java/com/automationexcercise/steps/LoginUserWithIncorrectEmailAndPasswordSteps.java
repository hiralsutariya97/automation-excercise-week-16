package com.automationexcercise.steps;

import com.automationexcercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginUserWithIncorrectEmailAndPasswordSteps {
    @And("The user clicks login button")
    public void theUserClicksLoginButton() {
    }

    @Then("Verify error Your email or password is incorrect is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertEquals(new LoginPage().verifyIncorrectText(),"Your email or password is incorrect!");
    }
}
