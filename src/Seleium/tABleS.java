package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class tABleS {
    public static String url="https://99namesofallah.name/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
       /* List<WebElement> name=driver.findElements(By.xpath("//table/tbody/tr"));
        for (int i = 0; i <name.size() ; i++) {
            String getthenames = name.get(i).getText();
            System.out.println(getthenames);
        }

        */
        /* List<WebElement> name=driver.findElements(By.xpath("//table/tbody/tr"));
        int size=name.size();
        System.out.println(size);
        Iterator<WebElement> nameget=name.iterator();
        while(nameget.hasNext()){
            WebElement namenext=nameget.next();
            String printname=namenext.getText();
            System.out.println(printname);
        }

        */
       /* driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        List<WebElement> name=driver.findElements(By.xpath("//tbody/tr/td"));
        int size=name.size();
        System.out.println(size);
        for (WebElement nameget:name
             ) {
            String printname=nameget.getText();

            if(printname.equals("4")){
                System.out.println(printname);
                break;
            }
        }

        */
        List<WebElement> names=driver.findElements(By.xpath("//tbody/tr"));
        int size=names.size();
        Iterator<WebElement> getname=names.iterator();
        while (getname.hasNext()){
            WebElement printname=getname.next();
            String print=printname.getText();
            System.out.println(print);
        }






















    }

}
