package jdisite.sections;

import com.epam.jdi.light.elements.base.UIElement;
import jdisite.entities.User;
import org.openqa.selenium.WebElement;

import static com.epam.jdi.light.elements.init.UIFactory.$;

public class SelenideLoginForm {
    UIElement name = $("#name"),
          password = $("#password"),
       loginButton = $("#login-button");

    public void loginAs(User user) {
        if (user.name != null) {
            name.clear();
            name.sendKeys(user.name);
        }
        if (user.password != null) {
            password.clear();
            password.sendKeys(user.password);
        }
        loginButton.click();
    }
}
