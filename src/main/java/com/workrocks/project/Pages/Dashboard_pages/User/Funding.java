package com.workrocks.project.Pages.Dashboard_pages.User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Funding extends UserDashboard{

    public Funding(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "AccountNumber") private WebElement accountNumber;
    @FindBy(id = "BankName") private WebElement bankName;
    @FindBy(id = "Amount") private WebElement amount;

    private void clickOkButton(){
        driver.findElement(By.xpath("//div[@class='box-footer clearfix']/button")).click();}

    private void setAccountNumber(String accountNumber){
        this.accountNumber.clear();
        this.accountNumber.sendKeys(accountNumber);}

    private void setBankName(String bankName){
        this.bankName.clear();
        this.bankName.sendKeys(bankName);}

    private void setAmount(String amount){
        this.amount.clear();
        this.amount.sendKeys(amount);}

    public void addFunds(String accountNumber, String bankName, String amount){
        //clickFundingButton();
        setAccountNumber(accountNumber);
        setBankName(bankName);
        setAmount(amount);
        clickOkButton();
    }
}
