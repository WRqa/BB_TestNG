package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressTab extends Pages{

    public AddressTab(WebDriver driver){
        super(driver);
    }

    @FindBy (xpath = "/html/body/span/span/span[1]/input") private WebElement state;
    @FindBy (id = "City") private WebElement city;
    @FindBy (id = "Address1") private WebElement address1;
    @FindBy (id = "Address2") private WebElement address2;
    @FindBy (id = "Zip") private WebElement zip;

    public void clickSaveAndNextButton(){
        driver.findElement(By.id("saveNext")).click();
    }

    public void clickSaveAndFinishButton(){
        driver.findElement(By.id("saveFinish")).click();
    }

    public void clickApproveButton(){
        driver.findElement(By.xpath("//button[@value='Approve']")).click();
    }

    public void clickRejectButton(){
        driver.findElement(By.xpath("//button[@value='Reject']")).click();
    }

    private void clickStateDropdown(){
        driver.findElement(By.id("select2-ProvinceId-container")).click();
    }

    private void clickManageTab(){
        driver.findElement(By.linkText("Manage")).click();
    }

    private void setState(String state){
        this.state.clear();
        this.state.sendKeys(state + Keys.ENTER);
    }

    private void setCity(String city){
        this.city.clear();
        this.city.sendKeys(city);
    }

    private void setAddress1(String address1){
        this.address1.clear();
        this.address1.sendKeys(address1);
    }

    private void setAddress2(String address2){
        this.address2.clear();
        this.address2.sendKeys(address2);
    }

    private void setZip(String zip){
        this.zip.clear();
        this.zip.sendKeys(zip);
    }

    public String getCityRequiredMessage(){
        return driver.findElement(By.cssSelector("fieldset > div:nth-child(5) > span > span")).getText();
    }

    public String getAddressRequiredMessage(){
        return driver.findElement(By.cssSelector("fieldset > div:nth-child(6) > span > span")).getText();
    }

    public String getZipRequiredMessage(){
        return driver.findElement(By.cssSelector("fieldset > div:nth-child(8) > span > span")).getText();
    }

    public ManageTab openManageTab() {
        clickManageTab();
        return new ManageTab(driver);
    }

    public AgreeTab openAgreeTab(){
        driver.findElement(By.linkText("Agree")).click();
        return new AgreeTab(driver);
    }

    public BuildingInfoTab setAddressData(String state, String city, String address1, String address2, String ZIP) {
        clickStateDropdown();
        setState(state);
        setCity(city);
        setAddress1(address1);
        setAddress2(address2);
        setZip(ZIP);
        clickSaveAndNextButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new BuildingInfoTab(driver);
    }

    public void approveBuilding() {
        clickApproveButton();
    }
}
