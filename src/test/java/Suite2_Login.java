
import com.workrocks.project.Pages.Login;
import com.workrocks.project.Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.*;
import resources.DataproviderClass;


public class Suite2_Login extends BasicData{

    @BeforeClass
    public void openLoginPage(){
        new MainPage(driver)
                .openLoginPage();
    }

    @Test(dataProvider = "testData", dataProviderClass = DataproviderClass.class)
    public void testLogin(String email, String password, String message){
        new Login(driver)
                .loginAs(email, password);

        Assert.assertTrue(driver.getPageSource().contains(message));
    }


//    @Test
//    public void test01_loginWithValidData(){
//        new MainPage(driver)
//                .openLoginPage()
//                .loginAs(data.getProperty("seller"), data.getProperty("password"));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("dropdown")));
//        Assert.assertTrue(
//                driver.findElement(By.linkText("Sign out")).isDisplayed());
//    }

}
