package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Header_Pages.SellAssetTabs.AddressTab;
import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildingsUnderReview extends ManagerDashboard {

    public BuildingsUnderReview(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "BuildingName") private WebElement buildingNameField;
    @FindBy(id = "Seller") private WebElement seller;

    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement assetNumber;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]/a") private WebElement buildingName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]") private WebElement address;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]/a") private WebElement sellerName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[5]") private WebElement expectedReturn;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[6]") private WebElement salePrice;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]") private WebElement dateOfCreation;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[8]") private WebElement dateStatusChange;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[9]/span") private WebElement status;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[10]/a") private WebElement checkAndApprove;

    private void clickCheckAndApprove(){
        checkAndApprove.click();
    }

    private void setBuildingName(String buildingName){
        buildingNameField.clear();
        buildingNameField.sendKeys(buildingName);}

    private void setSellerName(String sellerName){
        seller.clear();
        seller.sendKeys(sellerName);}

    public String getBuildingName(){
        return buildingName.getText();}

    public String getSellerName(){
        return sellerName.getText();}

    public String getStatus(){
        return status.getText();}



    public void searchAssetByName(String buildingName){
        setBuildingName(buildingName);
        clickSearchButton();
        //wait.until(ExpectedConditions.textToBePresentInElement(this.buildingName, buildingName));
    }

    public void searchAssetBySeller(String sellerName){
        setSellerName(sellerName);
        clickSearchButton();
        //wait.until(ExpectedConditions.textToBePresentInElement(this.sellerName, sellerName));
    }

    public AddressTab openBuildingForReview(){
        clickCheckAndApprove();
        return new AddressTab(driver);
    }

}

