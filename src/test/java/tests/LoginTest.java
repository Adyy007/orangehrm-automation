package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("OrangeHRM"), "Login Failed!");
    }
}
