package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class time {

        public static String url="https://the-internet.herokuapp.com/dynamic_controls";
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            WebElement remove=driver.findElement(By.xpath("//button[text()='Remove']"));
            remove.click();
           // WebDriverWait wait=new WebDriverWait();
            Thread.sleep(6000);
            WebElement massege=driver.findElement(By.xpath(" //p[@id='message']"));
           String getthemassege= massege.getText();
            System.out.println(getthemassege);

            WebElement enamled=driver.findElement(By.xpath("//button[text()='Enable']"));
            enamled.click();
            Thread.sleep(6000);
            WebElement text=driver.findElement(By.xpath(" //input[@type='text']"));
           boolean isenamled= text.isEnabled();
            System.out.println(isenamled);
            text.sendKeys("rabonas");









    }
}
