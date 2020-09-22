package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginFichapConstants;
import org.testng.Assert;

public class LoginFichapService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(LoginFichapConstants.EMAIL_INPUT_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible("loginFichapView.signInButton"), "Login view is not present.");
    }

    public static void doLoginProcess(String email, String password) {
        MobileActionManager.setInput(LoginFichapConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput("loginFichapView.passwordInput", password);
        MobileActionManager.click("loginFichapView.signInButton");
    }

    public static void isModalMessageCorrect(String message) {
        Assert.assertEquals(MobileActionManager.getText("loginFichapView.modalMessageText"), message);
    }
}
