package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import staticdata.WebTimeouts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchTabPage extends BasePage{
    LoginUpPage loginUpPage;

    @FindBy(xpath = "//li[@class='social_linkedin']//a")
    WebElement linkedInLink;

    @FindBy(xpath = "//a[@class='nav__logo-link']")
    WebElement linkedInLogo;


    public boolean SwitchToLinkedInPage(){
        loginUpPage = new LoginUpPage(driver);
        driver.manage().timeouts().implicitlyWait(WebTimeouts.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        loginUpPage.loginForCart();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Set<String> oldWindowsSet = driver.getWindowHandles();
        linkedInLink.click();
        String newWindowHandle = (new WebDriverWait(driver, 10))
                .until(new ExpectedCondition<String>() {
                           public String apply(WebDriver driver) {
                               Set<String> newWindowsSet = driver.getWindowHandles();
                               newWindowsSet.removeAll(oldWindowsSet);
                               return newWindowsSet.size() > 0 ?
                                       newWindowsSet.iterator().next() : null;
                           }
                       }
                );
        driver.switchTo().window(newWindowHandle);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='nav__logo-link']")));
        return linkedInLogo.isDisplayed();
    }


    public SwitchTabPage(WebDriver driver) {
        super(driver);
    }
}
