package Nop_Commerce_BDD;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage{
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperties props = new LoadProperties();

    @Before
    public void setUpBrowser() {

        browserSelector.setUpBrowser();

        //maximise the browser window screen
        driver.manage().window().fullscreen();

        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(props.getProperty("url"));
    }

    @After
    public void teatDown(Scenario scenario){
        if(scenario.isFailed()){
            Utils.takeScreenShot(driver,scenario.getName());
        }
        driver.close();
    }

}
