package fluentpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.UserNamesAndPasswords;
import staticdata.WebUrls;

public class FluentLoginUpPage extends BasePage{

    private By USERNAME_INPUT = By.id("user-name");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("login-button");



    public FluentLoginUpPage openSouceDemoHomepage() {
        driver.get(WebUrls.SAUCE_DEMO_HOMEPAGE);
        return this;
    }

    public FluentLoginUpPage inputUsername() {
        driver.findElement(USERNAME_INPUT).sendKeys(UserNamesAndPasswords.USER_NAME_ONE);
        return this;
    }

    public FluentLoginUpPage inputPassword(){
        driver.findElement(PASSWORD_INPUT).sendKeys(UserNamesAndPasswords.USER_PASSWORD);
        return this;
    }

    public FluentLoginUpPage clickLoginButton(){
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }


    public FluentLoginUpPage(WebDriver driver) {
        super(driver);
    }
}
