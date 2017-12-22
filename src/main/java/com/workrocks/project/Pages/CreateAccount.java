package com.workrocks.project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount{
    public WebDriver driver;

    public CreateAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "FirstName") private WebElement firstName;
    @FindBy(id = "LastName") private WebElement lastName;
    @FindBy(id = "Email") private WebElement email;
    @FindBy(id = "Password") private WebElement password;
    @FindBy(id = "create-account") private WebElement createAccountButton;

    private void clickSubmitCheckbox(){
        driver.findElement(By.id("IReviewedAndAgreeToTermsOfServiceAndPrivacyPolicy-label")).submit();
    }

    private void clickCreateMyAccountButton(){
        createAccountButton.submit();
    }

//    private void clickJoinFreeButton(){
//        driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[10]/div/button")).click();}
//
//    private void clickTermOfUseLink(){
//        driver.findElement(By.id("myModalTermsOfService")).click();
//    }
//
//    private void clickPrivacyPolicyLink(){
//        driver.findElement(By.id("myModalPrivacyPolicy")).click();
//    }
//
//    public void clickNextButton() {
//        driver.findElement(By.id("next")).click();}
//
//
    private void setFirstName(String firstName){
        this.firstName.clear();
        this.firstName.sendKeys(firstName);
    }
//
    private void setLastName(String lastName){
        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }

    private void setEmail(String email){
        this.email.clear();
        this.email.sendKeys(email);
    }

    private void setPassword(String password){
        this.password.clear();
        this.password.sendKeys(password);
    }


    public MainPage setRegistrationDataAndConfirmIt(String firstName, String lastName, String email, String password){
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        clickSubmitCheckbox();
        clickCreateMyAccountButton();
        return new MainPage(driver);
    }

    public void deleteUserFromBase(String email){
        driver.get("http://10.47.100.56:14815/Home/HardDelete?email=" + email);
    }
}
