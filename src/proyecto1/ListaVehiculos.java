/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.List;

/**
 *
 * @author Patrixito
 */
public class ListaVehiculos {
    List<Vehiculo> Vehiculos;

    public ListaVehiculos() {
    }
        

    public ListaVehiculos(List<Vehiculo> lVehiculos) {
        this.Vehiculos = lVehiculos;
    }

    public List<Vehiculo> getlVehiculos() {
        return Vehiculos;
    }

    public void setlVehiculos(List<Vehiculo> lVehiculos) {
        this.Vehiculos = lVehiculos;
    }
    
    
    
}
