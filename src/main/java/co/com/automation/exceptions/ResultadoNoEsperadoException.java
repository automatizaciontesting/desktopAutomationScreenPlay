package co.com.automation.exceptions;

public class ResultadoNoEsperadoException extends AssertionError {
    public static final String MENSAJE_RESULTADO_OPERACION_NO_ESPERADO = "El resultado de la operación matematica no es el esperado";

    public ResultadoNoEsperadoException(String mensaje, Throwable causa){
        super(mensaje,causa);
    }
}
