package com.crowdar.examples.steps;

import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;

public class LoginSteps {
    @Given("Me encuento en la aplicacion")
    public void verificacionApp() {
        LoginService.verificacionApp();
    }

    @When("Como usuario ingreso a mis datos: (.*), (.*)$")
    public void datosLogin(String user, String constrasena) {
        LoginService.datosLogin(user, constrasena);
    }

    @Then("Como usuario ingreso al aplicacion exitosamente")
    public void ingresoApp() {
        LoginService.ingresoApp();
    }
}
