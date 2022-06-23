package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.About;
import pages.BasePage;
import pages.LoginPage;
import pages.Logout;
import pages.products.ReactBurgerMenuBtn;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static pages.BasePage.BASE_URL;


public class BaseTest {
    BasePage basePage;
    LoginPage loginPage;
    public ReactBurgerMenuBtn burgerMenuBtn;
    public Logout logout;
    About about;


    @BeforeEach
    public void goToPage() {
        basePage = open(BASE_URL + "/login", BasePage.class);
        //  basePage = open(BASE_URL + "/inventory", BasePage.class);
        loginPage = page(LoginPage.class);
        loginPage.validFillForm();
        loginPage.clickOnLoginBtn();
    }


    @AfterEach
    public void closeBrowser() {
        // getWebDriver().close();
        Configuration.holdBrowserOpen = true;
    }
}
