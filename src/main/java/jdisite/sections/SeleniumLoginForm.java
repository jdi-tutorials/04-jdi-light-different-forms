package jdisite.sections;

import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.TextField;
import jdisite.entities.User;
import org.openqa.selenium.WebElement;

public class SeleniumLoginForm {
    @FindBy(id = "name") public WebElement name;
    @FindBy(id = "password") public WebElement password;
    @FindBy(id = "login-button") public WebElement loginButton;

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
