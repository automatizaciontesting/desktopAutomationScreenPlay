package co.com.automation.tasks;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Operaciones {
	  private Operaciones() {
		    throw new IllegalStateException("Utility class");
		  }
    public static Performable sumarLosNumeros() {
        return instrumented(Sumar.class);
    }

    public static Performable restarLosNumeros() {
        return instrumented(Restar.class);
    }

    public static Performable multiplicarLosNumeros() {
        return instrumented(Multiplicar.class);
    }

    public static Performable dividirLosNumeros() {
        return instrumented(Dividir.class);
    }
}
