package com.speedup.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterfaces.Home.ENTER_COOKIES;


public class Cookies implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ENTER_COOKIES));

    }
    public static Cookies cookies(){
        return new Cookies();
    }
}

