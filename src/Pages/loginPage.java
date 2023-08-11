package Pages;

import TestBase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage extends BaseClass {


    public WebElement StudentID=driver.findElement(By.id("txtStudentID"));
    public WebElement Password=driver.findElement(By.id("txtPassword"));
    public WebElement SignIn=driver.findElement(By.id("ibtnLogin"));


}
