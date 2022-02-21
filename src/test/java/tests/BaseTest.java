package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import staticdata.UserNamesAndPasswords;
import utilites.PropertiesManager;
import staticdata.WebUrls;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        PropertiesManager propertiesManager = new PropertiesManager();
        System.setProperty("webdriver.chrome.driver", propertiesManager.get("PATH_TO_CHROME_DRIVER"));
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void shutOff() {
        driver.quit();
    }
}
