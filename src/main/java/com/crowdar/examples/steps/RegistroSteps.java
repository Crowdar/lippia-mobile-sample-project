package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.RegistroService;
import cucumber.api.java.en.When;

public class RegistroSteps extends PageSteps {

    @When("El usuario ingresa los siguientes datos para el registro: (.*), (.*), (.*)")
    public void hacerRegistro(String username, String email, String password) {
        RegistroService.hacerRegistro(username, email, password);
    }

}
