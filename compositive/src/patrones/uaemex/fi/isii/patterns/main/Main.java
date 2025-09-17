
package patrones.uaemex.fi.isii.patterns.main;

import patrones.uaemex.fi.isii.patterns.composite.Bicycle;
import patrones.uaemex.fi.isii.patterns.composite.DeliveryGroup;
import patrones.uaemex.fi.isii.patterns.composite.Motorcycle;
import patrones.uaemex.fi.isii.patterns.factory.Ship;
import patrones.uaemex.fi.isii.patterns.factory.Truck;

/**
 *
 * @author agomezl020
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Patron Prototype
        System.out.println("Demostracion de prototype");
        Ship originalShip = new Ship();

        Ship clonedShip = (Ship) originalShip.clone();
        System.out.println("Original: ");
        originalShip.deliver();
        System.out.println("Clon: ");
        clonedShip.deliver();
        
        //Patron Builder
        System.out.println("Demostracion de builder");
        Truck truckb = (Truck)new Truck().setTipoCarga("alimentos");
        truckb.builder();
        
        //Patron Factory
        Ship ship = new Ship();
        Truck truck = new Truck();
        
        System.out.println("Demostracion de factory");
        ship.deliver();
        truck.deliver();
        
        //Patron Composite
        // Crear vehículos individuales
        Motorcycle moto1 = new Motorcycle();
        Motorcycle moto2 = new Motorcycle();
        Bicycle bici1 = new Bicycle();
        Bicycle bici2 = new Bicycle();
        
        // Crear grupos de entrega
        DeliveryGroup motoGroup = new DeliveryGroup("Motocicletas");
        DeliveryGroup biciGroup = new DeliveryGroup("Bicicletas");
        DeliveryGroup allVehicles = new DeliveryGroup("Todos los Vehiculos");
        
        // Agregar vehículos a los grupos
        motoGroup.add(moto1);
        motoGroup.add(moto2);
        
        biciGroup.add(bici1);
        biciGroup.add(bici2);
        
        allVehicles.add(motoGroup);
        allVehicles.add(biciGroup);
        
        System.out.println("=== DEMOSTRACION PATRON COMPOSITE ===\n");
        
        // Operaciones individuales
        System.out.println("1. Operaciones individuales:");
        System.out.println("--- Motocicleta 1 ---");
        moto1.collect();
        moto1.deliver();
        
        System.out.println("\n2. Operaciones con grupos:");
        System.out.println("--- Grupo de Motocicletas ---");
        motoGroup.collect();
        motoGroup.deliver();
        
        System.out.println("\n3. Operacion con todos los vehiculos:");
        System.out.println("--- Todos los Vehiculos ---");
        allVehicles.collect();
        allVehicles.deliver();
        
        System.out.println("\n=== ESTADISTICAS ===");
        System.out.println("Total motocicletas: " + motoGroup.getComponentCount());
        System.out.println("Total bicicletas: " + biciGroup.getComponentCount());
        System.out.println("Total grupos en vehiculos: " + allVehicles.getComponentCount());
    }
    
}
