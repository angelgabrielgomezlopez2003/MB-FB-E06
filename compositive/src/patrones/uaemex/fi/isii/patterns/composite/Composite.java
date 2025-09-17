
package patrones.uaemex.fi.isii.patterns.composite;

/**
 *
 * @author agomezl020
 */
public interface Composite {
    public void collect();
    public void deliver();
    public void add(Composite component);
    public void remove(Composite component);
    public Composite getChild(int index);
}
