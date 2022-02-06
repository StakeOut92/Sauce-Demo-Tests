package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class SauceDemoTest extends BaseTest {

    @Test
    public void loginUpTest() {
        //Check Login is success
        boolean loginSuccessMessage = driver.findElement(By.className("title")).isDisplayed();
        Assert.assertTrue(loginSuccessMessage,"Message 'Product is not show'");
    }

}
