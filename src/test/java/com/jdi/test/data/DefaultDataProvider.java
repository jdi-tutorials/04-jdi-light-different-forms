package com.jdi.test.data;

import jdisite.entities.User;

public class DefaultDataProvider {
    public static User ROMAN = new User().set(c -> {
        c.name = "Roman";
        c.password = "Jdi1234";}
    );
    public static User ALEX = new User().set(c -> c.name = "Alexander" );
    public static User ALEX_SELENIDE = new User().set(c -> {c.name = "Alexander"; c.password = "";} );
}
