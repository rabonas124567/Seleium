package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    /**
     * This is the class  with the opening and closing the browser.
     */
    public static WebDriver driver;

    public static void start(String url){
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    public static void End(){
        if(driver !=null){
            driver.quit();
        }
    }



}
