package PagesWithPageFactory;

import TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGIN extends BaseClass {

    @FindBy(id="txtStudentID")
    public WebElement StudentId;

    @FindBy(id="txtPassword")
    public WebElement Pasword;

    @FindBy(id="ibtnLogin")
    public WebElement SignIN;

   public LOGIN(){
        PageFactory.initElements(driver,this);
    }
}
