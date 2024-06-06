package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NoteTakerPage {

    public NoteTakerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy()
    public WebElement title;

    @FindBy()
    public WebElement notes;

    @FindBy()
    public WebElement add;

}
