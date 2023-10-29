package com.crowdar.examples.steps;

import com.crowdar.examples.services.ClockifyLoginService;
import com.crowdar.examples.services.CrearUnEscenarioService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrearUnEscenarioSteps {

    @When("El usuario ingresa el dia (.*) hora de inicio (.*) hora fin (.*) del trabajo$")
    public void datosLogin(String dia, String inicio, String fin) {
        CrearUnEscenarioService.ingresarDia(dia);
        CrearUnEscenarioService.ingresarDatosInicio(inicio);
        CrearUnEscenarioService.ingresarDatosFin(fin);
    }

    @Then("El usuario puede ver el escenario creado")
    public void ingresoApp() {
        CrearUnEscenarioService.validarEscenario();
    }

}
