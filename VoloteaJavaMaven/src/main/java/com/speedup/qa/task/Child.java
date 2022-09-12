package com.speedup.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterfaces.PasajerosInterface.ENTER_CHILD;

public class Child implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ENTER_CHILD));
    }
    public static Child child(){
        return Tasks.instrumented(Child.class);
    }
}
