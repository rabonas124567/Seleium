package Test;

import Pages.loginPage;
import TestBase.BaseClass;

public class TestBaseClass {
    public static void main(String[] args) {

        BaseClass.start("https://vulms.vu.edu.pk/LMS_LP.aspx");

            loginPage login=new loginPage();
            login.StudentID.sendKeys("bc200416975");
            login.Password.sendKeys("sysipus*2S");
            login.SignIn.click();
       /* TakesScreenshot shot=(TakesScreenshot)BaseClass.driver;
        File originallocation=shot.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(originallocation,new File("amazon/shots/LmsLogin.png "));
        }
         catch (IOException e) {
            e.printStackTrace();
        }


           BaseClass.End();

        */

        }
    }


