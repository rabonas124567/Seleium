package class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Action {
    public static String url="https://jqueryui.com/droppable/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        driver.manage().window().maximize();
        WebElement me=driver.findElement(By.id("draggable"));
        WebElement tohim=driver.findElement(By.id("droppable"));
        Actions action=new Actions(driver);
      //  action.dragAndDrop(me,tohim).perform();
        action.clickAndHold(me).moveToElement(tohim).release().build().perform();
        TakesScreenshot moreshots=(TakesScreenshot)driver;
        File original=  moreshots.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(original,new File("amazon/shots/drag.png"));
        }catch(IOException e){
            e.printStackTrace();
        }









    }
}
