package com.automationexcercise.steps;

import com.automationexcercise.pages.TestCasesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifyTestCasesPageSteps {
    @When("The user clicks Test Cases menu button")
    public void theUserClicksTestCasesMenuButton() {
        new TestCasesPage().clickTestCases();
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertEquals(new TestCasesPage().verifyTestCasesText(),"TEST CASES");
    }
}
