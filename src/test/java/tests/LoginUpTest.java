package tests;

import pompages.LoginUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.Retry;

public class LoginUpTest extends BaseTest {
    LoginUpPage loginUpPage;

    @Test(retryAnalyzer = Retry.class)
    public void loginUpTest() {
        loginUpPage = new LoginUpPage(driver);
        loginUpPage.openSouceDemoHomepage();
        loginUpPage.inputUsername();
        loginUpPage.inputPassword();
        loginUpPage.clickLoginButton();
        boolean loginIsCorrect = loginUpPage.checkLoginIsSuccess();
        Assert.assertTrue(loginIsCorrect, "Login is not correct");
    }
}
