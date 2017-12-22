package com.workrocks.project.Pages.Dashboard_pages.User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvestmentsByBuilding extends UserDashboard {

    public InvestmentsByBuilding(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "html/body/div[1]/div[1]/section/div/form/div/div/div[2]/div/div/div/table/tbody/tr[2]/td/div[1]/div/div/ins") private WebElement fixedPriceRadio;
    @FindBy (xpath = "html/body/div[1]/div[1]/section/div/form/div/div/div[2]/div/div/div/table/tbody/tr[2]/td/div[2]/div/div/ins") private WebElement auctionRadio;
    @FindBy (id = "BitsAmount") private WebElement bitsForSale;
    @FindBy (id = "IsStartNow") private WebElement startNowCheckbox;
    @FindBy (id = "StartDate") private WebElement startDate;
    @FindBy (id = "IsGoodUntilCancelled") private WebElement goodUntilCancelledCheckbox;
    @FindBy (id = "EndDate") private WebElement endDate;
    @FindBy (id = "Price") private WebElement price;
    @FindBy (id = "BidStep") private WebElement bidStep;
    @FindBy (id = "StartPrice") private WebElement startPrice;
    @FindBy (id = "EndPrice") private WebElement buyNowPrice;
    @FindBy (id = "ReserveBid") private WebElement reserveBid;

    private void clickFixedPriceRadio() {
        fixedPriceRadio.click();
    }

    private void clickAuctionRadio(){
        auctionRadio.click();
    }

    private void clickSellMyBITsButton(){
        driver.findElement(By.id("sellMyBITs")).click();
    }

    private void clickBITsForSalePlus(){
        driver.findElement(By.id("plus")).click();
    }

    private void clickBITsForSaleMinus(){
        driver.findElement(By.id("minus")).click();
    }

    private void clickBidStepPlus(){
        driver.findElement(By.xpath("html/body/div[1]/div[1]/section/div/form/div/div/div[2]/div/div/div/table/tbody/tr[4]/td/div/div/div/span[2]/i")).click();
    }

    private void clickBidStepMinus(){
        driver.findElement(By.xpath("html/body/div[1]/div[1]/section/div/form/div/div/div[2]/div/div/div/table/tbody/tr[4]/td/div/div/div/span[2]/i")).click();
    }

    private void clickStartNowCheckbox(){startNowCheckbox.click();
    }

    private void clickGoodUntilCancelledCheckbox(){goodUntilCancelledCheckbox.click();
    }

    private void clickSubmitCheckbox(){
        driver.findElement(By.id("IReviewedAndAgreeToTermsOfServiceAndPrivacyPolicy")).click();
    }

    private void clickOkButton(){
        driver.findElement(By.id("addOrUpdateResellAssetBtn")).click();
    }

    private void setBITSForSale(String bitsForSale){
        this.bitsForSale.clear();
        this.bitsForSale.sendKeys(bitsForSale);
    }

    private void setBidStep(String bidStep){
        this.bidStep.clear();
        this.bidStep.sendKeys(bidStep);
    }

    private void setStartDate(String startDate){
        this.startDate.clear();
        this.startDate.sendKeys(startDate);
    }

    private void setEndDate(String endDate){
        this.endDate.clear();
        this.endDate.sendKeys(endDate);
    }

    private void setPrice(String price){
        this.price.clear();
        this.price.sendKeys(price);
    }

    private void setStartPrice(String startPrice){
        this.startPrice.clear();
        this.startPrice.sendKeys(startPrice);
    }

    private void setReserveBid(String reserveBid){
        this.reserveBid.clear();
        this.reserveBid.sendKeys(reserveBid);
    }

    private void setBuyNowPrice(String buyBowPrice){
        buyNowPrice.clear();
        buyNowPrice.sendKeys(buyBowPrice);
    }

    public void createFixedPriceTrade(String bitsForSale, String startDate, String endDate, String price) throws InterruptedException {
        clickSellMyBITsButton();
        Thread.sleep(1000);
        clickAuctionRadio();
        clickFixedPriceRadio();
        setBITSForSale(bitsForSale);
        // clickBITsForSalePlus();
        // clickBITsForSaleMinus();
        setStartDate(startDate);
        clickStartNowCheckbox();
        setEndDate(endDate);
        clickGoodUntilCancelledCheckbox();
        setPrice(price);
        clickSubmitCheckbox();
        clickOkButton();
    }

    public void createAuctionTrade(String bitsForSale, String bidStep, String startDate, String startPrice,
                                   String reserveBid, String buyNowPrice) throws InterruptedException {
        clickSellMyBITsButton();
        Thread.sleep(1000);
        clickAuctionRadio();
        setBITSForSale(bitsForSale);
        setBidStep(bidStep);
        setStartDate(startDate);
        clickStartNowCheckbox();
        clickGoodUntilCancelledCheckbox();
        setStartPrice(startPrice);
        setReserveBid(reserveBid);
        setBuyNowPrice(buyNowPrice);
        clickSubmitCheckbox();
        clickOkButton();
    }
}
