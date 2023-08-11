package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class startandend {

    public void START(){
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void END(){

    }

}
