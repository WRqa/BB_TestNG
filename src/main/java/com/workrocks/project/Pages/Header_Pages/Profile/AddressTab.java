package com.workrocks.project.Pages.Header_Pages.Profile;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressTab extends MainInfo{

    public AddressTab(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@class='select2-search__field']") private WebElement stateField;
    @FindBy(id = "city") private WebElement city;
    @FindBy(id = "address1") private WebElement address1;
    @FindBy(id = "address2") private WebElement address2;
    @FindBy(id = "zip") private WebElement zip;

    private void clickState(){
        driver.findElement(By.id("select2-ProvinceId-container")).click();
    }

    private void clickSaveButton() {
        driver.findElement(By.xpath("//div[@data-eui-tab='2']/descendant::button")).click();
    }

    private void setState(String state){
        this.stateField.clear();
        this.stateField.sendKeys(state + Keys.ENTER);
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

    public String getState() {
        return driver.findElement(By.id("select2-ProvinceId-container")).getAttribute("title");
    }

    public String getCity() {
        return city.getAttribute("value");
    }

    public String getAddress1() {
        return address1.getAttribute("value");
    }

    public String getAddress2() {
        return address2.getAttribute("value");
    }

    public String getZip() {
        return zip.getAttribute("value");
    }


    public void setAddressData(String state, String city, String address1, String address2, String zip){
        clickState();
        setState(state);
        setCity(city);
        setAddress1(address1);
        setAddress2(address2);
        setZip(zip);
        clickSaveButton();
    }


}
