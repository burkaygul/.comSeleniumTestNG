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
    public void test01(){
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
}
