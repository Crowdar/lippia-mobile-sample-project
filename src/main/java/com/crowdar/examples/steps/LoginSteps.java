package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends PageSteps {

    @Given("La aplicacion funciona correctamente")
    public void loginVisible() {
        LoginService.isViewLoaded();
    }

    @When("El usuario se dirige a registrarse")
    public void irRegistro() {
            LoginService.irRegistro();
    }

    @When("El usuario ingresa a la app con su: (.*), (.*)")
    public void hacerLogin(String email, String password) {
        LoginService.hacerLogin(email, password);
    }

}
