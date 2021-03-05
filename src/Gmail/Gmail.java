package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

    public static void main(String[] args) throws InterruptedException {
        String chromeWebDriverPath="BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeWebDriverPath);
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.gmail.com/");
        driver.findElement(By.id("identifierId")).sendKeys("mariaamiar89@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.className("VfPpkd-RLmnJb")).click();
        Thread.sleep(6000);
        String at = driver.getTitle();
        String et ="Gmail";
        driver.close();
        if(at.equalsIgnoreCase(et)){
            System.out.println("Test Passed");
        }else{
            System.out.println(" Test failed");
        }
    }



}
