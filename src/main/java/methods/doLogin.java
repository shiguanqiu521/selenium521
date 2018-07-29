package methods;

import org.openqa.selenium.WebDriver;

import static baskpage.loginPage.logButton;
import static baskpage.loginPage.pwdEle;
import static baskpage.loginPage.userEle;


public class doLogin {

    public static void login(WebDriver driver,String name,String pwd){
        driver.findElement(userEle).sendKeys(name);
        driver.findElement(pwdEle).sendKeys(pwd);
        driver.findElement(logButton).click();
    }

}
