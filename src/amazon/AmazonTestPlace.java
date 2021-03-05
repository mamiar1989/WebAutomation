package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonTestPlace extends AmazonTestTools {


    @Test(priority = 1)
    private static void amazonLogoTest() {
        driver.findElement(By.id("nav-logo-sprites")).click();
    }

    @Test(priority =  6)
    public static void testLanguageSwitch() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).click();
        sleepFor(4);
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/i")).click();
        sleepFor(4);
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[1]/div/label/i")).click();
        sleepFor(4);
        driver.navigate().back();
    }
    @Test(priority = 3)
    public static void amazonCustomerService(){
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
    }
    }

