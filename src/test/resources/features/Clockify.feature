@Clockify
Feature: Como usuario quiero interactuar con clockify

  Background:
    Given Me encuento en la aplicacion
    When Como usuario ingreso a mis datos: germancorreoprueba@gmail.com, 159432xx

  @LoginExitoso
  Scenario: Ingreso a clockify
    Then Como usuario ingreso al aplicacion exitosamente

  @CrearUnEscenario
  Scenario Outline: El usuario crea un escenario
    When El usuario ingresa el dia <Dia> hora de inicio <Inicio> hora fin <Fin> del trabajo
    Then El usuario puede ver el escenario creado

    Examples:
    | Dia              || Inicio | Fin |
    | 08 October 2023  ||   9    | 18  |


