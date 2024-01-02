package com.automationexcercise.steps;

import com.automationexcercise.pages.ProductPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SearchProductsAndVerifyCartAfterLoginSteps {
    @Then("Verify that products are visible in cart")
    public void verifyThatProductsAreVisibleInCart() {
        Assert.assertEquals(new ProductPage().verifyProductNameInCart(), "Blue Top");
    }

    @Then("Verify that those products are visible in cart after login as well")
    public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        Assert.assertEquals(new ProductPage().verifyProductNameInCart(), "Blue Top");
    }
}
