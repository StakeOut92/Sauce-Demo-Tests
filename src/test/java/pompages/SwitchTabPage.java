package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SwitchTabPage extends BasePage{
    LoginUpPage loginUpPage;

    @FindBy(xpath = "//li[@class='social_linkedin']//a")
    WebElement linkedInLink;

    @FindBy(xpath = "//a[@class='nav__logo-link']")
    WebElement linkedInLogo;

    public boolean switchToLinkedInPage(){
        for (String newWindow : driver.getWindowHandles()){
            driver.switchTo().window(newWindow);
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='nav__logo-link']")));
        return linkedInLogo.isDisplayed();
    }

    public void clickLinkedIn(){
        linkedInLink.click();
    }

    public SwitchTabPage(WebDriver driver) {
        super(driver);
    }
}
