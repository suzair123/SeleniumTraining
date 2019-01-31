//import utils.Config;

import Config.ConfigTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class firstTest {
    public static void main(String[] args) throws InterruptedException, IOException {


        System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver","./browser/geckodriver.exe");

        WebDriver driver = new ChromeDriver();

        ConfigTest conf = new ConfigTest("config");

        driver.get(conf.getProperty("url"));

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        driver.findElement(By.id("btnLogin")).click();

        Thread.sleep(Long.parseLong(conf.getProperty("timer")));

        System.out.println("Successful");

        driver.quit();

    }
}
