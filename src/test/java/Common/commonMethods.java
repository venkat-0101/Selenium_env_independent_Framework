package Common;

import LoadProperties.LoadWebDriverProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class commonMethods {

    public static WebDriver driver = null;

    public static WebDriver setupDriver(){
        switch (LoadWebDriverProperties.getBrowserName()) {
            case "chrome":
            {
                driver = new ChromeDriver();
                break;
            }
            case "edge":
            {
                driver = new EdgeDriver();
                break;
            }
            default:
            {
                System.out.println("Invalid browsername");
            }
        }
        return driver;
    }
}
