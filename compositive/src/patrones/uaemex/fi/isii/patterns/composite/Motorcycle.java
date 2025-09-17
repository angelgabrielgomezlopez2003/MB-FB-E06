
package patrones.uaemex.fi.isii.patterns.composite;

/**
 *
 * @author agomezl020
 */
public class Motorcycle extends Vehicle{

    public Motorcycle(){
        super("Motorcycle");
    }

    @Override
    public void collect() {
        System.out.println("La motocicleta recolecta el paquete");
    }

    @Override
    public void deliver() {
        System.out.println("La motocicleta entrega el paquete");
    }
    
    
}
