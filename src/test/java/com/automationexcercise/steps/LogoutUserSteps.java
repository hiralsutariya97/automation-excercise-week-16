package com.automationexcercise.steps;

import com.automationexcercise.pages.LoginPage;
import io.cucumber.java.en.When;

public class LogoutUserSteps {
    @When("The user clicks Logout button")
    public void theUserClicksLogoutButton() {
        new LoginPage().clickLogoutButton();
    }
}
