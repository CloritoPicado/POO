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
public class Persona {
    
    int identificacion;
    String nombre;
    String correo;

    public Persona(String nombre, String correo, int identificacion) {
        this.nombre = nombre;
        this.correo = correo;
        this.identificacion = identificacion;
    }

    public Persona() {
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
        

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getCorreo() {
        return correo;
    }

    protected void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "{\"Nombre\":\"" +nombre+ ",\"Correo\":\""+correo+"\"}";
    }
    
    
}
