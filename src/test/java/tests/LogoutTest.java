package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.Logout;
import pages.products.ReactBurgerMenuBtn;

import static com.codeborne.selenide.Selenide.page;

public class LogoutTest extends BaseTest {

    @BeforeEach
    public void clickOnLogout() {
        burgerMenuBtn = page(ReactBurgerMenuBtn.class);
        logout = page(Logout.class);
        loginPage = page(LoginPage.class);

    }

    @Test
    public void clickLogout() {
        burgerMenuBtn.setOpenMenu();
        logout.logOut();
        loginPage.checkLoginButtonContainer();

    }
}
