package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyLoginConstants;
import org.testng.Assert;

public class ClockifyLoginService {
    public static void verificacionApp() {
        MobileActionManager.waitVisibility(ClockifyLoginConstants.APP_VISIBLE);
    }

    public static void datosLogin(String user, String contrasena) {
        MobileActionManager.setInput(ClockifyLoginConstants.USER,user);
        MobileActionManager.setInput(ClockifyLoginConstants.CONTRASENA,contrasena);
        MobileActionManager.click(ClockifyLoginConstants.LOGIN);
    }

    public static void ingresoApp() {
        MobileActionManager.waitVisibility(ClockifyLoginConstants.HOME_APP);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyLoginConstants.HOME_APP));
    }
}
