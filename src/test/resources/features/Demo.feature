@LippiaApk
Feature: Como potencial cliente quiero interactuar con la aplicacion de Lippia

    @Registro
    Scenario Outline: El usuario quiere registrarse
      Given La aplicacion funciona correctamente
      When El usuario se dirige a registrarse
      And El usuario ingresa los siguientes datos para el registro: <username>, <email>, <password>
      Then El usuario ingresa exitosamente

    @CambiarIdioma
    When El usuario cambia el idioma
    And El usuario hace un log out de la app
    Then El usuario se encuentra ahora en el login

    @IngresoApp
    When El usuario ingresa a la app con su: <email>, <password>
    Then El usuario ingresa exitosamente


    Examples:
      | username   | email                | password |
      | automation | automation@gmail.com | 123456   |
