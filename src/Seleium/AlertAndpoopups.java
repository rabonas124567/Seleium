package Seleium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndpoopups {
    public static void main(String[] args) {
      System.setProperty("webdriver.chromedriver.com","path/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("unitestpractice.com");
        WebElement getlink=driver.findElement(By.name("alert"));
        getlink.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();




        WebElement cnfirmation=driver.findElement(By.name("confrirmation"));
        cnfirmation.click();
        Alert convertfocusonconfirmationbutton=driver.switchTo().alert();
        convertfocusonconfirmationbutton.accept();//accept for yes
        convertfocusonconfirmationbutton.dismiss();//dismiss for no
       String gettext= convertfocusonconfirmationbutton.getText();//for getting what is in the appeared box






         WebElement prompt=driver.findElement(By.name("prompt"));
        prompt.click();
        Alert prompthighlight=driver.switchTo().alert();
        prompthighlight.sendKeys("Ihave no website availble so i imagining a website to write a code");
        prompthighlight.accept();
        driver.switchTo().defaultContent();














    }
}
