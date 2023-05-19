package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitiydemyPage;
import utilities.Driver;

public class C02_qualitydemyLoginTest {

    @Test
    public void test01(){
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get("https://www.qualitydemy.com");
        // login linkine tiklayin
        QualitiydemyPage qualitiydemyPage = new QualitiydemyPage();
        qualitiydemyPage.firstLoginButton.click();
        // gecerli username ve sifre yi ilgili kutulara yazin
        qualitiydemyPage.emailBox.sendKeys("anevzatcelik@gmail.com");
        qualitiydemyPage.passwordBox.sendKeys("Nevzat152032");

        // login butonuna basin

        qualitiydemyPage.secondLoginButton.click();

        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitiydemyPage.basariliGirisKontrolElementi.isDisplayed());
        // sayfayi kapatin
        Driver.closeDriver();


    }
}
