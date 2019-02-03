package training.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.ConfigTest;
import utility.Connector;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Login {

//    Connector conn = new Connector();
//    WebDriver driver;
//
//    {
//
//     driver =conn.openBrowser();
//
//    }
    public void accessPage(WebDriver driver) throws IOException, InterruptedException {


        ConfigTest conf = new ConfigTest("config");
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);


        driver.get(conf.getProperty("url"));

        driver.findElement(By.id("txtUsername")).sendKeys(conf.getProperty("username"));

        driver.findElement(By.id("txtPassword")).sendKeys(conf.getProperty("password"));

        //driver.findElement(By.id("btnLogin")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement explicit = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("btnLogin"))));
        explicit.click();


        Thread.sleep(Long.parseLong(conf.getProperty("timer")));

        System.out.println("Successful");

     //   return driver.getCurrentUrl();

    }

    public String getURL(WebDriver driver) throws IOException, InterruptedException {

        return driver.getCurrentUrl();

    }



}
