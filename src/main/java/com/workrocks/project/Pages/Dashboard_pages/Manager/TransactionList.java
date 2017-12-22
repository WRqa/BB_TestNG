package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransactionList extends ManagerDashboard {
    Pages webpages = new Pages(driver);

    public TransactionList(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "UserName") private WebElement user;
    @FindBy(id = "Amount") private WebElement amount;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement transactionNumber;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]") private WebElement amountData;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]/span") private WebElement typeIcon;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]/a/ins") private WebElement userName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[5]") private WebElement dateOfCreation;

    private void clickStatusDropdown(){
        driver.findElement(By.id("select2-TransactionType-container")).click();}


    private void setUser(String user){
        this.user.clear();
        this.user.sendKeys(user);}

    private void setAmount (String amount){
        this.amount.clear();
        this.amount.sendKeys(amount);}

    public String getAmount(){
        return amountData.getText().replaceAll(",", "").replaceAll("$" , "");}

    public String getUserName(){
        return userName.getText();}

    public String getType(){
        return typeIcon.getText();}



    public void searchTransactionByUserName(String userName){
        setUser(userName);
        clickSearchButton();
        //wait.until(ExpectedConditions.textToBePresentInElement(this.userName, userName));
    }

    public void searchTransactionByAmount(String amount){
        setAmount(amount);
        clickSearchButton();
        //wait.until(ExpectedConditions.textToBePresentInElement(amountData, "000"));
    }

    public void selectTransactionTypeInDropdown(){
        clickStatusDropdown();
        webpages.RobotAction().selectItemInDropdown();
        clickSearchButton();
        //wait.until(ExpectedConditions.visibilityOf(typeIcon));
    }
}

