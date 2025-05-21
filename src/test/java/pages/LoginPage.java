package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    private By username = By.name("username");
    private By password = By.name("password");
    private By loginBtn = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String uname, String pwd) {
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginBtn).click();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
