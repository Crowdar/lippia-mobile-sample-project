package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClokifyLoginConstants;
import org.testng.Assert;

public class ClokifyLoginService {
    public static void verificacionApp() {
        MobileActionManager.waitVisibility(ClokifyLoginConstants.APP_VISIBLE);
    }

    public static void datosLogin(String user, String contrasena) {
        MobileActionManager.setInput(ClokifyLoginConstants.USER,user);
        MobileActionManager.setInput(ClokifyLoginConstants.CONTRASENA,contrasena);
        MobileActionManager.click(ClokifyLoginConstants.LOGIN);
    }

    public static void ingresoApp() {
        MobileActionManager.waitVisibility(ClokifyLoginConstants.HOME_APP);
        Assert.assertTrue(MobileActionManager.isVisible(ClokifyLoginConstants.HOME_APP));
    }
}
