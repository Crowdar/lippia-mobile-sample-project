@Clockify
Feature: Como usuario quiero interactuar con clockify

  @LoginExitoso
  Scenario Outline: Ingreso a clockify
    Given Me encuento en la aplicacion
    When Como usuario ingreso a mis datos: <email>, <contrasena>
    Then Como usuario ingreso al aplicacion exitosamente

    Examples:
    | email                        | contrasena |
    | germancorreoprueba@gmail.com | 159432xx   |


