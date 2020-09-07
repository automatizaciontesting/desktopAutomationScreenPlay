package co.com.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.automation.userinterface.CalculadoraPage.RESULTADO;

public class ResultadoPrueba implements Question<Boolean> {
    private String resultado;

    public ResultadoPrueba(String resultado){
        this.resultado = resultado;
    }

    public static ResultadoPrueba esCorrecto(String resultado){
        return new ResultadoPrueba(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return RESULTADO.resolveFor(actor).getText().contains(resultado);
    }
}
