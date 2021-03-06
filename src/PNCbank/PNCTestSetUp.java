package PNCbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PNCTestSetUp {


    public static WebDriver driver;
   public static String pncUrl = "https://www.pnc.com/";

    @BeforeMethod
    public static void setUp() {

        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";   // so wecreate a setup method to execute before every test case
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);// we dont want to set the values everytime
        driver = new ChromeDriver();// create a variable named WebDriver
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.get(pncUrl);
    }
    @AfterMethod
    public static void tearDown() throws InterruptedException {
        sleepFor(3);
        driver.close();
    }

    public static void sleepFor(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }
    }



