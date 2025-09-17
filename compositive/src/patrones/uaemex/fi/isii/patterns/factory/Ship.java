
package patrones.uaemex.fi.isii.patterns.factory;
import patrones.uaemex.fi.isii.patterns.prototype.Prototype;

/**
 *
 * @author agomezl020
 */
public class Ship implements Factory , Prototype{
    
    @Override
    public void deliver(){
        System.out.println("Entrega de un contenedor");
    }
    
    @Override
    public Prototype clone(){
        Ship clonedShip = new Ship();
        return clonedShip;
    }
}
