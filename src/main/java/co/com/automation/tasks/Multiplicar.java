package co.com.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.automation.userinterface.CalculadoraPage.*;
import static co.com.automation.userinterface.CalculadoraPage.SIGNO_IGUAL;

public class Multiplicar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUMERO_TRES),
                Click.on(SIGNO_MULTIPLICAR),
                Click.on(NUMERO_SIETE),
                Click.on(SIGNO_IGUAL)
        );
    }
}
