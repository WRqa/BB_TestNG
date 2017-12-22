package com.workrocks.project.Pages.Settings;

import com.workrocks.project.Pages.Dashboard_pages.Manager.*;
import com.workrocks.project.Pages.Dashboard_pages.User.*;
import com.workrocks.project.Pages.Header_Pages.SellAssetTabs.AddressTab;
import com.workrocks.project.Pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pages {
    protected WebDriver driver;

    public Pages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public ManagerDashboard openManagerDashboard(){
        driver.findElement(By.id("dashboard")).click();
        return new ManagerDashboard(driver);
    }

    public UserDashboard openUserDashboard(){
        driver.findElement(By.id("dashboard")).click();
        return new UserDashboard(driver);
    }

    public MainPage MainPage() {return new MainPage(driver);}
    public ManagerDashboard ManagerDashboard() {return new ManagerDashboard(driver);}
    public FinancialSummary FinancialSummary() {return new FinancialSummary(driver);}
    public RobotAction RobotAction() {return new RobotAction(driver);}
    public AddressTab AddressTab() {return new AddressTab(driver);}
}