package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyLoginConstants;
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
        MobileActionManager.setInput(CrearUnEscenarioConstants.SELECIONAR_TIEMPO,inicio);
        MobileActionManager.setInput(CrearUnEscenarioConstants.SELECIONAR_TIEMPO,inicio);
    }

    public static void ingresarDatosFin(String fin) {
        MobileActionManager.click(CrearUnEscenarioConstants.FIN);
        MobileActionManager.click(CrearUnEscenarioConstants.SELECIONAR_TIEMPO);
        MobileActionManager.setInput(CrearUnEscenarioConstants.SELECIONAR_TIEMPO,fin);
        MobileActionManager.setInput(CrearUnEscenarioConstants.SELECIONAR_TIEMPO,fin);
        MobileActionManager.click(CrearUnEscenarioConstants.GUARDAR);
    }

    public static void validarEscenario() {
        MobileActionManager.click(CrearUnEscenarioConstants.GUARDAR);
        MobileActionManager.waitPresence(ClockifyLoginConstants.HOME_APP);
        Assert.assertTrue(MobileActionManager.isVisible(CrearUnEscenarioConstants.VERIFICACION_ESCENARIO));
    }
}
