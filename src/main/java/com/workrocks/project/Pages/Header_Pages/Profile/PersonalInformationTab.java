package com.workrocks.project.Pages.Header_Pages.Profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInformationTab extends MainInfo{

    public PersonalInformationTab(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FirstName") private WebElement firstName;
    @FindBy(id = "LastName") private WebElement lastName;
    @FindBy(id = "Phone") private WebElement phoneEdit;
    @FindBy(id = "Notes") private WebElement notes;

    private void clickSaveButton() {
        driver.findElement(By.xpath("//div[@data-eui-tab='1']/descendant::button")).click();}

    private void setFirstName(String firstName){
        this.firstName.clear();
        this.firstName.sendKeys(firstName);
    }

    private void setLastName(String lastName){
        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }

    private void setPhone(String phone){
        this.phoneEdit.clear();
        this.phoneEdit.sendKeys(phone);
    }

    private void setNotes(String notes){
        this.notes.clear();
        this.notes.sendKeys(notes);
    }

    public String getFirstName(){return firstName.getAttribute("value");}

    public String getLastName(){return lastName.getAttribute("value");}

    public String getPhone(){
        return phoneEdit.getAttribute("value");
    }

    public String getNotes(){
        return notes.getText();
    }

    public void editPersonalInformation(String firstName, String lastName, String phone, String notes){
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setNotes(notes);
        clickSaveButton();
    }

    public AddressTab openAddressTab(){
        driver.findElement(By.xpath("//table[@class='tabs__nav-inner']/tbody/tr/td[2]")).click();
        return new AddressTab(driver);
    }

    public ScreeningQuestionsTab openScreeningQuestionsTab() {
        driver.findElement(By.xpath("//table[@class='tabs__nav-inner']/tbody/tr/td[3]")).click();
        return new ScreeningQuestionsTab(driver);
    }

    public InvestmentQuestionnaireTab openInvestmentQuestionnaireTab(){
        driver.findElement(By.xpath("//table[@class='tabs__nav-inner']/tbody/tr/td[4]")).click();
        return new InvestmentQuestionnaireTab(driver);
    }

    public ChangePasswordTab openChangePasswordTab(){
        driver.findElement(By.xpath("//table[@class='tabs__nav-inner']/tbody/tr/td[5]")).click();
        return new ChangePasswordTab(driver);
    }

    public NotificationSettings openNotificationSettingsTab(){
        driver.findElement(By.xpath("//table[@class='tabs__nav-inner']/tbody/tr/td[6]")).click();
        return new NotificationSettings(driver);
    }
}
