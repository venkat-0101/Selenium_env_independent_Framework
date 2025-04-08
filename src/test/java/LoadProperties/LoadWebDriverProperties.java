package LoadProperties;

import java.io.FileReader;
import java.util.Properties;

import static io.cucumber.core.exception.ExceptionUtils.printStackTrace;

public class LoadWebDriverProperties {

    private static Properties props;
    private static String browserName;
    private static String driverName;
    private static String driverPath;
    static String projectDirectory = System.getProperty("user.dir");


    static{
        try(FileReader propertyFile = new FileReader(projectDirectory+"//path to the .properties file"))
        {props = new Properties();
          props.load(propertyFile);
          browserName = props.getProperty("browser_name");

          switch(browserName){
              case "chrome":
              {
                  driverName = props.getProperty("chromedriver_name");
                  driverPath = props.getProperty("chromedriver_path");
                  break;
              }
              case "edge":
              {
                  driverName = props.getProperty("edgedriver_name");
                  driverPath = props.getProperty("edgedriver_path");
                  break;
              }
              default:
              {
                  System.out.println("invalid browser name");
              }
          }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static String getBrowserName(){
        return browserName;
    }

    public static String getDriverName(){
        return driverName;
    }

    public static String getDriverPath(){
        return driverPath;
    }

}
