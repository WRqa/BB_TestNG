package com.workrocks.project.Pages.Dashboard_pages.User;

import com.workrocks.project.Pages.MainPage;
import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyBITsHoldings extends UserDashboard {

    public MyBITsHoldings(WebDriver driver){
        super(driver);
    }

    public InvestmentsByBuilding selectBuildingFromListAndOpenIt(int itemByList){
        driver.findElement(By.xpath("//tbody[@class='bit-holdings__body']/tr[" + itemByList + "]/td[2]/a")).click();
        return new InvestmentsByBuilding(driver);
    }
}
