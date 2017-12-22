package com.workrocks.project.Pages.Header_Pages;

import com.workrocks.project.Pages.Asset_details_page.BuildingDetails;
import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildingsList extends Pages{

    public static String nameOfFirstAsset;

    public BuildingsList(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='newacquisitions-asset-list']/section[1]/div[1]/div[1]/div[1]/div[2]/h4/a") private WebElement assetName;
    @FindBy(xpath = "//div[@id='newacquisitions-asset-list']/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/a") private WebElement favouriteIcon;

    public void clickDetailsButton(int itemByList) {
        driver.findElement(By.xpath("//div[@id='newacquisitions-asset-list']/section[" + itemByList + "]/div/div/div/div[3]/div[3]/a")).click();
    }

    public void clickDetailsButtonOnTrades(int itemByList){
        driver.findElement(By.xpath("//div[@id='trades-asset-list']/section[" + itemByList + "]/div/div/div/div[3]/div[3]/a")).click();
    }

    private void clickRadioBtn11() {driver.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[2]/div[1]/div/div[1]/div/ins")).click();}
    private void clickRadioBtn14() {driver.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[2]/div[1]/div/div[4]/div/ins")).click();}
    private void clickRadioBtn21() {driver.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[3]/div[1]/div/div[1]/div/ins")).click();}
    private void clickRadioBtn26() {driver.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[3]/div[1]/div/div[6]/div/ins")).click();}
    private void clickRadioBtn31() {driver.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[2]/div[2]/div/div[1]/div/ins")).click();}
    private void clickRadioBtn34() {driver.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[2]/div[2]/div/div[4]/div/ins")).click();}
    private void clickRadioBtn41() {driver.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[3]/div[2]/div/div[1]/div/ins")).click();}
    private void clickRadioBtn44() {driver.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[3]/div[2]/div/div[4]/div/ins")).click();}
    private void clickSaveQuestionnaireButton() {driver.findElement(By.xpath("//*[@id=\"questionnaire\"]/div[4]/div/button")).click();}
    private void clickFavoriteAsset(){favouriteIcon.click();}

    public void setQuestionnaire(){
        clickRadioBtn14();
        clickRadioBtn11();
        clickRadioBtn26();
        clickRadioBtn21();
        clickRadioBtn34();
        clickRadioBtn31();
        clickRadioBtn44();
        clickRadioBtn41();
        clickSaveQuestionnaireButton();
        //wait.until(ExpectedConditions.visibilityOf(assetName));
    }

    private void getAssetName(){
        nameOfFirstAsset = assetName.getText();}

    public void checkFavouritesAsset(){
        if (favouriteIcon.getAttribute("title").equals("Delete from My Favorites")){
            getAssetName();
        }else{
            getAssetName();
            clickFavoriteAsset();
        }
    }

    public BuildingDetails openBuildingDetailsPage(int itemByList_1_or_3_or_5_or_7) {
        clickDetailsButton(itemByList_1_or_3_or_5_or_7);
        return new BuildingDetails(driver);
    }

    public BuildingDetails openTradeDetailsPage(int itemByList_1_or_3_or_5_or_7){
        clickDetailsButtonOnTrades(itemByList_1_or_3_or_5_or_7);
        return new BuildingDetails(driver);
    }
}

