import com.workrocks.project.Pages.ForgotPassword;
import com.workrocks.project.Pages.MainPage;
import com.workrocks.project.Pages.Settings.ReadMail;
import com.workrocks.project.Pages.Settings.SqlServer;
import com.workrocks.project.Pages.Settings.SqlServer2;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resources.DataproviderClass;


public class Suite1_RegistrationAndPasswordRecovery extends BasicData {

    @Test(dataProvider = "sellerRegister", dataProviderClass = DataproviderClass.class)
    public void test01_sellerRegistration(String email, String password, String firstName, String lastName){
        sql.deleteUserFromDatabase(email);

        new MainPage(driver)
                .openCreateAccountPage()
                .setRegistrationDataAndConfirmIt(firstName, lastName, email, password);

        Assert.assertEquals(driver.findElement(By.className("login-box-body")).isEnabled(), true);
        Assert.assertEquals(driver.findElement(By.xpath("a[@id='userIdentity']/span")).getText(), email);
        Assert.assertEquals(sql.connectionToDatabase(SqlServer.getFirstName, email), firstName);
        Assert.assertEquals(sql.connectionToDatabase(SqlServer.getLastName, email), lastName);
    }

    @Test(dataProvider = "investor1Register", dataProviderClass = DataproviderClass.class)
    public void test02_investor1Registration(String email, String password, String firstName, String lastName){
        sql.deleteUserFromDatabase(data.getProperty("investor1"));

        new MainPage(driver)
                .openCreateAccountPage()
                .setRegistrationDataAndConfirmIt(firstName, lastName, email, password);

        Assert.assertEquals(driver.findElement(By.className("login-box-body")).isEnabled(), true);
        Assert.assertEquals(driver.findElement(By.xpath("a[@id='userIdentity']/span")).getText(), email);
        Assert.assertEquals(sql.connectionToDatabase(SqlServer.getFirstName, email), firstName);
        Assert.assertEquals(sql.connectionToDatabase(SqlServer.getLastName, email), lastName);
    }

    @Test
    public void test03_investor2RegistrationViaReferralLink(){
        //new CreateAccount().deleteUserFromBase("");
        new MainPage(driver)
                .openCreateAccountPage()
                .setRegistrationDataAndConfirmIt("test", "test", "bbtest22222@yopmail.com", "test555");
        Assert.assertEquals(true, driver.findElement(By.className("login-box-body")).isEnabled());
        Assert.assertEquals("bbtest22222@yopmail.com", driver.findElement(By.xpath("a[@id='userIdentity']/span")).getText());

    }

    @Test
    public void test04_checkUsersHaveRegistered(){
        boolean checkUserEmailIsPrecenceOnList = new MainPage(driver)
                .openLoginPage()
                .loginAs(data.getProperty("manager"), data.getProperty("managerPassword"))
                .openManagerDashboard()
                .openUserList()
                .isEmailOnList("kolya@kolya.com");

        Assert.assertEquals(checkUserEmailIsPrecenceOnList, true);
    }

    @Test
    public void test05_passwordRecovery() throws InterruptedException {
        new MainPage(driver)
                .openLoginPage()
                .openForgotPasswordPage()
                .passwordRecovery("");

        Assert.assertEquals(
                true, driver.findElement(By.className("auth__notification")).isDisplayed());
        Thread.sleep(3000);
        new ReadMail(driver).openConfirmationMessage(data.getProperty("seller"), data.getProperty("gmailpassword"));
        new ReadMail(driver).deleteConfirmationMessage(data.getProperty("investor2"), data.getProperty("gmailpassword"));
        new ForgotPassword(driver)
                .setNewPassword(
                    data.getProperty("seller"),
                    data.getProperty("password"),
                    data.getProperty("password"));
        Assert.assertEquals(
                "LOG IN", driver.findElement(By.id("login")).getText());
    }
}
