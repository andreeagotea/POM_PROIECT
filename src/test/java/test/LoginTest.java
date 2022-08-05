package test;

import com.evozon.helper.Constante;
import com.evozon.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @Test
    public void loginTest() {

        loginPage = new LoginPage(driver);

        loginPage.getLoginPage();
        loginPage.login(Constante.USER_NAME, Constante.USER_PASS);

        Assert.assertEquals(Constante.BASE_URL + loginPage.getPATH(), driver.getCurrentUrl());

    }
}
