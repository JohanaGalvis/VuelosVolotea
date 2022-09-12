package com.speedup.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.speedup.qa.userinterfaces.PasajerosInterface.GROUP_LINK;


public class PassengersReservation implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((GROUP_LINK), WebElementStateMatchers.isVisible()));
        return Text.of(GROUP_LINK).viewedBy(actor).asString();
    }

    public static PassengersReservation groupLink() { return new PassengersReservation(); }
}
