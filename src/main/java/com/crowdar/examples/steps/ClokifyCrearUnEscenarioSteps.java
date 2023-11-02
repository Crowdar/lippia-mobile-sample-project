package com.crowdar.examples.steps;

import com.crowdar.examples.services.ClokifyCrearUnEscenarioService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClokifyCrearUnEscenarioSteps {

    @When("El usuario ingresa el dia (.*) hora de inicio (.*) hora fin (.*) del trabajo$")
    public void datosLogin(String dia, String inicio, String fin) {
        ClokifyCrearUnEscenarioService.ingresarDia(dia);
        ClokifyCrearUnEscenarioService.ingresarDatosInicio(inicio);
        ClokifyCrearUnEscenarioService.ingresarDatosFin(fin);
    }

    @Then("El usuario puede ver el escenario creado")
    public void ingresoApp() {
        ClokifyCrearUnEscenarioService.validarEscenario();
    }

}
