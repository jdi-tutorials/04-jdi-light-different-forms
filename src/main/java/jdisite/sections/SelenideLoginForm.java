package jdisite.sections;

import com.epam.jdi.light.elements.common.UIElement;
import jdisite.entities.User;

import static com.epam.jdi.light.elements.init.UIFactory.$;

public class SelenideLoginForm {
    UIElement name = $("#name"),
          password = $("#password"),
       loginButton = $("#login-button");

    public void loginAs(User user) {
        $("#name").setValue(user.name);
        $("#password").setValue(user.password);
        $("#login-button").click();
    }
}
