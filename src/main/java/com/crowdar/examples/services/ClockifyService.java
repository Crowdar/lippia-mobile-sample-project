package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyConstants;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;

public class ClockifyService {
    public static void verificacionApp() {
        MobileActionManager.waitVisibility(ClockifyConstants.APP_VISIBLE);
    }

    public static void datosLogin(String user, String contrasena) {
        MobileActionManager.setInput(ClockifyConstants.USER,user);
        MobileActionManager.setInput(ClockifyConstants.CONTRASENA,contrasena);
        MobileActionManager.click(ClockifyConstants.LOGIN);
    }

    public static void ingresoApp() {
        MobileActionManager.waitVisibility(ClockifyConstants.HOME_APP);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyConstants.HOME_APP));
    }
}
