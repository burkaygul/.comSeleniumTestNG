package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ResuableMethods;

public class C01_PagesIlkTest {

    @Test
    public void amazonTest(){

        // amazon anasayfaya gidelim
        Driver.getDriver().get("https://www.amazon.com");
        // Nutella icin arama yapalim
        // Arama kutusunun locate'i pages sayfasinda
        // POM'de pages sayfasindaki locate'lere erismek icin
        // pages sayfalarindan bir obje olusturulur

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);

        // sonuclarin Nutella icerdigini test edelim
        String expectedIcerik = "Nutella";
        String actualResultText = amazonPage.resultText.getText();
        Assert.assertTrue(actualResultText.contains(expectedIcerik));

        // sayfayi kapatalim
        Driver.closeDriver();
    }
}
