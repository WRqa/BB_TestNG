package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgreeTab extends AddressTab{

    public AgreeTab(WebDriver driver){
        super(driver);
    }

    private void click1Agree(){
        driver.findElement(By.xpath("//h4[@id='agreeBB30DaysExclusivity']/div/ins")).click();
    }

    private void click2Agree(){
        driver.findElement(By.xpath("//div[@id='isProfessionalPhoto']/div/ins")).click();
    }

    private void click3Agree(){
        driver.findElement(By.xpath("//div[@id='agreeTermsBeforeFirst30Days']/div/ins")).click();
    }

    private void click4Agree(){
        driver.findElement(By.xpath("//div[@id='agreeTermsBeforeSecond30Days']/div/ins")).click();
    }

    private void click5Agree(){
        driver.findElement(By.xpath("//div[@id='agreeTermsBefore45Days']/div/ins")).click();
    }

    public void clickSaveAndSendToReviewButton() {
        driver.findElement(By.id("sendToReview")).click();}

    public void setAgreeData(){
        click1Agree();
        click2Agree();
        click3Agree();
        click4Agree();
        click5Agree();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickSaveAndSendToReviewButton();
    }

    public void sendBuildingToReview() {
        clickSaveAndSendToReviewButton();
    }
}
