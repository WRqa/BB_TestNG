package com.workrocks.project.Pages.Dashboard_pages.User;

import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDashboard extends Pages{
    WebDriver driver;

    public UserDashboard(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "viewAll") private WebElement viewAllHoldings;
    @FindBy(xpath = "//div[@class='row']/div[5]/div[1]/div[1]/h3") private WebElement cashValue;


    private void clickViewAllTransactionsButton() {
        driver.findElement(By.linkText("View All Transactions")).click();}

    private void clickViewAllMyBITsForSaleButton() {
        driver.findElement(By.linkText("View All My Buildings for Sale")).click();}

//    private void clickViewAllDividends(){
//        driver.findElement(By.xpath("//section[@class='content']/div[4]/section[2]/div[1]/div[2]/a")).click();}
//
//    private void clickViewAllMyFavouritesAssets(){
//        driver.findElement(By.xpath("//section[@class='content']/div[5]/section[2]/div[1]/div[3]/a")).click();}

    private void clickViewAllHoldingsButton(){
        driver.findElement(By.id("viewAll")).click();}

//    void clickFundingButton(){
//        driver.findElement(By.xpath("//div[@class='row']/div[5]/div[1]/a[1]")).click();}
//
//    public String getCashValue(){
//        return cashValue.getText();
//    }
//
    public TransactionList openTransactionsList(){
        clickViewAllTransactionsButton();
        return new TransactionList(driver);
    }

    public MyBuildingsForSale openMyBuildingsForSale(){
        clickViewAllMyBITsForSaleButton();
        return new MyBuildingsForSale(driver);
    }

//    public void openDividendsList(){
//      //  webpages.MainPage().clickDashboard();
//        clickViewAllDividends();
//    }
//
//    public void openViewAllMyFavouritesAssets(){
//       // webpages.MainPage().clickDashboard();
//        clickViewAllMyFavouritesAssets();
//    }

    public MyBITsHoldings openMyBitsHoldings(){
        clickViewAllHoldingsButton();
        return new MyBITsHoldings(driver);
    }
}
