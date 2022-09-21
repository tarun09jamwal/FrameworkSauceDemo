package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By userName = By.xpath("//input[@id='user-name']");
    By password = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@id='login-button']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void LoginUser()
    {
        driver.findElement(userName).sendKeys("standard_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(loginButton).click();
    }

}

