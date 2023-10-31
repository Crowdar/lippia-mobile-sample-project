package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

public class LoginService {
    public static void verificacionApp() {
        MobileActionManager.waitVisibility(LoginConstants.APP_VISIBLE);
    }

    public static void datosLogin(String user, String contrasena) {
        MobileActionManager.setInput(LoginConstants.USER,user);
        MobileActionManager.setInput(LoginConstants.CONTRASENA,contrasena);
        MobileActionManager.click(LoginConstants.LOGIN);
    }

    public static void ingresoApp() {
        MobileActionManager.waitVisibility(LoginConstants.HOME_APP);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.HOME_APP));
    }
}
