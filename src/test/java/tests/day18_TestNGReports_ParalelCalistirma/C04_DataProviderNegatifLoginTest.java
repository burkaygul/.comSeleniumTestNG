package tests.day18_TestNGReports_ParalelCalistirma;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitiydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_DataProviderNegatifLoginTest {
    @DataProvider
    public static Object[][] yanlisKullaniciAdlariListesi() {

        String [][] kullaniciBilgileriArrayi = {{"Memre","12345"},{"Mustafa","23456"},
                {"Burcu","32456"},{"Cigdem","867453"},
                {"Ahmet","32567"},{"Kemal","87654"},
                {"Melike","65747"},{"Cinar","645353"},
                {"Muleyke","6312"},{"Kadir","19870"}};

        return kullaniciBilgileriArrayi;
    }

    // verilen 10 kullanici bilgisi ile
    // sisteme giris yapilamadigini test edin

    @Test(dataProvider = "yanlisKullaniciAdlariListesi")
    public void gecersizIsimSifreTesti(String kullaniciAdi, String password){
        // qualitydemy anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // ilk login linkine tiklayin
        QualitiydemyPage qualitiydemyPage = new QualitiydemyPage();
        qualitiydemyPage.firstLoginButton.click();

        // kullanici adi olarak selenium
        qualitiydemyPage.emailBox.sendKeys(kullaniciAdi);
        // password olarak heyecandir yazin
        qualitiydemyPage.passwordBox.sendKeys(password);

        // login butonuna tiklayin
        qualitiydemyPage.secondLoginButton.click();

        // giris yapilamadigini test edin
        Assert.assertTrue(qualitiydemyPage.emailBox.isEnabled());

        //sayfayi kapatin
        Driver.closeDriver();

    }

}
