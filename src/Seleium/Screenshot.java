package class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chromedriver.driver","path/chromedriver.exe");
        WebDriver amazon= new ChromeDriver();
        amazon.navigate().to("https://www.facebook.com");
        amazon.manage().window().maximize();


      /*  TakesScreenshot shot= (TakesScreenshot)amazon;
        File originalfile=shot.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(originalfile,new File("amazon/shots/originalpage.png"));
        } catch (IIOException e){
            e.printStackTrace();
        }

       */
        TakesScreenshot shot=(TakesScreenshot)amazon;
        File originalfile=shot.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(originalfile,new File("amazon/shots/facebook.png"));
        }catch(IOException e){
            e.printStackTrace();
        }












    }
}
