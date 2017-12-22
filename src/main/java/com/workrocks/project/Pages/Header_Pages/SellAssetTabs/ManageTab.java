package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import com.workrocks.project.Pages.Settings.ConfigProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ManageTab extends AddressTab{

    public ManageTab(WebDriver driver){
        super(driver);
    }

    @FindBy (id = "Debt") private WebElement debt;
    @FindBy (id = "InterestRate") private WebElement interestRate;
    @FindBy (id = "LoanTerm") private WebElement loanTerm;
    @FindBy (id = "MonthlyDebtService") private WebElement monthlyDebtService;
    @FindBy (id = "Video") private WebElement videoLink;

    private void setDebt(String debt){
        this.debt.clear();
        this.debt.sendKeys(debt);}

    private void setVideo(String videoLink){
        this.videoLink.clear();
        this.videoLink.sendKeys(videoLink);}

    private Double getDebt(){
        return Double.valueOf(debt.getAttribute("value").replaceAll("," , ""));}

    public Double getInterestRate(){
        return Double.valueOf(interestRate.getAttribute("value"));}

    public Double getLoanTerm(){
        return Double.valueOf(loanTerm.getAttribute("value"));}

    public Double getMonthlyDebtService(){
        return Double.valueOf(monthlyDebtService.getAttribute("value"));}

    public Double calcMonthlyDebtService(){
        double p = getInterestRate() / 12 / 100;
        double pow = Math.pow(1 + p, 12 * getLoanTerm());
        double v = getDebt() * (p + (p / (pow - 1)));
        return  new BigDecimal(getDebt() * (p + (p / (pow - 1)))).setScale(2, RoundingMode.UP).doubleValue();}

    public void setManageData(String debt, String videoLink){
        setDebt(debt);
        setVideo(videoLink);
    }
}
