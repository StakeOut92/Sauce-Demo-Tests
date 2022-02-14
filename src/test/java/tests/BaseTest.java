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
//        driver.get(WebUrls.SAUCE_DEMO_HOMEPAGE);
//        //Input login user name
//        driver.findElement(By.id("user-name")).sendKeys(UserNamesAndPasswords.USER_NAME);
//        //Input user password
//        driver.findElement(By.id("password")).sendKeys(UserNamesAndPasswords.USER_PASSWORD);
//        //Click on 'Login' button
//        driver.findElement(By.id("login-button")).click();
    }

    @AfterMethod
    public void shutOff() {
        driver.quit();
    }
}
