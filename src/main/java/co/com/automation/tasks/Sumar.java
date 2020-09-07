package co.com.automation.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.automation.userinterface.CalculadoraPage.*;

public class Sumar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUMERO_SEIS),
                Click.on(SIGNO_MAS),
                Click.on(NUMERO_OCHO),
                Click.on(SIGNO_IGUAL)
               
        );
        Serenity.takeScreenshot();
    }
}