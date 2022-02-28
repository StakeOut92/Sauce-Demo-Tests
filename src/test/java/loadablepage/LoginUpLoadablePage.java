package loadablepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.UserNamesAndPasswords;
import staticdata.WebUrls;

public class LoginUpLoadablePage extends BasePage{


    private By USERNAME_INPUT = By.id("user-name");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("login-button");
    private By LOGIN_BOX_CONTAINER = By.xpath("//div[@class='login-box']");

    public LoginUpLoadablePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return driver.findElement(LOGIN_BOX_CONTAINER).isDisplayed();
    }

    public LoginUpLoadablePage openSouceDemoHomepage() {
        driver.get(WebUrls.SAUCE_DEMO_HOMEPAGE);
        return this;
    }

    public LoginUpLoadablePage inputUsername() {
        driver.findElement(USERNAME_INPUT).sendKeys(UserNamesAndPasswords.USER_NAME_ONE);
        return this;
    }

    public LoginUpLoadablePage inputPassword(){
        driver.findElement(PASSWORD_INPUT).sendKeys(UserNamesAndPasswords.USER_PASSWORD);
        return this;
    }

    public LoginUpLoadablePage clickLoginButton(){
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }
}
