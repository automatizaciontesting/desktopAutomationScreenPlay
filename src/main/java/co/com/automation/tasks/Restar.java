package co.com.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.automation.userinterface.CalculadoraPage.*;
import static co.com.automation.userinterface.CalculadoraPage.SIGNO_IGUAL;

public class Restar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUMERO_CUATRO),
                Click.on(SIGNO_MENOS),
                Click.on(NUMERO_DOS),
                Click.on(SIGNO_IGUAL)
        );
    }
}