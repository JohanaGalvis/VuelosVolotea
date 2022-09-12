package com.speedup.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/pasajeros.feature",
        glue = "com.speedup.qa.stepdefinition",
        tags = "@ScenarioOutline",
        snippets = SnippetType.CAMELCASE)

public class pasajerosRunners {
}
