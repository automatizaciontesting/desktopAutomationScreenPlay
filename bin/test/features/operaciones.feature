Feature: Realizar una operaciones con la calculadora de Windows

  @ejecutarResta
  Scenario: Ejecutar calculadora
    Given que Juan se encuentra en la calculadora de Windows
    When Juan realiza la resta de 4 y 2
    Then el deberia de ver el resultado igual a 2

