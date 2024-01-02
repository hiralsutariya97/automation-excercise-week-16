package com.automationexcercise.steps;

import com.automationexcercise.pages.HomePage;
import com.automationexcercise.pages.ViewCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddToCartFromRecommendedItemsSteps {
    @Then("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        Assert.assertEquals(new HomePage().verifyRecommendedItemsText(), "RECOMMENDED ITEMS");
    }

    @When("The user clicks on Add To Cart on Recommended product")
    public void theUserClicksOnAddToCartOnRecommendedProduct() {
        new HomePage().clickAddToCartRecommendedItem();
    }

    @Then("Verify that recommended product is displayed in cart page")
    public void verifyThatRecommendedProductIsDisplayedInCartPage() {
        Assert.assertEquals(new ViewCartPage().verifyRecommendedProductNameInCart(), "Stylish Dress");
    }
}
