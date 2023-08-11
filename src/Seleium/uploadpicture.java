package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class uploadpicture {
    public static String url="https://the-internet.herokuapp.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement uploadbutton=driver.findElement(By.xpath("//a[text()='File Upload']"));
        uploadbutton.click();

        WebElement uploadit=driver.findElement(By.id("file-upload"));
       // Thread.sleep(2000);
       // uploadit.click();
        Thread.sleep(2000);
        uploadit.sendKeys("This PC/Desktop/jimin.xlsx");

        WebElement upload=driver.findElement(By.id("file-submit"));
        upload.click();

    }
}
