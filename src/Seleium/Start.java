package Seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {

    public static void main(String[] args) throws InterruptedException {
        /*System.setProperty("webdriver.chrome,driver","path/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://www.google.com/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
         driver.quit();
         */

      /*  System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(6000);
        String title= driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.quit();

       */
       /* System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https:/www.youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        String title=driver.getTitle();
        if(title.equals("YouTube")){
            System.out.println("correct");
        }else{
            System.out.println("incorrect");
        }
        driver.quit();

        */
                  System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
                  WebDriver driver=new ChromeDriver();
                  driver.navigate().to("https://www.facebook.com");
                  driver.manage().window().maximize();
                  driver.findElement(By.id("email")).sendKeys("hcbduud");
               //   driver.findElement(By.id("pass")).sendKeys("snobar");
                //  driver.findElement(By.name("login")).click();
                //  driver.findElement(By.linkText("Forgotten password?")).click();
                  driver.findElement(By.linkText("Create new account")).click();
                   //   driver.findElement( By.linkText("")).click();
     /* //control F is used to get the searchbar on wesite for finding the element by typing in it but after geting the HTML

       driver.findElement(By.linkText("Surname")).sendKeys("nazir");
        driver.findElement(By.linkText("Mobile number or email address")).sendKeys("034484610");
        driver.findElement(By.linkText("new-password")).sendKeys("Snobar*1S");
        driver.findElement(By.linkText("Day")).sendKeys("14");
        driver.findElement(By.linkText("Month")).sendKeys("August");
        driver.findElement(By.linkText("Year")).sendKeys("2002");

        */

































    }
}
