public class PagoInsuficienteException extends Exception {
    PagoInsuficienteException(String noalcanza){
        super(noalcanza);
    }
}
