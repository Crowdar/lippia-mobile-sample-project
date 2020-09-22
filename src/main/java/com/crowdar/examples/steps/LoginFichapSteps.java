package com.crowdar.examples.steps;

import com.crowdar.examples.services.LoginFichapService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFichapSteps {

    @Given("The fichap app is loaded correctly")
    public void isLoginPageVisible() {
        LoginFichapService.isViewLoaded();
    }

    @When("The user do the login process with '(.*)' and '(.*)'")
    public void doLoginProcess(String email, String password) {
        LoginFichapService.doLoginProcess(email, password);
    }

    @Then("The modal message is '(.*)'")
    public void isModalMessageCorrect(String message) {
        LoginFichapService.isModalMessageCorrect(message);
    }
}
