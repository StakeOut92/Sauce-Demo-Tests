package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoTest extends BaseTest {

    @Test
    public void loginUpTest() {
        //Check Login is success
        boolean loginSuccessMessage = driver.findElement(By.className("title")).isDisplayed();
        Assert.assertTrue(loginSuccessMessage, "Message 'Product is not show'");
    }

    @Test
    public void addToCartTest() {
        //Click on product
        driver.findElement(By.id("item_4_title_link")).click();
        //Click on button 'ADD TO CART'
        boolean addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isEnabled();
        Assert.assertTrue(addToCart, "Cart button is enable");
    }

    @Test
    public void moveToCartTest() {
        //Click on product
        driver.findElement(By.id("item_4_title_link")).click();
        //Click on button 'ADD TO CART'
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //Click on shopping cart container button
        boolean cartButton = driver.findElement(By.id("shopping_cart_container")).isEnabled();
        Assert.assertTrue(cartButton,"Cart button is enable");
    }

    @Test
    public void checkInformationAboutProductInCartTest() {
        //Click on product
        driver.findElement(By.id("item_4_title_link")).click();
        //Click on button 'ADD TO CART'
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //Click on shopping cart container button
        driver.findElement(By.id("shopping_cart_container")).click();
        //Check that product is exists in shopping cart
        String value = driver.findElement(By.className("inventory_item_name")).getText();
        String price = driver.findElement(By.className("inventory_item_price")).getText();
        Assert.assertEquals(price, "$29.99");
        Assert.assertEquals(value, "Sauce Labs Backpack");
    }
}
