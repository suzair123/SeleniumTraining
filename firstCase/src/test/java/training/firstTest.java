package training;//import utils.Config;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import training.Pages.Login;
import utility.ConfigTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Connector;

import java.io.IOException;

public class firstTest {

    ConfigTest conf;
    Connector conn = new Connector();
    WebDriver driver;
    Login lt = new Login();
    String url = null;

    public firstTest() throws IOException, InterruptedException {

        conf = new ConfigTest("config");
        driver =  conn.openBrowser(conf.getProperty("browser"));

    }


    @Test (priority = 1)
    public void login() throws InterruptedException, IOException {


//        ConfigTest conf = new ConfigTest("config");
//        Connector conn = new Connector();
//        WebDriver driver =  conn.openBrowser(conf.getProperty("browser"));

    //    Login lt = new Login();
     //   String url =  lt.accessPage(driver);

        lt.accessPage(driver);
    //    System.out.println(url);

 //       Assert.assertEquals(url,"https://opensource-demhrmlive.com/index.php/dashboard");
 //       conn.tearDown();
//        driver.quit();

    }


    @Test (priority = 2)
    public void Dashboartd() throws InterruptedException, IOException {


        url = lt.getURL(driver);
        Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }



}
