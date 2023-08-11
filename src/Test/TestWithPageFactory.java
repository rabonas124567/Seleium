package Test;

import PagesWithPageFactory.LOGIN;
import TestBase.BaseClass;

public class TestWithPageFactory {
    public static void main(String[] args) {
        BaseClass.start("https://vulms.vu.edu.pk/LMS_LP.aspx");

        LOGIN login=new LOGIN();
        login.StudentId.sendKeys("bc200416975");
        login.Pasword.sendKeys("sysipus");
        login.SignIN.click();
    }
}
