package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windows {
    public static String url="https://demoqa.com/browser-windows";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver window=new ChromeDriver();
        window.get(url);
        window.manage().window().maximize();
        String mainwindow=window.getWindowHandle();

        WebElement tanbutton=window.findElement(By.id("tabButton"));
        WebElement  windowButton=window.findElement(By.xpath("//button[@id='windowButton']"));
        WebElement messageWindowButton=window.findElement(By.id("messageWindowButton"));

        tanbutton.click();
        windowButton.click();
        messageWindowButton.click();

        Set<String> allwindows=window.getWindowHandles();
        int size= allwindows.size();
        System.out.println(size);

        Iterator<String> driver=allwindows.iterator();
        while(driver.hasNext()){
            String getdriver=driver.next();
            String title=window .getCurrentUrl();
            System.out.println(title);

        }
























    }

}
