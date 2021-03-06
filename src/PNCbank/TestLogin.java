package PNCbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends PNCTestSetUp {


    @Test
    public static void testCorporationInstitional() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"experiencefragment-78303fa03f\"]/div/div/div[1]/button")).click();
        Thread.sleep(5000);
    }

    @Test
    public static void signIn(){
        driver.findElement(By.xpath("//[@id=\"experiencefragment-78303fa03f\"]/div/div/div[1]/button/span[2]")).click();
    }



    @Test
    public static void testSearchButton() throws InterruptedException {
        //driver.findElement(By.id("//*[@id=\"experiencefragment-78303fa03f\"]/div/div/div[1]/button/span[2]").
        //Thread.sleep(5000);

}
}






