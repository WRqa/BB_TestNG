package com.workrocks.project.Pages.Dashboard_pages.Manager;

import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Subscriptions extends ManagerDashboard {
    Pages webpages = new Pages(driver);

    public Subscriptions(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Email") private WebElement email;
    @FindBy(xpath = "html/body/div/div/section/div[1]/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[1]") private WebElement userNumber;
    @FindBy(xpath = "html/body/div/div/section/div[1]/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[2]/a") private WebElement userEmail;
    @FindBy(xpath = "html/body/div/div/section/div[1]/div/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[3]") private WebElement dateOfCreation;


    public void clickExportButton() {
        driver.findElement(By.id("exportToExcel")).click();}


    public void setEmail(String email){
        this.email.clear();
        this.email.sendKeys(email);}

    public String getEmail(){
        return userEmail.getText();}


    public void searchByEmail(String email) {
        setEmail(email);
        clickSearchButton();
        //wait.until(presenceOfElementLocated(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]/a/ins")));
    }

}

