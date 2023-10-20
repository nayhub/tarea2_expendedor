/**
 * Clase que representa una bebida de Fanta
 * Hereda de la clase Bebida.
 */
public class Fanta extends Bebida{
    /**
     * Constructor de la clase Fanta.
     * @param serie El número de serie de la bebida.
     */
    public Fanta(int serie) {
        super(serie);
    }

    /**
     * Método abstracto que devuelve el nombre de la bebida
     * @return El nombre de la bebida
     */
    @Override
    public String sonido() {
        return "Fanta";
    }
}
