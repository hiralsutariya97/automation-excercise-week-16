package com.automationexcercise.steps;

import com.automationexcercise.pages.ContactUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ContactUsFormSteps {
    @When("The user clicks Contact us menu button")
    public void theUserClicksContactUsMenuButton() {
        new ContactUsPage().clickContactUsButton();
    }

    @Then("Verify Get IN TOUCH is visible")
    public void verifyGetINTOUCHIsVisible() {
        Assert.assertEquals(new ContactUsPage().verifyGetInTouchText(),"GET IN TOUCH");
    }

    @When("The user enters contact email {string}")
    public void theUserEntersContactEmail(String emailBoxText) {
        new ContactUsPage().enterEmailBox(emailBoxText);
    }

    @When("The user enters subject {string}")
    public void theUserEntersSubject(String subjectBoxText) {
        new ContactUsPage().enterSubjectBox(subjectBoxText);
    }

    @When("The user enters message {string}")
    public void theUserEntersMessage(String messageBoxText) {
        new ContactUsPage().enterMessageBox(messageBoxText);
    }

    @And("The user uploads file")
    public void theUserUploadsFile() {
        new ContactUsPage().uploadFile();
    }

    @And("The user clicks Submit button")
    public void theUserClicksSubmitButton() {
        new ContactUsPage().clickSubmitButton();
    }

    @And("The user clicks OK button")
    public void theUserClicksOKButton() {
        new ContactUsPage().acceptPopupMessage();
    }

    @Then("Verify success message Success Your details have been submitted successfully is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertEquals(new ContactUsPage().verifySuccessText(),"Success! Your details have been submitted successfully.");
    }

    @When("The user clicks Home button")
    public void theUserClicksHomeButton() {
        new ContactUsPage().clickHomeButton();
    }

    @Then("Verify that landed to homepage successfully")
    public void verifyThatLandedToHomepageSuccessfully() {
        Assert.assertEquals(new ContactUsPage().verifyHomePageAutomationText(),"Automation");
    }
}
