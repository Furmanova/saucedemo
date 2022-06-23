package tests.poducts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.products.ReactBurgerMenuBtn;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.page;

public class ReactBurgerMenuBtnTest extends BaseTest {
    @BeforeEach

    public void setLoginPage() {
        burgerMenuBtn = page(ReactBurgerMenuBtn.class);
    }

    @Test
    public void testOpenBurgerMenu() {
        burgerMenuBtn.setOpenMenu();
    }


}
