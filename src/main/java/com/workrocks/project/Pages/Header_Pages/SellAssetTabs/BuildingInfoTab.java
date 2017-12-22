package com.workrocks.project.Pages.Header_Pages.SellAssetTabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildingInfoTab extends AddressTab{

    public BuildingInfoTab(WebDriver driver){
        super(driver);
        }

    @FindBy (id = "Title") private WebElement buildingName;
    @FindBy (id = "Price") private WebElement salePrice;
    @FindBy (id = "NOI") private WebElement noi;
    @FindBy (id = "NumberOfFloors") private WebElement numberOfFloors;
    @FindBy (id = "NumberOfUnits") private WebElement numberOfUnits;
    @FindBy (id = "SquareFootage") private WebElement squareFootage;
    @FindBy (id = "YearBuilt") private WebElement yearBuilt;

    private void selectTypeOfConstruction(int index){
        driver.findElement(By.xpath("//select[@id='selectedConstructionTypes']/option[" + index + "]")).click();
    }

    private void selectBuildingType(int index){
        driver.findElement(By.xpath("//select[@id='selectedPropertyTypes']/option[" + index + "]")).click();
    }

    private void selectBuildingClass(int index){
        driver.findElement(By.xpath("//div[@class='form-group']/div/div[" + index + "]/div/div")).click();
    }

    private void setBuildingName(String buildingName){
        this.buildingName.clear();
        this.buildingName.sendKeys(buildingName);
    }

    private void setSalePrice(String salePrice){
        this.salePrice.clear();
        this.salePrice.sendKeys(salePrice);
    }

    public Double getSalePrice(){
        return Double.valueOf(salePrice.getAttribute("value").replaceAll(",", ""));
    }

    private void setNOI(String NOI){
        noi.clear();
        noi.sendKeys(NOI);
    }

    private void setNumberOfFloors(String numberOfFloors){
        this.numberOfFloors.clear();
        this.numberOfFloors.sendKeys(numberOfFloors);
    }

    private void setNumberOfUnits(String numberOfUnits){
        this.numberOfUnits.clear();
        this.numberOfUnits.sendKeys(numberOfUnits);
    }

    private void setSquareFootage(String squareFootage){
        this.squareFootage.clear();
        this.squareFootage.sendKeys(squareFootage);
    }

    private void setYearBuilt(String yearBuilt){
        this.yearBuilt.clear();
        this.yearBuilt.sendKeys(yearBuilt);
    }

    public PhotosTab setBuildingInfoData(String buildingName, String salePrice, String NOI, String numberOfFloors, String numberOfUnits,
                                    String squareFootage, String yearBuilt, int typeOfConstruction, int buildingType, int buildingClass){
        if (!buildingName.equals("")){
            setBuildingName(buildingName);
            setSalePrice(salePrice);
            setNOI(NOI);
            setNumberOfFloors(numberOfFloors);
            setNumberOfUnits(numberOfUnits);
            setSquareFootage(squareFootage);
            setYearBuilt(yearBuilt);
            selectTypeOfConstruction(typeOfConstruction);
            selectBuildingType(buildingType);
            selectBuildingClass(buildingClass);
        }
        clickSaveAndNextButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new PhotosTab(driver);
    }
}
