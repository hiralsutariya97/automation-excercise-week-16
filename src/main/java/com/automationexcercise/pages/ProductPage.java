package com.automationexcercise.pages;

import com.automationexcercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    public WebElement allProductsText;

    @CacheLookup
    @FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")
    public WebElement firstViewProductButton;

    @CacheLookup
    @FindBy(xpath = "//a[.='View Product'][2]")
    public WebElement secondViewProductButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    public WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']//p[contains(text(),'Blue Top')]")
    public WebElement productNameinSearch;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    public WebElement productCategory;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    public WebElement productPrice;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-details']//p[2]")
    public WebElement productAvailability;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),' New')]")
    public WebElement productCondition;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),' Polo')]")
    public WebElement productBrand;

    @CacheLookup
    @FindBy(id = "search_product")
    public WebElement searchProductBox;

    @CacheLookup
    @FindBy(id = "submit_search")
    public WebElement submitSearchButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='overlay-content']//a[contains(@class,'add-to-cart')]")
    public List<WebElement> addToCartButtons;

    @CacheLookup
    @FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
    public WebElement firstAddtocartProductButton;

    @CacheLookup
    @FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]")
    public WebElement secondAddtocartProductButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    public WebElement continueShoppingButton;

    @CacheLookup
    @FindBy(xpath = "//u[.='View Cart']")
    public WebElement viewCartButton;

    @CacheLookup
    @FindBy(xpath = "//h2[.='Brands']")
    public WebElement brandsText;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    public WebElement poloButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")
    public WebElement poloText;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement hnmButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - H&M Products']")
    public WebElement hnmText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Blue Top')]")
    public WebElement productNameInCart;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'Rs. 500')]")
    public WebElement priceInCart;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[@id='product-1']/td[4]/button[1]")
    public WebElement quantityInCart;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'Rs. 500')]")
    public WebElement totalInCart;

    public void clickProductsButton() {
        log.info("Click Products Button" + productsButton.toString());
        clickOnElement(productsButton);
    }

    public String verifyAllProductsText() {
        log.info("Verify all Products Text" + allProductsText.toString());
        return getTextFromElement(allProductsText);
    }

    public void clickFirstViewProductButton() {
        log.info("Click first View Product Button" + firstViewProductButton.toString());
        mouseHoverToElementAndClick(firstViewProductButton);
    }

    public void clickSecondViewProductButton() {
        log.info("Click second View Product Button" + secondViewProductButton.toString());
        mouseHoverToElementAndClick(secondViewProductButton);
    }

    public String verifyProductName() {
        log.info("Verify product Name Text" + productName.toString());
        return getTextFromElement(productName);
    }

    public String verifyProductNameInSearch() {
        log.info("Verify product Name in Search" + productNameinSearch.toString());
        return getTextFromElement(productNameinSearch);
    }

    public String verifyProductCategory() {
        log.info("Verify product Category Text" + productCategory.toString());
        return getTextFromElement(productCategory);
    }

    public String verifyProductPrice() {
        log.info("Verify product Price Text" + productPrice.toString());
        return getTextFromElement(productPrice);
    }

    public String verifyProductAvailability() {
        log.info("Verify product Availability Text" + productAvailability.toString());
        return getTextFromElement(productAvailability);
    }

    public String verifyProductCondition() {
        log.info("Verify product Condition Text" + productCondition.toString());
        return getTextFromElement(productCondition);
    }

    public String verifyProductBrand() {
        log.info("Verify productBrand Text" + productBrand.toString());
        return getTextFromElement(productBrand);
    }

    public void searchProductBoxText(String searchProductBoxText) {
        log.info("Enter search Product Box Text." + searchProductBox);
        sendTextToElement(searchProductBox, searchProductBoxText);
    }

    public void clickSubmitSearchButton() {
        log.info("Click submit SearchButton" + submitSearchButton.toString());
        clickOnElement(submitSearchButton);
    }

    public void clickAddToCartButtons() {
        log.info("Click add To Cart Buttons" + addToCartButtons.toString());
        clickOnElement((WebElement) addToCartButtons);

    }

    public void clickFirstAddToCartProductButton() {
        log.info("Click first Addtocart Product Button" + firstAddtocartProductButton.toString());
        mouseHoverToElementAndClick(firstAddtocartProductButton);
    }

    public void clickSecondAddToCartButton() {
        log.info("Click second Addtocart Product Button" + secondAddtocartProductButton.toString());
        mouseHoverToElementAndClick(secondAddtocartProductButton);
    }

    public void clickContinueShoppingButton() {
        log.info("Click continue Shopping Button" + continueShoppingButton.toString());
        clickOnElement(continueShoppingButton);
    }

    public void clickViewCartButton() {
        log.info("Click view Cart Button" + viewCartButton.toString());
        clickOnElement(viewCartButton);
    }

    public String verifyBrandsText() {
        log.info("Verify brands Text" + brandsText.toString());
        return getTextFromElement(brandsText);
    }

    public void clickPoloButton() {
        log.info("Click polo Button" + poloButton.toString());
        clickOnElement(poloButton);
    }

    public String verifyPoloText() {
        log.info("Verify polo Text" + poloText.toString());
        return getTextFromElement(poloText);
    }

    public void clickhnmButton() {
        log.info("Click hnm Button" + hnmButton.toString());
        clickOnElement(hnmButton);
    }

    public String verifyHnmText() {
        log.info("Verify hnm Text" + hnmText.toString());
        return getTextFromElement(hnmText);
    }

    public String verifyProductNameInCart() {
        log.info("verify Product Name in Cart" + productNameInCart.toString());
        return getTextFromElement(productNameInCart);
    }

    public String verifyPriceInCart() {
        log.info("verify Price in Cart" + priceInCart.toString());
        return getTextFromElement(priceInCart);
    }

    public String verifyQuantityInCart() {
        log.info("verify quantity in Cart" + quantityInCart.toString());
        return getTextFromElement(quantityInCart);
    }

    public String verifyTotalInCart() {
        log.info("verify Total in Cart" + totalInCart.toString());
        return getTextFromElement(totalInCart);
    }

}
