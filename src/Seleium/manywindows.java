package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class manywindows {
    public static String url="https://accounts.google.com/signup";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        String mainwindowadress=driver.getWindowHandle();
        System.out.println(mainwindowadress);
        WebElement helpadress=driver.findElement(By.linkText("Help"));
        helpadress.click();
        Thread.sleep(2000);
        driver.switchTo().window(mainwindowadress);
        // driver.quit();
        driver.close();


     /*   Set<String> bothwindowsadress=  driver.getWindowHandles();
        System.out.println(bothwindowsadress.size());
       System.out.println(bothwindowsadress);
       for getting the adress of both the windows
      */

      //  Iterator<String> list=bothwindowsadress.iterator();
      //  mainwindowadress=list.next();
     //   Thread.sleep(2000);
     //   String chiledwindow=list.next();
     //   System.out.println(chiledwindow);




















    }
}
