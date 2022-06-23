package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.About;
import pages.products.ReactBurgerMenuBtn;

import static com.codeborne.selenide.Selenide.page;

public class AboutTest extends BaseTest{
    @BeforeEach
    public void setAboutPage(){
        about = page(About.class);
        burgerMenuBtn = page(ReactBurgerMenuBtn.class);
    }
    @Test
    public void aboutTest(){
        burgerMenuBtn.setOpenMenu();
        about.clickAbout();
        about.goToThePage();
        about.acceptCookies();
    }


}
