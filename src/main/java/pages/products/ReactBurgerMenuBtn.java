package pages.products;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ReactBurgerMenuBtn {
    /**
     * Elements
     **/
    public static final By openMenu = By.id("react-burger-menu-btn");


    /**
     * Methods
     **/
    public ReactBurgerMenuBtn setOpenMenu() {
        $(openMenu).click();
        return page(ReactBurgerMenuBtn.class);

    }

}
