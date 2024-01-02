package com.automationexcercise.pages;

import com.automationexcercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='message']")
    WebElement commentTextBox;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    WebElement placeOrderButton;

    public void enterCommentTextBox(String commentText) {
        log.info("Enter Comment Text." + commentTextBox);
        sendTextToElement(commentTextBox, commentText);
    }

    public void clickPlaceOrderButton() {
        log.info("Click on place Order Button." + placeOrderButton.toString());
        clickOnElement(placeOrderButton);
    }
}
