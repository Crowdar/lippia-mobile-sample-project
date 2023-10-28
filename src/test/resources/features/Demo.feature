@LippiaApk
Feature: Como potencial cliente quiero interactuar con la aplicacion de Lippia

  Background:
      Given La aplicacion funciona correctamente

    @Registro
    Scenario Outline: El usuario quiere registrarse
      When El usuario se dirige a registrarse
      And El usuario ingresa los siguientes datos para el registro: <username>, <email>, <password>
      Then El usuario ingresa exitosamente

      Examples:
        | username   | email                | password |
        | automation | automation@gmail.com | 123456   |

    @CambiarIdioma
    Scenario Outline: El usuario quiere cambiar el idioma
      When El usuario ingresa a la app con su: <email>, <password>
      And El usuario cambia el idioma
      And El usuario hace un log out de la app
      Then El usuario se encuentra en el login

      Examples:
        | email                | password |
        | automation@gmail.com | 123456   |

    @IngresoApp
    Scenario Outline: El usuario quiere ingresar a su cuenta
      When El usuario ingresa a la app con su: <email>, <password>
      Then El usuario ingresa exitosamente

      Examples:
        | email                | password |
        | automation@gmail.com | 123456   |


