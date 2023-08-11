package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class keys {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement username= driver.findElement(By.xpath("//input[@name='email']"));
        username.sendKeys("snobar");
        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("rabonas", Keys.ENTER);

    }

}
