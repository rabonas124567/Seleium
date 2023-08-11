package Seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class facebook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver","path/chromedriver.exe");
        WebDriver facebook=new ChromeDriver();
        facebook.navigate().to("https://www.facebook.com");
        facebook.manage().window().maximize();
        facebook.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        WebElement LINKSs=facebook.findElement(By.xpath("//select[@id='month']"));
         Select names=new Select(LINKSs);
        List<WebElement> LINKS=facebook.findElements(By.xpath("//select[@id='month']"));
        int size=LINKS.size();
        System.out.println(size);

        for (int i = 0; i < size; i++) {
            String allname=LINKS.get(i).getText();
            System.out.println(allname);


        }


















        /* alllinks.selectByValue("March");
        Thread.sleep(2000);
        alllinks.selectByVisibleText("April");
        alllinks.selectByIndex(0);
        Thread.sleep(5000);
        alllinks.selectByIndex(1);
        Thread.sleep(5000);
        alllinks.selectByIndex(2);
        Thread.sleep(5000);
        alllinks.selectByIndex(3);
        Thread.sleep(5000);
        alllinks.selectByIndex(4);
        Thread.sleep(5000);

        */



















        }
        }


