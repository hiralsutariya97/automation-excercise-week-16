package com.automationexcercise.steps;

import com.automationexcercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifyAllProductsAndProductDetailPageSteps {
    @When("The user clicks Products menu button")
    public void theUserClicksProductsMenuButton() {
        new ProductPage().clickProductsButton();
    }

    @Then("Verify user is navigated to All PRODUCTS page successfully")
    public void verifyUserIsNavigatedToAllPRODUCTSPageSuccessfully() {
        Assert.assertEquals(new ProductPage().verifyAllProductsText(),"ALL PRODUCTS");
    }

    @And("Verify the products list is visible")
    public void verifyTheProductsListIsVisible() {
        Assert.assertEquals(new ProductPage().verifyAllProductsText(),"ALL PRODUCTS");
    }

    @When("The user clicks on View Product of first product")
    public void theUserClicksOnViewProductOfFirstProduct() {
        new ProductPage().clickFirstViewProductButton();
    }

    @Then("Verify the user is landed to product detail page")
    public void verifyTheUserIsLandedToProductDetailPage() {
        Assert.assertEquals(new ProductPage().verifyProductName(),"Blue Top");
    }

    @And("Verify that detail detail is visible product name")
    public void verifyThatDetailDetailIsVisibleProductName() {
        Assert.assertEquals(new ProductPage().verifyProductName(),"Blue Top");
    }

    @And("Verify that detail detail is visible category")
    public void verifyThatDetailDetailIsVisibleCategory() {
        Assert.assertEquals(new ProductPage().verifyProductCategory(),"Category: Women > Tops");
    }

    @And("Verify that detail detail is visible price")
    public void verifyThatDetailDetailIsVisiblePrice() {
        Assert.assertEquals(new ProductPage().verifyProductPrice(),"Rs.500");
    }

    @And("Verify that detail detail is visible availability")
    public void verifyThatDetailDetailIsVisibleAvailability() {
        Assert.assertEquals(new ProductPage().verifyProductAvailability(),"Availability: In Stock");
    }

    @And("Verify that detail detail is visible condition")
    public void verifyThatDetailDetailIsVisibleCondition() {
        Assert.assertEquals(new ProductPage().verifyProductCondition(),"Condition: New");
    }

    @And("Verify that detail detail is visible brand")
    public void verifyThatDetailDetailIsVisibleBrand() {
        Assert.assertEquals(new ProductPage().verifyBrandsText(),"Brand: Polo");
    }
}
