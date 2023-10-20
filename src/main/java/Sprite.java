/**
 * Clase que representa una bebida de Sprite
 * Hereda de la clase Bebida.
 */
public class Sprite extends Bebida{
    /**
     * Constructor de la clase Sprite.
     * @param s El número de serie de la bebida.
     */
public Sprite(int s){ super(s); }

    /**
     * Método abstracto que devuelve el nombre de la bebida
     * @return El nombre de la bebida
     */
    @Override
    public String sonido() {
        return "sprite";
    }
}