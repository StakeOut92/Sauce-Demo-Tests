package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.UserNamesAndPasswords;
import staticdata.WebUrls;

public class LoginUpPage extends BasePage {

    private By USERNAME_INPUT = By.id("user-name");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("login-button");
    private By LOGIN_SUCCESS = By.className("title");


    public LoginUpPage(WebDriver driver) {
        super(driver);
    }

    public void openSouceDemoHomepage() {
        driver.get(WebUrls.SAUCE_DEMO_HOMEPAGE);
    }

    public void inputUsername() {
        driver.findElement(USERNAME_INPUT).sendKeys(UserNamesAndPasswords.USER_NAME);
    }

    public void inputPassword(){
        driver.findElement(PASSWORD_INPUT).sendKeys(UserNamesAndPasswords.USER_PASSWORD);
    }

    public void clickLoginButton(){
        driver.findElement(LOGIN_BUTTON).click();
    }

    public boolean checkLoginIsSuccess(){
        return driver.findElement(LOGIN_SUCCESS).isDisplayed();
    }

    public void loginForCart(){
        openSouceDemoHomepage();
        inputUsername();
        inputPassword();
        clickLoginButton();
    }

}
