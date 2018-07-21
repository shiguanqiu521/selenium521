package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static baskpage.loginPage.userEle;


public class doLogin {

    public static void login(WebDriver driver,String name,String pwd){
        driver.findElement(userEle).sendKeys(name);
        driver.findElement(userEle).sendKeys(pwd);
        driver.findElement(userEle).click();
    }

}
