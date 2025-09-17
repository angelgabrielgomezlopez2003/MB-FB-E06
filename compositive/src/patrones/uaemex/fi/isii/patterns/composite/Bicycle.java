
package patrones.uaemex.fi.isii.patterns.composite;

/**
 *
 * @author agomezl020
 */
public class Bicycle extends Vehicle{

    public Bicycle() {
        super("Bicycle");
    }

    @Override
    public void collect() {
        System.out.println("La bicicleta recolecta el pedido");
    }

    @Override
    public void deliver() {
        System.out.println("La bicicleta entrega el paquete");
    }
    
}
