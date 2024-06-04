package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EvilTesterValidation {
    public EvilTesterValidation(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name= "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "comments")
    public WebElement comments;

    @FindBy(name = "submitbutton")
    public WebElement submitbutton;

//    @FindBy(id = "error")
//    public WebElement error;

}
