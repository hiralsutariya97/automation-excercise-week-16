package com.automationexcercise.steps;

import com.automationexcercise.pages.ViewCartPage;
import io.cucumber.java.en.When;

public class VerifySubscriptionInCartPageSteps {
    @When("The user clicks Cart menu button")
    public void theUserClicksCartMenuButton() {
        new ViewCartPage().clickCartButton();
    }
}
