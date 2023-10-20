/**
 * Clase que representa una excepción cuando el pago es insuficiente para comprar el producto.
 */
public class PagoInsuficienteException extends Exception {
    /**
     * Constructor de la clase PagoInsuficienteException.
     * @param noalcanza El mensaje de error a mostrar.
     */
    PagoInsuficienteException(String noalcanza){
        super(noalcanza);
    }
}
