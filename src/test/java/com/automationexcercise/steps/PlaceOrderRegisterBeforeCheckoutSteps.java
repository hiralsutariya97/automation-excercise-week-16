package com.automationexcercise.steps;

import com.automationexcercise.pages.RegisterPage;
import io.cucumber.java.en.And;

public class PlaceOrderRegisterBeforeCheckoutSteps {
    @And("The user clicks after delete Continue button")
    public void theUserClicksAfterDeleteContinueButton() {
        new RegisterPage().clickDeleteContinueButton();
    }
}
