package com.automationexcercise.pages;

import com.automationexcercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(CategoryProductPage.class.getName());

    public CategoryProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@href='#Women']")
    WebElement womenCategory;

    @CacheLookup
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    WebElement clickOnWomenDress;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement womenDressProductsText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement menCategory;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    WebElement tShirtsCategory;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Tshirts Products']")
    WebElement menTshirtsProductsText;

    @CacheLookup
    @FindBy(xpath = "//h2[.='Category']")
    WebElement categoryText;

    public void clickOnWomenDress() {
        log.info("Click on Women Dress category." + clickOnWomenDress.toString());
        clickOnElement(clickOnWomenDress);
    }

    public String verifyWomenDressProductsText() {
        log.info("Verify Woman's Dress text." + womenDressProductsText.toString());
        return getTextFromElement(womenDressProductsText);
    }

    public void clickWomenCategory() {
        log.info("Click on Women category." + womenCategory.toString());
        clickOnElement(womenCategory);
    }

    public void clickMenCategory() {
        log.info("Click on Men category." + menCategory.toString());
        clickOnElement(menCategory);
    }

    public void clickTshirtsCategory() {
        log.info("Click on Tshirt category." + tShirtsCategory.toString());
        clickOnElement(tShirtsCategory);
    }

    public String verifyMenTshirtsProductsText() {
        log.info("Verify Men Tshirts text." + menTshirtsProductsText.toString());
        return getTextFromElement(menTshirtsProductsText);
    }

    public String verifyCategoryText() {
        log.info("Verify Category text." + categoryText.toString());
        return getTextFromElement(categoryText);
    }
}
