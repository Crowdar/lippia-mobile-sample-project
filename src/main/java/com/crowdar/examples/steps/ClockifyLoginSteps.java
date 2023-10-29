package com.crowdar.examples.steps;

import com.crowdar.examples.services.ClockifyLoginService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;

public class ClockifyLoginSteps {
    @Given("Me encuento en la aplicacion")
    public void verificacionApp() {
        ClockifyLoginService.verificacionApp();
    }

    @When("Como usuario ingreso a mis datos: (.*), (.*)$")
    public void datosLogin(String user, String constrasena) {
        ClockifyLoginService.datosLogin(user, constrasena);
    }

    @Then("Como usuario ingreso al aplicacion exitosamente")
    public void ingresoApp() {
        ClockifyLoginService.ingresoApp();
    }
}
