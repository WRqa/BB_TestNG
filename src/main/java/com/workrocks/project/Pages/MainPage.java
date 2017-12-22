package com.workrocks.project.Pages;

import com.workrocks.project.Pages.Header_Pages.BuildingsList;
import com.workrocks.project.Pages.Header_Pages.Profile.PersonalInformationTab;
import com.workrocks.project.Pages.Header_Pages.SellAssetTabs.AddressTab;
import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class MainPage extends Pages{

    public MainPage(WebDriver driver){
        super(driver);
    }

    public Login openLoginPage(){
        driver.findElement(By.id("loginLink")).click();
        return new Login(driver);
    }

    public CreateAccount openCreateAccountPage(){
        driver.findElement(By.id("registerLink")).click();
        return new CreateAccount(driver);
    }

    public void openProfileMenu() {
        driver.findElement(By.xpath("//li[@class='dropdown user user-menu']/a[1]/span")).click();
    }

    private void clickProfileButton() {
        driver.findElement(By.id("profile")).click();
    }

    private void clickSellDropdown() {
        driver.findElement(By.id("sell")).click();
    }

    private void clickInvestDropdown() {
        driver.findElement(By.id("invest")).click();
    }

    private void selectBuyBuildingsItem() {
        driver.findElement(By.id("buyBuildings")).click();
    }

    private void clickBuyBits(){
        driver.findElement(By.linkText("Buy Bits")).click();}

    private void selectYourBuildingItem() {
        driver.findElement(By.id("yourBuilding")).click();}

    public void clickDashboard(){
        driver.findElement(By.id("dashboard")).click();}

    private void clickSignOutButton() {
        driver.findElement(By.id("signOut")).click();}


    public PersonalInformationTab openUserProfile(){
        openProfileMenu();
        clickProfileButton();
        return new PersonalInformationTab(driver);
    }

    public AddressTab openSellAssetPage(){
        clickSellDropdown();
        selectYourBuildingItem();
        return new AddressTab(driver);
    }

    public BuildingsList openBuildingsList(){
        clickInvestDropdown();
        selectBuyBuildingsItem();
        return new BuildingsList(driver);
    }

    public BuildingsList openTradesList(){
        clickInvestDropdown();
        clickBuyBits();
        return new BuildingsList(driver);
    }

    public MainPage signOut(){
        openProfileMenu();
        clickSignOutButton();
        return this;
    }

    public void switchBetweenWindows(int windowNumber){
        ArrayList<Object> myHandles = new ArrayList<Object>(driver.getWindowHandles());
        driver.switchTo().window(String.valueOf(myHandles.get(windowNumber)));
    }
}






