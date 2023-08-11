package class10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender2 {
    public static String url="https://aa.com/homePage.do";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
