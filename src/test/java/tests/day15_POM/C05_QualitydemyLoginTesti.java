package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitiydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_QualitydemyLoginTesti {

    @Test
    public void test01(){
        // QUALITYDEMY ANA SAYFAYA GIDIN
       Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // login linkine tiklayin
        QualitiydemyPage qualitiydemyPage = new QualitiydemyPage();
        qualitiydemyPage.firstLoginButton.click();

        // gecerli username ve sifre yi ilgili kutulara yazin
        qualitiydemyPage.emailBox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitiydemyPage.passwordBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        // login butonuna basin
        qualitiydemyPage.secondLoginButton.click();


        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitiydemyPage.basariliGirisKontrolElementi.isDisplayed());

        // sayfayi kapatin
        Driver.closeDriver();
    }
}
