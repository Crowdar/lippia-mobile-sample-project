package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;

public class HomeService {

    public static void cambiarIdioma() {
        MobileActionManager.click(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR);
    }

    public static void volverLogin() {
        MobileActionManager.click(HomeConstants.SIGN_OUT_BUTTON_LOCATOR);
    }
    public static void homeVisible() {
        MobileActionManager.waitVisibility(HomeConstants.SIGN_OUT_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
}
