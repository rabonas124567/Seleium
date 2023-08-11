package Seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabank {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com");
      /*  WebElement username=driver.findElement(By.name("username"));
        boolean username1=username.isEnabled();
        System.out.println(username1);
        if(!username1){
            System.out.println("nooooooooooooo");
        }else{
            System.out.println("yessssssssssss");
        }
        boolean usernamedisplayed=username.isDisplayed();
        System.out.println(usernamedisplayed);
        username.sendKeys("rabnas");

        boolean usernameselected=username.isSelected();
        System.out.println(usernameselected);

       */
        WebElement Register=  driver.findElement(By.linkText("Register"));
        Register.click();









      /*  WebElement pasword= driver.findElement(By.name("password"));
               pasword.sendKeys("1234567");
               Thread.sleep(2000);

       */


     /*   driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("customer.firstName")).sendKeys("rabonas");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.lastName")).sendKeys("suga");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.street")).sendKeys("KRK");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Lahore");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.state")).sendKeys("pakistan");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("1234");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123456789012");
        driver.getTitle();
        driver.quit();

       */

























    }
}
