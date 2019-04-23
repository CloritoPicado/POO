/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Patrixito
 */
public class CoordenadasVehiculo {
    
    int latitud;
    int longitud;
    String nombreCoordenada;

    public CoordenadasVehiculo() {
    }

    public CoordenadasVehiculo(int latitud, int longitud, String nombreCoordenada) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.nombreCoordenada = nombreCoordenada;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getNombreCoordenada() {
        return nombreCoordenada;
    }

    public void setNombreCoordenada(String nombreCoordenada) {
        this.nombreCoordenada = nombreCoordenada;
    }
    
    
    
}
