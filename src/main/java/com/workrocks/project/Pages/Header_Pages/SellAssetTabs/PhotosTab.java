package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;

import com.workrocks.project.Pages.Settings.ConfigProperties;
import com.workrocks.project.Pages.Settings.Upload;
import org.openqa.selenium.WebDriver;

public class PhotosTab extends AddressTab{

    public PhotosTab(WebDriver driver){
        super(driver);
    }

    public RentRollTab uploadPhoto(String filePath, String buttonId){
        //new Upload(driver).uploadFile(filePath, buttonId);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='dZUpload']/div[2]/div[1]/img")));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickSaveAndNextButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='dZUpload']/div[2]/div[2]/div[1]")));
        return new RentRollTab(driver);
    }
}
