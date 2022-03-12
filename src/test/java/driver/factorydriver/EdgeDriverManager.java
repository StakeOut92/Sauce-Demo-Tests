package driver.factorydriver;

import org.openqa.selenium.edge.EdgeDriver;
import utilites.PropertiesManager;

public class EdgeDriverManager extends DriverManager{
    @Override
    public void createDriver() {
        PropertiesManager propertiesManager = new PropertiesManager();
        System.setProperty("webdriver.edge.driver", propertiesManager.get("PATH_TO_EDGE_DRIVER"));
        driver = new EdgeDriver();
    }
}
