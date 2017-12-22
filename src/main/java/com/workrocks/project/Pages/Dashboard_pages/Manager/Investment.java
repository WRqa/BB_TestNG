package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Investment extends ManagerDashboard {
    Pages webpages = new Pages(driver);

    public Investment(WebDriver driver) {super(driver);}


    @FindBy(id = "BuildingName") private WebElement buildingNameField;
    @FindBy(id = "Seller") private WebElement seller;
    @FindBy(id = "Investor") private WebElement investor;

    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement assetNumber;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]/a") private WebElement buildingName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]/a") private WebElement investorName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]") private WebElement investmentAmount;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[5]/a") private WebElement assetStatus;


    private void clickStatusDropdown() {
        driver.findElement(By.id("select2-statusSelectList-container")).click();}


    private void setBuildingNameField(String buildingName){
        this.buildingNameField.clear();
        this.buildingNameField.sendKeys(buildingName);}

    private void setInvestorName(String investor){
        this.investor.clear();
        this.investor.sendKeys(investor);}

    public String getStatus(){
        return assetStatus.getText();}

    public String getBuildingName(){
        return this.buildingName.getText();}

    public String getInvestorName(){
        return this.investorName.getText();}




    public void searchAssetByName(String buildingName){
        setBuildingNameField(buildingName);
        clickSearchButton();
        //wait.until(ExpectedConditions.textToBePresentInElement(this.buildingName, buildingName));
    }

    public void searchAssetByInvestor(String investorName){
        setInvestorName(investorName);
        clickSearchButton();
        //wait.until(ExpectedConditions.textToBePresentInElement(this.investorName, investorName));
    }

    public void selectInvestmentStatusInDropdown(){
        clickStatusDropdown();
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.waitForIdle();

        } catch (AWTException e) {
            e.printStackTrace();
        }
        clickSearchButton();
        //wait.until(visibilityOf(assetStatus));
        //wait.until(presenceOfElementLocated(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr[1]/td[5]/a")));
    }

}

