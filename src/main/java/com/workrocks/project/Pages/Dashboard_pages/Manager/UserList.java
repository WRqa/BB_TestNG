package com.workrocks.project.Pages.Dashboard_pages.Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class UserList extends ManagerDashboard {

    public UserList(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FirstName") private WebElement firstName;
    @FindBy(id = "LastName") private WebElement lastName;
    @FindBy(id = "Email") private WebElement email;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[1]") private WebElement userNumber;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[2]/div/img") private WebElement userAvatar;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[3]/a/ins") private WebElement userFullName;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[4]/a") private WebElement userEmail;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[6]") private WebElement userRole;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[7]") private WebElement dateOfCreation;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[8]/a") private WebElement sendMessageIcon;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[9]") private WebElement userRating;
    @FindBy(xpath = "//table[@class='table table-hover table-striped']/tbody/tr[1]/td[10]") private WebElement userBitsAmount;
    @FindBy(id = "list-subject") private WebElement listSubject;
    @FindBy(id = "list-message") private WebElement messageField;

    private void clickRolesDropdown(){
        driver.findElement(By.id("select2-selectedRole-container")).click();}

    private void clickSendEmailIcon(){
        driver.findElement(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr[1]/td[8]/a/span")).click();}

    private void clickSendButton(){
        driver.findElement(By.id("sendEmail")).click();}

    private void setFirstName(String firstName){
        this.firstName.clear();
        this.firstName.sendKeys(firstName);}

    private void setLastName(String lastName){
        this.lastName.clear();
        this.lastName.sendKeys(lastName);}

    private void setEmail(String email){
        this.email.clear();
        this.email.sendKeys(email);
    }

    private void setListSubject(String listSubject){
        this.listSubject.clear();
        this.listSubject.sendKeys(listSubject);}

    private void setMessage(String message){
        messageField.clear();
        messageField.sendKeys(message);}

    public String getUserFullName(){
        return userFullName.getText();}

    public String getEmail(){
        return userEmail.getText();}

    public String getRole(){
        return userRole.getText();}


    public UserList searchUserByFirstName(String firstName) {
        setFirstName(firstName);
        clickSearchButton();
        wait.until(ExpectedConditions.textToBePresentInElement(this.userFullName, firstName));
        return this;
    }

    public UserList searchUserByLastName(String lastName){
        setLastName(lastName);
        clickSearchButton();
        wait.until(ExpectedConditions.textToBePresentInElement(this.userFullName, lastName));
        return this;
    }

    public UserList searchUserByEmail(String email){
        setEmail(email);
        clickSearchButton();
        wait.until(ExpectedConditions.textToBePresentInElement(this.userEmail, email));
        return this;
    }

    public void selectUserRoleInDropdown(){
        clickRolesDropdown();
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.waitForIdle();

        } catch (AWTException e) {
            e.printStackTrace();
        }
        clickSearchButton();
        wait.until(ExpectedConditions.visibilityOf(userRole));
    }

    public void sendMessageToUser(String subject, String mesage){
        clickSendEmailIcon();
        //wait.until(ExpectedConditions.visibilityOf(messageField));
        setListSubject(subject);
        setMessage(mesage);
        clickSendButton();
    }

    public boolean isUserNameOnList(String searchName) {
        int quantityOfPointsOnList = driver.findElements(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr")).size();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i <= quantityOfPointsOnList; i++){
            list.add(driver.findElement(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr[" + i + "]/td[3]/a")).getText());
        }

        for (String aList : list) {
            if (aList.contains(searchName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmailOnList(String searchEmail) {
        int quantityOfPointsOnList = driver.findElements(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr")).size();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i <= quantityOfPointsOnList; i++){
            list.add(driver.findElement(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr[" + i + "]/td[4]/a")).getText());
        }

        for (String aList : list) {
            if (aList.equals(searchEmail)) {
                return true;
            }
        }
        return false;
    }
}

