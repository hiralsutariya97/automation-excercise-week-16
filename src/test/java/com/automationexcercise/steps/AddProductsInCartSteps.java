package com.automationexcercise.steps;

import com.automationexcercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AddProductsInCartSteps {
    @And("The user hovers over first product and clicks Add to cart")
    public void theUserHoversOverFirstProductAndClicksAddToCart() {
        new ProductPage().clickFirstAddToCartProductButton();
    }

    @And("The user clicks Continue Shopping button")
    public void theUserClicksContinueShoppingButton() {
        new ProductPage().clickContinueShoppingButton();
    }

    @And("The user hovers over second product and clicks Add to cart")
    public void theUserHoversOverSecondProductAndClicksAddToCart() {
        new ProductPage().clickSecondAddToCartButton();
    }

    @And("The user clicks View Cart button")
    public void theUserClicksViewCartButton() {
        new ProductPage().clickViewCartButton();
    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        Assert.assertEquals(new ProductPage().verifyProductNameInCart(),"Blue Top");
    }

    @And("Verify their prices")
    public void verifyTheirPrices() {
        Assert.assertEquals(new ProductPage().verifyPriceInCart(),"Rs.500");
    }

    @And("Verify their quantity")
    public void verifyTheirQuantity() {
        Assert.assertEquals(new ProductPage().verifyQuantityInCart(),"1");
    }

    @And("Verify their total price")
    public void verifyTheirTotalPrice() {
        Assert.assertEquals(new ProductPage().verifyTotalInCart(),"Rs.500");
    }
}
