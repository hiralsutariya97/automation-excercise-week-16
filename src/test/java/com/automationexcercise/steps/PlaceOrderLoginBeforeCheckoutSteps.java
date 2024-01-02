package com.automationexcercise.steps;

import com.automationexcercise.pages.RegisterPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class PlaceOrderLoginBeforeCheckoutSteps {
    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        Assert.assertEquals(new RegisterPage().verifyAccountDeletedText(),"ACCOUNT DELETED!");
    }
}
