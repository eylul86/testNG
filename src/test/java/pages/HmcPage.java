package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {

    public HmcPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

@FindBy(xpath = "//*[text()='Log in']")
public WebElement login;

    @FindBy (xpath = "//input[@id='UserName']")
    public WebElement userName;

    @FindBy (xpath = "//input[@id='Password']")
    public WebElement password;




}
