package com.workrocks.project.Pages.Dashboard_pages.Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Date;


public class PromoCodeList extends ManagerDashboard {
    Date today = new Date();
    SimpleDateFormat sdf;
    public static String fixedBonus = "";
    public static String purchasePriceDiscount = "";
    public static String freeDiscount = "";

    public PromoCodeList(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "DateRangePicker") private WebElement calendar;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement codeNumber;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]") private WebElement promoCode;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]") private WebElement startDate;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]") private WebElement expiredDate;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[5]") private WebElement promoType;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[6]") private WebElement value;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]") private WebElement createdBy;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[8]") private WebElement used;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[9]") private WebElement usedBy;
    @FindBy(id = "promo-count") private WebElement quantityOfNewCode;
    @FindBy(id = "promo-start-date") private WebElement startPromoDate;
    @FindBy(id = "promo-expired-date") private WebElement expiredPromoDate;
    @FindBy(id = "promo-value") private WebElement promoValue;


    private void clickGenerateNewPromoCodesIcon(){
        driver.findElement(By.id("generatePromoCodes")).click();}

    private void clickFixedBonus(){
        driver.findElement(By.xpath("//div[@class='form-group icheck']/div[1]/ins")).click();}
    private void clickPurchasePriceDiscount(){
        driver.findElement(By.xpath("//div[@class='form-group icheck']/div[2]/ins")).click();}
    private void clickFreeDiscount(){
        driver.findElement(By.xpath("//div[@class='form-group icheck']/div[3]/ins")).click();}

    private void clickQuantityField(){quantityOfNewCode.click();}

    private void clickGenerate(){
        driver.findElement(By.id("genereateCodeBtn")).click();}


    private void setQuantityOfNewPromoCodes(String quantity){
        quantityOfNewCode.clear();
        quantityOfNewCode.sendKeys(quantity);}

    private void setStartDate(String startDate){
        startPromoDate.clear();
        startPromoDate.sendKeys(startDate);}

    private void setEndDate(String endDate){
        expiredPromoDate.clear();
        expiredPromoDate.sendKeys(endDate);}

    private void setPromoValue(String promoValue){
        this.promoValue.clear();
        this.promoValue.sendKeys(promoValue);}

    private String getDate(){
        sdf = new SimpleDateFormat("MM/dd/yyyy");
        return sdf.format(today);
    }

    public String getPromoType(){
        return promoType.getText();
    }


    public void createFixedBonus(String quantity, String promoValue){
        clickGenerateNewPromoCodesIcon();
        //wait.until(ExpectedConditions.visibilityOf(quantityOfNewCode));
        setQuantityOfNewPromoCodes(quantity);
        setStartDate(getDate());
        clickQuantityField();
        setEndDate(getDate());
        clickQuantityField();
        clickFixedBonus();
        setPromoValue(promoValue);
        clickGenerate();
        //wait.until(ExpectedConditions.textToBePresentInElement(promoType, "Fixed Bonus"));
        fixedBonus = promoCode.getText();
    }

    public void createPurchasePriceDiscount(String quantity, String promoValue){
        clickGenerateNewPromoCodesIcon();
        //wait.until(ExpectedConditions.visibilityOf(quantityOfNewCode));
        setQuantityOfNewPromoCodes(quantity);
        setStartDate(getDate());
        clickQuantityField();
        setEndDate(getDate());
        clickQuantityField();
        clickPurchasePriceDiscount();
        setPromoValue(promoValue);
        clickGenerate();
        //wait.until(ExpectedConditions.textToBePresentInElement(promoType, "Purchase Price Discount"));
        purchasePriceDiscount = promoCode.getText();
    }

    public void createFreeDiscount(String quantity){
        clickGenerateNewPromoCodesIcon();
        //wait.until(ExpectedConditions.visibilityOf(quantityOfNewCode));
        setQuantityOfNewPromoCodes(quantity);
        setStartDate(getDate());
        clickQuantityField();
        setEndDate(getDate());
        clickQuantityField();
        clickPurchasePriceDiscount();
        clickFreeDiscount();
        clickGenerate();
        //wait.until(ExpectedConditions.textToBePresentInElement(promoType, "Free Discount"));
        freeDiscount = promoCode.getText();
    }
}

