package jdisite.sections;

import jdisite.entities.User;
import org.openqa.selenium.WebElement;

import static com.epam.jdi.light.elements.init.UIFactory.$;

public class SelenideLoginForm {
    public WebElement name = $("#name");
    public WebElement password = $("#password");
    public WebElement loginButton = $("#login-button");

    public boolean isHidden() {
        return !name.isDisplayed();
    }
    public void loginAs(User user) {
        if (user.name != null) {
            this.name.clear();
            this.name.sendKeys(user.name);
        }
        if (user.password != null) {
            this.password.clear();
            this.password.sendKeys(user.password);
        }
        loginButton.click();
    }
}
