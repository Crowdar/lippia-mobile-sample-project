package com.crowdar.examples.steps;

import com.crowdar.examples.services.ClokifyLoginService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;

public class ClokifyLoginSteps {
    @Given("Me encuento en la aplicacion")
    public void verificacionApp() {
        ClokifyLoginService.verificacionApp();
    }

    @When("Como usuario ingreso a mis datos: (.*), (.*)$")
    public void datosLogin(String user, String constrasena) {
        ClokifyLoginService.datosLogin(user, constrasena);
    }

    @Then("Como usuario ingreso al aplicacion exitosamente")
    public void ingresoApp() {
        ClokifyLoginService.ingresoApp();
    }
}
