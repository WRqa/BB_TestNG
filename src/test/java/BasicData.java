import com.workrocks.project.Pages.MainPage;
import com.workrocks.project.Pages.Settings.ConfigProperties;
import com.workrocks.project.Pages.Settings.SqlServer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BasicData {

    WebDriver driver;
    WebDriverWait wait;
    ConfigProperties data = new ConfigProperties();
    SqlServer sql = new SqlServer();
    String url = "http://10.47.100.56:14815";
    String outUrl = "http://159.224.194.43:14815";

    String seller = "workrocksqa@gmail.com";
    String investor1 = "investor1qa@gmail.com";
    String investor2 = "investor2qa@gmail.com";
    String password = "test555";

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/workrocksQA/BB_AutoTests/Drivers_for_Selenium/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "/Users/homemac/BB_AutoTests/Drivers_for_Selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30, 500);

        driver.manage().window().fullscreen();

        driver.get(url);
    }

    @AfterSuite
    public void tearDown(){
        if (driver != null)
            driver.quit();
    }
}
