package tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class P02 {

    /*
    - Birbirine bağımlı testler oluşturun.
    - beforeClass oluşturup setUp ayarlarini yapin.
    - Birbirine bağımlı testler oluşturarak
    - ilk once wisequarte'a gidin
    - sonra wisequarter'a bağımlı olarak youtube'a gidin
    - daha sonra youtube'a bağımlı olarak amazon' a gidin
    - driver'i kapatın.
     */

    static WebDriver driver;
     @BeforeClass
    public static void setUp(){
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }

     @Test
     public void wisequarter(){

     }

     @AfterClass
    public static void tearDown(){
         driver.close();
     }
}
