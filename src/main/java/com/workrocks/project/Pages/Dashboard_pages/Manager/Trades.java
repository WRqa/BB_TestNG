package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Trades extends ManagerDashboard {
    Pages webpages = new Pages(driver);

    public Trades(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "BuildingName") private WebElement buildingNameField;
    @FindBy(id = "Seller") private WebElement seller;
    @FindBy(id = "select2-statusSelectList-container") private WebElement phasesDropdown;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement assetNumber;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]/a") private WebElement buildingName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]/a") private WebElement sellerName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]") private WebElement bitsAmount;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[5]/a/span") public WebElement statusIcon;

    private void clickStatusDropdown(){phasesDropdown.click();}


    private void setBuildingName(String buildingName){
        this.buildingNameField.clear();
        this.buildingNameField.sendKeys(buildingName);}

    private void setSellerName (String seller){
        this.seller.clear();
        this.seller.sendKeys(seller);}

    public String getBuildingName(){
        return this.buildingName.getText();}

    public String getSellerName(){
        return this.sellerName.getText();}

    public String getStatus(){
        return  statusIcon.getText();}




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

    public void selectPhaseInDropdown(){
        clickStatusDropdown();
        webpages.RobotAction().selectItemInDropdown();
        clickSearchButton();
    }
}
