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
    
    public boolean isRepetidoVIN(String s)
    {
        for (Vehiculo v : vehiculos) 
        { 
            if(v.getNumVim().equals(s))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean isRepetidaPlaca(String s)
    {
        for (Vehiculo v : vehiculos) 
        { 
            if(v.getPlaca().equals(s))
            {
                return true;
            }
        }
        return false;
    }
    
    public String[] devolverVINs()
    {
        String[] resultado = new String[vehiculos.size()];
        for(int a = 0; a <vehiculos.size(); a++)
        {
            resultado[a] = vehiculos.get(a).getNumVim();
        }
        return resultado;
    }
    
    public Vehiculo getVehiculo(String s)
    {
        for(int a = 0; a <vehiculos.size(); a++)
        {
            if(vehiculos.get(a).getNumVim().equals(s))
            {
                return vehiculos.get(a);
            }
        }
        return null;
    }
    
    public String[] listarVehiculos()
    {
        String[] resultado = new String[vehiculos.size()];
        for(int a = 0; a < vehiculos.size(); a++)
        {
            resultado[a] = vehiculos.get(a).getNumVim();
        }
        
        return resultado;
    }
    
    
}
