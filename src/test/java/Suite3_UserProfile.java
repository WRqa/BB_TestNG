import com.workrocks.project.Pages.Asset_details_page.BuildingDetails;
import com.workrocks.project.Pages.Header_Pages.Profile.*;
import com.workrocks.project.Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.DataproviderClass;


public class Suite3_UserProfile extends BasicData{

    @Test(dataProvider = "sellerRegister", dataProviderClass = DataproviderClass.class)
    public void test01_editPersonalInformationSeller(String email, String password, String firstName, String lastName){
        new MainPage(driver)
                .openLoginPage()
                .loginAs(email, password)
                .openUserProfile();
        Assert.assertEquals(new PersonalInformationTab(driver).getFirstName(), firstName);
        Assert.assertEquals(new PersonalInformationTab(driver).getLastName(), lastName);
        Assert.assertEquals(new PersonalInformationTab(driver).getPhone(), "");
        Assert.assertEquals(new PersonalInformationTab(driver).getNotes(), "");

        new PersonalInformationTab(driver)
                .editPersonalInformation("base", "test", "123123123123213213123", "!!!");

        Assert.assertEquals(new PersonalInformationTab(driver).getFirstName(), "base");
        Assert.assertEquals(new PersonalInformationTab(driver).getLastName(), "test");
        Assert.assertEquals(new PersonalInformationTab(driver).getNotes(), "!!!");

    }

    @Test(dataProvider = "seller", dataProviderClass = DataproviderClass.class)
    public void test11_editAddressTab(String email, String password){
        new MainPage(driver)
                .openLoginPage()
                .loginAs(email, password)
                .openUserProfile()
                .openAddressTab()
                .setAddressData(
                        data.getProperty("state"),
                        data.getProperty("city"),
                        data.getProperty("address1"),
                        data.getProperty("address2"),
                        data.getProperty("zip"));
        driver.navigate().refresh();
        new PersonalInformationTab(driver)
                .openAddressTab();

        Assert.assertEquals(new AddressTab(driver).getState(), data.getProperty("state"));
        Assert.assertEquals(new AddressTab(driver).getCity(), data.getProperty("city"));
        Assert.assertEquals(new AddressTab(driver).getAddress1(), data.getProperty("address1"));
        Assert.assertEquals(new AddressTab(driver).getAddress2(), data.getProperty("address2"));
        Assert.assertEquals(new AddressTab(driver).getZip(), data.getProperty("zip"));
    }

    @Test(dataProvider = "seller", dataProviderClass = DataproviderClass.class)
    public void test01_setQuestionnaire1Seller(String email, String password) {
        new MainPage(driver)
                .openLoginPage()
                .loginAs(email, password)
                .openBuildingsList()
                .setQuestionnaire();
        new MainPage(driver)
                .openUserProfile()
                .openScreeningQuestionsTab();
        Assert.assertEquals(
                new ScreeningQuestionsTab(driver).getRadioBtn11Status().equals("iradio_minimal-orange checked"), true);
        Assert.assertEquals(
                new ScreeningQuestionsTab(driver).getRadioBtn21Status().equals("iradio_minimal-orange checked"), true);
        Assert.assertEquals(
                new ScreeningQuestionsTab(driver).getRadioBtn31Status().equals("iradio_minimal-orange checked"), true);
        Assert.assertEquals(
                new ScreeningQuestionsTab(driver).getRadioBtn41Status().equals("iradio_minimal-orange checked"), true);
    }

    @Test
    public void test02_setQuestionnaire1Investor1() {
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openBuildingsList()
                .setQuestionnaire();
        new MainPage(driver)
                .openUserProfile()
                .openScreeningQuestionsTab();
        Assert.assertEquals(
                true, new ScreeningQuestionsTab(driver).getRadioBtn11Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, new ScreeningQuestionsTab(driver).getRadioBtn21Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, new ScreeningQuestionsTab(driver).getRadioBtn31Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, new ScreeningQuestionsTab(driver).getRadioBtn41Status().equals("iradio_minimal-orange checked"));
    }

    @Test
    public void test03_setQuestionnaire1Investor2() {
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openBuildingsList()
                .setQuestionnaire();
        new MainPage(driver)
                .openUserProfile()
                .openScreeningQuestionsTab();
        Assert.assertEquals(
                true, new ScreeningQuestionsTab(driver).getRadioBtn11Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, new ScreeningQuestionsTab(driver).getRadioBtn21Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, new ScreeningQuestionsTab(driver).getRadioBtn31Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, new ScreeningQuestionsTab(driver).getRadioBtn41Status().equals("iradio_minimal-orange checked"));
    }

    @Test
    public void test04_editScreeningQuestionsTab(){
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openUserProfile()
                .openScreeningQuestionsTab()
                .editScreeningQuestionsData();
        driver.navigate().refresh();
        new PersonalInformationTab(driver)
                .openScreeningQuestionsTab();
        Assert.assertEquals(
                true, new ScreeningQuestionsTab(driver).getRadioBtn14Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, new ScreeningQuestionsTab(driver).getRadioBtn26Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, new ScreeningQuestionsTab(driver).getRadioBtn34Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(
                true, new ScreeningQuestionsTab(driver).getRadioBtn44Status().equals("iradio_minimal-orange checked"));
    }

    @Test
    public void test05_setQuestionnaire2Seller() throws InterruptedException {
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openBuildingsList()
                .openBuildingDetailsPage(1)
                .clickInvestNowButton();
        Thread.sleep(2000);
        new BuildingDetails(driver).setQuestionnaire(
                data.getProperty("dateOfBirth"),
                data.getProperty("socialSecurityNumber"),
                data.getProperty("bankRouting"),
                data.getProperty("profession"),
                data.getProperty("alternativePhone"),
                data.getProperty("alternativeEmail"),
                data.getProperty("residenceAddress"),
                data.getProperty("bankAccount"),
                data.getProperty("seller"));
    }

    @Test
    public void test06_setQuestionnaire2Investor1() throws InterruptedException {
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openBuildingsList()
                .openBuildingDetailsPage(1)
                .clickInvestNowButton();
        Thread.sleep(2000);
        new BuildingDetails(driver).setQuestionnaire(
                data.getProperty("dateOfBirth"),
                data.getProperty("socialSecurityNumber"),
                data.getProperty("bankRouting"),
                data.getProperty("profession"),
                data.getProperty("alternativePhone"),
                data.getProperty("alternativeEmail"),
                data.getProperty("residenceAddress"),
                data.getProperty("bankAccount"),
                data.getProperty("seller"));
    }

    @Test
    public void test07_setQuestionnaire2Investor2() throws InterruptedException {
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openBuildingsList()
                .openBuildingDetailsPage(1)
                .clickInvestNowButton();
        Thread.sleep(2000);
        new BuildingDetails(driver).setQuestionnaire(
                data.getProperty("dateOfBirth"),
                data.getProperty("socialSecurityNumber"),
                data.getProperty("bankRouting"),
                data.getProperty("profession"),
                data.getProperty("alternativePhone"),
                data.getProperty("alternativeEmail"),
                data.getProperty("residenceAddress"),
                data.getProperty("bankAccount"),
                data.getProperty("seller"));
    }

    @Test
    public void test08_checkInvestmentQuestionnaireTab() throws InterruptedException {
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openUserProfile()
                .openInvestmentQuestionnaireTab();
        Thread.sleep(1000);
        Assert.assertEquals(data.getProperty("firstName"), new InvestmentQuestionnaireTab(driver).getFirstName());
        Assert.assertEquals(data.getProperty("lastName"), new InvestmentQuestionnaireTab(driver).getLastName());
        Assert.assertEquals(data.getProperty("dateOfBirth"), new InvestmentQuestionnaireTab(driver).getDateOfBirth());
        Assert.assertEquals(data.getProperty("socialSecurityNumber"), new InvestmentQuestionnaireTab(driver).getSocialSecurityNumber());
        Assert.assertEquals(data.getProperty("bankRouting"), new InvestmentQuestionnaireTab(driver).getBankRouting());
        Assert.assertEquals(true, new InvestmentQuestionnaireTab(driver).getRadio13Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(true, new InvestmentQuestionnaireTab(driver).getNoStatus().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(data.getProperty("profession"), new InvestmentQuestionnaireTab(driver).getProfession());
        Assert.assertEquals(data.getProperty("phone"), new InvestmentQuestionnaireTab(driver).getPhoneEdit());
        Assert.assertEquals(data.getProperty("seller"), new InvestmentQuestionnaireTab(driver).getEmailEdit());
        Assert.assertEquals("1(555) 555-5555", new InvestmentQuestionnaireTab(driver).getAlternativePhone());
        Assert.assertEquals(data.getProperty("alternativeEmail"), new InvestmentQuestionnaireTab(driver).getAlternativeEmail());
        Assert.assertEquals(data.getProperty("residenceAddress"), new InvestmentQuestionnaireTab(driver).getResidenceAdress());
        Assert.assertEquals(data.getProperty("bankAccount"), new InvestmentQuestionnaireTab(driver).getBankAccount());
    }

    @Test
    public void test09_editInvestmentQuestionnaireTab() throws InterruptedException {
        new MainPage(driver)
                .openLoginPage()
                .loginAs("", "")
                .openUserProfile()
                .openInvestmentQuestionnaireTab()
                .editInvestmentQuestionnaireData(
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                );
        driver.navigate().refresh();
        new PersonalInformationTab(driver)
                .openInvestmentQuestionnaireTab();
        Assert.assertEquals(data.getProperty("dateOfBirth"), new InvestmentQuestionnaireTab(driver).getDateOfBirth());
        Assert.assertEquals(data.getProperty("editSocialSecurityNumber"), new InvestmentQuestionnaireTab(driver).getSocialSecurityNumber());
        Assert.assertEquals(data.getProperty("editBankRouting"), new InvestmentQuestionnaireTab(driver).getBankRouting());
        Assert.assertEquals(true, new InvestmentQuestionnaireTab(driver).getRadio12Status().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(true, new InvestmentQuestionnaireTab(driver).getNoStatus().equals("iradio_minimal-orange checked"));
        Assert.assertEquals(data.getProperty("editProfession"), new InvestmentQuestionnaireTab(driver).getProfession());
        Assert.assertEquals("1(123) 456-7890", new InvestmentQuestionnaireTab(driver).getPhoneEdit());
        Assert.assertEquals(data.getProperty("editUserEmail"), new InvestmentQuestionnaireTab(driver).getEmailEdit());
        Assert.assertEquals("1(444) 444-4444", new InvestmentQuestionnaireTab(driver).getAlternativePhone());
        Assert.assertEquals(data.getProperty("editAlternativeEmail"), new InvestmentQuestionnaireTab(driver).getAlternativeEmail());
        Assert.assertEquals(data.getProperty("editResidenceAddress"), new InvestmentQuestionnaireTab(driver).getResidenceAdress());
        Assert.assertEquals(data.getProperty("editBankAccount"), new InvestmentQuestionnaireTab(driver).getBankAccount());
    }



    @Test
    public void test12_editPasswordTab(){
        new MainPage(driver)
                .openLoginPage()
                .loginAs("","")
                .openUserProfile()
                .openChangePasswordTab()
                .changePassword("", "","");
//        webpages.Login().userLogin(data.getProperty("seller"), data.getProperty("newPassword"));
//        webpages.MainPage().openUserProfile();
//        webpages.ChangePasswordTab().editPasswordTab(
//                data.getProperty("newPassword"),
//                data.getProperty("password"),
//                data.getProperty("password"));
    }
}
