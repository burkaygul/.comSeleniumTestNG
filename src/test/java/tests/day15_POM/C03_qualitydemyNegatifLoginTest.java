package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitiydemyPage;
import utilities.Driver;

public class C03_qualitydemyNegatifLoginTest {

    @Test
    public void test01(){
        // qualitydemy anasayfaya gidin
        Driver.getDriver().get("https://www.qualitydemy.com");
        // ilk login linkine tiklayin
        QualitiydemyPage qualitiydemyPage = new QualitiydemyPage();
        qualitiydemyPage.firstLoginButton.click();
        // kullanici adi olarak selenium
        qualitiydemyPage.emailBox.sendKeys("selenium");
        // password olarak heyecandir yazin
        qualitiydemyPage.passwordBox.sendKeys("heyecandir");

        // login butonuna tiklayin
        qualitiydemyPage.secondLoginButton.click();

        // giris yapilamadigini test edin
        Assert.assertTrue(qualitiydemyPage.emailBox.isEnabled());

        //sayfayi kapatin
        Driver.closeDriver();
    }


}
