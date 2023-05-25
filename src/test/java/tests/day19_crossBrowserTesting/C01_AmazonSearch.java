package tests.day19_crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.TestBaseCross;

public class C01_AmazonSearch extends TestBaseCross {

    @Test
    public void amazonTest(){

        // amazon anasayfaya gidelim
        driver.get("http://www.amazon.com");
        // Nutella icin arama yapalim

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("Nutella" + Keys.ENTER);

        // sonuclarin Nutella icerdigini test edelim
        String expectedIcerik = "Nutella";
        WebElement resultTextElement = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        String actualResultText =resultTextElement.getText();
        Assert.assertTrue(actualResultText.contains(expectedIcerik));

    }
}
