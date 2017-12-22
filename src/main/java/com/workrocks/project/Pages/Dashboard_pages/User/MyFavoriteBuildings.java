package com.workrocks.project.Pages.Dashboard_pages.User;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyFavoriteBuildings extends UserDashboard{

    public MyFavoriteBuildings(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[2]/a") private WebElement assetName;
    @FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[3]") private WebElement address;
    @FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[4]") private WebElement salePrice;
    @FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[5]") private WebElement expectedReturn;
    @FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[6]") private WebElement estimatedValue;
    @FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[7]") private WebElement phase;

    public String getAssetName(){
        return assetName.getText();
    }


}
