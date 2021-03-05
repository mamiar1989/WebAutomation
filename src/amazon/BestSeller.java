package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BestSeller {


    WebDriver driver;
    String AmazonUrl = "https://www.amazon.com/";
    String bestSeller = "//*[@id=\"nav-xshop\"]/a[1]"; //xpath


    @BeforeMethod // Before method annotation will help you execute the test case before any other metho
    public void setUp() throws InterruptedException {
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();

        driver.get(AmazonUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);
    }

    @Test(priority = 1)
    public void bestSeller() {
        driver.findElement(By.xpath(bestSeller)).click();
    }


    @Test(priority = 2)
    public void newRelease() throws InterruptedException {
        driver.findElement(By.cssSelector("#nav-hamburger-menu")).sendKeys("New Releases");
        Thread.sleep(6000);
    }

        @Test(priority = 3)
        public void moversAndShakers () throws InterruptedException {
            driver.findElement(By.cssSelector("#nav-hamburger-menu")).getTagName();
            Thread.sleep(6000);

        }

        @AfterMethod
        public void tearDown () {
            driver.quit();

        }
    }