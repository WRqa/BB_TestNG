package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsList extends ManagerDashboard {
    Pages webpages = new Pages(driver);

    public EventsList(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "UserName") private WebElement userNameField;
    @FindBy(id = "IP") private WebElement ipField;
    @FindBy(id = "DateRangePicker") private WebElement calendar;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement eventNumber;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]") private WebElement dateAndTime;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]") private WebElement ip;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]/a") private WebElement userName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[5]") private WebElement managerEmail;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[6]") private WebElement action;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]/a/ins") private WebElement object;


    private void setUserName(String userName){
        this.userNameField.clear();
        this.userNameField.sendKeys(userName);}

    private void setIp(String ip){
        this.ipField.clear();
        this.ipField.sendKeys(ip);}

    public String getUserName(){
        return userName.getText();}

    public String getIP(){
        return ip.getText();}




    public void searchEventByUserName(String userName){
        setUserName(userName);
        clickSearchButton();
     //   wait.until(ExpectedConditions.textToBePresentInElement(this.userName, userName));
    }

    public void searchEventByIP(String ip){
        setIp(ip);
        clickSearchButton();
     //   wait.until(ExpectedConditions.textToBePresentInElement(this.ip, ip));
    }
}
