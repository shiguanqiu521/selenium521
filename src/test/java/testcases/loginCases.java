package testcases;

import methods.doLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class loginCases {

    WebDriver driver;

    @Test
    public void loginRight(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        driver = new ChromeDriver();
        driver.get("https://email.163.com/");
        doLogin.login(driver,"18269241305","sss5727658229");
    }


    @AfterMethod
    public void close(){
        driver.quit();
    }
}
