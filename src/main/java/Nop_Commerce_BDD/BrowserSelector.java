package Nop_Commerce_BDD;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserSelector extends Utils {
    LoadProperties props = new LoadProperties();

    public void setUpBrowser() {
        //Storing the value of browser from config file in a String Variable
        String browser = System.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {

            //setting system properties to launch chrome browser
            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Resources\\WebBrowsers\\chromedriver.exe");

            //open the browser

            ChromeOptions options = new ChromeOptions();
            // options.addArguments("disable-infobars");
            // options.addArguments("--disable-extensions");
            //options.addArguments("--disable-setUpBrowser-side-navigation");
            //options.addArguments("--incognito");
            // options.addArguments("--disable-blink-features=BlockCredentialedSubresources");
            // driver = new ChromeDriver(options);
            driver = new ChromeDriver();


        } else if (browser.equalsIgnoreCase("firefox")) {
            //DesiredCapabilities ff = DesiredCapabilities.firefox();
           // ff.acceptInsecureCerts();
            //ff.setAcceptInsecureCerts(true);
           // FirefoxOptions options = new FirefoxOptions();
           // options.merge(ff);
           System.setProperty("webdriver.gecko.driver", "src\\test\\java\\Resources\\WebBrowsers\\geckodriver.exe");
            driver = new FirefoxDriver();//tried to merge ff here but didn't work
        }
            else if(browser.equalsIgnoreCase("IE")){
                System.setProperty("webdriver.ie.driver","src\\test\\java\\Resources\\WebBrowsers\\IEDriverServer.exe");
                InternetExplorerOptions internetExplorerOptions=new InternetExplorerOptions();
                internetExplorerOptions.setCapability(InternetExplorerDriver.IE_SWITCHES,"-private");
                internetExplorerOptions.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
                driver= new InternetExplorerDriver(internetExplorerOptions);}


             else {

            System.out.println("Browser name is either empty or typed wrong :" + browser);}

        }
    }







