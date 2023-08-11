package Seleium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mutiplewindow {
    public static String url="https://admin:admin@the-internet.herokuapp.com/basic_auth";
                                    //Here you can pass the username:password  after// and beforethe exact adress
    public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement adress=driver.findElement(By.name("NAME"));
        adress.sendKeys("THIS is an imaginary website for my work");

        driver.switchTo().defaultContent();// this is used to moveback to the original page from the frame
        WebElement onealert=driver.findElement(By.name("alert"));
        onealert.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frome");
        WebElement adress2=driver.findElement(By.id("name"));
        adress2.clear();// if you are acessing the same frame twice then first you have  to remove the earliar sendkeys before giving the
       // new one
        adress2.sendKeys("this is imaginary");

        driver.switchTo().defaultContent();

        WebElement newadress=driver.findElement(By.xpath("whatever"));
        driver.switchTo().frame(newadress);
        adress2.clear(); // we are using the same adress for sending the key for the above frams but we can locate that box again
        // option2
        WebElement adress3=driver.findElement(By.id("name"));
        adress3.clear();
        adress3.sendKeys("blahhhhhhhhhhhhhhhhhh");






















    }
}
