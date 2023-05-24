package tests.day18_TestNGReports_ParalelCalistirma;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluAmazonSearch  extends TestBaseRapor {

    @Test
    public void test01(){

        extentTest = extentReports.createTest("Amazon Search",
                "An user can find everyting what the user want");

        // amazon'a gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Kullanici amazon anasayfaya gider");

        // Nutella icin arama yapin
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(ConfigReader.getProperty("amazonAranacakKelime"));
        amazonPage.searchBox.submit();
        extentTest.info("Arama kutusuna belirlenen aranacak kelimeyi yazar ve aratir");
        // arama sonuclarinin Nutella icerdigini test edin

        String actualSonucYazisi = amazonPage.resultText.getText();
        String expectedIcerik = ConfigReader.getProperty("amazonExpectedIcerik");

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
        extentTest.pass("belirlenen "+ConfigReader.getProperty("amazonAranacakKelime")+ " aratildiginda, arama sonucunda expected icerik oldugu test edildi");

        Driver.closeDriver();


    }

}
