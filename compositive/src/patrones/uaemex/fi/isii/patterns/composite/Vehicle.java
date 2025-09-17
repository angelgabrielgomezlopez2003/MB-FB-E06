
package patrones.uaemex.fi.isii.patterns.composite;

/**
 *
 * @author agomezl020
 */
public abstract class Vehicle implements Composite{
    protected String type;

    public Vehicle(String type) {
        this.type = type;
    }

    @Override
    public void add(Composite component) {
        throw new UnsupportedOperationException("No se puede agregar un vehiculo");
    }

    @Override
    public void remove(Composite component) {
        throw new UnsupportedOperationException("No se puede remover el vehiculo");
    }

    @Override
    public Composite getChild(int index) {
        throw new UnsupportedOperationException("El vehiculo no tiene leafs");
    }
    
    
}
