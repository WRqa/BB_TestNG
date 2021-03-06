package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopSellers extends ManagerDashboard {
    Pages webpages = new Pages(driver);

    public TopSellers(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]") private WebElement userNumber;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]") private WebElement stateOrProvince;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[3]/a/ins") private WebElement sellerName;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[4]") private WebElement offeredForSaleAssets;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[5]") private WebElement successfullySoldAssets;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[6]") private WebElement mostTotalAmount;
    @FindBy(xpath = "html/body/div/div/section/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[7]") private WebElement listOfEngagedAssets;



}
