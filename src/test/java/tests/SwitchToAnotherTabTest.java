package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.SwitchTabPage;

public class SwitchToAnotherTabTest extends BaseTest{

    SwitchTabPage switchTabPage;

    @Test
    public void loginAtSouceDemoAndSwitchToAnotherTabTest(){
        switchTabPage = new SwitchTabPage(driver);
        Assert.assertTrue(switchTabPage.SwitchToLinkedInPage());
    }

}
