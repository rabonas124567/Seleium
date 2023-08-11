package Seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementeeeeee {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement username= driver.findElement(By.xpath("//input[@name='email']"));
        username.sendKeys("snobar");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("rabonas");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rabonas");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Suga");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("03448461042");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("SUGA");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("14");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='month']")).sendKeys("August");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2002");
        Thread.sleep(2000);
        driver.findElement(By.className("_58mt")).click();
/* int sizee= links.size();
       System.out.println(sizee);
        for (WebElement name:links
             ) {
            name.click();
            Thread.sleep(2000);

       */











    }

}
