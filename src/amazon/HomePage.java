package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {

    WebDriver driver;
    String amazonUrl = "https://www.amazon.com/";
    String productName = "Mask";
    String searchBoxLocator = "twotabsearchtextbox";
    String searchButtonLocator = "nav-search-submit-button";


    @BeforeMethod
    public void setUp() throws InterruptedException {
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";   // so wecreate a setup method to execute before every test case
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);// we dont want to set the values everytime
        driver=new ChromeDriver();// create a variable named WebDriver
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);
    }

/*
    @Test
   public void testCheckSearchBox(){
        checkSearchBox();
        String expectedText="\"Mask\"";
        String actualText=driver.findElement(By.className("\"a-color-state a-text-bold\"")).getText();
       Assert.assertEquals(actualText,expectedText,"Product does not match");
    }
*/
   public void checkSearchBox() {

        //1rest step is enter product name
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        // 2nd Step click on the search bottom
        driver.findElement(By.id(searchButtonLocator)).click();


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();// close all the windows, better to use this .
       // driver.close();// close only one window


    }


}
