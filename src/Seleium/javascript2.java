package class10;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript2 {

        public static String url="https://amazon.com";
    public static String url2="https://google.com";
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            JavascriptExecutor js2=(JavascriptExecutor)driver;

            js2.executeScript("window.open(url2);");
           /* js2.executeScript("window.scrollBy(0,500)");
            js2.executeScript("window.scrollBy(0,-500)");
            WebElement bacttop=driver.findElement(By.className("navFooterBackToTopText"));
            js2.executeScript("arguments[0].scrollIntoView(true)",bacttop);

            */
        }
}
