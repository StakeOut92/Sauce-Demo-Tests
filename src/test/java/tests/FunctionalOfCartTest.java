package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.CartPage;

public class FunctionalOfCartTest extends BaseTest{
    CartPage cartPage;

    @Test
    public void checkAddToCartButtonIsEnableTest() {
         cartPage = new CartPage(driver);
         cartPage.LogIn();
         cartPage.clickOnProductButton();
         Assert.assertTrue(cartPage.addToCartButtonIsEnable(),"Add to cart button is not enable");
    }

    @Test
    public void moveToCartTest() {
        cartPage = new CartPage(driver);
        cartPage.LogIn();
        cartPage.clickOnProductButton();
        cartPage.addProductToCart();
        Assert.assertTrue(cartPage.shoppingCartButtonIsEnable(),"Shopping cart button is not enable");
    }

    @Test
    public void checkInformationAboutProductInCartTest() {
        cartPage = new CartPage(driver);
        cartPage.LogIn();
        cartPage.clickOnProductButton();
        cartPage.addProductToCart();
        cartPage.shoppingCartButtonClack();
        Assert.assertEquals(cartPage.productItemName(),"Sauce Labs Backpack");
        Assert.assertEquals(cartPage.productItemPrice(),"$29.99");
    }
}
