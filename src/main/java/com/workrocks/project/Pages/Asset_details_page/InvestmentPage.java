package com.workrocks.project.Pages.Asset_details_page;

import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvestmentPage extends Pages{

    public InvestmentPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "Amount") private WebElement investmentAmount;
    @FindBy(name = "PromoCode") private WebElement promoCode;
    @FindBy(id = "SignaturePrintName") private WebElement printName;
    @FindBy(id = "Subtotal") private WebElement subtotal;
    @FindBy(id = "FeeAmount") private WebElement feeAmount;
    @FindBy(id = "DiscountAmount") private WebElement discountAmount;
    @FindBy(id = "Total") private WebElement total;
    @FindBy(css = ".col-sm-4.invoice-col>a>ins") private WebElement assetId;
    @FindBy(css = ".page-header") private WebElement investmentTitle;
    @FindBy(xpath = "//div[@class='row']/div[1]/div[1]/div[1]/span/span") public WebElement confirmationText;



    private void clickPlusIcon() {
        driver.findElement(By.id("plus")).click();
    }

    private void clickMinusIcon() {
        driver.findElement(By.id("minus")).click();
    }

    private void clickDiscountRadio() {
        driver.findElement(By.id("Discount")).click();}

    private void clickPromoCodeRadio() {
        driver.findElement(By.xpath("//*[@id='promoCode']/div/ins")).click();
    }

    public void clickMakeInvestment() {
        driver.findElement(By.id("investment")).click();
    }

    private void clickBuyButton(){
        driver.findElement(By.xpath("//div[@class='col-xs-12']/button")).click();}

    private void clickUseButton() {
        driver.findElement(By.xpath("//td[@class='promoWrapper']/div[1]/span")).click();}


    private void setInvestmentAmount(String amount){
        investmentAmount.clear();
        investmentAmount.sendKeys(amount);}

    private void setPromoCodeData(String promoCode){
        this.promoCode.clear();
        this.promoCode.sendKeys(promoCode);}

    private void setUserName(String userName){
        printName.clear();
        printName.sendKeys(userName);}

    public String getSubtotal(){
        return subtotal.getText();
    }

    public String getFee(){return feeAmount.getText();}

    public String getDiscount(){
        return discountAmount.getText();
    }

    public String getTotal(){
        return total.getText();
    }

    public String getAssetID(){
        return assetId.getText();
    }

    public String getInvestmentTitle(){
        return investmentTitle.getText();
    }


    public void setInvestDataWithoutDiscount(String amount, String name){
        setInvestmentAmount(amount);
        clickPlusIcon();
        clickMinusIcon();
        clickPlusIcon();
        setUserName(name);
    }

    public void setInvestDataWithPromoCode(String amount, String promoCode, String name) {
        setInvestmentAmount(amount);
        clickPlusIcon();
        clickMinusIcon();
        clickPlusIcon();
        clickPromoCodeRadio();
        setPromoCodeData(promoCode);
        clickUseButton();
    }

    public void setDiscountPromoCode(String priceDiscount){
        clickPromoCodeRadio();
        setPromoCodeData(priceDiscount);
        clickUseButton();
    }

    public void setFreeDiscountPromoCode(String freeDiscount){
        clickPromoCodeRadio();
        setPromoCodeData(freeDiscount);
        clickUseButton();
    }

    public void setFixedPriceAndBuyBITs(String name){
        setUserName(name);
        clickBuyButton();
    }



}
