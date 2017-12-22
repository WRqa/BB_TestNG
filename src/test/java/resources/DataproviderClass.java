package resources;

import org.junit.runners.Parameterized;
import org.testng.annotations.DataProvider;

import java.util.Collection;

public class DataproviderClass {

    @DataProvider
    public static Object[][] testData() {
        return new Object[][]{
                {"", "", "Please enter your "},
                {"", "", "Please enter your "},
                {"workrocksqa@gmail.com", "test5545", "Please check your email or password"},
                {"twregfs", "ffasd", "Please enter a valid email address."},
        };
    }

    @DataProvider
    public static Object[][] sellerRegister() {
        return new Object[][]{
                {"workrocksqa2@gmail.com", "test555", "Seller", "Name"}
        };
    }

    @DataProvider
    public static Object[][] investor1Register() {
        return new Object[][]{
                {"investor1qa@gmail.com", "test555", "Investor", "Name"}
        };
    }

    @DataProvider
    public static Object[][] seller() {
        return new Object[][]{
                {"workrocksqa@gmail.com", "test555"}
        };
    }

    @DataProvider
    public static Object[][] investor1() {
        return new Object[][]{
                {"investor1qa@gmail.com", "test555"}
        };
    }

    @DataProvider
    public static Object[][] investor2() {
        return new Object[][]{
                {"investor2qa@gmail.com", "test555"}
        };
    }

    @DataProvider
    public static Object[][] addressDataOfAsset() {
        return new Object[][]{
                {"", "", "", "", "", "Please enter", "Please enter", "Please enter ZIP Code"},
                {"Nebraska", "Omaha", "Ames Ave, 5", "10 avenue", "68134", "", "", ""}
        };
    }

    @DataProvider
    public static Object[][] buildingInfoDataOfAsset(){
        return new Object[][]{
                {"", "", "", "", "", "", "", 0, 0, 0, "Please enter building name", "Please enter your Price", "Please enter square footage", "Please select an options from the list", "Please enter building class"},
                {"Test Building 1", "200000", "20000", "5", "55", "5000", "2005", 1, 2, 2, "", "", "", "", ""}
        };
    }

    @DataProvider
    public static Object[][] rentRollDataOfAsset(){
        return new Object[][]{
                {"Tenant1", "1000", "01/01/2016", "31/12/2018", "50000", "50000", "250000", 5, "10000", "10000" ,"10000", "10000", "10000", "10000"}
        };
    }

    @DataProvider
    public static Object[][] reportDataOfAsset() {
        return new Object[][]{
                {"250000", "Test report"}
        };
    }
}
