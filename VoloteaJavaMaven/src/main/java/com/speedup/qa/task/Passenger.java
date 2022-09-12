package com.speedup.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterfaces.Home.PASSENGER_BTN;

public class Passenger implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor){ actor.attemptsTo(Click.on(PASSENGER_BTN));}

    public static Passenger clickPassenger() {
        return new Passenger();}
}
