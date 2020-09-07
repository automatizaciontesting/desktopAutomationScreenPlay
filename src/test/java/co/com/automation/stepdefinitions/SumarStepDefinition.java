package co.com.automation.stepdefinitions;

import co.com.automation.exceptions.ResultadoNoEsperadoException;
import co.com.automation.questions.ResultadoPrueba;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.automation.exceptions.ResultadoNoEsperadoException.MENSAJE_RESULTADO_OPERACION_NO_ESPERADO;
import static co.com.automation.tasks.Operaciones.*;
import static co.com.automation.utils.drivers.DriverManager.pruebaCalculadoraWindows;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.net.MalformedURLException;

public class SumarStepDefinition {

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que (.*) se encuentra en la calculadora de Windows$")
    public void prepararEscenario(String nombreActor) throws MalformedURLException {
        theActorCalled(nombreActor).can(
                //BrowseTheWeb.with(abrirCalculadoraWindows())
                BrowseTheWeb.with(pruebaCalculadoraWindows())
        );
    }

    @When("^Juan realiza la suma de 6 y 8$")
    public void juanRealizaLaSumaDe() {
        theActorInTheSpotlight().attemptsTo(
                sumarLosNumeros()
        );
    }

    @When("^Juan realiza la resta de 4 y 2$")
    public void juanRealizaLaRestaDe() {
        theActorInTheSpotlight().attemptsTo(
                restarLosNumeros()
        );
    }

    @When("^Juan realiza la multiplicacion de 3 y 7$")
    public void juanRealizaLaMultiplicacionDe() {
        theActorInTheSpotlight().attemptsTo(
                multiplicarLosNumeros()
        );
    }

    @When("^Juan realiza la division de 10 y 5$")
    public void juanRealizaLaDivisionDe() {
        theActorInTheSpotlight().attemptsTo(
                dividirLosNumeros()
        );
    }

    @Then("^el deberia de ver el resultado igual a (.*)$")
    public void elDeberiaDeVerElResultadoIgualA(String resultado) {
        theActorInTheSpotlight().
        should(seeThat(ResultadoPrueba.esCorrecto(resultado)).orComplainWith(
                ResultadoNoEsperadoException.class, MENSAJE_RESULTADO_OPERACION_NO_ESPERADO)
        );
    }
}