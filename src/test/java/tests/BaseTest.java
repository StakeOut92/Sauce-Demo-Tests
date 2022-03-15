package tests;

import driver.factorydriver.DriverFactory;
import driver.factorydriver.DriverManager;
import driver.factorydriver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utilites.TestListeners;
import java.net.MalformedURLException;

@Listeners(TestListeners.class)
public class BaseTest {

    WebDriver driver;
    DriverManager driverManager;

    @BeforeSuite
    @Parameters({"browser"})

    public void setUp(@Optional("chrome") String browser) throws MalformedURLException {
        DriverFactory factory = new DriverFactory();
        DriverType driverType = null;
        if (browser.equals("chrome")){
            driverType = DriverType.CHROME;
        }
        driverManager = factory.getManager(driverType);
        driverManager.createDriver();
        driver = driverManager.getDriver();
        driverManager.maximize();
        driverManager.setTimeout();
    }

    public WebDriver getDriver(){
        return driver;
    }

    @AfterSuite
    public void shutOff() {
        driver.quit();
    }
}
