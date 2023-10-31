package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.constants.CrearUnEscenarioConstants;
import org.testng.Assert;

public class CrearUnEscenarioService {

    public static void ingresarDia(String dia) {
        MobileActionManager.click(CrearUnEscenarioConstants.AGREGAR_ESCENARIO);
        MobileActionManager.click(CrearUnEscenarioConstants.AGREGAR_TIEMPO);
        MobileActionManager.click(CrearUnEscenarioConstants.DIA, dia);
    }

    public static void ingresarDatosInicio(String inicio) {
        MobileActionManager.click(CrearUnEscenarioConstants.INICIO);
        MobileActionManager.click(CrearUnEscenarioConstants.SELECIONAR_TIEMPO);
        for(int i = 0; i < 2; i++) {
            MobileActionManager.setInput(CrearUnEscenarioConstants.SELECIONAR_TIEMPO, inicio);
        }
    }

    public static void ingresarDatosFin(String fin) {
        MobileActionManager.click(CrearUnEscenarioConstants.FIN);
        MobileActionManager.click(CrearUnEscenarioConstants.SELECIONAR_TIEMPO);
        for(int i = 0; i < 2; i++) {
            MobileActionManager.setInput(CrearUnEscenarioConstants.SELECIONAR_TIEMPO, fin);
        }
        for(int i = 0; i < 2; i++) {
            MobileActionManager.click(CrearUnEscenarioConstants.GUARDAR);
        }
    }

    public static void validarEscenario() {
        MobileActionManager.waitPresence(LoginConstants.HOME_APP);
        Assert.assertTrue(MobileActionManager.isVisible(CrearUnEscenarioConstants.VERIFICACION_ESCENARIO));
    }
}
