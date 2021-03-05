package ApplicationTestDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ApplicationTestLogin {
   static WebDriver driver;

    @BeforeMethod
    public static void setUp() {


        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("https://phptravels.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }


    @AfterMethod
    public static void tearDown() {
        driver.quit();
    }

}


