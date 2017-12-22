
import com.workrocks.project.Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Suite6_ManagerAction extends BasicData {
    @BeforeTest
    public void managerLogin() {
        new MainPage(driver)
                .openLoginPage()
                .loginAs(data.getProperty("manager"), data.getProperty("managerPassword"));
    }

    @Test
    public void test01_searchAssetByNameOnUnderReviewPage() {
//        webpages.ManagerDashboard().openBuildingsUnderReviewPage();
//        webpages.BuildingsUnderReview().searchAssetByName("UnderReview Don't touch");
//        Assert.assertEquals(
//                "UnderReview Don't touch", webpages.BuildingsUnderReview().getBuildingName());
    }

    @Test
    public void test02_searchAssetBySellerOnUnderReviewPage() {
//        webpages.ManagerDashboard().openBuildingsUnderReviewPage();
//        webpages.BuildingsUnderReview().searchAssetBySeller("Test account");
//        Assert.assertEquals(
//                "Test account", webpages.BuildingsUnderReview().getSellerName());
    }

    @Test
    public void test03_searchAssetByNameOnApprovedAssetList() {
        new MainPage(driver)
                .openManagerDashboard()
                .openApprovedAssetsList();

//        webpages.ManagerDashboard().openApprovedAssetsList();
//        webpages.ApprovedAssets().searchAssetByName("Approved Don't touch");
//        Assert.assertEquals(
//                "Approved Don't touch", webpages.ApprovedAssets().getBuildingName());
    }

    @Test
    public void test04_searchAssetBySellerOnApprovedAssetList() {
//        webpages.ManagerDashboard().openApprovedAssetsList();
//        webpages.ApprovedAssets().searchAssetBySeller("Regression account");
//        Assert.assertEquals(
//                "Regression account", webpages.ApprovedAssets().getSellerName());
    }

    @Test
    public void test05_sortAssetByPhasesOnApprovedAssetList(){
//        webpages.ManagerDashboard().openApprovedAssetsList();
//        webpages.ApprovedAssets().selectPhaseInDropdown();
//        //wait.until(ExpectedConditions.textToBePresentInElement(webpages.ApprovedAssets().phase,"A (Pre-Acquisition)"));
//        Assert.assertEquals(
//                "A (Pre-Acquisition)", webpages.ApprovedAssets().getStatus());
//        webpages.ApprovedAssets().selectPhaseInDropdown();
//        //wait.until(ExpectedConditions.textToBePresentInElement(webpages.ApprovedAssets().phase,"B (Due Diligence)"));
//        Assert.assertEquals(
//                "B (Due Diligence)", webpages.ApprovedAssets().getStatus());
    }

    @Test
    public void test06_searchAssetByNameOnTrades() {
//        webpages.ManagerDashboard().openTradesList();
//        webpages.Trades().searchAssetByName("Sold don't touch");
//        Assert.assertEquals(
//                "Sold don't touch", webpages.Trades().getBuildingName());
    }

    @Test
    public void test07_searchAssetBySellerOnTrades() {
//        webpages.ManagerDashboard().openTradesList();
//        webpages.Trades().searchAssetBySeller("Regression account");
//        Assert.assertEquals(
//                "Regression account", webpages.Trades().getSellerName());
    }

    @Test
    public void test08_sortAssetByPhasesOnTrades(){
//        webpages.ManagerDashboard().openTradesList();
//        webpages.Trades().selectPhaseInDropdown();
//        //wait.until(ExpectedConditions.textToBePresentInElement(webpages.Trades().statusIcon,"New"));
//        Assert.assertEquals(
//                "New", webpages.Trades().getStatus());
//        /*webpages.Trades().selectPhaseInDropdown();
//        wait.until(ExpectedConditions.textToBePresentInElement(webpages.Trades().statusIcon,"In progress"));
//        Assert.assertEquals("In Progress", webpages.ApprovedAssets().getStatus());*/
//        webpages.Trades().selectPhaseInDropdown();
//        //wait.until(ExpectedConditions.textToBePresentInElement(webpages.Trades().statusIcon,"Sold"));
//        Assert.assertEquals(
//                "Sold", webpages.Trades().getStatus());
    }

    @Test
    public void test09_searchAssetByNameOnSoldOutAssetsList() {
//        webpages.ManagerDashboard().openSoldOutAssetsList();
//        webpages.SoldOutAssets().searchAssetByName("Sold don't touch");
//        Assert.assertEquals(
//                "Sold don't touch", webpages.SoldOutAssets().getBuildingName());
    }

    @Test
    public void test10_searchAssetBySellerOnSoldOutAssetsList() {
//        webpages.ManagerDashboard().openSoldOutAssetsList();
//        webpages.SoldOutAssets().searchAssetBySeller("Sergey account");
//        Assert.assertEquals(
//                "Sergey account", webpages.SoldOutAssets().getSellerName());
    }


    @Test
    public void test11_addReportOnFinancialSummaryPage(){
//        webpages.ManagerDashboard().openSoldOutAssetsList();
//        webpages.SoldOutAssets().addReport(
//                "10000",
//                "10000",
//                "1000",
//                "1000",
//                "1000",
//                "1000",
//                "1000",
//                "01/2017");
//        Assert.assertEquals(
//                "20000.0", String.valueOf(webpages.FinancialSummary().getTotalGrossIncome()));
//        Assert.assertEquals(
//                "5000.0", String.valueOf(webpages.FinancialSummary().getTotalExpenses()));
//        Assert.assertEquals(
//                "15000.0", String.valueOf(webpages.FinancialSummary().getNetOperatingIncome()));
//        webpages.FinancialSummary().clickOkButton();
//        //wait.until(ExpectedConditions.visibilityOf(webpages.FinancialSummary().distributeButton));
//        webpages.FinancialSummary().clickDistribute();
//        Assert.assertEquals(true, driver.findElement(By.xpath("//tr[@class='userRow']/td[7]/span")).getText().contains("Distribute"));
    }



    @Test
    public void test12_searchInvestmentByAssetOnInvestmentList(){
//        webpages.ManagerDashboard().openInvestmentList();
//        webpages.Investment().searchAssetByName("Sold don't touch");
//        Assert.assertEquals(
//                "Sold don't touch", webpages.Investment().getBuildingName());
    }


    @Test
    public void test13_searchInvestmentByInvestorOnInvestmentList() {
//        webpages.ManagerDashboard().openInvestmentList();
//        webpages.Investment().searchAssetByInvestor("Regression account");
//        Assert.assertEquals(
//                "Regression account", webpages.Investment().getInvestorName());
    }


    @Test
    /**
     * At the moment all types do not exist in the system.
     */
    public void test14_sortInvestmentByStatusOnInvestmentList() {
//        webpages.ManagerDashboard().openInvestmentList();
//        webpages.Investment().selectInvestmentStatusInDropdown();
//        Assert.assertEquals(
//                "New", webpages.Investment().getStatus());
//        webpages.Investment().selectInvestmentStatusInDropdown();
//        Assert.assertEquals(
//                "Paid", webpages.Investment().getStatus());
//        webpages.Investment().selectInvestmentStatusInDropdown();
//        Assert.assertEquals(
//                "Cancel", webpages.Investment().getStatus());
//        webpages.Investment().selectInvestmentStatusInDropdown();
//        Assert.assertEquals(
//                "Overdue", webpages.Investment().getStatus());
//        webpages.Investment().selectInvestmentStatusInDropdown();
//        Assert.assertEquals(
//                "Rejected", webpages.Investment().getStatus());
    }

    @Test
    public void test15_searchUserByFirstNameOnUserList() {
        boolean checkUserByLastNameIsPresenseOnList = new MainPage(driver)
                .openManagerDashboard()
                .openUserList()
                .searchUserByFirstName("base")
                .isUserNameOnList("base");

        Assert.assertEquals(checkUserByLastNameIsPresenseOnList, true);
    }

    @Test
    public void test16_searchUserByLastNameOnUserList() {
        boolean checkUserByLastNameIsPresenseOnList = new MainPage(driver)
                .openManagerDashboard()
                .openUserList()
                .searchUserByLastName("base")
                .isUserNameOnList("base");

        Assert.assertEquals(checkUserByLastNameIsPresenseOnList, true);
    }

    @Test
    public void test17_searchUserByEmailOnUserList() {
        boolean checkUserEmailIsPresenceOnList = new MainPage(driver)
                .openManagerDashboard()
                .openUserList()
                .searchUserByEmail("bbtestbase@yopmail.com")
                .isEmailOnList("bbtestbase@yopmail.com");

        Assert.assertEquals(checkUserEmailIsPresenceOnList, true);
    }

    @Test
    public void test18_sortUserByRolesOnUserList() throws InterruptedException {
//        new MainPage(driver)
//                .openManagerDashboard()
//                .openUserList()
//                .selectUserRoleInDropdown();
//        Thread.sleep(3000);

//        Assert.assertEquals(
//                "Seller", webpages.UserList().getRole());
//        webpages.UserList().selectUserRoleInDropdown();
//        Assert.assertEquals(
//                "Investor", webpages.UserList().getRole());
//        webpages.UserList().selectUserRoleInDropdown();
//        //Assert.assertEquals("Admin", webpages.UserList().getRole());
//        webpages.UserList().selectUserRoleInDropdown();
//        Assert.assertEquals(
//                "Member", webpages.UserList().getRole());
//        webpages.UserList().selectUserRoleInDropdown();
//        Assert.assertEquals(
//                "Seller, Investor", webpages.UserList().getRole());
    }

    @Test
    public void test19_sendEmailToUserFromUserList(){
//        webpages.ReadMail().clearAllMessages(data.getProperty("investor2"), data.getProperty("gmailpassword"));
//        webpages.ManagerDashboard().openUserList();
//        Assert.assertEquals(
//                data.getProperty("investor2"), webpages.UserList().getEmail());
//        webpages.UserList().sendMessageToUser("Test subject", data.getProperty("textOfSendMessage"));
//        webpages.ReadMail().readFirstMessageFromList(data.getProperty("investor2"), data.getProperty("gmailpassword"));
//        Assert.assertEquals(
//                ReadMail.verify, data.getProperty("textOfSendMessage"));
//        webpages.ReadMail().clearAllMessages(data.getProperty("investor2"), data.getProperty("gmailpassword"));
    }


    @Test
    public void test20_searchUserByEmailOnSubscriptionsList() {
//        webpages.ManagerDashboard().openSubscriptionsList();
//        webpages.Subscriptions().searchByEmail("workrocksqa@gmail.com");
//        Assert.assertEquals(
//                "workrocksqa@gmail.com", webpages.Subscriptions().getEmail());
    }

    @Test
    public void test21_searchTransactionByUserNameOnTransactionList(){
//        webpages.ManagerDashboard().openTransactionList();
//        webpages.TransactionList().searchTransactionByUserName("firstname lastname");
//        Assert.assertEquals(
//                "firstname lastname", webpages.TransactionList().getUserName());
    }

    @Test
    public void test22_searchTransactionByAmountOnTransactionList() {
//        webpages.ManagerDashboard().openTransactionList();
//        webpages.TransactionList().searchTransactionByAmount("500000.00");
//        Assert.assertEquals(
//                "$500000.00", webpages.TransactionList().getAmount());
    }

    @Test
    public void test23_sortTransactionByTypesOnTransactionList() {
//        webpages.ManagerDashboard().openTransactionList();
//        webpages.TransactionList().selectTransactionTypeInDropdown();
//        Assert.assertEquals(
//                "Funding", webpages.TransactionList().getType());
//        webpages.TransactionList().selectTransactionTypeInDropdown();
//        Assert.assertEquals(
//                "Distributions", webpages.TransactionList().getType());
//        webpages.TransactionList().selectTransactionTypeInDropdown();
//        Assert.assertEquals(
//                "Investments", webpages.TransactionList().getType());
        /**
         * At the moment the "Withdrawal" and "Disposal" types do not exist in the system
         */
        /*webpages.TransactionList().selectUserRoleInDropdown();
        Assert.assertEquals("null", webpages.TransactionList().getType());
        webpages.TransactionList().selectUserRoleInDropdown();
        Assert.assertEquals("null", webpages.TransactionList().getType());*/

    }

    @Test
    public void test24_searchCommentByUserNameOnCommentsList() {
//        webpages.ManagerDashboard().openCommentList();
//        webpages.Comments().searchCommentByUserName("Test account");
//        Assert.assertEquals(
//                "Test account", webpages.Comments().getUserName());
    }

    @Test
    public void test25_searchCommentByAssetNameOnCommentsList() {
//        webpages.ManagerDashboard().openCommentList();
//        webpages.Comments().searchCommentByBuildingName("Approved Don't touch");
//        Assert.assertEquals(
//                "Approved Don't touch", webpages.Comments().getBuildingName());
    }

    @Test
    public void test26_searchCommentByMessageOnCommentsList() {
//        webpages.ManagerDashboard().openCommentList();
//        webpages.Comments().searchCommentByMessage(data.getProperty("comment1"));
//        Assert.assertEquals(
//                data.getProperty("comment1"), webpages.Comments().getComment());
    }

    @Test
    public void test27_editCommentOnCommentsList() {
//        webpages.ManagerDashboard().openCommentList();
//        webpages.Comments().editComment("New comment");
//        Assert.assertEquals("New comment", webpages.Comments().getComment());
//        webpages.Comments().forwardOldComment();
//        Assert.assertEquals(
//                Comments.commentBeforeDelete, webpages.Comments().getComment());
    }

    @Test
    public void test28_deleteCommentFromCommentsList() {
//        webpages.ManagerDashboard().openCommentList();
//        webpages.Comments().deleteComment();
//        Assert.assertNotEquals(
//                Comments.commentBeforeDelete, Comments.commentAfterDelete);
    }

    @Test
    public void test29_searchEventByUserNameOnEventsList() {
//        webpages.ManagerDashboard().openEventsList();
//        webpages.EventsList().searchEventByUserName("firstname lastname");
//        Assert.assertEquals(
//                "firstname lastname", webpages.EventsList().getUserName());
    }

    @Test
    public void test30_searchEventByIPOnEventsList() {
//        webpages.ManagerDashboard().openEventsList();
//        webpages.EventsList().searchEventByIP("10.47.100.56");
//        Assert.assertEquals(
//                "10.47.100.56", webpages.EventsList().getIP());
    }

    @Test
    public void test31_checkPresentElementsOnTopPages(){
//        webpages.ManagerDashboard().openTopInvestors();
//        webpages.TopInvestors().presentElementsOnThePage();
//        webpages.ManagerDashboard().openTopReferrals();
//        webpages.TopReferrals().presentElementsOnThePage();
//        webpages.ManagerDashboard().openTopSellers();
//        webpages.TopSellers().presentElementsOnThePage();
    }
}
