package com.workrocks.project.Pages.Header_Pages.Profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordTab extends MainInfo{

    public ChangePasswordTab(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "OldPassword") private WebElement oldPassword;
    @FindBy(id = "NewPassword") private WebElement newPassword;
    @FindBy(id = "ConfirmPassword") private WebElement confirmPassword;

    private void clickSaveButton() {
        driver.findElement(By.xpath(".//*[@id='change-password']/form/div[5]/div/input")).click();
    }

    private void setOldPassword(String oldPassword){
        this.oldPassword.clear();
        this.oldPassword.sendKeys(oldPassword);
    }

    private void setNewPassword(String newPassword){
        this.newPassword.clear();
        this.newPassword.sendKeys(newPassword);
    }

    private void setConfirmPassword(String confirmPassword){
        this.confirmPassword.clear();
        this.confirmPassword.sendKeys(confirmPassword);
    }

    public void changePassword(String oldPassword, String newPassword, String confirmPassword){
        setOldPassword(oldPassword);
        setNewPassword(newPassword);
        setConfirmPassword(confirmPassword);
        clickSaveButton();
    }
}
