package tests;

import driver.factorydriver.DriverFactory;
import driver.factorydriver.DriverManager;
import driver.factorydriver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;
    DriverManager driverManager;

    @BeforeMethod
    public void setUp() {
        DriverFactory factory = new DriverFactory();
        driverManager = factory.getManager(DriverType.EDGE);
        driverManager.createDriver();
        driver = driverManager.getDriver();
        driverManager.maximize();
        driverManager.setTimeout();
    }

    @AfterMethod
    public void shutOff() {
        driver.quit();
    }
}
