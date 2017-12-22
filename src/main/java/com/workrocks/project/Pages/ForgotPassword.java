package com.workrocks.project.Pages;


import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends Pages{

    public ForgotPassword(WebDriver driver){
        super(driver);
    }

    @FindBy (id = "Email") private WebElement email;
    @FindBy (id = "Password") private WebElement password;
    @FindBy (id = "ConfirmPassword") private WebElement confirmPassword;
    @FindBy (xpath = "//button[@class = 'btn btn-primary btn-flat']") private WebElement resetButton;
    @FindBy (linkText = "click here to log in") private WebElement confirmLink;


    private void clickContinueButton(){
        driver.findElement(By.className("button button--default button--raised_orange button--medium-width")).submit();
    }
    private void clickResetButton() {resetButton.click();}
    private void clickConfirmLink() {confirmLink.click();}

    private void setEmail(String userEmail){
        email.clear();
        email.sendKeys(userEmail);}

    private void setPassword(String userPassword){
        password.clear();
        password.sendKeys(userPassword);}

    private void setConfirmPassword(String userConfirmPassword){
        confirmPassword.clear();
        confirmPassword.sendKeys(userConfirmPassword);}

    public void passwordRecovery(String email){
        setEmail(email);
        clickContinueButton();}

    public void setNewPassword(String email, String password, String confirmPassword){
        setEmail(email);
        setPassword(password);
        setConfirmPassword(confirmPassword);
        clickResetButton();
        clickConfirmLink();}
}
