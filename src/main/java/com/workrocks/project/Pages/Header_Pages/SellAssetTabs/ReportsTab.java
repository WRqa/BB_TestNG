package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import com.workrocks.project.Pages.Settings.ConfigProperties;
import com.workrocks.project.Pages.Settings.Upload;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsTab extends AddressTab{
    ConfigProperties data = new ConfigProperties();

    public ReportsTab(WebDriver driver){
        super(driver);
    }

    @FindBy (id = "report-manage-mysaleprice") private WebElement mySalePrice;
    @FindBy (id = "report-manage-appraisalprice") private WebElement appraisedValue;
    @FindBy (id = "report-manage-percantage") private WebElement percentage;
    @FindBy (xpath = "//div[@id='reportItem_7']/div[1]/input") private WebElement addNewReport;
    @FindBy (xpath = "//div[@id='reportItem_7']/div[4]/a/span") private WebElement plusOrDeleteIcon;

    private void clickPlusOrDeleteIcon() {plusOrDeleteIcon.click();}

    private void setAppraisedValue(String appraisedValue){
        this.appraisedValue.clear();
        this.appraisedValue.sendKeys(appraisedValue);}

    private void setAddNewReport(String newReport) {
        addNewReport.clear();
        addNewReport.sendKeys(newReport);}

    public Double getMySalePrice() {
        return Double.valueOf(mySalePrice.getAttribute("value").replaceAll(",", ""));}

    private Double getAppraisedValue(){
        return Double.valueOf(appraisedValue.getAttribute("value").replaceAll(",", ""));}

    public Double calcPercentage(){
        return (getMySalePrice() * 100 / getAppraisedValue()) - 100;}

    public Double getPercentage(){
        return Double.valueOf(percentage.getAttribute("value").replaceAll(",", ""));}

    public AgreeTab setReportsData(String appraisedValue, String newReport){
//        setAppraisedValue(appraisedValue);
//        new Upload(driver).uploadReport("ReportItems[0].MediaFile", data.getProperty("report1"));
//        new Upload(driver).uploadReport("ReportItems[1].MediaFile", data.getProperty("report2"));
//        new Upload(driver).uploadReport("ReportItems[2].MediaFile", data.getProperty("report3"));
//        new Upload(driver).uploadReport("ReportItems[3].MediaFile", data.getProperty("report4"));
//        new Upload(driver).uploadReport("ReportItems[4].MediaFile", data.getProperty("report5"));
//        new Upload(driver).uploadReport("ReportItems[5].MediaFile", data.getProperty("report6"));
//        new Upload(driver).uploadReport("ReportItems[6].MediaFile", data.getProperty("report7"));
//        new Upload(driver).uploadReport("ReportItems[7].MediaFile", data.getProperty("report8"));
//        setAddNewReport(newReport);
//        clickPlusOrDeleteIcon();
        clickSaveAndNextButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AgreeTab(driver);
    }
}
