package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import util.PropertiesLoader;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class LoginPage {
    /**
     * Properties
     **/
    private static final String validUsername = PropertiesLoader.loadProperty("valid.userName");
    private static final String validPassword = PropertiesLoader.loadProperty("valid.password");
    private static final String invalidUserName = PropertiesLoader.loadProperty("invalid.userName");
    private static final String invalidPassword = PropertiesLoader.loadProperty("invalid.password");
    private static final By loginButtonContainer = By.id("login_button_container");
    /**
     * Elements
     */

    By USER_NAME = By.id("user-name");
    By PASSWORD = By.id("password");
    By LOGIN_BUTTON = By.id("login-button");
    By ERROR_MESSAGE_CONTAINER = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");

    /**
     * Methods
     **/
    public LoginPage validFillForm() {
        $(USER_NAME).setValue(validUsername);
        $(PASSWORD).setValue(validPassword);
        return page(LoginPage.class);
    }

    public void invalidFillForm() {
        $(USER_NAME).setValue(invalidUserName);
        $(PASSWORD).setValue(invalidPassword);
    }

    public SelenideElement setErrorMessageContainer() {
        return $(ERROR_MESSAGE_CONTAINER);

    }

    public void clickOnLoginBtn() {
        $(LOGIN_BUTTON).click();
    }

    public void checkLoginButtonContainer() {
        $(loginButtonContainer).shouldHave(exist);
    }
}


