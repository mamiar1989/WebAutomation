package ApplicationTestDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage extends ApplicationTestLogin {

    @Test
    public static void testDemo() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/header/div/nav/a[1]")).click();
        Thread.sleep(6000);
    }

    @Test
    public static void testPricing() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/header/div/nav/a[2]")).click();
        Thread.sleep(10000);
    }


    @Test
    public static void testFeatures() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/header/div/nav/div[1]/span")).click();
        Thread.activeCount()

    }


}
