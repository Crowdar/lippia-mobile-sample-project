Feature: As a potential client i want to interact with the functionalities of Login

  Scenario Outline: Invalid Login
    Given The fichap app is loaded correctly
    When The user do the login process with '<email>' and '<password>'
    Then The modal message is '<message>'

  @Login
    Examples:
      | email                | password | message                                     |
      | automation@gmail.com | 123456   | El usuario o la contraseña son incorrectos. |