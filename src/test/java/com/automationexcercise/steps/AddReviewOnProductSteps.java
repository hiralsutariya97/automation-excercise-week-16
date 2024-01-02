package com.automationexcercise.steps;

import com.automationexcercise.pages.ProductDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AddReviewOnProductSteps {
    @Then("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() {
        Assert.assertEquals(new ProductDetailsPage().verifyWriteYourReviewText(),"WRITE YOUR REVIEW");
    }

    @And("The user fills in name {string}")
    public void theUserFillsInName(String name) {
        new ProductDetailsPage().nameBoxText(name);
    }

    @And("The user fills in email {string}")
    public void theUserFillsInEmail(String email) {
        new ProductDetailsPage().emailBox(email);
    }

    @And("The user fills in review {string}")
    public void theUserFillsInReview(String review) {
        new ProductDetailsPage().reviewBoxText(review);
    }

    @And("The click Submit Button")
    public void theClickSubmitButton() {
        new ProductDetailsPage().clickReviewButton();
    }

    @Then("Verify success message Thank you for your review.")
    public void verifySuccessMessageThankYouForYourReview() {
        Assert.assertEquals(new ProductDetailsPage().verifyThankYouText(),"Thank you for your review.");
    }
}
