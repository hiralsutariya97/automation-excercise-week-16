package com.automationexcercise.pages;

import com.automationexcercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscriptionText;

    @CacheLookup
    @FindBy(id = "susbscribe_email")
    WebElement susbscribeEmailBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement successSubscribeText;

    @CacheLookup
    @FindBy(xpath = "//h2[.='recommended items']")
    WebElement recommendedItemsText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//div[1]//div[1]//div[1]//div[1]//a[1]")
    WebElement AddToCartRecommendedItem;

    @CacheLookup
    @FindBy(xpath = "//a[@id='scrollUp']")
    WebElement scrollUpArrow;

    @CacheLookup
    @FindBy(xpath = "//h2[.='Full-Fledged practice website for Automation Engineers']")
    WebElement fullFleggedText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement subscriptionArrowButton;

    public String verifySubscriptionText() {
        log.info("Verify Subscription text." + subscriptionText.toString());
        return getTextFromElement(subscriptionText);
    }

    public void enterSubscribeEmailBox(String subscribeEmailBoxText) {
        log.info("Enter Subscribe Email Text." + susbscribeEmailBox);
        sendTextToElement(susbscribeEmailBox, subscribeEmailBoxText);
    }

    public String verifySuccessSubscribeText() {
        log.info("Verify Success Subscribe text." + successSubscribeText.toString());
        return getTextFromElement(successSubscribeText);
    }

    public String verifyRecommendedItemsText() {
        log.info("Verify Recommended Items Text." + recommendedItemsText.toString());
        return getTextFromElement(recommendedItemsText);
    }

    public void scrollDownToRecommendedItems() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", recommendedItemsText);
        log.info("Scroll down to Recommended Items");
    }

    public void clickAddToCartRecommendedItem() {
        log.info("Click on add to cart button." + AddToCartRecommendedItem.toString());
        clickOnElement(AddToCartRecommendedItem);
    }

    public void clickScrollUpArrow() {
        log.info("Click on Scroll Up Arrow." + scrollUpArrow.toString());
        clickOnElement(scrollUpArrow);
    }

    public void scrollUpScript() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,0)", "");
        log.info("Scroll up");
    }

    public String verifyFullFleggedText() {
        log.info("Verify Full Flegged Text" + fullFleggedText.toString());
        return getTextFromElement(fullFleggedText);
    }

    public void clickLoginLink() {
        log.info("Click on login Link" + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnArrowToSubscribe() {
        log.info("Click on subscription arrow button : " + subscriptionArrowButton.toString());
        clickOnElement(subscriptionArrowButton);
    }
}
