package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.SignUpConstants;


public class RegistroService {

    public static void hacerRegistro(String username, String email, String password){
        MobileActionManager.setInput(SignUpConstants.USERNAME_INPUT_LOCATOR, username);
        MobileActionManager.setInput(SignUpConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(SignUpConstants.PASSWORD_INPUT_LOCATOR, password);
        MobileActionManager.click(SignUpConstants.SIGN_UP_BUTTON_LOCATOR);
    }
}
