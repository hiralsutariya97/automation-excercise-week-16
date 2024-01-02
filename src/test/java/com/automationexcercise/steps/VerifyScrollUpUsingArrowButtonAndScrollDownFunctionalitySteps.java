package com.automationexcercise.steps;

import com.automationexcercise.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalitySteps {
    @When("Ths user clicks orange arrow button")
    public void thsUserClicksOrangeArrowButton() {
        new HomePage().scrollUpScript();
        new HomePage().clickScrollUpArrow();
    }

    @Then("Verify that page is scrolled up and Full-Flegged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFleggedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        Assert.assertEquals(new HomePage().verifyFullFleggedText(), "Full-Fledged practice website for Automation Engineers");
    }
}
