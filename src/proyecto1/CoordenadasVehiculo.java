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
    
    float latitud;
    float longitud;
    String nombreCoordenada;

    public CoordenadasVehiculo() {
    }

    public CoordenadasVehiculo(float latitud, float longitud, String nombreCoordenada) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.nombreCoordenada = nombreCoordenada;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public String getNombreCoordenada() {
        return nombreCoordenada;
    }

    public void setNombreCoordenada(String nombreCoordenada) {
        this.nombreCoordenada = nombreCoordenada;
    }
    
    
    
}
