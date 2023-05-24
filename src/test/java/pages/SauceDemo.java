package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SauceDemo {

    public SauceDemo(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='product_sort_container']")
    public WebElement priceLowtoHigh;

    @FindAll(@FindBy(className = "inventory_item_price"))
    public List<WebElement> priceList;
}
