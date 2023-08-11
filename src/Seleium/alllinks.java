package Seleium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class alllinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
      //  List<WebElement> links=  driver.findElement(By.tagName("a"));
       // List<WebElement> link=driver.findElement(By.tagName("a"));
    }
}
