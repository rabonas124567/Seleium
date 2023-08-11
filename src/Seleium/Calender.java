package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calender {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://www.delta.com");
        driver.manage().window().maximize();
        WebElement departbuton=driver.findElement(By.className("calenderDepartSpan"));
        departbuton.click();
        WebElement nextbutton=driver.findElement(By.className("dl-datepicker-1"));
        WebElement month=driver.findElement(By.className("dl-datepicker-month-0"));
       String printmonth= month.getText();
          while (!printmonth.equals("December")){
              nextbutton.click();
              printmonth= month.getText();
          }
          List<WebElement> days=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
        for (WebElement getdays:days
             ) {
            String printdays=getdays.getText();
            if(printdays.equals("19")){
                getdays.click();
            }
        }


        WebElement month2=driver.findElement(By.className("dl-datepicker-month-1"));
        String printmonth2= month2.getText();
        while (!printmonth2.equals("February")){
            nextbutton.click();
            printmonth2= month2.getText();
        }


        List<WebElement> days2=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));
        for (WebElement getdays2:days2
        ) {
            String printdays=getdays2.getText();
            if(printdays.equals("19")){
                getdays2.click();
                break;
            }
        }

        WebElement done=driver.findElement(By.xpath("//button[@class='donebutton']"));
        done.click();








    }
}
