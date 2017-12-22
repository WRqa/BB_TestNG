package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagerDashboard {
    WebDriver driver;
    WebDriverWait wait;

    public ManagerDashboard(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 30, 500);
    }

    public void clickSearchButton() {
        driver.findElement(By.id("search")).click();
    }

    private void clickBuildingsForSale() {
        driver.findElement(By.linkText("Buildings for Sale")).click();}

    private void selectBuildginsUnderReviewItem() {
        driver.findElement(By.linkText("Buildings Under Review")).click();}

    private void clickApprovedAssetsList() {
        driver.findElement(By.linkText("Approved Buildings  List")).click();}

    private void clickTrades() {
        driver.findElement(By.linkText("Trades")).click();}

    private void clickSoldOutAssetsList() {
        driver.findElement(By.linkText("Sold Out Assets List")).click();}

    private void clickInvestment() {
        driver.findElement(By.linkText("Investment")).click();}

    private void clickInvestmentList() {
        driver.findElement(By.linkText("Investment List")).click();}

    private void clickUsers() {
        driver.findElement(By.linkText("Users")).click();}

    private void clickUserList() {
        driver.findElement(By.linkText("User List")).click();}

    private void clickSubscriptionsList() {
        driver.findElement(By.linkText("Subscriptions List")).click();}

    private void clickTransaction() {
        driver.findElement(By.linkText("Transaction")).click();}

    private void clickTransactionList() {
        driver.findElement(By.linkText("Transaction List")).click();}

    private void clickPromo() {
        driver.findElement(By.linkText("Promo")).click();}

    private void clickPromoCodeList() {
        driver.findElement(By.linkText("Promo Code List")).click();}

    private void clickComment() {
        driver.findElement(By.linkText("Comments")).click();}

    private void clickCommentList() {
        driver.findElement(By.linkText("Comments List")).click();}

    private void clickTopList() {
        driver.findElement(By.linkText("Top List")).click();}

    private void clickTopInvestors() {
        driver.findElement(By.linkText(" Top Investors")).click();}

    private void clickTopReferrals() {
        driver.findElement(By.linkText(" Top Referrals")).click();}

    private void clickTopSellers() {
        driver.findElement(By.linkText(" Top Sellers")).click();}

    private void clickEventLog() {
        driver.findElement(By.linkText("Event Log")).click();}

    private void clickEventsList() {
        driver.findElement(By.linkText("Events List")).click();}


    public BuildingsUnderReview openBuildingsUnderReviewPage(){
        clickBuildingsForSale();
        selectBuildginsUnderReviewItem();
        return new BuildingsUnderReview(driver);
    }

    public ApprovedAssets openApprovedAssetsList(){
        clickBuildingsForSale();
        clickApprovedAssetsList();
        return new ApprovedAssets(driver);
    }

    public void openTrades(){
        new MainPage(driver).clickDashboard();
        clickBuildingsForSale();
        clickTrades();}

    public void openSoldOutAssetsList(){
        new MainPage(driver).clickDashboard();
        clickBuildingsForSale();
        clickSoldOutAssetsList();}

    public void openInvestmentList(){
        new MainPage(driver).clickDashboard();
        clickInvestment();
        clickInvestmentList();}

    public UserList openUserList(){
        clickUsers();
        clickUserList();
        return new UserList(driver);
    }

    public void openSubscriptionsList(){
        new MainPage(driver).clickDashboard();
        clickUsers();
        clickSubscriptionsList();}

    public void openTransactionList(){
        new MainPage(driver).clickDashboard();
        clickTransaction();
        clickTransactionList();}

    public PromoCodeList openPromoCodeList(){
        clickPromo();
        clickPromoCodeList();
        return new PromoCodeList(driver);
    }

    public void openCommentList(){
        new MainPage(driver).clickDashboard();
        clickComment();
        clickCommentList();}

    public void openTopInvestors(){
        new MainPage(driver).clickDashboard();
        clickTopList();
        clickTopInvestors();
    }

    public void openTopReferrals(){
        new MainPage(driver).clickDashboard();
        clickTopList();
        clickTopReferrals();}

    public void openTopSellers(){
        new MainPage(driver).clickDashboard();
        clickTopList();
        clickTopSellers();}

    public void openEventsList(){
        new MainPage(driver).clickDashboard();
        clickEventLog();
        clickEventsList();}
}

