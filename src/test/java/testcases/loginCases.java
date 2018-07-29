package testcases;

import methods.doLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class loginCases {

    WebDriver driver;

    @Test
    public void loginRight() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://email.163.com/");
        Thread.sleep(5000);
        WebElement e = driver.findElement(By.xpath("//*[@frameborder='0']"));
        driver.switchTo().frame(e);
        doLogin.login(driver,"18269241305","sss5727658229");
        Thread.sleep(5000);
    }


    @AfterMethod
    public void close(){
        driver.quit();
    }
}
