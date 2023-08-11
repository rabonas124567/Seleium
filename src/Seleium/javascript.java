package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {
    public static String url="https://facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement username= driver.findElement(By.xpath("//input[@name='email']"));
        Thread.sleep(2000);
        username.sendKeys("snobar");
       WebElement password= driver.findElement(By.id("pass"));
        Thread.sleep(2000);
        password  .sendKeys("rabonas");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.backgroundColor='purple'",username);
        Thread.sleep(2000);
        js.executeScript("arguments[0].style.backgroundColor='red'",password);
         Thread.sleep(2000);
        WebElement login=driver.findElement(By.xpath("//button[text()='Log in']"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()",login);

    }
}
