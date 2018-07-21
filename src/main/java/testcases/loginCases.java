package testcases;

import com.google.common.annotations.VisibleForTesting;
import methods.doLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginCases {

    WebDriver driver;

    @VisibleForTesting
    public void loginRight(){
        driver = new ChromeDriver();
        doLogin.login(driver,"18269241305","sss5727658229");
    }
}
