package tests;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelUtil;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        // Add assertion if needed
    }

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        String excelPath = System.getProperty("user.dir") + "/src/test/resources/testdata/LoginData.xlsx";
        return ExcelUtil.getLoginData(excelPath, "Sheet1");
    }
}
