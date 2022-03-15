package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.LoginUpPage;
import pompages.SwitchTabPage;
import utilites.Retry;

public class SwitchToAnotherTabTest extends BaseTest {
    SwitchTabPage switchTabPage;
    LoginUpPage loginUpPage;

    @Test(retryAnalyzer = Retry.class)
    public void loginAtSouceDemoAndSwitchToAnotherTabTest() {
        loginUpPage = new LoginUpPage(driver);
        loginUpPage.loginForCart();
        driverManager.removeTimeout();
        switchTabPage = new SwitchTabPage(driver);
        switchTabPage.clickLinkedIn();
        Assert.assertTrue(switchTabPage.switchToLinkedInPage());
    }
}
