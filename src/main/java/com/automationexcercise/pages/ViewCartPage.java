package com.automationexcercise.pages;

import com.automationexcercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ViewCartPage.class.getName());

    public ViewCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-times']")
    WebElement removeQtyButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckoutButton;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerLoginButton;

    @CacheLookup
    @FindBy(xpath = "//b[.='Cart is empty!']")
    WebElement cartEmptyText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Blue Top')]")
    WebElement productNameInCart;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cartButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Stylish Dress']")
    WebElement recommendedProductNameInCart;

    @CacheLookup
    @FindBy(xpath = "//ul[@id = 'address_delivery']/li[4]")
    WebElement deliveryAddress;

    @CacheLookup
    @FindBy(xpath = "//ul[@id = 'address_invoice']/li[4]")
    WebElement billingAddress;

    public String verifyShoppingCartText() {
        log.info("Verify Shopping Cart Text" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public void clickRemoveQtyButton() {
        log.info("Click remove Qty Button" + removeQtyButton.toString());
        clickOnElement(removeQtyButton);
    }

    public void clickProceedToCheckoutButton() {
        log.info("Click proceedToCheckoutButton" + proceedToCheckoutButton.toString());
        clickOnElement(proceedToCheckoutButton);
    }

    public void clickRegisterLoginButton() {
        log.info("Click registerLoginButton." + registerLoginButton.toString());
        clickOnElement(registerLoginButton);
    }

    public String verifyCartEmptyText() {
        log.info("Verify cartEmptyText" + cartEmptyText.toString());
        return getTextFromElement(cartEmptyText);
    }

    public String verifyProductNameInCart() {
        log.info("verify Product Name in Cart" + productNameInCart.toString());
        return getTextFromElement(productNameInCart);
    }

    public void clickCartButton() {
        log.info("Click Cart Button." + cartButton.toString());
        clickOnElement(cartButton);
    }

    public String verifyRecommendedProductNameInCart() {
        log.info("verify Recommended Product Name in Cart" + recommendedProductNameInCart.toString());
        return getTextFromElement(recommendedProductNameInCart);
    }

    public String getDeliveryAddress() {
        log.info("Getting delivery address : " + deliveryAddress.toString());
        return getTextFromElement(deliveryAddress);
    }

    public String getBillingAddress() {
        log.info("Getting billing address : " + deliveryAddress.toString());
        return getTextFromElement(deliveryAddress);
    }
}
