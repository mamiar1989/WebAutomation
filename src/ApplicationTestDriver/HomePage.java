package ApplicationTestDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class
HomePage extends ApplicationTestLogin {

    @Test(priority = 1)
    public static void testDemo() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/header/div/nav/a[1]")).click();
        Thread.sleep(6000);
    }

    @Test(priority = 2)
    public static void testPricing() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/header/div/nav/a[2]")).click();
        Thread.sleep(10000);
    }


    @Test(priority = 3)
    public static void testFeatures() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/header/div/nav/div[1]/span")).click();
        Thread.sleep(5000);

    }

    @Test(priority = 4)
    public static void testIntegration() throws InterruptedException {
        driver.findElement(By.cssSelector(" body > header > div > nav > a:nth-child(5)")).click();
        Thread.sleep(5000);

    }

    @Test(priority = 5)
    public static void testDocs() throws InterruptedException {
        driver.findElement(By.cssSelector(" body > header > div > nav > a:nth-child(6)")).click();
        Thread.sleep(5000);
    }


    @Test(priority = 6)
    public static void testBlog() throws InterruptedException {
        driver.findElement(By.cssSelector(" body > header > div > nav > a:nth-child(7)")).click();
        Thread.sleep(5000);

    }

    @Test(priority = 7)
    public static void testCompany() throws InterruptedException {
        driver.findElement(By.cssSelector(" body > header > div > nav > div.lvl-0.dropdown.headerLang")).click();
        Thread.sleep(5000);
    }


    @Test(priority = 8)
    public static void testLogin() throws InterruptedException {
        driver.findElement(By.xpath(" /html/body/header/div/nav/a[6]")).click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("#inputEmail")).sendKeys("mariaamiar89@gmail.com");

    }
}