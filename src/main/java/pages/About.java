package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import util.PropertiesLoader;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class About {
    public static final By aboutSidebar = By.id("about_sidebar_link");
    public static final By container = By.xpath("//h2[contains(text(),'Pass or fail. The world relies on your code.')]");
    public static final By cookies = By.id("onetrust-accept-btn-handler");

    public About clickAbout(){
        $(aboutSidebar).click();
        return page(About.class);
    }
    public About goToThePage(){
        $(container).shouldHave(Condition.text("Pass or fail. The world relies on your code."));
         return page(About.class);
    }
    public void acceptCookies(){
        $(cookies).click();
    }

}
