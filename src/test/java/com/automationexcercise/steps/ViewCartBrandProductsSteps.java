package com.automationexcercise.steps;

import com.automationexcercise.pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ViewCartBrandProductsSteps {
    @Then("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        Assert.assertEquals(new ProductPage().verifyBrandsText(), "BRANDS");
    }

    @When("The user clicks on left side bar Polo brand name")
    public void theUserClicksOnLeftSideBarPoloBrandName() {
        new ProductPage().clickPoloButton();
    }

    @Then("Verify that user is navigated to Polo page and brand products are displayed")
    public void verifyThatUserIsNavigatedToPoloPageAndBrandProductsAreDisplayed() {
        Assert.assertEquals(new ProductPage().verifyPoloText(), "BRAND - POLO PRODUCTS");
    }

    @When("The user clicks on left side bar H&M brand name")
    public void theUserClicksOnLeftSideBarHMBrandName() {
        new ProductPage().clickhnmButton();
    }

    @Then("Verify that user is navigated to H&M page and brand products are displayed")
    public void verifyThatUserIsNavigatedToHMPageAndBrandProductsAreDisplayed() {
        Assert.assertEquals(new ProductPage().verifyHnmText(), "BRAND - H&M PRODUCTS");
    }
}
