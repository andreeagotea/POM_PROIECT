package com.evozon.page;

import com.evozon.helper.Constante;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
    private final String PATH ="/customer/account/login/";

    public String getPATH() {
        return PATH;
    }

    public LoginPage (WebDriver driver) {

        super(driver);

    }

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "pass")
    private  WebElement passInput;

    @FindBy(id = "send2")
    private  WebElement loginButton;

    public void getLoginPage() {

        getDriver().get(Constante.BASE_URL + PATH);

    }

    public void login (String userEmail, String userPass) {

        emailInput.sendKeys(userEmail);
        passInput.sendKeys(userPass);
        loginButton.click();

    }


}
