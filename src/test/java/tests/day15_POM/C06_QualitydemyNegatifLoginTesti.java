package tests.day15_POM;

import org.checkerframework.checker.units.qual.C;
import org.checkerframework.framework.qual.QualifierArgument;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitiydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_QualitydemyNegatifLoginTesti {

    @Test
    public void gecersizIsimSifreTesti(){
        // qualitydemy anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // ilk login linkine tiklayin
        QualitiydemyPage qualitiydemyPage = new QualitiydemyPage();
        qualitiydemyPage.firstLoginButton.click();

        // kullanici adi olarak selenium
        qualitiydemyPage.emailBox.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        // password olarak heyecandir yazin
        qualitiydemyPage.passwordBox.sendKeys("qdGecersizPassword");

        // login butonuna tiklayin
        qualitiydemyPage.secondLoginButton.click();

        // giris yapilamadigini test edin
        Assert.assertTrue(qualitiydemyPage.emailBox.isEnabled());

        //sayfayi kapatin
        Driver.closeDriver();

    }

    @Test(groups = "smoke")

    public void gecersizIsimTesti(){
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // login linkine tiklayin
        QualitiydemyPage qualitydemyPage = new QualitiydemyPage();
        qualitydemyPage.firstLoginButton.click();
        // gecersiz username ve gecerli sifre yi ilgili kutulara yazin
        qualitydemyPage.emailBox.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        // login butonuna basin
        qualitydemyPage.secondLoginButton.click();
        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.emailBox.isEnabled());
        // sayfayi kapatin
        Driver.closeDriver();

    }

    @Test
    public void gecersizSifreTesti(){
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // login linkine tiklayin
        QualitiydemyPage qualitydemyPage = new QualitiydemyPage();
        qualitydemyPage.firstLoginButton.click();
        // gecerli username ve gecersiz sifre yi ilgili kutulara yazin
        qualitydemyPage.emailBox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordBox.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        // login butonuna basin
        qualitydemyPage.secondLoginButton.click();
        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.emailBox.isEnabled());
        // sayfayi kapatin
        Driver.closeDriver();

    }
}
