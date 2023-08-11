package class10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Doubleclick {

        public static String url="https://demo.guru99.com/test/simple_context_menu.html";
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
            Actions action=new Actions(driver);
            action.contextClick(rightclick).perform();
            WebElement newwindow=driver.findElement(By.xpath("//span[text()='Edit']"));
            action.click(newwindow).perform();
            Alert alert=driver.switchTo().alert();
            Thread.sleep(3000);
            alert.accept();
            WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
            action.doubleClick(doubleclick).perform();
            driver.switchTo().alert();
            Thread.sleep(3000);
            alert.accept();
        }
}
