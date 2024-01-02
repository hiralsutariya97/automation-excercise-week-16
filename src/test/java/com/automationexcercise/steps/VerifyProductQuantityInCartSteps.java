package com.automationexcercise.steps;

import com.automationexcercise.pages.ProductDetailsPage;
import com.automationexcercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifyProductQuantityInCartSteps {
    @When("The user clicks View Product for any product on home page")
    public void theUserClicksViewProductForAnyProductOnHomePage() {
        new ProductPage().clickFirstViewProductButton();
    }

    @Then("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        Assert.assertEquals(new ProductDetailsPage().verifyProductName(),"Blue Top");
    }

    @When("The user increases quantity to {string}")
    public void theUserIncreasesQuantityTo(String quantityBox) {
        new ProductDetailsPage().enterQuantityBoxText(quantityBox);
    }

    @And("The user clicks Add to cart button")
    public void theUserClicksAddToCartButton() {
        new ProductDetailsPage().clickAddToCartButton();
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertEquals(new ProductDetailsPage().verifyQuantityInCart(),"44");
    }
}
