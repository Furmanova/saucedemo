package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class Logout {
    public static final By logout = By.id("logout_sidebar_link");

    public Logout logOut() {
        $(logout).click();
        return page(Logout.class);
    }

}
