package jdisite;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Link;
import com.epam.jdi.light.ui.html.elements.common.Text;
import jdisite.entities.User;
import jdisite.sections.LoginForm;
import jdisite.sections.LoginFormSmart;
import jdisite.sections.SelenideLoginForm;
import jdisite.sections.SeleniumLoginForm;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JDISite {
    @Url("/") public static WebPage homePage;

    public static SeleniumLoginForm seleniumLoginForm;
    public static SelenideLoginForm selenideLoginForm;
    public static LoginForm loginForm;
    public static LoginFormSmart loginFormSmart;
    public static Form<User> lightLoginForm;

    @UI("img#user-icon") public static Link userIcon;
    @UI("#user-name") public static Text userName;
    @UI(".fa-sign-out") public static Button logout;

}
