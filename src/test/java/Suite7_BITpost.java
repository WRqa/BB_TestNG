import com.workrocks.project.Pages.MainPage;
import org.junit.Test;

public class Suite7_BITpost extends BasicData{

    @Test
    public void test01_sellBITsByFixedPrice_Investor1() throws InterruptedException {
        new MainPage(driver)
                .openLoginPage()
                .loginAs(data.getProperty("investor1"), data.getProperty("password"))
                .openUserDashboard()
                .openMyBitsHoldings()
                .selectBuildingFromListAndOpenIt(1)
                .createFixedPriceTrade("2","01/02/2017","05/02/2017","1111");
    }

    @Test
    public void test02_sellBITsFromAuction_Investor1() throws InterruptedException {
        new MainPage(driver)
                .openLoginPage()
                .loginAs(data.getProperty("investor1"), data.getProperty("password"))
                .openUserDashboard()
                .openMyBitsHoldings()
                .selectBuildingFromListAndOpenIt(1)
                .createAuctionTrade("3", "50","01/06/2017","1050","1300","1500");
    }

    @Test
    public void test03_buyBitsWithFixedPrice_Seller(){
        new MainPage(driver)
                .openLoginPage()
                .loginAs(data.getProperty("investor2"), data.getProperty("password"))
                .openTradesList()
                .openTradeDetailsPage(1)
                .clickBuyButton()
                .setFixedPriceAndBuyBITs("Test");
    }

    @Test
    public void test04_buyBitsFromAuction_Investor2(){

    }
}
