package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeSteps extends PageSteps {

    @Then("El usuario hace un log out de la app")
    public void homePageVisible() {
        HomeService.homeVisible();
    }

    @When("El usuario cambia el idioma")
    public void cambiarIdioma() {
        HomeService.cambiarIdioma();
    }

    @When("El usuario se encuentra en el login")
    public void volverLogin() {
        HomeService.volverLogin();
    }

    @Then("El usuario ingresa exitosamente")
    public void ingresoApp() {
        HomeService.homeVisible();
    }

}
