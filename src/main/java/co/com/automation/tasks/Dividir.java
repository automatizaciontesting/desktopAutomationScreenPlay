package co.com.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.automation.userinterface.CalculadoraPage.*;
import static co.com.automation.userinterface.CalculadoraPage.SIGNO_IGUAL;

public class Dividir implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUMERO_UNO),
                Click.on(NUMERO_CERO),
                Click.on(SIGNO_DIVISION),
                Click.on(NUMERO_CINCO),
                Click.on(SIGNO_IGUAL)
        );
    }
}
