package com.workrocks.project.Pages.Header_Pages.Profile;

import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainInfo extends Pages{

    public MainInfo(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='box-body']/p[1]") private WebElement leftLocation;
    @FindBy(xpath = "//div[@class='box-body']/div[1]/div[1]/p") private WebElement bitsAmount;
    @FindBy(xpath = "//div[@class='box-body']/div[1]/div[2]/p") private WebElement bonus;
    @FindBy(xpath = "//div[@class='box-body']/p[2]/a") private WebElement yourReferralCodeLink;
    @FindBy(xpath = "//div[@class='box-body']/p[2]/input") private WebElement yourReferralCodeField;

    @FindBy(xpath = "//div[@class='col-md-9']/div[1]/div[2]/div[1]/div[1]/p[1]") private WebElement fullName;
    @FindBy(xpath = "//div[@class='col-md-9']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p") private WebElement phone;
    @FindBy(xpath = "//div[@class='col-md-9']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/p") private WebElement email;
    @FindBy(xpath = "//div[@class='col-md-9']/div[1]/div[2]/div[1]/div[1]/p[4]") private WebElement notesField;

    public String getFullName(){
        return fullName.getText();}

    public String getPhone(){
        return phone.getText();}

    public String getEmail(){
        return email.getText();}

    public String getLeftLocation(){
        return leftLocation.getText();}

    public String getNotes(){
        return notesField.getText();}

    public String getBitsAmount(){
        return bitsAmount.getText();}

    public String getBonus(){
        return bonus.getText();}

    public String getReferralLink(){
        yourReferralCodeLink.click();
        return yourReferralCodeField.getAttribute("value");
    }
}
