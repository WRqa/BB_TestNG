import com.workrocks.project.Pages.Dashboard_pages.Manager.BuildingsUnderReview;
import com.workrocks.project.Pages.Header_Pages.SellAssetTabs.*;
import com.workrocks.project.Pages.MainPage;

import com.workrocks.project.Pages.Settings.Upload;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resources.DataproviderClass;

public class Suite4_CreateAsset extends BasicData{

    @BeforeClass
    public void openLoginPage(){
        new MainPage(driver)
                .openLoginPage()
                .loginAs(seller, password)
                .openSellAssetPage();
    }

    @Test(dataProvider = "addressDataOfAsset", dataProviderClass = DataproviderClass.class)
    public void test01_setDataToAddressTab(String state, String city, String address1, String address2, String zipCode, String cityMessage, String addressMessage, String zipMessage){
        new AddressTab(driver)
                .setAddressData(state, city, address1, address2, zipCode);

        Assert.assertTrue(driver.getPageSource().contains(cityMessage));
        Assert.assertTrue(driver.getPageSource().contains(addressMessage));
        Assert.assertTrue(driver.getPageSource().contains(zipMessage));

    }

    @Test(dataProvider = "buildingInfoDataOfAsset", dataProviderClass = DataproviderClass.class)
    public void test02_setDataToBuildingInfoTab(String buildingName, String salePrice, String NOI, String numberOfFloors, String numberOfUnits,
                                                String squareFootage, String yearBuilt, int typeOfConstruction, int buildingType, int buildingClass,
                                                String messageCity, String messagePrice, String messageSquareFootage, String messageBuildingType, String messageBuildingClass){
        new BuildingInfoTab(driver)
                .setBuildingInfoData(buildingName, salePrice, NOI, numberOfFloors, numberOfUnits, squareFootage, yearBuilt, typeOfConstruction, buildingType, buildingClass);

        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='tabInfo']/descendant::fieldset/div[1]/div[1]/div/span")).getText(), messageCity);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='tabInfo']/descendant::fieldset/div[1]/div[2]/div/span")).getText(), messagePrice);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='tabInfo']/descendant::fieldset/div[2]/div[3]/div/span")).getText(), messageSquareFootage);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='tabInfo']/descendant::fieldset/div[3]/div[2]/div/span[2]")).getText(), messageBuildingType);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='tabInfo']/descendant::fieldset/div[4]/div[1]/descendant::span[4]")).getText(), messageBuildingClass);
    }

    @Test
    public void test03_uploadPhoto(){
        new PhotosTab(driver)
                .uploadPhoto("", "");
    }

    @Test(dataProvider = "rentRollDataOfAsset", dataProviderClass = DataproviderClass.class)
    public void test04_setRentRollData(String tenant, String SqFt, String termStart, String termEnd, String annualRent, String rentPSF, String annualCAM, int index,
                                       String reimbursements, String propertyTaxes, String insurance, String utilities, String repairsANDMaintenance, String otherExpenses){
        new RentRollTab(driver)
                .setRentRollData(tenant, SqFt, termStart, termEnd, annualRent, rentPSF, annualCAM, index, reimbursements,
                                propertyTaxes, insurance, utilities, repairsANDMaintenance, otherExpenses);
    }

    @Test(dataProvider = "reportDataOfAsset", dataProviderClass = DataproviderClass.class)
    public void test05_setReportData(String appraisedValue, String newReport){
        new ReportsTab(driver)
                .setReportsData(appraisedValue, newReport);
    }

    @Test
    public void test06_setAggreeTab(){
        new AgreeTab(driver)
                .setAgreeData();
    }

//    @Test
//    public void test02_fillManageTab(){
//        new MainPage(driver)
//                .openLoginPage()
//                .loginAs("", "")
//                .openManagerDashboard()
//                .openBuildingsUnderReviewPage()
//                .openBuildingForReview()
//                .openManageTab()
//                .setManageData("", "");
//        Assert.assertEquals(
//                true, new ManageTab(driver).getInterestRate().toString().equals("4.25"));
//        Assert.assertEquals(
//                true, new ManageTab(driver).getLoanTerm().toString().equals("30.0"));
//        Assert.assertEquals(
//                new ManageTab(driver).getMonthlyDebtService(), new ManageTab(driver).calcMonthlyDebtService());
//        new ManageTab(driver).clickSaveAndFinishButton();
//    }
//
//    @Test
//    public void test03_rejectAsset(){
//        new MainPage(driver)
//                .openLoginPage()
//                .loginAs("", "")
//                .openManagerDashboard()
//                .openBuildingsUnderReviewPage()
//                .openBuildingForReview()
//                .clickRejectButton();
//        Assert.assertEquals(
//                "Rejected", new BuildingsUnderReview(driver).getStatus());
//    }
//
//    @Test
//    public void test04_sendAssetToApprove(){
//        new MainPage(driver)
//                .openLoginPage()
//                .loginAs("", "")
//                .openUserDashboard()
//                .openMyBuildingsForSale()
//                .openRejectedBuilding()
//                .openAgreeTab()
//                .sendBuildingToReview();
//    }
//
//    @Test
//    public void test05_approveAsset(){
//        new MainPage(driver)
//                .openLoginPage()
//                .loginAs("","")
//                .openManagerDashboard()
//                .openBuildingsUnderReviewPage()
//                .openBuildingForReview()
//                .approveBuilding();
//    }
}
