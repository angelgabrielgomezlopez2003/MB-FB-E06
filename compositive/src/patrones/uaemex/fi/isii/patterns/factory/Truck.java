
package patrones.uaemex.fi.isii.patterns.factory;

import patrones.uaemex.fi.isii.patterns.builder.Builder;

/**
 *
 * @author agomezl020
 */
public class Truck implements Factory, Builder{
    private String tipoCarga;
    
    @Override
    public void deliver(){
        System.out.println("Entrega de caja");
    }
    
    @Override
    public Builder setTipoCarga(String tipoCarga){
        this.tipoCarga = tipoCarga;
        return this;
    }
    
    @Override
    public Builder builder() {
        Truck truck = new Truck();
        truck.tipoCarga = this.tipoCarga;
        System.out.println("Entrega de caja. Tipo de carga: " + tipoCarga);
        return truck;
    }
}
