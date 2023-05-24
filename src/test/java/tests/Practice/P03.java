package tests.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SauceDemo;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P03 {
     /*
    Navigate to https://www.saucedemo.com/
    Enter the username as standard_user
    Enter the password as secret_sauce
    Click on login button
    Test 1: Choose price low to high
    Test 2:Verify item prices are sorted from Iow to high with soft Assert
 */
    @Test
    public void sauceDemo1(){
        Driver.getDriver().get(ConfigReader.getProperty("sauceDemoUrl"));
        SauceDemo sauceDemo = new SauceDemo();

        sauceDemo.userName.sendKeys(ConfigReader.getProperty("sauceDemoUsername"));
        sauceDemo.password.sendKeys(ConfigReader.getProperty("sauceDemoPassword"));

        sauceDemo.loginButton.click();

        Select select = new Select(sauceDemo.priceLowtoHigh);
        select.selectByValue("lohi");
    }

    @Test
    public void sauceDemo2(){
        // Test 2:Verify item prices are sorted from Iow to high with soft Assert

        SauceDemo sauceDemo = new SauceDemo();

        List<String> prices = new ArrayList<>();

        for (WebElement allPrices: sauceDemo.priceList
             ) {
            prices.add(allPrices.getText());
        }

        List<String> sortedPrices = new ArrayList<String>(prices);
        Collections.sort(sortedPrices);

    }

}
