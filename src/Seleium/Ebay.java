package Seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ebay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver.driver","path/chrome.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.ebay.com/");


        List<WebElement> lisks=driver.findElements(By.tagName("a"));
        System.out.println(lisks.size());
        for (WebElement alllinks:lisks
             ) {
            String getlinks=alllinks.getText();
            String fulllinks=alllinks.getAttribute("href");
            if(!getlinks.isEmpty()){
                System.out.println(getlinks+"    "+fulllinks);
            }

        }

    }
}
