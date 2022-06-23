package tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;


public class LoginStepsTest extends BaseTest {


    @BeforeEach
    public void setLoginPage() {
        loginPage = page(LoginPage.class);
    }

    @Test
    public void testLoginPositive() {
        loginPage.validFillForm();
        loginPage.clickOnLoginBtn();
    }

    @Test
    public void testLoginNegative() {
        loginPage.invalidFillForm();
        loginPage.clickOnLoginBtn();
        loginPage.setErrorMessageContainer()
                .shouldHave(text("Epic sadface: Username and password do not match any user in this service"));

    }

}

