
package patrones.uaemex.fi.isii.patterns.composite;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agomezl020
 */
public class DeliveryGroup implements Composite{
    
    private List<Composite> components = new ArrayList<>();
    private String groupName;

    public DeliveryGroup(String groupName) {
        this.groupName = groupName;
    }
    
    @Override
    public void collect() {
        System.out.println("Grupo " + groupName + " iniciando recoleccion:");
        for (Composite component : components) {
            component.collect();
        }
    }

    @Override
    public void deliver() {
        System.out.println("Grupo " + groupName + " iniciando entrega:");
        for (Composite component : components) {
            component.deliver();
        }
    }

    @Override
    public void add(Composite component) {
        components.add(component);
    }

    @Override
    public void remove(Composite component) {
        components.remove(component);
    }

    @Override
    public Composite getChild(int index) {
        return components.get(index);
    }
    
    public int getComponentCount() {
        return components.size();
    }
    
}
