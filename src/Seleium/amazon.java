package Seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class amazon {
    public static void main(String[] args) {
      /*  System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver amazon=new ChromeDriver();
        amazon.navigate().to("https://www.amazon.com");
        amazon.manage().window().maximize();
        List<WebElement> getlink=amazon.findElements(By.tagName("a"));
        System.out.println(getlink.size());
        for (WebElement alllinks:getlink
             ) {
             String printlinks=alllinks.getText();
             String printpath=alllinks.getAttribute("href");
             if(!printlinks.isEmpty()){
                 System.out.println(printlinks+" "+printpath);
             }


        }


       */
     /*   System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver amazom=new ChromeDriver();
        amazom.navigate().to("https://www.amazon.com");
        amazom.manage().window().maximize();
        List<WebElement> links=amazom.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (WebElement alllinks:links
             ) {
            String linksprint=alllinks.getText();
            String linkadress=alllinks.getAttribute("href");
            if(!linksprint.isEmpty()){
                System.out.println(linksprint+" "+linkadress);
            }
        }

      */
        System.setProperty("webdriver.chromedriver.driver","path/chromedriver.exe");
        WebDriver amazon= new ChromeDriver();
        amazon.navigate().to("https://www.amazon.com");
        amazon.manage().window().maximize();


        WebElement adrressfordropdown=amazon.findElement(By.id("searchDropdownBox"));
        Select links=new Select(adrressfordropdown);
        boolean ismultiple=links.isMultiple();


        if(!ismultiple){
        List<WebElement> getlistofelement=links.getOptions();
        Iterator<WebElement> getlinks=getlistofelement.iterator();
        while(getlinks.hasNext()) {
            WebElement getthename = getlinks.next();
            String storethename = getthename.getText();
            // String storethelink=getthename.getAttribute("href");
            links.selectByIndex(7);
            System.out.println(storethename);
        }
        }







































    }
}
