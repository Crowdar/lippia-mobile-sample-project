package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClokifyCrearUnEscenarioConstants;
import com.crowdar.examples.constants.ClokifyLoginConstants;
import org.testng.Assert;

public class ClokifyCrearUnEscenarioService {

    public static void ingresarDia(String dia) {
        MobileActionManager.click(ClokifyCrearUnEscenarioConstants.AGREGAR_ESCENARIO);
        MobileActionManager.click(ClokifyCrearUnEscenarioConstants.AGREGAR_TIEMPO);
        MobileActionManager.click(ClokifyCrearUnEscenarioConstants.DIA, dia);
    }

    public static void ingresarDatosInicio(String inicio) {
        MobileActionManager.click(ClokifyCrearUnEscenarioConstants.INICIO);
        MobileActionManager.click(ClokifyCrearUnEscenarioConstants.SELECIONAR_TIEMPO);
        for(int i = 0; i < 2; i++) {
            MobileActionManager.setInput(ClokifyCrearUnEscenarioConstants.SELECIONAR_TIEMPO, inicio);
        }
    }

    public static void ingresarDatosFin(String fin) {
        MobileActionManager.click(ClokifyCrearUnEscenarioConstants.FIN);
        MobileActionManager.click(ClokifyCrearUnEscenarioConstants.SELECIONAR_TIEMPO);
        for(int i = 0; i < 2; i++) {
            MobileActionManager.setInput(ClokifyCrearUnEscenarioConstants.SELECIONAR_TIEMPO, fin);
        }
        for(int i = 0; i < 2; i++) {
            MobileActionManager.click(ClokifyCrearUnEscenarioConstants.GUARDAR);
        }
    }

    public static void validarEscenario() {
        MobileActionManager.waitPresence(ClokifyLoginConstants.HOME_APP);
        Assert.assertTrue(MobileActionManager.isVisible(ClokifyCrearUnEscenarioConstants.VERIFICACION_ESCENARIO));
    }
}
