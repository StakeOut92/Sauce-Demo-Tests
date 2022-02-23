package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.LoginUpPage;
import pompages.SwitchTabPage;

public class SwitchToAnotherTabTest extends BaseTest {
    SwitchTabPage switchTabPage;
    LoginUpPage loginUpPage;

    @Test
    public void loginAtSouceDemoAndSwitchToAnotherTabTest() {
        loginUpPage = new LoginUpPage(driver);
        loginUpPage.loginForCart();
        switchTabPage = new SwitchTabPage(driver);
        switchTabPage.clickLinkedIn();
        Assert.assertTrue(switchTabPage.switchToLinkedInPage());
    }
}
