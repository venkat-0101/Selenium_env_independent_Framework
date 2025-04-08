package Common;

import LoadProperties.LoadWebDriverProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hooks {

   public static WebDriver driver = null;

    @Before
    public void init(){
       driver =  commonMethods.setupDriver();
       driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}