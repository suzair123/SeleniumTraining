package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Connector {

    public static WebDriver driver;


    public WebDriver openBrowser(String browser){

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","./browser/geckodriver.exe");
             driver = new FirefoxDriver();
        }
        return driver;
    }

    public void tearDown(){
        driver.quit();
    }


}
