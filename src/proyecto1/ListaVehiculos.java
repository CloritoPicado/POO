/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrixito
 */
public class ListaVehiculos {
    List<Vehiculo> vehiculos = new ArrayList<>();

    public ListaVehiculos() {
        
    }        

    public ListaVehiculos(List<Vehiculo> lVehiculos) {
        this.vehiculos = lVehiculos;
    }

    public List<Vehiculo> getlVehiculos() {
        return vehiculos;
    }

    public void setlVehiculos(List<Vehiculo> lVehiculos) {
        this.vehiculos = lVehiculos;
    }
    
    
    
}
