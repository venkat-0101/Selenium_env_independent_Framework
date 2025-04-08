package Steps;

import LoadProperties.LoadWebDriverProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.demopage;

public class demoSteps extends demopage {

    @Given("The user launched the webdriver")
    public void the_user_launched_the_webdriver() {
        System.out.println("inside step 1");
    }
   @Then ("search the amazon url")
        public void search_the_amazon_url(){
        getUrl();
        }
    @Then("Close the webdriver session")
    public void close_the_webdriver_session() {
        System.out.println("inside step 3");
        System.out.println(LoadWebDriverProperties.getBrowserName());
        System.out.println(LoadWebDriverProperties.getDriverName());
        System.out.println(LoadWebDriverProperties.getDriverPath());
    }
}
