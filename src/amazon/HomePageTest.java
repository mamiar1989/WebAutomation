package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {



    @Test(priority = 2)
    public void testCheckSearchBox(){
        testCheckSearchBox();
        String expectedText="\"Mask\"";
        String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualText,expectedText, "product does not Match");
    }
    @Test(priority = 1)
public void testPageTitle(){
        String expectedText="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"page title nit match");

}



}
