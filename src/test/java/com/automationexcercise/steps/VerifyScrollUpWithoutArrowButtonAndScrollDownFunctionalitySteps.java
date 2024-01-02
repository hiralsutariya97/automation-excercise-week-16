package com.automationexcercise.steps;

import com.automationexcercise.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalitySteps {
    @When("The user scrolls up to top")
    public void theUserScrollsUpToTop() {
        new HomePage().scrollUpScript();
    }

    @Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        Assert.assertEquals(new HomePage().verifyFullFleggedText(), "Full-Fledged practice website for Automation Engineers");

    }
}
