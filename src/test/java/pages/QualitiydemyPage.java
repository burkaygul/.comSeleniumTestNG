package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitiydemyPage {

    public QualitiydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement firstLoginButton;

    @FindBy(id ="login-email")
    public WebElement emailBox;

    @FindBy(id="login-password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement secondLoginButton;

    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement basariliGirisKontrolElementi;
}
