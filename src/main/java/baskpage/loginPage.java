package baskpage;

import org.openqa.selenium.By;

public class loginPage {

    public static By userEle = By.xpath("//*[@data-loginname='loginEmail']");

    public static By pwdEle = By.name("password");

    public  static By logButton = By.id("dologin");

}
