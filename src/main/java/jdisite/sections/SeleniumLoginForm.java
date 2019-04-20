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

    public boolean isHidden() {
        return !name.isDisplayed();
    }
    public void loginAs(User user) {
        this.name.clear();
        this.name.sendKeys(user.name);
        this.password.clear();
        this.password.sendKeys(user.password);
        loginButton.click();
    }
}
