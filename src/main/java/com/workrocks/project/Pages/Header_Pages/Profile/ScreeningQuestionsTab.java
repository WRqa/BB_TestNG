package com.workrocks.project.Pages.Header_Pages.Profile;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScreeningQuestionsTab extends MainInfo{

    public ScreeningQuestionsTab(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='questionnaire']/div[2]/div[1]/div/div[1]/div") private WebElement radioBtn11;
    @FindBy(xpath = "//*[@id='questionnaire']/div[2]/div[1]/div/div[4]/div") private WebElement radioBtn14;

    @FindBy(xpath = "//*[@id='questionnaire']/div[3]/div[1]/div/div[1]/div") private WebElement radioBtn21;
    @FindBy(xpath = "//*[@id='questionnaire']/div[3]/div[1]/div/div[6]/div") private WebElement radioBtn26;

    @FindBy(xpath = "//*[@id='questionnaire']/div[2]/div[2]/div/div[1]/div") private WebElement radioBtn31;
    @FindBy(xpath = "//*[@id='questionnaire']/div[2]/div[2]/div/div[4]/div") private WebElement radioBtn34;

    @FindBy(xpath = "//*[@id='questionnaire']/div[3]/div[2]/div/div[1]/div") private WebElement radioBtn41;
    @FindBy(xpath = "//*[@id='questionnaire']/div[3]/div[2]/div/div[4]/div") private WebElement radioBtn44;

    private void clickScreeningQuestionsTsb() {
        driver.findElement(By.linkText("Screening Questions")).click();}
    private void clickRadioBtn11() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[2]/div[1]/div/div[1]/div")).click();}
    private void clickRadioBtn12() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[2]/div[1]/div/div[2]/div")).click();}
    private void clickRadioBtn13() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[2]/div[1]/div/div[3]/div")).click();}
    private void clickRadioBtn14() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[2]/div[1]/div/div[4]/div")).click();}
    private void clickRadioBtn21() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[3]/div[1]/div/div[1]/div")).click();}
    private void clickRadioBtn22() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[3]/div[1]/div/div[2]/div")).click();}
    private void clickRadioBtn23() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[3]/div[1]/div/div[3]/div")).click();}
    private void clickRadioBtn24() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[3]/div[1]/div/div[4]/div")).click();}
    private void clickRadioBtn25() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[3]/div[1]/div/div[5]/div")).click();}
    private void clickRadioBtn26() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[3]/div[1]/div/div[6]/div")).click();}
    private void clickRadioBtn31() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[2]/div[2]/div/div[1]/div")).click();}
    private void clickRadioBtn32() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[2]/div[2]/div/div[2]/div")).click();}
    private void clickRadioBtn33() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[2]/div[2]/div/div[3]/div")).click();}
    private void clickRadioBtn34() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[2]/div[2]/div/div[4]/div")).click();}
    private void clickRadioBtn41() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[3]/div[2]/div/div[1]/div")).click();}
    private void clickRadioBtn42() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[3]/div[2]/div/div[2]/div")).click();}
    private void clickRadioBtn43() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[3]/div[2]/div/div[3]/div")).click();}
    private void clickRadioBtn44() {
        driver.findElement(By.xpath("//*[@id='questionnaire']/div[3]/div[2]/div/div[4]/div")).click();}
    private void clickSaveScreeningQuestionsButton() {
        driver.findElement(By.xpath(".//*[@id='questionnaire']/div[4]/div/button")).click();}

    public String getRadioBtn11Status(){
        return String.valueOf(radioBtn11.getAttribute("class"));
    }

    public String getRadioBtn14Status(){
        return String.valueOf(radioBtn14.getAttribute("class"));
    }

    public String getRadioBtn21Status(){
        return String.valueOf(radioBtn21.getAttribute("class"));
    }

    public String getRadioBtn26Status(){
        return String.valueOf(radioBtn26.getAttribute("class"));
    }

    public String getRadioBtn31Status(){
        return String.valueOf(radioBtn31.getAttribute("class"));
    }

    public String getRadioBtn34Status(){
        return String.valueOf(radioBtn34.getAttribute("class"));
    }

    public String getRadioBtn41Status(){
        return String.valueOf(radioBtn41.getAttribute("class"));
    }

    public String getRadioBtn44Status(){
        return String.valueOf(radioBtn44.getAttribute("class"));
    }

    public void editScreeningQuestionsData(){
        clickScreeningQuestionsTsb();
        clickRadioBtn11();
        clickRadioBtn12();
        clickRadioBtn13();
        clickRadioBtn14();
        clickRadioBtn21();
        clickRadioBtn22();
        clickRadioBtn23();
        clickRadioBtn24();
        clickRadioBtn25();
        clickRadioBtn26();
        clickRadioBtn31();
        clickRadioBtn32();
        clickRadioBtn33();
        clickRadioBtn34();
        clickRadioBtn41();
        clickRadioBtn42();
        clickRadioBtn43();
        clickRadioBtn44();
        clickSaveScreeningQuestionsButton();
    }
}
