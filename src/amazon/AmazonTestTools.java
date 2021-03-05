package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AmazonTestTools {

    public static WebDriver driver;

    @BeforeMethod()
    public static void getBrowserAndUrl(){

        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
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
