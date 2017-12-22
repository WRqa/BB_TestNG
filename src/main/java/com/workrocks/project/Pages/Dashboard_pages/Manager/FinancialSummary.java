package com.workrocks.project.Pages.Dashboard_pages.Manager;


import com.workrocks.project.Pages.Settings.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinancialSummary extends ManagerDashboard {
    Pages webpages = new Pages(driver);

    public FinancialSummary(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "RentalIncome")
    public WebElement rentalIncome;
    @FindBy(id = "Reimbursements") private WebElement reimbursements;
    @FindBy(id = "TotalGrossIncome") private WebElement totalGrossIncome;
    @FindBy(id = "NetOperatingIncome") private WebElement netOperatingIncome;
    @FindBy(id = "PropertyTaxes") private WebElement propertyTaxes;
    @FindBy(id = "Insurance") private WebElement insurance;
    @FindBy(id = "Utilities") private WebElement utilities;
    @FindBy(id = "RepairsANDMaintenance") private WebElement repairsAndMaintenance;
    @FindBy(id = "OtherExpenses") private WebElement otherExpenses;
    @FindBy(id = "TotalExpenses") private WebElement totalExpenses;
    @FindBy(id = "Month") private WebElement month;
    @FindBy(xpath = "//button[@title='Manage']") public WebElement manageButton;
    @FindBy(xpath = "//tr[@class='userRow']/td[7]/a") public WebElement distributeButton;

    void clickManageButton() {manageButton.click();}
    public void clickDistribute(){distributeButton.click();}
    public void clickOkButton(){
        driver.findElement(By.id("manageByMonthBtn")).click();}

    private void setRentalIcome(String rentalIncome){
        this.rentalIncome.clear();
        this.rentalIncome.sendKeys(rentalIncome);}

    private void setReimbursements(String reimbursements){
        this.reimbursements.clear();
        this.reimbursements.sendKeys(reimbursements);}

    private void setPropertyTaxes(String propertyTaxes){
        this.propertyTaxes.clear();
        this.propertyTaxes.sendKeys(propertyTaxes);}

    private void setInsurance(String insurance){
        this.insurance.clear();
        this.insurance.sendKeys(insurance);}

    private void setUtilities(String utilities){
        this.utilities.clear();
        this.utilities.sendKeys(utilities);}

    private void setRepairsAndMaintenance(String repairsAndMaintenance){
        this.repairsAndMaintenance.clear();
        this.repairsAndMaintenance.sendKeys(repairsAndMaintenance);}

    private void setOtherExpenses(String otherExpenses){
        this.otherExpenses.clear();
        this.otherExpenses.sendKeys(otherExpenses);}

    private void setReportingMonth(String reportingMonth){
        month.clear();
        month.sendKeys(reportingMonth);
    }

    public Double getTotalGrossIncome(){
        return Double.valueOf(totalGrossIncome.getAttribute("value").replaceAll("," , ""));}

    public Double getNetOperatingIncome(){
        return Double.valueOf(netOperatingIncome.getAttribute("value").replaceAll("," , ""));}

    public Double getTotalExpenses(){
        return Double.valueOf(totalExpenses.getAttribute("value").replaceAll("," , ""));}


    public void fillReport(String rentalIncome, String reimbursements, String propertyTaxes, String insurance, String utilities,
                           String repairsAndMaintenance, String otherExpenses, String reportingMonth){
        setRentalIcome(rentalIncome);
        setReimbursements(reimbursements);
        setPropertyTaxes(propertyTaxes);
        setInsurance(insurance);
        setUtilities(utilities);
        setRepairsAndMaintenance(repairsAndMaintenance);
        setOtherExpenses(otherExpenses);
        setReportingMonth(reportingMonth);
    }



}
