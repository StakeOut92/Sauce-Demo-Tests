package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilites.PropertiesManager;
import staticdata.WebUrls;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        PropertiesManager propertiesManager = new PropertiesManager();
        System.setProperty("webdriver.chrome.driver", propertiesManager.get("PATH_TO_CHROME_DRIVER"));
        driver = new ChromeDriver();
        driver.get(WebUrls.SAUCE_DEMO_HOMEPAGE);
        //Input login user name
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Input user password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Click on 'Login' button
        driver.findElement(By.id("login-button")).click();
        System.out.println("Start Driver");

    }

    @AfterMethod
    public void shutOff() {
        driver.quit();
    }




}
