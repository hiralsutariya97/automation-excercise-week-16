package com.automationexcercise.steps;

import com.automationexcercise.pages.CategoryProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ViewCategoryProductsSteps {
    @Then("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
        Assert.assertEquals(new CategoryProductPage().verifyCategoryText(), "CATEGORY");
    }

    @When("The user clicks on Women category")
    public void theUserClicksOnWomenCategory() {
        new CategoryProductPage().clickWomenCategory();
    }

    @And("The user clicks on Dress link under Women category")
    public void theUserClicksOnDressLinkUnderWomenCategory() {
        new CategoryProductPage().clickOnWomenDress();
    }

    @Then("Verify that category page is displayed and confirm text women Dress PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWomenDressPRODUCTS() {
        Assert.assertEquals(new CategoryProductPage().verifyWomenDressProductsText(), "WOMEN - DRESS PRODUCTS");
    }

    @When("The user clicks on Men category")
    public void theUserClicksOnMenCategory() {
        new CategoryProductPage().clickMenCategory();
    }

    @And("The user clicks on Tshirts link under Men category")
    public void theUserClicksOnTshirtsLinkUnderMenCategory() {
        new CategoryProductPage().clickTshirtsCategory();
    }

    @Then("Verify that category page is displayed and confirm text men Tshirts PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextMenTshirtsPRODUCTS() {
        Assert.assertEquals(new CategoryProductPage().verifyMenTshirtsProductsText(), "MEN - TSHIRTS PRODUCTS");
    }
}
