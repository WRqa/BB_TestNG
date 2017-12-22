import com.workrocks.project.Pages.Asset_details_page.BuildingDetails;
import com.workrocks.project.Pages.Asset_details_page.InvestmentPage;
import com.workrocks.project.Pages.Dashboard_pages.Manager.PromoCodeList;
import com.workrocks.project.Pages.Dashboard_pages.User.TransactionList;
import com.workrocks.project.Pages.Dashboard_pages.User.UserDashboard;
import com.workrocks.project.Pages.MainPage;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

public class Suite5_Investition extends BasicData{

    @Test
    public void test01_addFunds_Seller(){
//        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("password"));
//        webpages.MainPage().clickDashboard();
//        webpages.Funding().addFunds("123456", "My bank", "500000");
//        Assert.assertEquals(
//                "$500,000", webpages.UserDashboard().getCashValue());
    }

    @Test
    public void test02_addFunds_Investor1(){
//        webpages.Login().userLogin(data.getProperty("investor1Email"), data.getProperty("password"));
//        webpages.MainPage().clickDashboard();
//        webpages.Funding().addFunds("123456", "My bank", "500000");
//        Assert.assertEquals(
//                "$500,000", webpages.UserDashboard().getCashValue());
    }

    @Test
    public void test03_addFunds_Investor2(){
//        webpages.Login().userLogin(data.getProperty("investor2"), data.getProperty("password"));
//        webpages.MainPage().clickDashboard();
//        webpages.Funding().addFunds("123456", "My bank", "500000");
//        Assert.assertEquals(
//                "$500,000", webpages.UserDashboard().getCashValue());
    }

    @Test
    public void test04_buyAssetWithoutDiscount_Investor2(){
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openBuildingsList()
                .openBuildingDetailsPage(1)
                .clickInvestNowButton()
                .setInvestDataWithoutDiscount("", "");
        Assert.assertEquals(
                "$14,000.00", new InvestmentPage(driver).getSubtotal());
        Assert.assertEquals(
                "$210.00", new InvestmentPage(driver).getFee());
        Assert.assertEquals(
                "$14,210.00", new InvestmentPage(driver).getTotal());

        new InvestmentPage(driver).clickMakeInvestment();
        Assert.assertEquals(
                true, new InvestmentPage(driver).confirmationText.isEnabled());
//        new UserDashboard(driver).openMyBitsHoldings();
        Assert.assertEquals(
                true, driver.findElement(By.xpath("//ul[@class='products-list product-list-in-box']/li/div[2]/a[2]/span")).isEnabled());
    }

    @Ignore
    @Test
    public void test05_buyAssetWithDiscount_Investor1(){
//        webpages.MainPage().openUserProfile();
//        driver.get(webpages.MainInfo().getReferralLink());

    }

    @Test
    public void test06_createFixedBonusPromoCodeAndBuyAsset_Investor1(){
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openManagerDashboard()
                .openPromoCodeList()
                .createFixedBonus(data.getProperty("quantityOfPromoCode"), data.getProperty("valueOfFixedBonus"));
        Assert.assertEquals(
                "Fixed Bonus", new PromoCodeList(driver).getPromoType());

        new MainPage(driver)
                .signOut()
                .openLoginPage()
                .loginAs("","")
                .openBuildingsList()
                .openBuildingDetailsPage(1)
                .clickInvestNowButton()
                .setInvestDataWithPromoCode("", PromoCodeList.fixedBonus, "");
        Assert.assertEquals("$14,000.00", new InvestmentPage(driver).getSubtotal());
        Assert.assertEquals("$210.00", new InvestmentPage(driver).getFee());
        Assert.assertEquals("$14,110.00", new InvestmentPage(driver).getTotal());

        new InvestmentPage(driver).clickMakeInvestment();
        Assert.assertEquals(true, driver.findElement(By.cssSelector(".page-header")).isEnabled());

        new MainPage(driver).openUserDashboard().openTransactionsList();
        Assert.assertEquals("14110.00", new TransactionList(driver).getAmount());
        Assert.assertEquals("Investments", new TransactionList(driver).getStatus());
    }

    @Test
    public void test07_createPurchasePriceDiscountPromoCodeAndBuyAsset_Investor2(){
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openManagerDashboard()
                .openPromoCodeList()
                .createPurchasePriceDiscount(data.getProperty("quantityOfPromoCode"), data.getProperty("valueOfPriceDiscount"));
        Assert.assertEquals("Purchase Price Discount (%)", new PromoCodeList(driver).getPromoType());

        new MainPage(driver)
                .signOut()
                .openLoginPage()
                .loginAs("", "")
                .openBuildingsList()
                .openBuildingDetailsPage(1)
                .clickInvestNowButton()
                .setInvestDataWithPromoCode("13000", PromoCodeList.purchasePriceDiscount,"TestName");
        Assert.assertEquals("$14,000.00", new InvestmentPage(driver).getSubtotal());
        Assert.assertEquals("$210.00", new InvestmentPage(driver).getFee());
        Assert.assertEquals("$12,810.00", new InvestmentPage(driver).getTotal());

        new InvestmentPage(driver).clickMakeInvestment();
        Assert.assertEquals(true, driver.findElement(By.cssSelector(".page-header")).isEnabled());

        new UserDashboard(driver).openTransactionsList();
        Assert.assertEquals("12810.00", new TransactionList(driver).getAmount());
    }


    @Test
    public void test08_createPromoCodeWithFreeDiscountAndBuyAsset_Investor2(){
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openManagerDashboard()
                .openPromoCodeList()
                .createFreeDiscount(data.getProperty("quantityOfPromoCode"));
        Assert.assertEquals("Free Discount (%)", new PromoCodeList(driver).getPromoType());

        new MainPage(driver)
                .signOut()
                .openLoginPage()
                .loginAs("", "")
                .openBuildingsList()
                .openBuildingDetailsPage(1)
                .clickInvestNowButton()
                .setInvestDataWithPromoCode("13000", PromoCodeList.freeDiscount, "TestName");

        Assert.assertEquals("$14,000.00", new InvestmentPage(driver).getSubtotal());
        Assert.assertEquals("$0.00", new InvestmentPage(driver).getFee());
        Assert.assertEquals("$14,000.00", new InvestmentPage(driver).getTotal());

        new InvestmentPage(driver).clickMakeInvestment();
        Assert.assertEquals(true, driver.findElement(By.cssSelector(".page-header")).isEnabled());


        new UserDashboard(driver).openTransactionsList();
        Assert.assertEquals("14000.00", new TransactionList(driver).getAmount());
    }

    @Test
    public void test09_addCommentOnFirstAsset_Investor1(){
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openBuildingsList()
                .openBuildingDetailsPage(1)
                .addComment(data.getProperty("comment1"));
        Assert.assertEquals(data.getProperty("comment1"), new BuildingDetails(driver).getComment());
    }

    @Test
    public void test10_addCommentOnSecondAsset_Investor2(){
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openBuildingsList()
                .openBuildingDetailsPage(1)
                .addComment(data.getProperty("comment2"));
        Assert.assertEquals(data.getProperty("comment2"), new BuildingDetails(driver).getComment());
    }

}
