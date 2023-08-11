package Seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ebayyyyy {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver ebay=new ChromeDriver();
        ebay.navigate().to("https://www.amazon.com");
        ebay.manage().window().maximize();
        WebElement links=ebay.findElement(By.id("searchDropdownBox"));
       // int size=links.size();
      //  System.out.println(size);
        Select select=new Select(links);
        boolean multiple=select.isMultiple();
        System.out.println(multiple);

        List<WebElement> list=select.getOptions();
        if(!multiple) {
            for (WebElement newlist : list
            ) {
                String print = newlist.getText();
                System.out.println(print);
                select.selectByVisibleText(print);
            }
        }

        select.selectByValue("search-alias=fashion-girls-intl-ship");
       // select.deselectByIndex(5);
       // select.deselectByVisibleText(" ");
      //  select.deselectAll();







    }

}
