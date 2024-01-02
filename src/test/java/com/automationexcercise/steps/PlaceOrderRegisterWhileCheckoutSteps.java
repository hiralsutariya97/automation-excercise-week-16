package com.automationexcercise.steps;

import com.automationexcercise.pages.PaymentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PlaceOrderRegisterWhileCheckoutSteps {
    @When("The user clicks Proceed To Checkout button")
    public void theUserClicksProceedToCheckoutButton() {
    }

    @Then("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
    }

    @And("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
    }

    @Then("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        Assert.assertEquals(new PaymentPage().verifySuccessMessageText(),"Congratulations! Your order has been confirmed!");
    }
}
