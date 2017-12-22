package com.workrocks.project.Pages;

import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Pages{

    public Login(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Email") private WebElement emailField;
    @FindBy(id = "Password") private WebElement passwordField;


    private void clickLoginButton(){
        driver.findElement(By.xpath("//button[@class='button button--default button--raised_orange button--login']")).submit();
    }

    public ForgotPassword openForgotPasswordPage(){
        driver.findElement(By.linkText("Forgot Password")).click();
        return new ForgotPassword(driver);
    }

    private void setUserEmail(String userEmail){
        emailField.clear();
        emailField.sendKeys(userEmail);}

    private void setUserPassword(String userPassword){
        passwordField.clear();
        passwordField.sendKeys(userPassword);}

    public MainPage loginAs(String name, String password){
        setUserEmail(name);
        setUserPassword(password);
        clickLoginButton();
        return new MainPage(driver);
    }

    public void getAlertMessageFromPage(){
        System.out.println(driver.findElement(By.partialLinkText("Please")));
    }

}

