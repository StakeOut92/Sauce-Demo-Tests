package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindLocatorsTest extends BaseTest {

    @Test
    public void classNameLocatorTest() {
        WebElement className = driver.findElement(By.className("inventory_item_label"));
    }

    @Test
    public void tagNameLocatorTest() {
        WebElement tagName = driver.findElement(By.tagName("a"));
    }

    @Test
    public void linkTextLocatorTest() {
        WebElement linkText = driver.findElement(By.linkText("Twitter"));
    }

    @Test
    public void partialLinkTextLocatorTest() {
        WebElement partialLink = driver.findElement(By.partialLinkText("Twi"));
    }

    @Test
    public void xpathLocatorByIdTest() {
        WebElement xpathById = driver.findElement(By.xpath("//*[@id='item_4_title_link']"));
    }

    @Test
    public void xpathLocatorByClassTest(){
        WebElement xpathByClass = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
    }

    @Test
    public void xpathLocatorByTextTest(){
        WebElement xpathByText = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
    }

    @Test
    public void xpathLocatorContainsAttributeTest(){
        WebElement xpathContains = driver.findElement(By.xpath("//div[contains(@class,'inventory')]"));
    }

    @Test
    public void xpathLocatorContainsTextTest(){
        WebElement xpathContainsText = driver.findElement(By.xpath("//div[contains(text(),'Sauce')]"));
    }

    @Test
    public void xpathLocatorAncestorTest(){
        WebElement xpathAncestor = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']//ancestor::a"));
    }

    @Test
    public void xpathLocatorParentTest(){
        WebElement xpathParent = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']//parent::div"));
    }

    @Test
    public void xpathLocatorWithAndConditionsTest(){
        WebElement xpathWithAnd = driver.findElement(By.xpath("//div[@id='shopping_cart_container' and @class='shopping_cart_container']"));
    }

    @Test
    public void cssSelectorByIdTest(){
        WebElement cssById = driver.findElement(By.cssSelector("#inventory_container"));
    }

    @Test
    public void cssSelectorByClassTest(){
        WebElement cssByClass = driver.findElement(By.cssSelector(".inventory_item_name"));
    }

    @Test
    public void cssSelectorByTagnameTest(){
        WebElement cssByTagname = driver.findElement(By.cssSelector("div.inventory_item_name"));
    }

    @Test
    public void cssSelectorByAttributeClassStartingWithINVTest(){
        WebElement cssByAttributeWithINV = driver.findElement(By.cssSelector("[class^='inv']"));
    }

    @Test
    public void cssSelectorByAttributeIdFinishedWithLinkTest(){
        WebElement cssByAttributeWithLink = driver.findElement(By.cssSelector("[id$='link']"));
    }

    @Test
    public void cssSelectorByAllHrefAttributesTest(){
        WebElement cssByAttributeHref = driver.findElement(By.cssSelector("[href*='https://twitter.com/saucelabs']"));
    }

    @Test
    public void cssSelectorByFirstChildTest(){
        WebElement cssByFirstChild = driver.findElement(By.cssSelector("li:first-child"));
    }

    @Test
    public void cssSelectorByNthChildTest(){
        WebElement cssByNthChild = driver.findElement(By.cssSelector(".inventory_list .inventory_item:nth-child(6)"));
    }
}
