package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    LoginUpPage loginUpPage;

    private By PRODUCT_NAME = By.id("item_4_title_link");
    private By ADD_TO_CART_BUTTON = By.id("add-to-cart-sauce-labs-backpack");
    private By SHOPPING_CART_BUTTON = By.id("shopping_cart_container");
    private By PRODUCT_ITEM_NAME = By.className("inventory_item_name");
    private By PRODUCT_ITEM_PRICE = By.className("inventory_item_price");

    public void LogIn(){
        loginUpPage = new LoginUpPage(driver);
        loginUpPage.openSouceDemoHomepage();
        loginUpPage.inputUsername();
        loginUpPage.inputPassword();
        loginUpPage.clickLoginButton();
    }

    public void clickOnProductButton(){
        driver.findElement(PRODUCT_NAME).click();
    }

    public void addProductToCart(){
        driver.findElement(ADD_TO_CART_BUTTON).click();
    }

     public boolean addToCartButtonIsEnable(){
       return driver.findElement(ADD_TO_CART_BUTTON).isEnabled();
    }

    public void shoppingCartButtonClack(){
        driver.findElement(SHOPPING_CART_BUTTON).click();
    }

    public boolean  shoppingCartButtonIsEnable(){
        return driver.findElement(SHOPPING_CART_BUTTON).isEnabled();
    }

    public String productItemName(){
       return driver.findElement(PRODUCT_ITEM_NAME).getText();
    }

    public String productItemPrice(){
       return driver.findElement(PRODUCT_ITEM_PRICE).getText();
    }

    public CartPage(WebDriver driver) {
        super(driver);
    }
}
