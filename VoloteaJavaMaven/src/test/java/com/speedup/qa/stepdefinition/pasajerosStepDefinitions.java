package com.speedup.qa.stepdefinition;

import com.speedup.qa.questions.PassengersReservation;
import com.speedup.qa.task.Child;
import com.speedup.qa.task.Cookies;
import com.speedup.qa.task.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class pasajerosStepDefinitions {

    @Managed
    private WebDriver navegador;

    @Before
    public void serUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(navegador)));
        theActorCalled("Usuario Volotea");
    }

    @Given("^go to the volotea flights page$")
    public void goToTheVoloteaFlightsPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
        OnStage.theActorInTheSpotlight().wasAbleTo(Cookies.cookies());

    }

    @When("^the plus button is clicked and it is greater than nine '(\\d+)'$")
    public void thePlusButtonIsClickedAndItIsGreaterThanNine(int arg1) {
        for (int i = 1; i < arg1; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(Child.child());
        }

    }

    @Then("^if it is greater than nine the link  '\"([^\"]*)\"' Reserva de grupos$")
    public void ifItIsGreaterThanNineTheLinkReservaDeGrupos(String link) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PassengersReservation.groupLink(), org.hamcrest.Matchers.is(link)));}

}
