package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebElement username() {
        return driver.findElement(By.name("username"));
    }
    
    public WebElement password() {
        return driver.findElement(By.name("password"));
    }
    
    public WebElement loginBtn() {
        return driver.findElement(By.xpath("//button[normalize-space()='Login']"));
    }
    

    public String getTitle() {
        return driver.getTitle();
    }
}
