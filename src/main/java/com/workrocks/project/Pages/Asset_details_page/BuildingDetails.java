package com.workrocks.project.Pages.Asset_details_page;

import com.workrocks.project.Pages.Settings.Pages;
import com.workrocks.project.Pages.Settings.ConfigProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BuildingDetails extends Pages{

    public BuildingDetails(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "FirstName") private WebElement firstName;
    @FindBy(id = "LastName") private WebElement lastName;
    @FindBy(id = "DOB") private WebElement dateOfBirth;
    @FindBy(id = "SSN") private WebElement socialSecurityNumber;
    @FindBy(id = "BankRouting") private WebElement bankRouting;
    @FindBy(id = "Profession") private WebElement profession;
    @FindBy(id = "Phone") private WebElement phone;
    @FindBy(id = "Email") private WebElement email;
    @FindBy(id = "AlternativePhone") private WebElement alternativePhone;
    @FindBy(id = "AlternativeEmail") private WebElement alternativeEmail;
    @FindBy(id = "ResidenceAddress") private WebElement residenceAddress;
    @FindBy(id = "BankAccount") private WebElement bankAccount;
    @FindBy(name = "Message") private WebElement commentField;
    @FindBy(xpath = "//div[@class='box-body comments-list']/div[1]/p") private WebElement comment;

    private void clickCommentsTab(){
        driver.findElement(By.linkText("Comments")).click();}
    private void clickSend(){
        driver.findElement(By.id("send")).click();}

    private void clickSingleStatus() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[2]/div[4]/div[1]/div[1]/div/ins")).click();}
    private void clickMarriedStatus() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[2]/div[4]/div[1]/div[2]/div")).click();}
    private void clickDevorsedStatus() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[2]/div[4]/div[1]/div[3]/div")).click();}

    private void clickYesRadio() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[2]/div[4]/div[2]/div[1]/div")).click();}
    private void clickNoRadio() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[2]/div[4]/div[2]/div[2]/div")).click();}

    private void clickRadio11() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/div")).click();}
    private void clickRadio12() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/div")).click();}
    private void clickRadio13() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[1]/div/div[3]/div")).click();}
    private void clickRadio14() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[1]/div/div[4]/div")).click();}
    private void clickRadio21() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[1]/div/div[1]/div")).click();}
    private void clickRadio22() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[1]/div/div[2]/div")).click();}
    private void clickRadio23() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[1]/div/div[3]/div")).click();}
    private void clickRadio24() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[1]/div/div[4]/div")).click();}
    private void clickRadio31() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[1]/div/div[1]/div")).click();}
    private void clickRadio32() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/div")).click();}
    private void clickRadio33() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[1]/div/div[3]/div")).click();}
    private void clickRadio34() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[1]/div/div[4]/div")).click();}
    private void clickRadio35() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[1]/div/div[5]/div")).click();}
    private void clickRadio41() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[4]/div[1]/div/div[1]/div")).click();}
    private void clickRadio42() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[4]/div[1]/div/div[2]/div")).click();}
    private void clickRadio43() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[4]/div[1]/div/div[3]/div")).click();}
    private void clickRadio44() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[4]/div[1]/div/div[4]/div")).click();}
    private void clickRadio45() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[4]/div[1]/div/div[5]/div")).click();}
    private void clickRadio51() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/div")).click();}
    private void clickRadio52() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[2]/div/div[2]/div")).click();}
    private void clickRadio53() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[2]/div/div[3]/div")).click();}
    private void clickRadio54() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[1]/div[2]/div/div[4]/div")).click();}
    private void clickRadio61() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[2]/div/div[1]/div")).click();}
    private void clickRadio62() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[2]/div/div[2]/div")).click();}
    private void clickRadio63() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[2]/div/div[3]/div")).click();}
    private void clickRadio64() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[2]/div[2]/div/div[4]/div")).click();}
    private void clickRadio71() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[2]/div/div[1]/div")).click();}
    private void clickRadio72() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[1]/div/div[3]/div[3]/div[2]/div/div[2]/div")).click();}

    private void clickSaveAndNext() {
        driver.findElement(By.xpath("//*[@id='investmentQuestionnaire']/div[2]/ul/li[2]/button")).click();}
    private void clickSaveAndFinishButton() {
        driver.findElement(By.xpath("//form[@id='investmentQuestionnaire']/div[2]/ul/li[3]/button")).click();
    }
    public InvestmentPage clickInvestNowButton() {
        driver.findElement(By.cssSelector(".btn.btn-primary.btn-rounded.invest-btn")).click();
        return new InvestmentPage(driver);
    }

    public InvestmentPage clickBuyButton(){
        driver.findElement(By.xpath("//*[@id='makeOffer']/div[2]/div[1]/a")).click();
        return new InvestmentPage(driver);
    }


    private void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth.sendKeys(Keys.ENTER);
        this.dateOfBirth.clear();
        this.dateOfBirth.sendKeys(dateOfBirth);}

    private void setSocialSequrityNumber(String socialSecurityNumber){
        this.socialSecurityNumber.clear();
        this.socialSecurityNumber.sendKeys(socialSecurityNumber);}

    private void setBankRouting(String bankRouting){
        this.bankRouting.clear();
        this.bankRouting.sendKeys(bankRouting);}

    private void setProfession(String profession){
        this.profession.clear();
        this.profession.sendKeys(profession);}

    private void setAlternativePhone(String alternativePhone){
        this.alternativePhone.clear();
        this.alternativePhone.sendKeys(alternativePhone);}

    private void setAlternativeEmail(String alternativeEmail){
        this.alternativeEmail.clear();
        this.alternativeEmail.sendKeys(alternativeEmail);}

    private void setResidenceAddress(String residenceAddress){
        this.residenceAddress.clear();
        this.residenceAddress.sendKeys(residenceAddress);}

    private void setBankAccount(String bankAccount){
        this.bankAccount.clear();
        this.bankAccount.sendKeys(bankAccount);}

    private void setComment(String comment){
        this.commentField.clear();
        this.commentField.sendKeys(comment);}

    private String getFirstName(){return firstName.getAttribute("value");}

    private String getLastName(){return lastName.getAttribute("value");}

    private String getPhone(){return phone.getAttribute("value");}

    public String getEmail() {return email.getAttribute("value");}

    public String getComment(){return comment.getText();}

//-----------------------------------------------------------------------------------------------------------------------------------------------
    public void setQuestionnaire(String dateOfBirth, String socialSecurityNumber, String bankRouting, String profession,
                                 String alternativePhone, String alternativeEmail, String residenceAddress, String bankAccount, String checkEmail) throws InterruptedException {
        //Assert.assertEquals(data.getProperty("firstName"), getFirstName());
        //Assert.assertEquals(data.getProperty("lastName"), getLastName());
        setDateOfBirth(dateOfBirth);
        setSocialSequrityNumber(socialSecurityNumber);
        setBankRouting(bankRouting);
        clickSingleStatus();
        clickMarriedStatus();
        clickDevorsedStatus();
        clickYesRadio();
        clickNoRadio();
        setProfession(profession);
        //Assert.assertEquals(data.getProperty("phone"), getPhone());
        setAlternativePhone(alternativePhone);
        setAlternativeEmail(alternativeEmail);
        setResidenceAddress(residenceAddress);
        setBankAccount(bankAccount);
        clickSaveAndNext();
        Thread.sleep(1000);
        clickRadio11();
        clickRadio12();
        clickRadio13();
        clickRadio14();
        clickRadio21();
        clickRadio22();
        clickRadio23();
        clickRadio24();
        clickRadio31();
        clickRadio32();
        clickRadio33();
        clickRadio34();
        clickRadio35();
        clickRadio41();
        clickRadio42();
        clickRadio43();
        clickRadio44();
        clickRadio45();
        clickRadio51();
        clickRadio52();
        clickRadio53();
        clickRadio54();
        clickRadio61();
        clickRadio62();
        clickRadio63();
        clickRadio64();
        clickRadio71();
        clickRadio72();
        clickSaveAndFinishButton();
    }

    public void addComment(String comment){
        clickCommentsTab();
        setComment(comment);
        clickSend();
        //wait.until(ExpectedConditions.textToBePresentInElement(this.comment, comment));
    }
}
