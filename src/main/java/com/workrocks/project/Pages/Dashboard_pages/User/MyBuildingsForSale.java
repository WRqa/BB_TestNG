package com.workrocks.project.Pages.Dashboard_pages.User;


import com.workrocks.project.Pages.Header_Pages.SellAssetTabs.AddressTab;
import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyBuildingsForSale extends Pages{

    WebDriver driver;

    public MyBuildingsForSale(WebDriver driver){
        super(driver);
    }

    @FindBy (xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[6]/span") private WebElement status;


    public void clickManageIcon() {
        driver.findElement(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]/a[1]/i")).click();}

    public void clickDeleteIcon() {
        driver.findElement(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]/a[2]/i")).click();}

    public String getStatus(){
        return status.getText();}

    public AddressTab openRejectedBuilding() {
        if (getStatus().equals("Reject")){
            clickManageIcon();
        } else {
            System.out.println("Error");
        }
        return new AddressTab(driver);
    }
}
