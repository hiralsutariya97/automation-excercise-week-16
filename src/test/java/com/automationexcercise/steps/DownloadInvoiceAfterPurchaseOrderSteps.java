package com.automationexcercise.steps;

import com.automationexcercise.pages.CheckOutPage;
import com.automationexcercise.pages.PaymentPage;
import com.automationexcercise.pages.ViewCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class DownloadInvoiceAfterPurchaseOrderSteps {

    @And("The user clicks Register-Login button")
    public void theUserClicksRegisterLoginButton() {
        new ViewCartPage().clickRegisterLoginButton();
    }

    @When("The user enters description in comment text area {string}")
    public void theUserEntersDescriptionInCommentTextArea(String commentText) {
        new CheckOutPage().enterCommentTextBox(commentText);
    }

    @And("Click Place Order button")
    public void clickPlaceOrderButton() {
        new CheckOutPage().clickPlaceOrderButton();
    }

    @And("The user enters payment details Name on Card {string}")
    public void theUserEntersPaymentDetailsNameOnCard(String nameOnCardText) {
        new PaymentPage().enterNameOnCardText(nameOnCardText);
    }

    @And("The user enters payment details Card Number {string}")
    public void theUserEntersPaymentDetailsCardNumber(String cardNumberText) {
        new PaymentPage().enterCardNumberText(cardNumberText);
    }

    @And("The user enters payment details CVC {string}")
    public void theUserEntersPaymentDetailsCVC(String cvcNumberText) {
        new PaymentPage().enterCvcNumberText(cvcNumberText);
    }

    @And("The user enters payment details Expiration month {string}")
    public void theUserEntersPaymentDetailsExpirationMonth(String expiryMonthText) {
        new PaymentPage().enterExpiryMonthText(expiryMonthText);
    }

    @And("The user enters payment details Expiration year {string}")
    public void theUserEntersPaymentDetailsExpirationYear(String expiryYearText) {
        new PaymentPage().enterExpiryYearText(expiryYearText);
    }

    @When("The user clicks Pay and Confirm Order button")
    public void theUserClicksPayAndConfirmOrderButton() {
        new PaymentPage().clickPayAndConfirmOrderButton();
    }

    @When("The user clicks Download Invoice button")
    public void theUserClicksDownloadInvoiceButton() {
        new PaymentPage().clickDownloadInvoiceButton();
    }

    @And("Verify invoice is downloaded successfully")
    public void verifyInvoiceIsDownloadedSuccessfully() {
        new PaymentPage().filePresent();
    }
}
