package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.WeakHashMap;

public class
OldHomePage {

    public static void main(String[] args) throws InterruptedException {
        String amazonUrl="https://www.amazon.com/";
        String productName="Mask";
        String searchBoxLocator="twotabsearchtextbox";
        String searchButtonLocator="nav-search-submit-button";



        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();



        driver.get(amazonUrl);
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.findElement(By.id(productName));
        driver.manage().window().fullscreen();
        driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        driver.findElement(By.id(productName)).sendKeys();
        driver.findElement(By.id("nav-search-submit-button")).click();

//Thread.sleep(5000);
// driver.close();
/*
        String fireFoxDriverPath="BrowserDriver/windows/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",fireFoxDriverPath);
        WebDriver driver1= new FirefoxDriver();
        driver1.get("https://www.amazon.com/");
        driver1.manage().window().fullscreen();
        driver1.findElement(By.id("twotabsearchtextbox"));
*/


    }
}




