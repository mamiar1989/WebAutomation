package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Books {

    WebDriver driver;
    String AmazonUrl = "https://www.amazon.com/";
    String productName = "Books";
    String SearchBoxLocator = "twotabsearchtextbox";//id
    String SearchButtonLocator = "nav-search-submit-button";//id


    @BeforeMethod // Before method annotation will help you execute the test case before any other metho
    public void setUp() {
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }

    public void testCheckSearchBox() {
        CheckSearchBox();
        String expectedTest = " \"Books\"";
        String actualText = driver.findElement(By.className("a-color-state a-text-bold")).getText();
        Assert.assertEquals(actualText, expectedTest, "product does not match");

    }

    @Test // this is the test class method  test , this method will open the browser and look for the item to research
    public void
    CheckSearchBox() {
        driver.findElement(By.id(SearchBoxLocator)).sendKeys(productName);
        driver.findElement(By.id(SearchButtonLocator)).click();
    }

    @AfterMethod // this will close the method
    public void tearDown() {
        driver.quit();
        // driver.close();


    }
}
