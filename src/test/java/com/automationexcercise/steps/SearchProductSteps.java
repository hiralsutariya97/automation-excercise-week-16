package com.automationexcercise.steps;

import com.automationexcercise.pages.ProductPage;
import com.automationexcercise.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchProductSteps {
    @When("The user enters product name {string}")
    public void theUserEntersProductName(String searchProductBoxText) {
        new ProductPage().searchProductBoxText(searchProductBoxText);
    }

    @When("The user clicks search button")
    public void theUserClicksSearchButton() {
        new ProductPage().clickSubmitSearchButton();
    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertEquals(new SearchPage().verifySearchedProductsText(), "SEARCHED PRODUCTS");
    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        Assert.assertEquals(new ProductPage().verifyProductNameInSearch(), "Blue Top");
    }
}
